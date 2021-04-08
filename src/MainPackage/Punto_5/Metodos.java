
package MainPackage.Punto_5;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Metodos {
    protected BufferedImage GlobalBasicoRelive; 
    protected BufferedImage GlobalRelieveOrden1;
    /* Copiar imagen */
    protected BufferedImage CopyImage(BufferedImage original){
        BufferedImage clone = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        Graphics2D g2d = clone.createGraphics();
        g2d.drawImage(original, 0, 0, null);
        g2d.dispose();
        return clone;
    }
    
    /* Conseguimos el color en escala de grises */
    protected int getGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = (rgb) & 0xff;
        int gray = (int)(0.2126 * r + 0.7152 * g + 0.0722 * b);
        /* Retornamos el color en escala de grises */
        return gray;
    }

    /* proceso de Relieve con Matriz de convoluciond de primer o segundo orden*/
    protected BufferedImage RelievePrimer_Segundo_Orden(BufferedImage Original, BufferedImage Copia, int[][] MatConvo){
        GlobalRelieveOrden1 = Original;
        for(int i = 1; i < Original.getWidth() -1; i++){
            for(int j = 1; j < Original.getHeight() - 1; j++){
                int pixel = OperacionUnitariaRelive(i, j, MatConvo);
                pixel = 0xff000000 | (pixel << 16) | (pixel << 8) | pixel;
                Copia.setRGB(i, j, pixel);
            }
        }
        
        return Copia;
    }
    
    /* Operacion unitaria de relieve de la matriz de orden 1*/
    protected int OperacionUnitariaRelive(int i, int j, int[][] MatConvo){
        int ValorCalculado = 0;
        final int pivote = 128;
        
        /* Primera fila */
        int val00 = getGrayScale(GlobalRelieveOrden1.getRGB(i-1,j-1))*MatConvo[0][0];
        int val10 = getGrayScale(GlobalRelieveOrden1.getRGB(i ,j-1))*MatConvo[1][0];
        int val20 = getGrayScale(GlobalRelieveOrden1.getRGB(i+1,j-1))*MatConvo[2][0];
        
        /* Segunda fila */
        int val01 = getGrayScale(GlobalRelieveOrden1.getRGB(i-1,j))*MatConvo[0][1];
        int val11 = getGrayScale(GlobalRelieveOrden1.getRGB(i,j))*MatConvo[1][1];
        int val21 = getGrayScale(GlobalRelieveOrden1.getRGB(i+1,j))*MatConvo[2][1];
        
        /* Tercera fila */
        int val02 = getGrayScale(GlobalRelieveOrden1.getRGB(i-1,j+1))*MatConvo[0][2];
        int val12 = getGrayScale(GlobalRelieveOrden1.getRGB(i,j+1))*MatConvo[1][2];
        int val22 = getGrayScale(GlobalRelieveOrden1.getRGB(i+1,j+1))*MatConvo[2][2];
        
        double preCalculo = pivote + (val00 + val10 + val20 + val01 + val11 + val21 +
                                      val02 + val12 + val22 );
        ValorCalculado = (int)(Math.round(preCalculo));
        
        if(ValorCalculado < 0){
            ValorCalculado = 0;
        }else{
            if(ValorCalculado > 255){
                ValorCalculado = 255;
            }
        }
        
        return ValorCalculado; 
    }
    

}
