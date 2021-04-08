
package MainPackage.Punto_3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class Metodos {
    protected BufferedImage GlobalImagePonderada = null; 
    protected BufferedImage GlobalImageDireccional = null;
    
    /* Copiar imagen */
    protected BufferedImage CopyImage(BufferedImage original){
        BufferedImage clone = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        Graphics2D g2d = clone.createGraphics();
        g2d.drawImage(original, 0, 0, null);
        g2d.dispose();
        return clone;
    }
    
    /* Conversion de modelos a escala de grises */
    protected BufferedImage ConvertoToGrayScale(BufferedImage original){
        int pixel; 
        for(int i = 0; i < original.getWidth(); i++){
            for(int j = 0; j < original.getHeight(); j++){
                pixel = original.getRGB(i, j);
                int gray = getGrayScale(pixel);
                gray = 0xff000000 | (gray << 16) | (gray << 8) | gray;    
                original.setRGB(i, j, gray);
            }
        }
        return original; 
    }
    
    /* Operacion a nivel de bit para la conversion a escada de grises */
    public int getGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = (rgb) & 0xff;
        int gray = (int)(0.2126 * r + 0.7152 * g + 0.0722 * b);
        /* Retornamos el color en escala de grises */
        return gray;
    }

    /* Calculo de la media ponderada */
    /* Se recibe una imagen a color  */
    protected BufferedImage CalculoMediaPonderada(BufferedImage Original, BufferedImage Copia){
        GlobalImagePonderada = Original;
        for(int i = 1; i < Original.getWidth()-1; i++){
            for(int j = 1; j < Original.getHeight()-1; j++){
                int pixel = OperacionIndividualMediaPonderada(i, j);
                pixel = 0xff000000 | (pixel << 16) | (pixel << 8) | pixel;
                Copia.setRGB(i, j, pixel);
            }
        }
        return Copia;
    }
    
    /* Operaciones individual */
    protected int OperacionIndividualMediaPonderada(int i, int j){
        double preCalculo = 0;
        int ValorCalculado = 0;
        
        /* Obtenemos la fraccion por la que se multiplicara la suma de los pixeles vecinos */
        int fraccion = 8 + getGrayScale(GlobalImagePonderada.getRGB(i, j));
        
        /* Primera columa */
        int val00 = getGrayScale(GlobalImagePonderada.getRGB(i-1, j-1));
        int val01 = getGrayScale(GlobalImagePonderada.getRGB(i-1, j));
        int val02 = getGrayScale(GlobalImagePonderada.getRGB(i-1, j+1));
        
        /* Segunda columna */
        int val10 = getGrayScale(GlobalImagePonderada.getRGB(i, j-1));
        int val11 = getGrayScale(GlobalImagePonderada.getRGB(i, j)); /* Pixel central */
        int val12 = getGrayScale(GlobalImagePonderada.getRGB(i, j+1));
        
        /* Tercera columna */
        int val20 = getGrayScale(GlobalImagePonderada.getRGB(i+1, j-1));
        int val21 = getGrayScale(GlobalImagePonderada.getRGB(i+1, j));
        int val22 = getGrayScale(GlobalImagePonderada.getRGB(i+1, j+1));
        
        /* Solo multiplicamos el valor central por si mismo */
        val11 =(int)Math.pow(val11, 2);
        
        preCalculo = (val00 + val01 + val02 + val10 + val11 + val12 + val20 + val21 + val22 )/fraccion;
        ValorCalculado = (int)Math.round(preCalculo);
        if(ValorCalculado < 0){
            ValorCalculado = 0;
        }else{
            if(ValorCalculado > 255){
                ValorCalculado = 255;
            }
        }
        
        return ValorCalculado;
    }
    
    /* Calculo de promedio direccional */
    protected BufferedImage CalculoPromedioDireccional(BufferedImage Original, BufferedImage Copia ){
        GlobalImageDireccional = Original;
        for(int i = 1; i < Original.getWidth()-1 ; i++){
            for(int j = 1; j < Original.getHeight() - 1; j++){
                int pixel = OperacionIndividualPromedioDireccional(i, j);
                pixel = 0xff000000 | (pixel << 16) | (pixel << 8) | pixel;
                Copia.setRGB(i, j, pixel);
            }
        }
        return Copia;
    }
    
    protected int OperacionIndividualPromedioDireccional(int i, int j){
        /* Se calculan las triadas */
        /* de [0][0] a [2][2]*/
        int val_1 = getGrayScale(GlobalImageDireccional.getRGB(i-1, j-1)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i, j)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i+1, j+1));
        
        /* de [0][1] a [2][1] */
        int val_2 = getGrayScale(GlobalImageDireccional.getRGB(i-1, j)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i, j)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i+1, j));
        
        /* de [0][2] a [2][0]*/
        int val_3 = getGrayScale(GlobalImageDireccional.getRGB(i-1, j+1)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i, j)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i+1, j-1)); 
        
        /* de [1][0] a [1][2] */
        int val_4 = getGrayScale(GlobalImageDireccional.getRGB(i, j-1)) +
                    getGrayScale(GlobalImageDireccional.getRGB(i, j)) + 
                    getGrayScale(GlobalImageDireccional.getRGB(i, j+1));
        
        /* Optenemos promedio*/
        val_1 = val_1 / 3;
        val_2 = val_2 / 3;
        val_3 = val_3 / 3;
        val_4 = val_4 / 4;
        
        /* Calculamos el maximo */
        int maxValue = Math.max(val_1, Math.max(val_2, Math.max(val_3, val_4)));
        
        if(maxValue < 0){
            maxValue = 0;
        }else{
            if(maxValue > 255){
                maxValue = 255;
            }
        }
        return maxValue;
    }
    
    //GuardarImageb como un jpge
    protected void GuardarImagen(BufferedImage Img, String nombre){
        try {
            ImageIO.write(Img, "jpg", new File(nombre + ".jpg"));
        } catch (Exception e) {
            System.out.println("Error de escritura");
        }
    }
}

