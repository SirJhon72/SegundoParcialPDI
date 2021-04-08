
package MainPackage.Punto_3;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Punto3_Main_Panel extends javax.swing.JPanel {
    protected BufferedImage GlobalImage;

    public Punto3_Main_Panel() {
//        TitledBorder ImagenOriginal = BorderFactory.createTitledBorder("Imagen Original");
//        ImagenOriginal.setTitleJustification(TitledBorder.CENTER);
//        LienzoOriginal.setBorder(ImagenOriginal);
//        
//        TitledBorder ImagenLienzo1 = BorderFactory.createTitledBorder("Medias Ponderadas");
//        ImagenOriginal.setTitleJustification(TitledBorder.CENTER);
//        LienzoOperador1.setBorder(ImagenLienzo1);
//        
//        TitledBorder ImagenLienzo2 = BorderFactory.createTitledBorder("Promedio Direccional ");
//        ImagenOriginal.setTitleJustification(TitledBorder.CENTER);
//        LienzoOperador2.setBorder(ImagenLienzo2);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LienzoOriginal = new javax.swing.JLabel();
        loadImage = new javax.swing.JButton();
        Operador1_Button = new javax.swing.JButton();
        PromDirecctional = new javax.swing.JButton();
        LienzoOperador1 = new javax.swing.JLabel();
        LienzoOperador2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        loadImage.setText("Cargar Imagen");
        loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageActionPerformed(evt);
            }
        });

        Operador1_Button.setText("Media Ponderada");
        Operador1_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operador1_ButtonActionPerformed(evt);
            }
        });

        PromDirecctional.setText("Prom. Direccional");
        PromDirecctional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromDirecctionalActionPerformed(evt);
            }
        });

        jLabel1.setText("Original");

        jLabel2.setText("Media Ponderada");

        jLabel3.setText("Promedio Direccional");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(loadImage)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PromDirecctional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Operador1_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LienzoOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LienzoOperador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LienzoOperador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(199, 199, 199))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LienzoOperador1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(LienzoOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Operador1_Button)
                            .addComponent(loadImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PromDirecctional)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LienzoOperador2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
        //        Cargar la imagen dentro del panel
    try { 
        JFileChooser FC = new JFileChooser();
        FC.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        /* Solo permitimos archivos de tipo PNG y JPG*/
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        FC.setFileFilter(imgFilter);
        
        int result = FC.showOpenDialog(this);
        if(result != JFileChooser.CANCEL_OPTION || result != JFileChooser.ABORT){
            File image = FC.getSelectedFile();
            
            if(image == null || image.getName().equals("")){
                JOptionPane.showMessageDialog(null, "Favor de cargar una imagen valida");
            }else{
                Metodos MT = new Metodos();
                BufferedImage img = ImageIO.read(image);
                /* isGrayScale(img) -- nos retorna la imagen es escala de grises, si es que esta la imagen original esta a color */
                //BufferedImage copia = MT.isGrayScaleMode(img);
                GlobalImage = MT.CopyImage(img);
                BufferedImage grayScale = MT.ConvertoToGrayScale(img);
                MT.GuardarImagen(grayScale, "Orginal");
                setOriginalImage(grayScale);
                
            }
        }    
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }//GEN-LAST:event_loadImageActionPerformed

    private void Operador1_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operador1_ButtonActionPerformed
        Metodos MT = new Metodos();  
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        BufferedImage Resultado = MT.CalculoMediaPonderada(GlobalImage, Copia);
        MT.GuardarImagen(Resultado, "Ponderado");
        setMediaPonderada(Resultado);
        
    }//GEN-LAST:event_Operador1_ButtonActionPerformed

    private void PromDirecctionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromDirecctionalActionPerformed
        Metodos MT = new Metodos();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        BufferedImage Resultado = MT.CalculoPromedioDireccional(GlobalImage, Copia);
        MT.GuardarImagen(Resultado, "PromedioDirection");
        setPromedioDireccional(Resultado);
    }//GEN-LAST:event_PromDirecctionalActionPerformed

    protected void setOriginalImage(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoOriginal.getWidth(), LienzoOriginal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoOriginal.setIcon(Icon);      
    }

    protected void setMediaPonderada(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoOperador1.getWidth(), LienzoOperador1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoOperador1.setIcon(Icon); 
    }
    
    protected void setPromedioDireccional(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoOperador2.getWidth(), LienzoOperador2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoOperador2.setIcon(Icon);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LienzoOperador1;
    private javax.swing.JLabel LienzoOperador2;
    private javax.swing.JLabel LienzoOriginal;
    private javax.swing.JButton Operador1_Button;
    private javax.swing.JButton PromDirecctional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loadImage;
    // End of variables declaration//GEN-END:variables
}
