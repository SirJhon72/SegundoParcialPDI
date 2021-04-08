
package MainPackage.Punto_4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Metodos {
    protected BufferedImage GlobalImage = null;
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

    /* Filtro Bilateral */
    protected BufferedImage FiltroBilateral(BufferedImage original, BufferedImage Copia, int difEspacial, double difRango){
        GlobalImage = original;
        for(int i = difEspacial; i < original.getWidth() - difEspacial; i++){
            for(int j = difEspacial; j < original.getHeight() - difEspacial; j++){
                int ValorSuavizado = ValorSuavizado(i, j, difEspacial, difRango);
                ValorSuavizado = 0xff000000 | (ValorSuavizado << 16) | (ValorSuavizado << 8) | ValorSuavizado;
                Copia.setRGB(i, j, ValorSuavizado);
            }
        }
        
        return Copia;
    }
    
    /* Proceso separado */
    protected int ValorSuavizado(int i, int j, int difEspacial, double difRango){
        double FactorNormalizacion = 0;
        double ColorCalculado = 0;
        int ColorFinal = 0;
        
        //Calculo de la sumatoria entre el factor de normalizacion 
        for(int subi = i-difEspacial; subi <= i+difEspacial; subi++){
            for(int subj = j-difEspacial; subj <= j+difEspacial; subj++){
                if(subi == i && subj == j){
                   /*Valor central de la matriz, que no se toma*/
                }else{
                    /* Realizamos la sumatoria del factor de normalizacion*/
                    double peso = CalculoPeso(i, j, subi, subj, difEspacial, difRango);
                    FactorNormalizacion += peso;
                    
                    /* Realizamos la operacion por cada pixel vecino*/
                    double preCalculo = peso * getGrayScale(GlobalImage.getRGB(subi, subj));
                    ColorCalculado += preCalculo ;
                }
            }
        }
        
        ColorFinal = (int)(ColorCalculado / FactorNormalizacion);
        return (int)ColorFinal;
    }
    
    
    /* calculo de peso */
    protected double CalculoPeso(int i, int j, int subi, int subj, int difEspacial, double difRango){
        double DiferenciaEspacial = DiferenciaEspacial(i, j, subi, subj, difEspacial);
        double DiferenciaRango = DiferenciaIntensidades(GlobalImage.getRGB(i, j), GlobalImage.getRGB(subi, subj), difRango);
        double Peso = Math.exp(DiferenciaEspacial + DiferenciaRango);
        return Peso;
    }

    /* protected diferencia espacial */
    protected double DiferenciaEspacial(int i, int j, int subi, int subj, int difEspacial){
        /*Calculamos la distancia entro los pixeles */
        double parte_1 = Math.abs(subi - i);
        double parte_2 = Math.abs(subj - j);
        double Distancia = Math.sqrt( Math.pow(parte_1, 2) + Math.pow(parte_2, 2) );

        /* Realizamos la division */
        double valorCalculado = (-1/2)*(Math.pow((Distancia / difEspacial), 2));

        return valorCalculado;
    }
    
    /* Diferencia de intensidades */
    protected double DiferenciaIntensidades(int pixelCentral, int pixelVecino, double difRango){
        
        /*Calculamos la diferencia de las intensidades de los pixeles */
        int grayPixelCentral = getGrayScale(pixelCentral);
        int grayPixelVecino = getGrayScale(pixelVecino);
        double diferenciaIntensidades = Math.abs(grayPixelCentral - grayPixelVecino);
        
        /* Realizamos la division */
        double valorCalculado = (-1/2)*(Math.pow((diferenciaIntensidades / difRango), 2));

        return valorCalculado;
    }
    
    /* protected calculo del factor de normalizacion */
    
    
    /* funcion exponencial */
    protected double funcionExponencial(double valor){
        
        /* Covertimos a negativo, antes de realizar la funcion exponcial*/
        if(valor > 0){
            valor = valor * -1;
        }
        return Math.exp(valor);
    }
         
    /* calcular el divisor */
    protected double Divisor(double valor){
        double ValorCalculado = Math.pow(valor, 2);
        return ValorCalculado;
    }
}
