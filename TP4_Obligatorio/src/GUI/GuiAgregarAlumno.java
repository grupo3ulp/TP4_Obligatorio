/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entidades.Alumno;
import javax.swing.JOptionPane;
import tp4_obligatorio.Colegio;

/**
 *
 * @author Heisen
 */
public class GuiAgregarAlumno extends javax.swing.JFrame {

    public GuiAgregarAlumno() {
        initComponents();
        setResizable(false);
        btnGuardar.setEnabled(false);
    }

    public void habilitarBoton() {
        if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty()
                && !txtLegajo.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlLegajo = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(596, 443));
        setResizable(false);
        setSize(new java.awt.Dimension(596, 443));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLegajo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlLegajo.setForeground(new java.awt.Color(51, 51, 51));
        jlLegajo.setText("Legajo");
        jPanel1.add(jlLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        txtLegajo.setBackground(new java.awt.Color(255, 255, 255));
        txtLegajo.setForeground(new java.awt.Color(204, 204, 204));
        txtLegajo.setText("Ingrese el número de Legajo");
        txtLegajo.setBorder(null);
        txtLegajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLegajoMousePressed(evt);
            }
        });
        txtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLegajoActionPerformed(evt);
            }
        });
        txtLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLegajoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLegajoKeyTyped(evt);
            }
        });
        jPanel1.add(txtLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 310, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese su nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 30));

        jLNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLNombre.setText("Nombre");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Ingrese su apellido");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 310, 30));

        jLApellido.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLApellido.setForeground(new java.awt.Color(51, 51, 51));
        jLApellido.setText("Apellido");
        jPanel1.add(jLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btnVolver.setBackground(new java.awt.Color(53, 44, 91));
        btnVolver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 90, 30));

        btnLimpiar.setBackground(new java.awt.Color(53, 44, 91));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 90, 30));

        btnGuardar.setBackground(new java.awt.Color(53, 44, 91));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 90, 30));

        sidePanel.setBackground(new java.awt.Color(53, 44, 91));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Alumno");
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 10));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 440));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 280, -1));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 280, 20));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLegajoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int aux = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea guardar este alumno");
        if (aux == 0) {
            Colegio.getAlumnos().add(new Alumno(txtNombre.getText(), txtApellido.getText(),
                    Integer.parseInt(txtLegajo.getText())));
            JOptionPane.showMessageDialog(rootPane, "Alumno guardado correctamente");
            txtApellido.setText("");
            txtLegajo.setText("");
            txtNombre.setText("");
            btnGuardar.setEnabled(false);
        } else if (aux == 1) {
            txtApellido.setText("");
            txtLegajo.setText("");
            txtNombre.setText("");
            btnGuardar.setEnabled(false);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        GuiMain main = new GuiMain();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtApellido.setText("");
        txtLegajo.setText("");
        txtNombre.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtLegajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLegajoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtLegajoKeyReleased

    private void txtLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLegajoKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");

        }
        if (txtLegajo.getText().length() > 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLegajoKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtLegajoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLegajoMousePressed
        txtLegajo.setText("");
    }//GEN-LAST:event_txtLegajoMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        txtApellido.setText("");
    }//GEN-LAST:event_txtApellidoMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlLegajo;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
