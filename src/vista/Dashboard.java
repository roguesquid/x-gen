/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.MedicamentoRefrigerado;
import model.MedicamentoTemperaturaAmbiente;

/**
 *
 * @author luisr
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        InitContent();

    }

    private void InitContent() {
        ShowJPanel(new PanelMedicamentos());
    }

    public static void ShowJPanel(JPanel p) {
        p.setSize(722, 568);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        botonVentas = new javax.swing.JButton();
        botonMedicamentos = new javax.swing.JButton();
        botonInventario = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X-Gen");
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 18, -1, -1));

        botonVentas.setFont(new java.awt.Font("Hind", 1, 12)); // NOI18N
        botonVentas.setForeground(new java.awt.Color(109, 127, 136));
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/dollar.png"))); // NOI18N
        botonVentas.setText("  Ventas");
        botonVentas.setBorderPainted(false);
        botonVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonVentas.setMargin(new java.awt.Insets(2, 10, 2, 14));
        botonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentasActionPerformed(evt);
            }
        });
        jPanel1.add(botonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 33));

        botonMedicamentos.setBackground(new java.awt.Color(108, 170, 255));
        botonMedicamentos.setFont(new java.awt.Font("Hind", 1, 12)); // NOI18N
        botonMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/pill.png"))); // NOI18N
        botonMedicamentos.setText("Medicamentos");
        botonMedicamentos.setBorderPainted(false);
        botonMedicamentos.setMargin(new java.awt.Insets(2, 6, 2, 14));
        botonMedicamentos.setOpaque(true);
        botonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(botonMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 33));

        botonInventario.setFont(new java.awt.Font("Hind", 1, 12)); // NOI18N
        botonInventario.setForeground(new java.awt.Color(109, 127, 136));
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/tasks.png"))); // NOI18N
        botonInventario.setText("  Inventario");
        botonInventario.setBorderPainted(false);
        botonInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonInventario.setMargin(new java.awt.Insets(2, 10, 2, 14));
        botonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 33));

        botonSalir.setBackground(new java.awt.Color(136, 186, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/logout.png"))); // NOI18N
        botonSalir.setBorderPainted(false);
        botonSalir.setMargin(new java.awt.Insets(8, 10, 8, 10));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 550, -1, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 16, 722, 568));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonMedicamentosActionPerformed
        // TODO add your handling code here:
        botonMedicamentos.setBackground(new java.awt.Color(108, 170, 255));
        botonMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/pill.png"))); // NOI18N
        botonMedicamentos.setOpaque(true);

        botonInventario.setBackground(new java.awt.Color(255, 255, 255));
        botonInventario.setForeground(new java.awt.Color(109, 127, 136));
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/tasks.png"))); // NOI18N
        botonInventario.setOpaque(false);

        botonVentas.setBackground(new java.awt.Color(255, 255, 255));
        botonVentas.setForeground(new java.awt.Color(109, 127, 136));
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/dollar.png"))); // NOI18N
        botonVentas.setOpaque(false);
        
        ShowJPanel(new PanelMedicamentos());
    }// GEN-LAST:event_botonMedicamentosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }// GEN-LAST:event_botonSalirActionPerformed

    private void botonInventarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonInventarioActionPerformed
        // TODO add your handling code here:
        botonInventario.setBackground(new java.awt.Color(108, 170, 255));
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/TasksWhite.png"))); // NOI18N
        botonInventario.setForeground(new java.awt.Color(255, 255, 255));
        botonInventario.setOpaque(true);

        botonMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        botonMedicamentos.setForeground(new java.awt.Color(109, 127, 136));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/Pill-rBlack.png"))); // NOI18N
        botonMedicamentos.setOpaque(false);

        botonVentas.setBackground(new java.awt.Color(255, 255, 255));
        botonVentas.setForeground(new java.awt.Color(109, 127, 136));
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/dollar.png"))); // NOI18N
        botonVentas.setOpaque(false);
        
        ShowJPanel(new PanelInventario());
    }// GEN-LAST:event_botonInventarioActionPerformed

    private void botonVentasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonVentasActionPerformed
        // TODO add your handling code here:
        botonVentas.setBackground(new java.awt.Color(108, 170, 255));
        botonVentas.setForeground(new java.awt.Color(255, 255, 255));
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/dollarWhite.png"))); // NOI18N
        botonVentas.setOpaque(true);

        botonMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        botonMedicamentos.setForeground(new java.awt.Color(109, 127, 136));
        botonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/Pill-rBlack.png"))); // NOI18N
        botonMedicamentos.setOpaque(false);

        botonInventario.setBackground(new java.awt.Color(255, 255, 255));
        botonInventario.setForeground(new java.awt.Color(109, 127, 136));
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/tasks.png"))); // NOI18N
        botonInventario.setOpaque(false);
    }// GEN-LAST:event_botonVentasActionPerformed

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0);
    }// GEN-LAST:event_botonSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInventario;
    private javax.swing.JButton botonMedicamentos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVentas;
    private static javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
