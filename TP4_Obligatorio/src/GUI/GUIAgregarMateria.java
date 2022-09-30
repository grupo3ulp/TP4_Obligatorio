/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entidades.Materia;
import javax.swing.JOptionPane;
import tp4_obligatorio.Colegio;

/**
 *
 * @author Moon
 */
public class GUIAgregarMateria extends javax.swing.JFrame {

    /**
     * Creates new form GUIAgregarMateria
     */
    public GUIAgregarMateria() {
        initComponents();
        setResizable(false);
        jBtnGuardar.setEnabled(false);
    }

    public void habilitarBoton() {
        if (!jtxtId.getText().isEmpty() && !jtxtAnio.getText().isEmpty()
                && !jtxtNombre.getText().isEmpty()) {
            jBtnGuardar.setEnabled(true);
        } else {
            jBtnGuardar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLid = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLanio = new javax.swing.JLabel();
        jtxtAnio = new javax.swing.JTextField();
        jBtnVolver = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLid.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLid.setForeground(new java.awt.Color(51, 51, 51));
        jLid.setText("ID");
        jPanel1.add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jtxtId.setBackground(new java.awt.Color(255, 255, 255));
        jtxtId.setBorder(null);
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        jtxtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtIdKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 318, 30));

        jLNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLNombre.setText("Nombre");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jtxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setBorder(null);
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 318, 30));

        jLanio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLanio.setForeground(new java.awt.Color(51, 51, 51));
        jLanio.setText("Año");
        jPanel1.add(jLanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jtxtAnio.setBackground(new java.awt.Color(255, 255, 255));
        jtxtAnio.setBorder(null);
        jtxtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAnioActionPerformed(evt);
            }
        });
        jtxtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtAnioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAnioKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 318, 30));

        jBtnVolver.setBackground(new java.awt.Color(53, 44, 91));
        jBtnVolver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVolver.setText("Volver");
        jBtnVolver.setBorder(null);
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 94, 30));

        jBtnLimpiar.setBackground(new java.awt.Color(53, 44, 91));
        jBtnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.setBorder(null);
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 94, 30));

        jBtnGuardar.setBackground(new java.awt.Color(53, 44, 91));
        jBtnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.setBorder(null);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 94, 30));

        sidePanel.setBackground(new java.awt.Color(53, 44, 91));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Materia");
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 10));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 440));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 320, 20));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 320, 20));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 320, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed

        int aux = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea guardar esta materia?");
        if (aux == 0) {
            boolean flag = true;
            for (Materia materia : Colegio.getMaterias()) {
                if (materia.getIdMateria() == Integer.parseInt(jtxtId.getText())) {
                    flag = false;
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(rootPane, "El Id de la materia ya está en uso.");
            } else {
                Colegio.getMaterias().add(new Materia(Integer.parseInt(jtxtId.getText()), jtxtNombre.getText(), Integer.parseInt(jtxtAnio.getText())));
                JOptionPane.showMessageDialog(rootPane, "Materia guaradada correctamente");
            }
            jtxtId.setText("");
            jtxtAnio.setText("");
            jtxtNombre.setText("");
            jBtnGuardar.setEnabled(false);
        } else if (aux == 1) {
            jtxtId.setText("");
            jtxtAnio.setText("");
            jtxtNombre.setText("");
            jBtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        GuiMain main = new GuiMain();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        jtxtId.setText("");
        jtxtAnio.setText("");
        jtxtNombre.setText("");
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jtxtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIdKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");

        }
        if (jtxtId.getText().length() > 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtIdKeyTyped

    private void jtxtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAnioActionPerformed

    private void jtxtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAnioKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");

        }
        if (jtxtAnio.getText().length() > 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtAnioKeyTyped

    private void jtxtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIdKeyReleased
       habilitarBoton();
    }//GEN-LAST:event_jtxtIdKeyReleased

    private void jtxtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jtxtNombreKeyReleased

    private void jtxtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAnioKeyReleased
       habilitarBoton();
    }//GEN-LAST:event_jtxtAnioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLanio;
    private javax.swing.JLabel jLid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jtxtAnio;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
