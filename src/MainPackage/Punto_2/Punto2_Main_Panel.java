
package MainPackage.Punto_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Punto2_Main_Panel extends javax.swing.JPanel {
    /* Copia global de la imagen */
    protected BufferedImage GlobalImage = null;
    protected boolean MatrizCorrecta = false;

    public Punto2_Main_Panel() {
        initComponents();
       
        //Posicion 2
        pos_2.setText("0");
        pos_2.setEnabled(false);

        //Posicion 5
        pos_5.setText("0");
        pos_5.setEnabled(false);

        //Posicion 8
        pos_8.setText("0");
        pos_8.setEnabled(false);

        //Posicion 13
        pos_13.setText("0");
        pos_13.setEnabled(false);
        
        //Posicion 14
        pos_14.setText("0");
        pos_14.setEnabled(false);

        //Posicion 15
        pos_15.setText("0");
        pos_15.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelOriginalImagen = new javax.swing.JPanel();
        LoadImage = new javax.swing.JButton();
        ApplyMatriz = new javax.swing.JButton();
        CleanMatriz = new javax.swing.JButton();
        ImagenOriginalLiezno = new javax.swing.JLabel();
        pos_1 = new javax.swing.JTextField();
        pos_2 = new javax.swing.JTextField();
        pos_3 = new javax.swing.JTextField();
        pos_4 = new javax.swing.JTextField();
        pos_5 = new javax.swing.JTextField();
        pos_6 = new javax.swing.JTextField();
        pos_7 = new javax.swing.JTextField();
        pos_8 = new javax.swing.JTextField();
        pos_9 = new javax.swing.JTextField();
        pos_10 = new javax.swing.JTextField();
        pos_11 = new javax.swing.JTextField();
        pos_12 = new javax.swing.JTextField();
        pos_13 = new javax.swing.JTextField();
        pos_14 = new javax.swing.JTextField();
        pos_15 = new javax.swing.JTextField();
        pos_16 = new javax.swing.JTextField();
        pos_17 = new javax.swing.JTextField();
        pos_18 = new javax.swing.JTextField();
        ImagenTransformedLienzo = new javax.swing.JLabel();

        LoadImage.setText("Cargar Imagen");
        LoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadImageActionPerformed(evt);
            }
        });

        ApplyMatriz.setText("Aplicar Matriz");
        ApplyMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyMatrizActionPerformed(evt);
            }
        });

        CleanMatriz.setText("Limpiar Matriz");
        CleanMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanMatrizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOriginalImagenLayout = new javax.swing.GroupLayout(PanelOriginalImagen);
        PanelOriginalImagen.setLayout(PanelOriginalImagenLayout);
        PanelOriginalImagenLayout.setHorizontalGroup(
            PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoadImage)
                    .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                        .addComponent(ApplyMatriz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CleanMatriz))
                    .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pos_4)
                            .addComponent(pos_7)
                            .addComponent(pos_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOriginalImagenLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(pos_5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pos_16)
                                    .addComponent(pos_10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                                .addComponent(pos_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pos_13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pos_14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos_18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                        .addComponent(ImagenOriginalLiezno, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ImagenTransformedLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        PanelOriginalImagenLayout.setVerticalGroup(
            PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOriginalImagenLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenTransformedLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImagenOriginalLiezno, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoadImage)
                .addGap(26, 26, 26)
                .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CleanMatriz)
                            .addComponent(ApplyMatriz)))
                    .addGroup(PanelOriginalImagenLayout.createSequentialGroup()
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pos_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pos_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelOriginalImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelOriginalImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelOriginalImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadImageActionPerformed
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
                setOriginalImage(img);
                
            }
        }    
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }//GEN-LAST:event_LoadImageActionPerformed

    private void ApplyMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyMatrizActionPerformed
        Metodos MT = new Metodos();
        
        //Tomamos una copia de la imagen original
        BufferedImage original = MT.CopyImage(GlobalImage);
        BufferedImage copia = MT.CopyImage(GlobalImage);
        
        //Tomamos los valores de la matriz 
        int[][] MatConvu_Vertical = getMatrizValues(1);
        int[][] MatConvu_Horizontal = getMatrizValues(2);
       
        BufferedImage TransforedImage = MT.BorderDetection(original, copia, MatConvu_Vertical, MatConvu_Horizontal);
        
        //Realizamos la operaciones 
        setCleanTransformedImage();
        setTransformesImage(TransforedImage);
    }//GEN-LAST:event_ApplyMatrizActionPerformed

    private void CleanMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanMatrizActionPerformed
        pos_1.setText("");
 
        pos_3.setText("");
        
        pos_4.setText("");
        
        pos_6.setText("");

        pos_7.setText("");
        
        pos_9.setText("");
        
        pos_10.setText("");
        
        pos_11.setText("");
        
        pos_12.setText("");
        
        pos_16.setText("");
        
        pos_17.setText("");
        
        pos_18.setText("");
        
        cleanImage();

    }//GEN-LAST:event_CleanMatrizActionPerformed

    protected void setOriginalImage(BufferedImage img){
        Image scaledImage = img.getScaledInstance(ImagenOriginalLiezno.getWidth(), ImagenOriginalLiezno.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        ImagenOriginalLiezno.setIcon(Icon);      
    }

    protected void setTransformesImage(BufferedImage img){
        Image scaledImage = img.getScaledInstance(ImagenTransformedLienzo.getWidth(), ImagenTransformedLienzo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        ImagenTransformedLienzo.setIcon(Icon);  
    }
    
    protected void setCleanTransformedImage(){
        try {
            ImagenTransformedLienzo.removeAll();
        } catch (Exception e) {
        }
    }
    
    protected void cleanImage(){
        Image scaledImage = GlobalImage.getScaledInstance(ImagenTransformedLienzo.getWidth(), ImagenTransformedLienzo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        ImagenTransformedLienzo.setIcon(Icon);  
    }
    
    protected int[][] getMatrizValues(int noMat){
        int[][] matConvu = new int[3][3];
        
        if(noMat == 1){
            /* Matriz vertical */
            matConvu[0][0] = Integer.parseInt(pos_1.getText().trim());
            matConvu[0][1] = Integer.parseInt(pos_4.getText().trim());
            matConvu[0][2] = Integer.parseInt(pos_7.getText().trim());
            matConvu[1][0] = 0;
            
            matConvu[1][2] = 0;
            matConvu[2][0] = Integer.parseInt(pos_3.getText().trim());
            matConvu[2][1] = Integer.parseInt(pos_6.getText().trim());
            matConvu[2][2] = Integer.parseInt(pos_9.getText().trim());
            
            int Central = ConteoDePixeles(matConvu);
            pos_5.setText(Central + "");
            matConvu[1][1] = Central;
        }else{
            /* Matriz horizontal */
            matConvu[0][0] = Integer.parseInt(pos_10.getText().trim());
            matConvu[0][1] = Integer.parseInt(pos_11.getText().trim());
            matConvu[0][2] = Integer.parseInt(pos_12.getText().trim());
            matConvu[1][0] = 0;
            matConvu[1][2] = 0;
            matConvu[2][0] = Integer.parseInt(pos_16.getText().trim());
            matConvu[2][1] = Integer.parseInt(pos_17.getText().trim());
            matConvu[2][2] = Integer.parseInt(pos_18.getText().trim());
            
            int Central = ConteoDePixeles(matConvu);
            pos_14.setText(Central + "");
            matConvu[1][1] = Central;
        }
        
        return matConvu;
    }
    
    protected int ConteoDePixeles(int[][] mat){
        int cont = 0; 
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(Math.abs(mat[i][j]) > 0){
                    cont += Math.abs(mat[i][j]);
                }
            }
        }
        
        return cont;
    }

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyMatriz;
    private javax.swing.JButton CleanMatriz;
    private javax.swing.JLabel ImagenOriginalLiezno;
    private javax.swing.JLabel ImagenTransformedLienzo;
    private javax.swing.JButton LoadImage;
    private javax.swing.JPanel PanelOriginalImagen;
    private javax.swing.JTextField pos_1;
    private javax.swing.JTextField pos_10;
    private javax.swing.JTextField pos_11;
    private javax.swing.JTextField pos_12;
    private javax.swing.JTextField pos_13;
    private javax.swing.JTextField pos_14;
    private javax.swing.JTextField pos_15;
    private javax.swing.JTextField pos_16;
    private javax.swing.JTextField pos_17;
    private javax.swing.JTextField pos_18;
    private javax.swing.JTextField pos_2;
    private javax.swing.JTextField pos_3;
    private javax.swing.JTextField pos_4;
    private javax.swing.JTextField pos_5;
    private javax.swing.JTextField pos_6;
    private javax.swing.JTextField pos_7;
    private javax.swing.JTextField pos_8;
    private javax.swing.JTextField pos_9;
    // End of variables declaration//GEN-END:variables
}
