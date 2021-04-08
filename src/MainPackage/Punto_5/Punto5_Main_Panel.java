
package MainPackage.Punto_5;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Punto5_Main_Panel extends javax.swing.JPanel {
    protected BufferedImage GlobalImage = null;

    public Punto5_Main_Panel() {
        initComponents();
        pos_1.setText("0");
        pos_1.setEnabled(false);
        
        pos_2.setText("0");
        pos_2.setEnabled(false);
        
        pos_3.setText("0");
        pos_3.setEnabled(false);
        
        pos_4.setText("0");
        pos_4.setEnabled(false);
        
        pos_5.setText("0");
        pos_5.setEnabled(false);
        
        pos_6.setText("0");
        pos_6.setEnabled(false);
        
        pos_7.setText("0");
        pos_7.setEnabled(false);
        
        pos_8.setText("0");
        pos_8.setEnabled(false);
        
        pos_9.setText("0");
        pos_9.setEnabled(false);
        
        pos_10.setText("0");
        pos_10.setEnabled(false);
        
        pos_11.setText("0");
        pos_11.setEnabled(false);
        
        pos_12.setText("0");
        pos_12.setEnabled(false);
        
        pos_13.setText("0");
        pos_13.setEnabled(false);
        
        pos_14.setText("0");
        pos_14.setEnabled(false);
        
        pos_15.setText("0");
        pos_15.setEnabled(false);
        
        pos_16.setText("0");
        pos_16.setEnabled(false);
        
        pos_17.setText("0");
        pos_17.setEnabled(false);
        
        pos_18.setText("0");
        pos_18.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LienzoOriginal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoadImage = new javax.swing.JButton();
        LienzoRelieve1 = new javax.swing.JLabel();
        LienzoRelieve2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        ZeroDegPrimerOrder = new javax.swing.JButton();
        Deg180PrimerOrden = new javax.swing.JButton();
        Deg315PrimerOrden = new javax.swing.JButton();
        ZeroDegSegundoOrden = new javax.swing.JButton();
        Deg180SegundoOrden = new javax.swing.JButton();
        Deg315SegundoOrden = new javax.swing.JButton();

        jLabel2.setText("Original");

        LoadImage.setText("Cargar Imagen");
        LoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadImageActionPerformed(evt);
            }
        });

        jLabel5.setText("Relieve 1");

        jLabel6.setText("Relieve 2");

        jLabel1.setText("Matriz de 1er Orden");

        jLabel3.setText("Matriz de 2do Orden");

        ZeroDegPrimerOrder.setText("0°");
        ZeroDegPrimerOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroDegPrimerOrderActionPerformed(evt);
            }
        });

        Deg180PrimerOrden.setText("180°");
        Deg180PrimerOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deg180PrimerOrdenActionPerformed(evt);
            }
        });

        Deg315PrimerOrden.setText("315°");
        Deg315PrimerOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deg315PrimerOrdenActionPerformed(evt);
            }
        });

        ZeroDegSegundoOrden.setText("0°");
        ZeroDegSegundoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroDegSegundoOrdenActionPerformed(evt);
            }
        });

        Deg180SegundoOrden.setText("180°");
        Deg180SegundoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deg180SegundoOrdenActionPerformed(evt);
            }
        });

        Deg315SegundoOrden.setText("315°");
        Deg315SegundoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deg315SegundoOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel2)
                .addGap(471, 471, 471)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LienzoOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(LoadImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(pos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(pos_2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(pos_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ZeroDegPrimerOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(pos_7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(pos_4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pos_8)
                                    .addComponent(pos_5)
                                    .addComponent(Deg180PrimerOrden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pos_6)
                                    .addComponent(pos_9)
                                    .addComponent(Deg315PrimerOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(pos_10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(pos_11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(pos_12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ZeroDegSegundoOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pos_16)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(pos_13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pos_17)
                                    .addComponent(pos_14, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(Deg180SegundoOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pos_15)
                                    .addComponent(pos_18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Deg315SegundoOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(235, 235, 235))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LienzoRelieve1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LienzoRelieve2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LienzoOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(LoadImage)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pos_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pos_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pos_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ZeroDegSegundoOrden)
                            .addComponent(Deg180SegundoOrden)
                            .addComponent(Deg315SegundoOrden)
                            .addComponent(Deg315PrimerOrden)
                            .addComponent(Deg180PrimerOrden)
                            .addComponent(ZeroDegPrimerOrder)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LienzoRelieve1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(LienzoRelieve2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadImageActionPerformed
        ///        Cargar la imagen dentro del panel
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

    private void ZeroDegPrimerOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroDegPrimerOrderActionPerformed
        setInitialValuesFirstOrder();
        pos_1.setText("-1");
        pos_2.setText("-1");
        pos_3.setText("-1");
        
        pos_7.setText("1");
        pos_8.setText("1");
        pos_9.setText("1");
        
        Metodos MT = new Metodos();
        int[][] MatConvo = getMatrizValuesFirstOrder();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        
        BufferedImage Resultado = MT.RelievePrimer_Segundo_Orden(GlobalImage, Copia, MatConvo);
        setRelieve_1(Resultado);
        
    }//GEN-LAST:event_ZeroDegPrimerOrderActionPerformed

    private void Deg180PrimerOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deg180PrimerOrdenActionPerformed
        setInitialValuesFirstOrder();
        pos_1.setText("1");
        pos_2.setText("1");
        pos_3.setText("1");
        
        pos_7.setText("-1");
        pos_8.setText("-1");
        pos_9.setText("-1");
        
        
        Metodos MT = new Metodos();
        int[][] MatConvo = getMatrizValuesFirstOrder();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        
        BufferedImage Resultado = MT.RelievePrimer_Segundo_Orden(GlobalImage, Copia, MatConvo);
        setRelieve_1(Resultado);
    }//GEN-LAST:event_Deg180PrimerOrdenActionPerformed

    private void Deg315PrimerOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deg315PrimerOrdenActionPerformed
        setInitialValuesFirstOrder();
        pos_1.setText("-1");
        pos_2.setText("-1");
        pos_4.setText("-1");
        
        pos_6.setText("1");
        pos_8.setText("1");
        pos_9.setText("1");
        
        Metodos MT = new Metodos();
        int[][] MatConvo = getMatrizValuesFirstOrder();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        
        BufferedImage Resultado = MT.RelievePrimer_Segundo_Orden(GlobalImage, Copia, MatConvo);
        setRelieve_1(Resultado);
    }//GEN-LAST:event_Deg315PrimerOrdenActionPerformed

    private void ZeroDegSegundoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroDegSegundoOrdenActionPerformed
        setInitalValuesSecondOrder();
        pos_10.setText("-1");
        pos_11.setText("-2");
        pos_12.setText("-1");
        
        pos_16.setText("1");
        pos_17.setText("2");
        pos_18.setText("1");
        
        Metodos MT = new Metodos();
        int[][] MatConvo = getMatrizValuesSecondOrder();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        
        BufferedImage Resultado = MT.RelievePrimer_Segundo_Orden(GlobalImage, Copia, MatConvo);
        setRelieve_2(Resultado);
    }//GEN-LAST:event_ZeroDegSegundoOrdenActionPerformed

    private void Deg180SegundoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deg180SegundoOrdenActionPerformed
        setInitalValuesSecondOrder();
        pos_10.setText("1");
        pos_11.setText("2");
        pos_12.setText("1");
        
        pos_16.setText("-1");
        pos_17.setText("-2");
        pos_18.setText("-1");
        
        Metodos MT = new Metodos();
        int[][] MatConvo = getMatrizValuesSecondOrder();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        
        BufferedImage Resultado = MT.RelievePrimer_Segundo_Orden(GlobalImage, Copia, MatConvo);
        setRelieve_2(Resultado);
    }//GEN-LAST:event_Deg180SegundoOrdenActionPerformed

    private void Deg315SegundoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deg315SegundoOrdenActionPerformed
        setInitalValuesSecondOrder();
        pos_10.setText("-2");
        pos_11.setText("-1");
        pos_13.setText("-1");
        
        pos_15.setText("1");
        pos_17.setText("1");
        pos_18.setText("2");
        
        Metodos MT = new Metodos();
        int[][] MatConvo = getMatrizValuesSecondOrder();
        BufferedImage Copia = MT.CopyImage(GlobalImage);
        
        BufferedImage Resultado = MT.RelievePrimer_Segundo_Orden(GlobalImage, Copia, MatConvo);
        setRelieve_2(Resultado);
    }//GEN-LAST:event_Deg315SegundoOrdenActionPerformed

    protected void setInitialValuesFirstOrder(){
        pos_1.setText("0");
        pos_2.setText("0");
        pos_3.setText("0");
        pos_4.setText("0");
        pos_5.setText("0");
        pos_6.setText("0");
        pos_7.setText("0");
        pos_8.setText("0");
        pos_9.setText("0");
        
    }
    
    protected void setInitalValuesSecondOrder(){
        pos_10.setText("0");
        pos_11.setText("0");
        pos_12.setText("0");
        pos_13.setText("0");
        pos_14.setText("0");
        pos_15.setText("0");
        pos_16.setText("0");
        pos_17.setText("0");
        pos_18.setText("0");
    }
    
    protected void setOriginalImage(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoOriginal.getWidth(), LienzoOriginal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoOriginal.setIcon(Icon);  
    }
    
    protected int[][] getMatrizValuesFirstOrder(){
        int[][] matConvu = new int[3][3];
        
        /* Primera fila */
        matConvu[0][0] = Integer.parseInt(pos_1.getText());
        matConvu[1][0] = Integer.parseInt(pos_2.getText());
        matConvu[2][0] = Integer.parseInt(pos_3.getText());
        
        /* Segunda fila */
        matConvu[0][1] = Integer.parseInt(pos_4.getText());
        matConvu[1][1] = Integer.parseInt(pos_5.getText());
        matConvu[2][1] = Integer.parseInt(pos_6.getText());
        
        /* Tercera fila */
        matConvu[0][2] = Integer.parseInt(pos_7.getText());
        matConvu[1][2] = Integer.parseInt(pos_8.getText());
        matConvu[2][2] = Integer.parseInt(pos_9.getText());
       
        return matConvu;
    }
    
    protected int[][] getMatrizValuesSecondOrder(){
         int[][] matConvu = new int[3][3];
        
        /* Primera fila */
        matConvu[0][0] = Integer.parseInt(pos_10.getText());
        matConvu[1][0] = Integer.parseInt(pos_11.getText());
        matConvu[2][0] = Integer.parseInt(pos_12.getText());
        
        /* Segunda fila */
        matConvu[0][1] = Integer.parseInt(pos_13.getText());
        matConvu[1][1] = Integer.parseInt(pos_14.getText());
        matConvu[2][1] = Integer.parseInt(pos_15.getText());
        
        /* Tercera fila */
        matConvu[0][2] = Integer.parseInt(pos_16.getText());
        matConvu[1][2] = Integer.parseInt(pos_17.getText());
        matConvu[2][2] = Integer.parseInt(pos_18.getText());
       
        return matConvu;
    }
    
    protected void setRelieve_1(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoRelieve1.getWidth(), LienzoRelieve1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoRelieve1.setIcon(Icon); 
    }

    protected void setRelieve_2(BufferedImage img){
        Image scaledImage = img.getScaledInstance(LienzoRelieve2.getWidth(), LienzoRelieve2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Icon = new ImageIcon(scaledImage);
        LienzoRelieve2.setIcon(Icon); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deg180PrimerOrden;
    private javax.swing.JButton Deg180SegundoOrden;
    private javax.swing.JButton Deg315PrimerOrden;
    private javax.swing.JButton Deg315SegundoOrden;
    private javax.swing.JLabel LienzoOriginal;
    private javax.swing.JLabel LienzoRelieve1;
    private javax.swing.JLabel LienzoRelieve2;
    private javax.swing.JButton LoadImage;
    private javax.swing.JButton ZeroDegPrimerOrder;
    private javax.swing.JButton ZeroDegSegundoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
