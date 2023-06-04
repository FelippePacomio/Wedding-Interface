package br.weddinginterface.interface_principal;

import br.weddinginterface.model.*;
import javax.swing.JOptionPane;

public class Tela_Cadastro extends javax.swing.JFrame {

    public Tela_Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addGap(209, 209, 209))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 601, 1080);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("E-mail");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(677, 243, 51, 23);

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField2.setToolTipText("Informe um e-mail válido.");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(677, 417, 300, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(677, 388, 46, 23);

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField3.setToolTipText("Informe um e-mail válido.");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(677, 272, 300, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Senha");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(677, 532, 55, 23);

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPasswordField1.setToolTipText("Crie uma senha.");
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(677, 561, 300, 30);

        btnVoltar.setBackground(new java.awt.Color(204, 0, 51));
        btnVoltar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(677, 646, 99, 23);

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CADASTRAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(878, 646, 101, 23);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1164, 0, 280, 300);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1160, 910, 280, 180);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1172, 316, 280, 300);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(677, 111, 302, 31);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(677, 148, 302, 10);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1164, 602, 280, 300);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1164, 602, 280, 300);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 280, 300);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, 0, 280, 300);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel18.setToolTipText("");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 0, 280, 300);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel19.setToolTipText("");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 0, 280, 300);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 0, 280, 300);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1450, 0, 280, 300);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1440, 910, 280, 180);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1460, 320, 280, 300);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1450, 610, 280, 300);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1450, 610, 280, 300);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(1720, 20, 280, 300);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel22.setToolTipText("");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(1720, 930, 280, 180);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel23.setToolTipText("");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1730, 340, 280, 300);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel24.setToolTipText("");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1720, 620, 280, 300);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel25.setToolTipText("");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(1720, 620, 280, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    public boolean verificarEmail(String email) {
        // Verifica se o email contém "@"
        if (!email.contains("@")) {
            return false;
        }

        // Verifica se o email contém um dos domínios permitidos
        if (!email.endsWith("@gmail.com") && !email.endsWith("@outlook.com") && !email.endsWith("@hotmail.com")) {
            return false;
        }

        // Verifica se o email termina com ".com" ou ".br"
        if (!email.endsWith(".com") && !email.endsWith(".br")) {
            return false;
        }

        return true;
    }

 public boolean verificarSenha(String senha) {
    try {
        Integer.parseInt(senha);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Interface_Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                          
    try {
        String email = jTextField3.getText();
        String login = jTextField2.getText();
        String senhaStr = jPasswordField1.getText();

        // Verifica se o email é válido
        if (!verificarEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email inválido. Apenas @gmail/@outlook/@hotmail com .com/.br são permitidos", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Retorna sem prosseguir com o login
        }

        // Verifica se a senha contém apenas números
         if (!verificarSenha(senhaStr)) {
            JOptionPane.showMessageDialog(this, "Senha inválida. Apenas números são permitidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Retorna sem prosseguir com o login
        }

        int senha = Integer.parseInt(senhaStr);

        Usuario us = new Usuario();
        us.setEmail(email);
        us.setLogin(login);
        us.setSenha(senha);

        us.insereUsuario(us);

        JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");
        new Tela_Login().setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
