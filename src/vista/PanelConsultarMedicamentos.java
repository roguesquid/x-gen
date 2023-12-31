/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author luisr
 */
public class PanelConsultarMedicamentos extends javax.swing.JPanel {

    /**
     * Creates new form PanelConsultarMedicamentos
     */
    public PanelConsultarMedicamentos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonMedicamentos = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MedicamentosTitle.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Und Disp.", "Fecha Venc.", "Temp.", "Codigo", "Lote", "Und Vend.", "Costo", "Disponibilidad", "%", "Lugar 1", "Lugar 2", "Lugar 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, -1));

        botonMedicamentos.setBackground(new java.awt.Color(108, 170, 255));
        botonMedicamentos.setFont(new java.awt.Font("Hind", 1, 12)); // NOI18N
        botonMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/volverIcono.png"))); // NOI18N
        botonMedicamentos.setText("Volver");
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
        add(botonMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 15, -1, 33));
    }// </editor-fold>//GEN-END:initComponents

    private void botonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMedicamentosActionPerformed

    private void botonMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMedicamentosMouseClicked
        // TODO add your handling code here:
        Dashboard.ShowJPanel(new PanelInventario());
    }//GEN-LAST:event_botonMedicamentosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMedicamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
