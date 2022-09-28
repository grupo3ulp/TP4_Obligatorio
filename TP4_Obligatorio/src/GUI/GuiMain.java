/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entidades.Alumno;
import entidades.Materia;
import javax.swing.JOptionPane;
import tp4_obligatorio.Colegio;

/**
 *
 * @author Heisen
 */
public class GuiMain extends javax.swing.JFrame {

    /**
     * Creates new form GuiMain
     */
    public GuiMain() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        btnAgregarAl = new javax.swing.JButton();
        btnAgregarMat = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        btnMostrarAl = new javax.swing.JButton();
        btnMostrarMat = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLTitulo.setText("Colegio Hogwarts");

        btnAgregarAl.setText("Agregar Alumno");
        btnAgregarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlActionPerformed(evt);
            }
        });

        btnAgregarMat.setText("Agregar Materia");
        btnAgregarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMatActionPerformed(evt);
            }
        });

        btnInscribir.setText("Inscribir Alumno");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnMostrarAl.setText("Mostrar Alumnos");
        btnMostrarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlActionPerformed(evt);
            }
        });

        btnMostrarMat.setText("Mostrar Materias");
        btnMostrarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMatActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnAgregarAl)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnInscribir)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarAl)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlActionPerformed
        GuiAgregarAlumno agregarAl = new GuiAgregarAlumno();
        agregarAl.setVisible(true);
        agregarAl.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAgregarAlActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        txtResultado.setText(" ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if ((JOptionPane.showConfirmDialog(null, "Realmente "
                + "desea salir?", "Confirmar salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlActionPerformed
        String aux2 = " ";
        for (Alumno aux : Colegio.getAlumnos()) {
            aux2 += aux + "\n" + "------------------------" + "\n";
        }
        txtResultado.setText(aux2);

    }//GEN-LAST:event_btnMostrarAlActionPerformed

    private void btnAgregarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMatActionPerformed
        GUIAgregarMateria agregarMat = new GUIAgregarMateria();
        agregarMat.setVisible(true);
        agregarMat.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAgregarMatActionPerformed

    private void btnMostrarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMatActionPerformed
        String aux2 = " ";
        for (Materia aux : Colegio.getMaterias()) {
            aux2 += aux + "\n" + "------------------------" + "\n";
        }
        txtResultado.setText(aux2);
    }//GEN-LAST:event_btnMostrarMatActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        GuiInscribirAlumno inscribir = new GuiInscribirAlumno();
        inscribir.setVisible(true);
        inscribir.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnInscribirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAl;
    private javax.swing.JButton btnAgregarMat;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnMostrarAl;
    private javax.swing.JButton btnMostrarMat;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
