package br.weddinginterface.interface_principal;

import br.weddinginterface.model.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Tela_Login extends javax.swing.JFrame {

    Usuario user = new Usuario();
    Color color_red = new Color(255, 102, 102);
    Color color_white = new Color(255, 255, 255);

    public Tela_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel9.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1900, 1080));

        jPanel1.setBackground(new java.awt.Color(253, 231, 231));
        jPanel1.setMaximumSize(new java.awt.Dimension(1900, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1900, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1080));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(601, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(601, 1080));
        jPanel2.setPreferredSize(new java.awt.Dimension(601, 1080));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wedding Interface.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 601, 1080);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(677, 265, 300, 23);

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(677, 294, 300, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(680, 440, 300, 23);

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(680, 460, 300, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(780, 590, 110, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("N�o tem uma conta? Clique aqui.");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(780, 500, 200, 16);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(677, 90, 316, 31);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(677, 127, 354, 10);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1350, 343, 280, 300);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1350, 649, 280, 300);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1630, 20, 280, 300);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1650, 950, 280, 180);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1620, 340, 280, 300);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1620, 650, 280, 300);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1350, 26, 280, 300);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(1370, 930, 280, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        int senha;
        senha = Integer.parseInt(jPasswordField1.getText());

        if (!(user.checarSenha(senha))) {
            jPasswordField1.setBackground(color_red);
        } else {
            jPasswordField1.setBackground(color_white);
        }
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Tela_Cadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String usuario;
        usuario = jTextField1.getText();

        if (!(user.checarLogin(usuario))) {
            jTextField1.setBackground(color_red);
        } else {
            jTextField1.setBackground(color_white);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tratamentoUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        String usuario;

        usuario = jTextField1.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            user.checarLogin(usuario);
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void tratamentoUsuario() {
        String usuario;
        int senha;

        usuario = jTextField1.getText();
        senha = Integer.parseInt(jPasswordField1.getText());

        if (user.checarLoginESenha(usuario, senha)) {
            new Menu_Orcamento().setVisible(true);
            this.dispose();
        }

        if (!(user.checarLogin(usuario) && user.checarSenha(senha))) {
            jTextField1.setBackground(color_red);
            jPasswordField1.setBackground(color_red);
            JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos!");

        } else if (jTextField1.getText() == null || jPasswordField1.getText() == null) {
            jTextField1.setBackground(color_red);
            jPasswordField1.setBackground(color_red);
            JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos!");
        } else if (jTextField1.getText() == null && jPasswordField1.getText() == null) {
            jTextField1.setBackground(color_red);
            jPasswordField1.setBackground(color_red);
            JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos!");
        } else {
            jPasswordField1.setBackground(color_white);
            jTextField1.setBackground(color_white);
        }
    }

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                tratamentoUsuario();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            jTextField1.setBackground(color_red);
            jPasswordField1.setBackground(color_red);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                tratamentoUsuario();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            jTextField1.setBackground(color_red);
            jPasswordField1.setBackground(color_red);
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
