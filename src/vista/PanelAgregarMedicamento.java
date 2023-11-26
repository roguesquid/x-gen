/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author luisr
 */
public class PanelAgregarMedicamento extends javax.swing.JPanel {

    /**
     * Creates new form PanelAgregarMedicamento
     */
    public PanelAgregarMedicamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonMedicamentos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        botonMedicamentos1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AgregarMedicamento.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Hind Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 127, 136));
        jLabel2.setText("Tipo de Medicamento:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Refrigerado", "Temp Ambiente" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        botonMedicamentos.setBackground(new java.awt.Color(108, 170, 255));
        botonMedicamentos.setFont(new java.awt.Font("Hind", 1, 12)); // NOI18N
        botonMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PlusCircle-r.png"))); // NOI18N
        botonMedicamentos.setText("Agregar");
        botonMedicamentos.setBorderPainted(false);
        botonMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonMedicamentos.setMargin(new java.awt.Insets(2, 6, 2, 14));
        botonMedicamentos.setOpaque(true);
        botonMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMedicamentosMouseClicked(evt);
            }
        });
        botonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedicamentosActionPerformed(evt);
            }
        });
        add(botonMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 33));

        jLabel3.setText("Codigo (1234-5678-90)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("Nombre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jTextField2.setText("Nombre");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, -1));

        jLabel5.setText("Costo");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel6.setText("Unidades en existencia");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel7.setText("Fecha de vencimiento");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextField5.setText("1234-5678-90");
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        jLabel8.setText("Lote");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jTextField6.setText("1234-5678-90");
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, -1));

        jLabel9.setText("Vigencia");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel10.setText("Porcentaje de Ganancia");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, 20, 100, 1));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible en el mercado", "No disponible en el mercado", "Retirado del mercado" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel11.setText("-");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 120, -1, -1));

        jTextField3.setText("1234");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 120, 50, -1));

        jTextField4.setText("90");
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 120, 40, -1));

        jLabel13.setText("-");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 50, -1));

        jTextField7.setText("1234");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, -1));

        botonMedicamentos1.setBackground(new java.awt.Color(108, 170, 255));
        botonMedicamentos1.setFont(new java.awt.Font("Hind", 1, 12)); // NOI18N
        botonMedicamentos1.setForeground(new java.awt.Color(255, 255, 255));
        botonMedicamentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/volverIcono.png"))); // NOI18N
        botonMedicamentos1.setText("Volver");
        botonMedicamentos1.setBorderPainted(false);
        botonMedicamentos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonMedicamentos1.setMargin(new java.awt.Insets(2, 6, 2, 14));
        botonMedicamentos1.setOpaque(true);
        botonMedicamentos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMedicamentos1MouseClicked(evt);
            }
        });
        botonMedicamentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedicamentos1ActionPerformed(evt);
            }
        });
        add(botonMedicamentos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 15, -1, 33));
    }// </editor-fold>//GEN-END:initComponents

    private void botonMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMedicamentosMouseClicked
        // TODO add your handling code here:
        Dashboard.ShowJPanel(new PanelInventario());
    }//GEN-LAST:event_botonMedicamentosMouseClicked

    private void botonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMedicamentosActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void botonMedicamentos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMedicamentos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMedicamentos1MouseClicked

    private void botonMedicamentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedicamentos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMedicamentos1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMedicamentos;
    private javax.swing.JButton botonMedicamentos1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}