
package MainPackage.Punto_2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;


public class Metodos {
    protected BufferedImage Original = null;

    /* Copiar imagen */
    protected BufferedImage CopyImage(BufferedImage original){
        BufferedImage clone = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        Graphics2D g2d = clone.createGraphics();
        g2d.drawImage(original, 0, 0, null);
        g2d.dispose();
        return clone;
    }
    
    /*Convertir a escala de grises*/
    protected BufferedImage ConvertoGrayScale(BufferedImage original){
        int pixel; 
        Color color; 
        for(int i = 0; i < original.getWidth(); i++){
            for(int j = 0; j < original.getHeight(); j++){
                pixel = original.getRGB(i, j);
                color = new Color(pixel, true);
                int grayValue = (color.getRed() + color.getGreen() + color.getBlue())/3;
                color = new Color(grayValue, grayValue, grayValue);
                original.setRGB(i, j, color.getRGB());
            }
        }
        
        
        return original;
    }

    /* Comprobar que sea una imagena escala de grises o a color */
    protected BufferedImage isGrayScaleMode(BufferedImage original){
        int pixel;
        boolean isGrayScale = false;
        Color color; 
        for(int i = 0; i < original.getWidth(); i++){
            for(int j = 0; j < original.getHeight(); j++){
                pixel = original.getRGB(i, j);
                color = new Color(pixel, true);
                
                if(color.getRed() == color.getGreen() && color.getGreen() == color.getBlue()){
                    isGrayScale = true;
                }else{
                    isGrayScale = false;
                    break;
                }
            }
        }
        
        /* Si esta a color, se convierte a escala de grises */
        if(isGrayScale == false){
            JOptionPane.showMessageDialog(null, "Espera a que la imagen se convierta a escala de grises");
            ConvertoGrayScale(original);
        }
        
        return original;
    }

    /* Deteccion de borders*/
    protected BufferedImage BorderDetection(BufferedImage original, BufferedImage copia, int[][] MatConvoVertical, int[][] MatConvoHorizontal){
        int pixelCentral = 0;
        double maxGradient = 0;
        int[][] preImagen = new int[original.getWidth()][original.getHeight()];
        
        /* Realizamos una copia de nuestras imagenes, para tenernas de manera global */
        Original = original;
          
        /* Calculo de las magnitudes */
        for(int i = 1; i < original.getWidth() -1 ; i++){
            for(int j = 1; j < original.getHeight() -1; j++){
                /* Se toma el pixel central */
                pixelCentral = original.getRGB(i, j);
                
                /* Se realiza la operacion vertical*/
                double ValorA = operacionVertical(i, j, MatConvoVertical);

                /* Se realiza la operacion horizontal*/
                double ValorB = operacionHorizontal(i, j, MatConvoHorizontal);
                
                /* Elvamos cada numero al cuadrado */
                double ValorAA = Math.pow(ValorA, 2);
                double ValorBB = Math.pow(ValorB, 2);
                
                /* Realizamos la raiz cuadrada y los redondeamos hacia arriba o abajo dependiendo de su decimal*/
                double preMagnitud = Math.round(Math.sqrt(ValorAA + ValorBB));
                int Magnitud = (int)preMagnitud;
                
                if(maxGradient < Magnitud){
                    /* Almacenamos la magnitud mayor de todas*/
                    maxGradient = Magnitud;
                }
                /* Guardamos la magnitudes de todos los pixeles */    
                preImagen[i][j] = Magnitud;                
            }
        }
        
        double escala = 255.0 / maxGradient; 
        
        /* Asginaciones de color */
        for(int i = 1; i < original.getWidth() - 1; i++){
            for(int j = 1; j < original.getHeight() -1 ; j++){
                int ColorBorde = preImagen[i][j];
                
                /* Con esto eliminamos la comprobacion de 0 a 255*/
                ColorBorde = (int)(escala*ColorBorde);
                /* Creamos un nuevo color */
                ColorBorde = 0xff000000 | (ColorBorde << 16) | (ColorBorde << 8) | ColorBorde;
                /* Asignamos el color */
                copia.setRGB(i, j, ColorBorde);
            }
        }

        return copia;
    }
    
    /* Detection de Borders */
    protected BufferedImage BorderDetectionOperations(BufferedImage Original, BufferedImage Copia, int[][] MatConvoVertical, int[][] MatConvoHorizontal){
        return Copia;
    }
    
    protected double operacionVertical(int i, int j, int[][] MatConvoVertical){
        double ValorCalculadoY = 0;
        
        //Lado izquierdo
        int val00 = getGrayScale(Original.getRGB(i-1, j-1));
        int val01 = getGrayScale(Original.getRGB(i-1, j));
        int val02 = getGrayScale(Original.getRGB(i-1, j+1));
        
        //Lado derecho 
        int val20 = getGrayScale(Original.getRGB(i+1, j-1));
        int val21 = getGrayScale(Original.getRGB(i+1, j));
        int val22 = getGrayScale(Original.getRGB(i+1, j+1));
        
        //Realizamos las operaciones en base a lo cargado en la matriz 
        ValorCalculadoY = (val00 * MatConvoVertical[0][0] + val01 * MatConvoVertical[0][1] + 
                           val02 * MatConvoVertical[0][2] + val20 * MatConvoVertical[2][0] + 
                           val21 * MatConvoVertical[2][1] + val22 * MatConvoVertical[2][2]);

        return ValorCalculadoY;
    }
    
    protected double operacionHorizontal(int i, int j, int[][] MatConvoHorizontal){
        double ValorCalculadoX = 0;
        //Fila superior
        int val00 = getGrayScale(Original.getRGB(i-1, j-1));
        int val10 = getGrayScale(Original.getRGB(i, j-1));
        int val20 = getGrayScale(Original.getRGB(i+1, j-1)); 
        
        //Fila inferior
        int val02 = getGrayScale(Original.getRGB(i-1, j+1));
        int val12 = getGrayScale(Original.getRGB(i, j+1));
        int val22 = getGrayScale(Original.getRGB(i+1, j+1));
        
        //Realizamos las operaciones en base a los cargado en la matriz
        ValorCalculadoX = (val00 * MatConvoHorizontal[0][0] + val10 * MatConvoHorizontal[1][0] +
                           val20 * MatConvoHorizontal[2][0] + val02 * MatConvoHorizontal[0][2] +
                           val12 * MatConvoHorizontal[1][2] + val22 * MatConvoHorizontal[2][2]);
        
        return ValorCalculadoX;
    }

    public int getGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = (rgb) & 0xff;
        int gray = (int)(0.2126 * r + 0.7152 * g + 0.0722 * b);
        /* Retornamos el color en escala de grises */
        return gray;
    }
    
      protected void imprimir_matriz(BufferedImage image){
        for(int i = 1; i < image.getWidth(); i++ ){
            for(int j = 1; j < image.getHeight(); j++){
                int pexel = image.getRGB(i, j);
                int gray = getGrayScale(pexel);
                System.out.print(gray );
            }
            System.out.println("");
        }
    }
}
 