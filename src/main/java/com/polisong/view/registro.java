/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.polisong.view;

import com.polisong.controller.UsuarioController;
import com.polisong.model.gestorUsuarios;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author CAMILO
 */
public class registro extends javax.swing.JFrame {
    
    Border bordeOriginal;


    /**
     * Creates new form registro
     */
    public registro() {
        initComponents();
        
        pack();
        setLocationRelativeTo(null);
        
        bordeOriginal = jTextField1.getBorder();
        

    // Botón transparente con borde invisible
    jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
    jButton3.setContentAreaFilled(false);
    jButton3.setFocusPainted(false);
    jButton3.setOpaque(false);

    // Efecto hover (subrayado)
    jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton3.setBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.WHITE)
            );
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton3.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0)
            );
        }
    });
    
    
        // Botón transparente con borde invisible
    jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
    jButton4.setContentAreaFilled(false);
    jButton4.setFocusPainted(false);
    jButton4.setOpaque(false);

    // Efecto hover (subrayado)
    jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton4.setBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.WHITE)
            );
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton4.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0)
            );
        }
    });
    
            // Botón transparente con borde invisible
    jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
    jButton5.setContentAreaFilled(false);
    jButton5.setFocusPainted(false);
    jButton5.setOpaque(false);

    // Efecto hover (subrayado)
    jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton5.setBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.WHITE)
            );
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton5.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0)
            );
        }
    });
    
    
            // Botón transparente con borde invisible
    jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
    jButton6.setContentAreaFilled(false);
    jButton6.setFocusPainted(false);
    jButton6.setOpaque(false);

    // Efecto hover (subrayado)
    jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton6.setBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.WHITE)
            );
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton6.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0)
            );
        }
    });
    
            // Botón transparente con borde invisible
    jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
    jButton7.setContentAreaFilled(false);
    jButton7.setFocusPainted(false);
    jButton7.setOpaque(false);

    // Efecto hover (subrayado)
    jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton7.setBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.WHITE)
            );
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton7.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0)
            );
        }
    });


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1284, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("POLISONG STOCK");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("CUENTA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel9.setText("Crea una cuenta");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel10.setText("Nombre");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel11.setText("Apellido");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel12.setText("Direccion de correo electronico");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel13.setText("Contraseña");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel14.setText("Confirmar contraseña");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 290, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 290, 30));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 290, 30));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 290, 30));
        jPanel3.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 290, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("INICIO");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CATALOGO");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("COLECCIONES");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BLOG");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CONTACTO");
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "proveedor", "comprador", "administrador", " " }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel3.setText("Tipo de cuenta");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registro polisong.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        formularioIngreso fi = new formularioIngreso();
        fi.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           // Recuperar valores
    String nombre = jTextField1.getText().trim();
    String apellido = jTextField2.getText().trim();
    String correo = jTextField3.getText().trim();
    String contrasena = String.valueOf(jPasswordField1.getPassword()).trim();
    String confirmar = String.valueOf(jPasswordField2.getPassword()).trim();
    
    
    
        // Resetear bordes
    jTextField1.setBorder(bordeOriginal);
    jTextField2.setBorder(bordeOriginal);
    jTextField3.setBorder(bordeOriginal);
    jPasswordField1.setBorder(bordeOriginal);
    jPasswordField2.setBorder(bordeOriginal);
    
    
    
        // 1. Validar campos vacíos
    if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || confirmar.isEmpty()) {
        JOptionPane.showMessageDialog(this, 
            "Todos los campos son obligatorios.", 
            "Campos incompletos", 
            JOptionPane.WARNING_MESSAGE);

        if (nombre.isEmpty()) jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        if (apellido.isEmpty()) jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        if (correo.isEmpty()) jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        if (contrasena.isEmpty()) jPasswordField1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        if (confirmar.isEmpty()) jPasswordField2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        return;
    }
    
        // 2. Validar nombre y apellido (solo letras)
    if (!nombre.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ ]+")) {
        JOptionPane.showMessageDialog(this, 
            "El nombre solo debe contener letras.", 
            "Dato no válido", 
            JOptionPane.WARNING_MESSAGE);
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        return;
    }
    
        if (!apellido.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ ]+")) {
        JOptionPane.showMessageDialog(this, 
            "El apellido solo debe contener letras.", 
            "Dato no válido", 
            JOptionPane.WARNING_MESSAGE);
        jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        return;
    }
        
         // 3. Validar correo que termine en @correo.com
    if (!correo.endsWith("@gmail.com")) {
        JOptionPane.showMessageDialog(this, 
            "El correo debe terminar en '@gmail.com.com'.", 
            "Correo no válido", 
            JOptionPane.WARNING_MESSAGE);
        jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        return;
    }
    
        // 4. Validar contraseña solo numérica
    if (!contrasena.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, 
            "La contraseña debe contener solo números.", 
            "Contraseña inválida", 
            JOptionPane.WARNING_MESSAGE);
        jPasswordField1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        return;
    }
    
        // 5. Validar coincidencia de contraseñas
    if (!contrasena.equals(confirmar)) {
        JOptionPane.showMessageDialog(this, 
            "Las contraseñas no coinciden.", 
            "Error", 
            JOptionPane.WARNING_MESSAGE);
        jPasswordField2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        return;
    }
    
    
        // ---- INTEGRACIÓN CON BASE DE DATOS ----
    UsuarioController controller = new UsuarioController();
        String rol = jComboBox1.getSelectedItem().toString();
    boolean registrado = controller.registrarUsuario(nombre, apellido, correo, contrasena, rol);

    if (!registrado) {
        JOptionPane.showMessageDialog(this,
            "No se pudo registrar el usuario. Revise los datos.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Registro exitoso
    JOptionPane.showMessageDialog(this, 
        "Cuenta creada correctamente.", 
        "Registro exitoso", 
        JOptionPane.INFORMATION_MESSAGE);
    
    gestorUsuarios.registrarUsuario(nombre, apellido, correo, contrasena);
    
        // 6. Todo correcto → registrar usuario
    JOptionPane.showMessageDialog(this, 
        "Cuenta creada correctamente.", 
        "Registro exitoso", 
        JOptionPane.INFORMATION_MESSAGE);
    
        // 7. Redirigir al frame de inicio de sesión
    formularioIngreso login = new formularioIngreso();  
    login.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
