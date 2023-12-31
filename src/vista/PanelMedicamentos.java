/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author luisr
 */
public class PanelMedicamentos extends javax.swing.JPanel {

    /**
     * Creates new form PanelMedicamentos
     */
    public PanelMedicamentos() {
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

        labelLugarUno = new javax.swing.JLabel();
        labelFechaV = new javax.swing.JLabel();
        labelTemp = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelLugarDos = new javax.swing.JLabel();
        labeLugarTres = new javax.swing.JLabel();
        comboBoxSeleccionarMedicamento = new javax.swing.JComboBox<>();
        fondoMedicamento = new javax.swing.JLabel();
        iconoUsuario = new javax.swing.JLabel();
        medicamentosTitulo = new javax.swing.JLabel();
        medicamentosSubtitulo = new javax.swing.JLabel();
        publicidadOnline = new javax.swing.JLabel();
        publicidadMedicamentos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLugarUno.setText("jLabel2");
        add(labelLugarUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 161, -1, -1));

        labelFechaV.setText("jLabel3");
        add(labelFechaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 185, -1, -1));

        labelTemp.setText("jLabel4");
        add(labelTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 208, -1, -1));

        labelNombre.setText("jLabel2");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 161, -1, -1));

        labelLugarDos.setText("jLabel6");
        add(labelLugarDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 185, -1, -1));

        labeLugarTres.setText("jLabel7");
        add(labeLugarTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 208, -1, -1));

        comboBoxSeleccionarMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboBoxSeleccionarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        fondoMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoMedicamento.png"))); // NOI18N
        add(fondoMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        add(iconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 60, 50));

        medicamentosTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MedicamentosTitle.png"))); // NOI18N
        add(medicamentosTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 40));

        medicamentosSubtitulo.setFont(new java.awt.Font("Hind Medium", 0, 14)); // NOI18N
        medicamentosSubtitulo.setForeground(new java.awt.Color(109, 127, 136));
        medicamentosSubtitulo.setText("Seleccione el medicamento");
        add(medicamentosSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 230, 20));

        publicidadOnline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DisfrutaEtc.png"))); // NOI18N
        add(publicidadOnline, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 250, 240));

        publicidadMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DistribuidosPorXGen.png"))); // NOI18N
        add(publicidadMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 240, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxSeleccionarMedicamento;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoMedicamento;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JLabel labeLugarTres;
    private javax.swing.JLabel labelFechaV;
    private javax.swing.JLabel labelLugarDos;
    private javax.swing.JLabel labelLugarUno;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTemp;
    private javax.swing.JLabel medicamentosSubtitulo;
    private javax.swing.JLabel medicamentosTitulo;
    private javax.swing.JLabel publicidadMedicamentos;
    private javax.swing.JLabel publicidadOnline;
    // End of variables declaration//GEN-END:variables
}
