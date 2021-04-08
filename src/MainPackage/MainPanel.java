package MainPackage;
import MainPackage.Punto_1.Punto1_Main_Panel;
import javax.swing.border.TitledBorder;
import MainPackage.Punto_2.Punto2_Main_Panel;
import MainPackage.Punto_3.Punto3_Main_Panel;
import MainPackage.Punto_4.Punto4_Main_Panel;
import MainPackage.Punto_5.Punto5_Main_Panel;
import javax.swing.BorderFactory;


public class MainPanel extends javax.swing.JFrame {

    public MainPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Punto_1 = new javax.swing.JMenuItem();
        Punto2 = new javax.swing.JMenuItem();
        Punto3 = new javax.swing.JMenuItem();
        Punto4 = new javax.swing.JMenuItem();
        Punto5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1139, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jMenu1.setText("Puntos");

        Punto_1.setText("Punto 1 - Laplace & Sobel");
        Punto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punto_1ActionPerformed(evt);
            }
        });
        jMenu1.add(Punto_1);

        Punto2.setText("Punto 2 - Deteccion de Borders");
        Punto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punto2ActionPerformed(evt);
            }
        });
        jMenu1.add(Punto2);

        Punto3.setText("Punto 3 - Suavizado Lineal");
        Punto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punto3ActionPerformed(evt);
            }
        });
        jMenu1.add(Punto3);

        Punto4.setText("Punto 4 - Suavizado Bilateral");
        Punto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punto4ActionPerformed(evt);
            }
        });
        jMenu1.add(Punto4);

        Punto5.setText("Punto 5 - Relieves");
        Punto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Punto5ActionPerformed(evt);
            }
        });
        jMenu1.add(Punto5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Punto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punto2ActionPerformed
        Punto2_Main_Panel Punto2 = new Punto2_Main_Panel();
        Punto2.setBounds(0, 0, MainPanel.getWidth(), MainPanel.getHeight());
  
        TitledBorder Punto2_Border = BorderFactory.createTitledBorder("Punto 2 - Deteccion de Bordes");
        Punto2_Border.setTitleJustification(TitledBorder.CENTER);
        Punto2.setBorder(Punto2_Border);
        RemovePanels();
        MainPanel.add(Punto2);
    }//GEN-LAST:event_Punto2ActionPerformed

    private void Punto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punto3ActionPerformed
       Punto3_Main_Panel Punto3 = new Punto3_Main_Panel();
       Punto3.setBounds(0, 0, MainPanel.getWidth(), MainPanel.getHeight());
       
       TitledBorder Punto_3_Border = BorderFactory.createTitledBorder("Punto 3 - Suavizado Lineal");
       Punto_3_Border.setTitleJustification(TitledBorder.CENTER);
       Punto3.setBorder(Punto_3_Border);
       RemovePanels();
       MainPanel.add(Punto3);
    }//GEN-LAST:event_Punto3ActionPerformed

    private void Punto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punto4ActionPerformed
        Punto4_Main_Panel Punto4 = new Punto4_Main_Panel();
        Punto4.setBounds(0, 0, MainPanel.getWidth(), MainPanel.getHeight());
        TitledBorder Punto4_Border = BorderFactory.createTitledBorder("Punto 2 - Deteccion de Bordes");
        Punto4_Border.setTitleJustification(TitledBorder.CENTER);
        Punto2.setBorder(Punto4_Border);
        RemovePanels();
        MainPanel.add(Punto4);
        
    }//GEN-LAST:event_Punto4ActionPerformed

    private void Punto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punto5ActionPerformed
        Punto5_Main_Panel Punto5 = new Punto5_Main_Panel();
        Punto5.setBounds(0, 0, MainPanel.getWidth(), MainPanel.getHeight());
        
        TitledBorder Punto_5_Border = BorderFactory.createTitledBorder("Punto 5 - Relieves");
        Punto_5_Border.setTitleJustification(TitledBorder.CENTER);
        Punto5.setBorder(Punto_5_Border);
        RemovePanels();
        MainPanel.add(Punto5);
    }//GEN-LAST:event_Punto5ActionPerformed

    private void Punto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Punto_1ActionPerformed
        Punto1_Main_Panel Punto1 = new Punto1_Main_Panel();
        Punto1.setBounds(0, 0, MainPanel.getWidth(), MainPanel.getHeight());
        
        TitledBorder Punto_1_Border = BorderFactory.createTitledBorder("Punto 1 - Bordes por Sobel y Laplace");
        Punto_1_Border.setTitleJustification(TitledBorder.CENTER);
        Punto1.setBorder(Punto_1_Border);
        Punto1.Todo();
        RemovePanels();
        MainPanel.add(Punto1);
    }//GEN-LAST:event_Punto_1ActionPerformed

    protected void RemovePanels(){
        MainPanel.removeAll();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MainPanel;
    private javax.swing.JMenuItem Punto2;
    private javax.swing.JMenuItem Punto3;
    private javax.swing.JMenuItem Punto4;
    private javax.swing.JMenuItem Punto5;
    private javax.swing.JMenuItem Punto_1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
