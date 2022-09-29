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

        jLTitulo = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLanio = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtAnio = new javax.swing.JTextField();
        jtxtId = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLTitulo.setText("Agregar Materia");

        jLid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLid.setText("ID");

        jLNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLNombre.setText("Nombre");

        jLanio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLanio.setText("Año");

        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyReleased(evt);
            }
        });

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

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnVolver.setText("Volver");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLanio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLid)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLanio)
                    .addComponent(jtxtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnVolver)
                    .addComponent(jBtnLimpiar))
                .addGap(40, 40, 40))
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
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLanio;
    private javax.swing.JLabel jLid;
    private javax.swing.JTextField jtxtAnio;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
