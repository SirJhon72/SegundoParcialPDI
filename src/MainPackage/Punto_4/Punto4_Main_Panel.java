package MainPackage.Punto_4;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Punto4_Main_Panel extends javax.swing.JPanel {
    protected BufferedImage GlobalImage = null;

    public Punto4_Main_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LienzoOriginal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LienzoFiltered = new javax.swing.JLabel();
        LoadImage = new javax.swing.JButton();
        ApplyFilter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        difEspacial = new javax.swing.JTextField();
        difRango = new javax.swing.JTextField();
        working = new javax.swing.JLabel();
        RemoveImage = new javax.swing.JButton();

        jLabel1.setText("Original");

        jLabel3.setText("Suavizado");

        LoadImage.setText("Cargar Imagen");
        LoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadImageActionPerformed(evt);
            }
        });

        ApplyFilter.setText("Suavizar");
        ApplyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyFilterActionPerformed(evt);
            }
        });

        jLabel2.setText("σs:");

        jLabel4.setText("σr:");

        RemoveImage.setText("Remover Imagen");
        RemoveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LienzoOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(LienzoFiltered, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(LoadImage)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ApplyFilter)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(difRango)
                                            .addComponent(difEspacial, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(268, 268, 268)
                                        .addComponent(working))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(243, 243, 243)
                                        .addComponent(RemoveImage)))))
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(300, 300, 300))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LienzoOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LienzoFiltered, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LoadImage)
                        .addComponent(jLabel2)
                        .addComponent(difEspacial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RemoveImage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(difRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(working)
                        .addGap(31, 31, 31)))
                .addComponent(ApplyFilter)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadImageActionPerformed

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
                GlobalImage = MT.CopyImage(img);
                BufferedImage grayScale = MT.ConvertoToGrayScale(img);
                setOriginalImage(grayScale);
                working.setText("");
                LienzoFiltered.setIcon(null);
            }
        }    
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_LoadImageActionPerformed

    private void ApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyFilterActionPerformed
        Metodos MT = new Metodos();
        LienzoFiltered.setIcon(null);
        working.setText("");
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        int difEspacialNumber = Integer.parseInt(difEspacial.getText().trim());
        double difRangoNumber = Double.parseDouble(difRango.getText().trim());
        BufferedImage Resultado = MT.FiltroBilateral(GlobalImage, Copia, difEspacialNumber, difRangoNumber);
        setResultadoImage(Resultado);
        working.setText("Listo");

    }//GEN-LAST:event_ApplyFilterActionPerformed

    private void RemoveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveImageActionPerformed
        LienzoFiltered.setIcon(null);
                
    }//GEN-LAST:event_RemoveImageActionPerformed

    /* Set Original */
    protected void setOriginalImage(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoOriginal.getWidth(), LienzoOriginal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoOriginal.setIcon(Icon); 
    }
    
    /* Set resultado */
    protected void setResultadoImage(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoFiltered.getWidth(), LienzoFiltered.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoFiltered.setIcon(Icon); 
    }
    
    /* Generate matriz */
    protected int[][] MatConvu(int opc){
        int[][] convu = new int[3][3];
        /* Primera columna */
        convu[0][0] = 1;
        convu[0][1] = 1;
        convu[0][2] = 1;
        
        /*Segunda columna */
        convu[1][0] = 1;
        convu[1][1] = 0;
        convu[1][2] = 1;
        
        /* Tercera columna */
        convu[2][0] = 1;
        convu[2][1] = 1;
        convu[2][2] = 1;
        
        
        return convu;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyFilter;
    private javax.swing.JLabel LienzoFiltered;
    private javax.swing.JLabel LienzoOriginal;
    private javax.swing.JButton LoadImage;
    private javax.swing.JButton RemoveImage;
    private javax.swing.JTextField difEspacial;
    private javax.swing.JTextField difRango;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel working;
    // End of variables declaration//GEN-END:variables
}
