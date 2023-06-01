package br.weddinginterface.interface_principal;

import java.awt.Color;
import br.weddinginterface.model.Convidados;
import javax.swing.JOptionPane;

public class Menu_AdicionarConvidado extends javax.swing.JFrame {
    
    Color mySelect = new Color(255, 161, 170);
    Color myUnSelect = new Color(253, 214, 218);
    Color mySubUnSelect = new Color(232, 194, 194);
    
    public Menu_AdicionarConvidado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barraMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOrcamento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnNoiva = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEvento = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnConvidados = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnAdicionarConvidado = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnGerenciarConvidados = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnNoivo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(253, 231, 231));
        background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        background.setMinimumSize(new java.awt.Dimension(1920, 1080));
        background.setPreferredSize(new java.awt.Dimension(1920, 1080));
        background.setLayout(null);

        barraMenu.setBackground(new java.awt.Color(204, 0, 51));
        barraMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraMenu.setMaximumSize(new java.awt.Dimension(300, 1080));
        barraMenu.setMinimumSize(new java.awt.Dimension(300, 1080));
        barraMenu.setPreferredSize(new java.awt.Dimension(300, 1080));
        barraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        barraMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        btnOrcamento.setBackground(new java.awt.Color(253, 214, 218));
        btnOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrcamento.setMaximumSize(new java.awt.Dimension(150, 75));
        btnOrcamento.setMinimumSize(new java.awt.Dimension(150, 75));
        btnOrcamento.setPreferredSize(new java.awt.Dimension(150, 75));
        btnOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrcamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrcamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrcamentoMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orcamento.png"))); // NOI18N
        jLabel4.setText("               ORÇAMENTO");

        javax.swing.GroupLayout btnOrcamentoLayout = new javax.swing.GroupLayout(btnOrcamento);
        btnOrcamento.setLayout(btnOrcamentoLayout);
        btnOrcamentoLayout.setHorizontalGroup(
            btnOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        btnOrcamentoLayout.setVerticalGroup(
            btnOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrcamentoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        barraMenu.add(btnOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, -1));

        btnNoiva.setBackground(new java.awt.Color(253, 214, 218));
        btnNoiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoiva.setMaximumSize(new java.awt.Dimension(150, 75));
        btnNoiva.setMinimumSize(new java.awt.Dimension(150, 75));
        btnNoiva.setPreferredSize(new java.awt.Dimension(150, 75));
        btnNoiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoivaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoivaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNoivaMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noiva.png"))); // NOI18N
        jLabel2.setText("                    NOIVA");

        javax.swing.GroupLayout btnNoivaLayout = new javax.swing.GroupLayout(btnNoiva);
        btnNoiva.setLayout(btnNoivaLayout);
        btnNoivaLayout.setHorizontalGroup(
            btnNoivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNoivaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        btnNoivaLayout.setVerticalGroup(
            btnNoivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNoivaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        barraMenu.add(btnNoiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, -1));

        btnEvento.setBackground(new java.awt.Color(253, 214, 218));
        btnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvento.setMaximumSize(new java.awt.Dimension(150, 75));
        btnEvento.setMinimumSize(new java.awt.Dimension(150, 75));
        btnEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEventoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEventoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEventoMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/evento.png"))); // NOI18N
        jLabel15.setText("                   EVENTO");

        javax.swing.GroupLayout btnEventoLayout = new javax.swing.GroupLayout(btnEvento);
        btnEvento.setLayout(btnEventoLayout);
        btnEventoLayout.setHorizontalGroup(
            btnEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        btnEventoLayout.setVerticalGroup(
            btnEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEventoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18))
        );

        barraMenu.add(btnEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, -1));

        btnConvidados.setBackground(new java.awt.Color(253, 214, 218));
        btnConvidados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConvidados.setMaximumSize(new java.awt.Dimension(150, 75));
        btnConvidados.setMinimumSize(new java.awt.Dimension(150, 75));
        btnConvidados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvidadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvidadosMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convidados.png"))); // NOI18N
        jLabel16.setText("              CONVIDADOS");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta-para-baixo.png"))); // NOI18N

        javax.swing.GroupLayout btnConvidadosLayout = new javax.swing.GroupLayout(btnConvidados);
        btnConvidados.setLayout(btnConvidadosLayout);
        btnConvidadosLayout.setHorizontalGroup(
            btnConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConvidadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(31, 31, 31))
        );
        btnConvidadosLayout.setVerticalGroup(
            btnConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConvidadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(btnConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel26))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        barraMenu.add(btnConvidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, -1));

        btnAdicionarConvidado.setBackground(new java.awt.Color(232, 194, 194));
        btnAdicionarConvidado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarConvidado.setMaximumSize(new java.awt.Dimension(150, 75));
        btnAdicionarConvidado.setMinimumSize(new java.awt.Dimension(150, 75));
        btnAdicionarConvidado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarConvidadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarConvidadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarConvidadoMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jLabel25.setText("      ADICIONAR CONVIDADO");

        javax.swing.GroupLayout btnAdicionarConvidadoLayout = new javax.swing.GroupLayout(btnAdicionarConvidado);
        btnAdicionarConvidado.setLayout(btnAdicionarConvidadoLayout);
        btnAdicionarConvidadoLayout.setHorizontalGroup(
            btnAdicionarConvidadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdicionarConvidadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        btnAdicionarConvidadoLayout.setVerticalGroup(
            btnAdicionarConvidadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdicionarConvidadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel25)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        barraMenu.add(btnAdicionarConvidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        btnGerenciarConvidados.setBackground(new java.awt.Color(232, 194, 194));
        btnGerenciarConvidados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerenciarConvidados.setMaximumSize(new java.awt.Dimension(150, 75));
        btnGerenciarConvidados.setMinimumSize(new java.awt.Dimension(150, 75));
        btnGerenciarConvidados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerenciarConvidadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGerenciarConvidadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGerenciarConvidadosMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/curriculo.png"))); // NOI18N
        jLabel20.setText("      GERENCIAR CONVIDADOS");

        javax.swing.GroupLayout btnGerenciarConvidadosLayout = new javax.swing.GroupLayout(btnGerenciarConvidados);
        btnGerenciarConvidados.setLayout(btnGerenciarConvidadosLayout);
        btnGerenciarConvidadosLayout.setHorizontalGroup(
            btnGerenciarConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGerenciarConvidadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGerenciarConvidadosLayout.setVerticalGroup(
            btnGerenciarConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGerenciarConvidadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel20)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        barraMenu.add(btnGerenciarConvidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 300, -1));

        btnNoivo.setBackground(new java.awt.Color(253, 214, 218));
        btnNoivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoivo.setMaximumSize(new java.awt.Dimension(150, 75));
        btnNoivo.setMinimumSize(new java.awt.Dimension(150, 75));
        btnNoivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNoivoMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noivo (1).png"))); // NOI18N
        jLabel3.setText("                    NOIVO");

        javax.swing.GroupLayout btnNoivoLayout = new javax.swing.GroupLayout(btnNoivo);
        btnNoivo.setLayout(btnNoivoLayout);
        btnNoivoLayout.setHorizontalGroup(
            btnNoivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNoivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        btnNoivoLayout.setVerticalGroup(
            btnNoivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNoivoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        barraMenu.add(btnNoivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        background.add(barraMenu);
        barraMenu.setBounds(0, 0, 300, 1080);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        background.add(jLabel11);
        jLabel11.setBounds(1450, 980, 280, 180);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        background.add(jLabel12);
        jLabel12.setBounds(1420, 0, 280, 320);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        background.add(jLabel13);
        jLabel13.setBounds(1440, 340, 280, 320);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        background.add(jLabel14);
        jLabel14.setBounds(1450, 670, 280, 320);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1);
        jButton1.setBounds(960, 570, 110, 23);

        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField4.setToolTipText("Informe as restrições alimentares de convidado (se houver).");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        background.add(jTextField4);
        jTextField4.setBounds(970, 450, 220, 30);

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField5.setToolTipText("Informe o número para contato do convidado.");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        background.add(jTextField5);
        jTextField5.setBounds(550, 450, 220, 30);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wedding Interface(red).png"))); // NOI18N
        background.add(jLabel24);
        jLabel24.setBounds(300, 100, 1133, 164);

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel31.setText("NOME");
        background.add(jLabel31);
        jLabel31.setBounds(550, 330, 220, 21);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/genealogia.png"))); // NOI18N
        background.add(jLabel33);
        jLabel33.setBounds(930, 430, 32, 40);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setText("TELEFONE");
        background.add(jLabel8);
        jLabel8.setBounds(550, 430, 220, 21);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setText("GRAU PARENTESCO");
        background.add(jLabel9);
        jLabel9.setBounds(970, 430, 220, 21);

        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField6.setToolTipText("Informe o nome do convidado.");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        background.add(jTextField6);
        jTextField6.setBounds(550, 350, 220, 30);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel10.setText("RESTRIÇÃO ALIMENTAR");
        background.add(jLabel10);
        jLabel10.setBounds(970, 330, 220, 21);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carteira-de-identidade.png"))); // NOI18N
        background.add(jLabel34);
        jLabel34.setBounds(510, 330, 32, 40);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chamada-telefonica.png"))); // NOI18N
        background.add(jLabel35);
        jLabel35.setBounds(510, 430, 32, 40);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prato.png"))); // NOI18N
        background.add(jLabel37);
        jLabel37.setBounds(930, 330, 32, 40);

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField7.setToolTipText("Informe as restrições alimentares de convidado (se houver).");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        background.add(jTextField7);
        jTextField7.setBounds(970, 350, 220, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel6.setToolTipText("");
        background.add(jLabel6);
        jLabel6.setBounds(1730, 0, 280, 300);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel7.setToolTipText("");
        background.add(jLabel7);
        jLabel7.setBounds(1730, 910, 280, 180);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel17.setToolTipText("");
        background.add(jLabel17);
        jLabel17.setBounds(1740, 320, 280, 300);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel18.setToolTipText("");
        background.add(jLabel18);
        jLabel18.setBounds(1730, 600, 280, 300);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180 × 200 px) (280 × 300 px).png"))); // NOI18N
        jLabel19.setToolTipText("");
        background.add(jLabel19);
        jLabel19.setBounds(1730, 600, 280, 300);

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2);
        jButton2.setBounds(700, 570, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventoMousePressed
    }//GEN-LAST:event_btnEventoMousePressed

    private void btnNoivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoivoMouseEntered
        btnNoivo.setBackground(mySelect);
    }//GEN-LAST:event_btnNoivoMouseEntered

    private void btnNoivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoivoMouseExited
        btnNoivo.setBackground(myUnSelect);
    }//GEN-LAST:event_btnNoivoMouseExited

    private void btnEventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventoMouseEntered
        btnEvento.setBackground(mySelect);
    }//GEN-LAST:event_btnEventoMouseEntered

    private void btnEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventoMouseExited
        btnEvento.setBackground(myUnSelect);
    }//GEN-LAST:event_btnEventoMouseExited

    private void btnConvidadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvidadosMouseEntered
        btnConvidados.setBackground(mySelect);
    }//GEN-LAST:event_btnConvidadosMouseEntered

    private void btnConvidadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvidadosMouseExited
        btnConvidados.setBackground(myUnSelect);
    }//GEN-LAST:event_btnConvidadosMouseExited

    private void btnOrcamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrcamentoMouseEntered
        btnOrcamento.setBackground(mySelect);
    }//GEN-LAST:event_btnOrcamentoMouseEntered

    private void btnOrcamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrcamentoMouseExited
        btnOrcamento.setBackground(myUnSelect);
    }//GEN-LAST:event_btnOrcamentoMouseExited

    private void btnNoivaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoivaMouseEntered
        btnNoiva.setBackground(mySelect);
    }//GEN-LAST:event_btnNoivaMouseEntered

    private void btnNoivaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoivaMouseExited
        btnNoiva.setBackground(myUnSelect);
    }//GEN-LAST:event_btnNoivaMouseExited

    private void btnAdicionarConvidadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarConvidadoMouseEntered
        btnAdicionarConvidado.setBackground(mySelect);
    }//GEN-LAST:event_btnAdicionarConvidadoMouseEntered

    private void btnAdicionarConvidadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarConvidadoMouseExited
        btnAdicionarConvidado.setBackground(mySubUnSelect);
    }//GEN-LAST:event_btnAdicionarConvidadoMouseExited

    private void btnGerenciarConvidadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarConvidadosMouseEntered
        btnGerenciarConvidados.setBackground(mySelect);
    }//GEN-LAST:event_btnGerenciarConvidadosMouseEntered

    private void btnGerenciarConvidadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarConvidadosMouseExited
        btnGerenciarConvidados.setBackground(mySubUnSelect);
    }//GEN-LAST:event_btnGerenciarConvidadosMouseExited

    private void btnNoivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoivaMouseClicked
        new Menu_Noiva().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNoivaMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        int rgbcolor_green = Color.HSBtoRGB(0.38f, 0.93f, 0.73f);
        int rgbcolor_red = Color.HSBtoRGB(1.0f, 0.89f, 0.77f);

        Color coloruse_green = new Color(rgbcolor_green);
        Color coloruse_red = new Color(rgbcolor_red);
        Convidados conv = new Convidados();

        if (jTextField6.getText().trim().isEmpty()) {
            jTextField6.setBackground(coloruse_red);
        } else {
            jTextField6.setBackground(coloruse_green);
            conv.setNome(jTextField6.getText());
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventoMouseClicked
        new Menu_Evento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEventoMouseClicked

    private void btnAdicionarConvidadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarConvidadoMouseClicked
        new Menu_AdicionarConvidado().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdicionarConvidadoMouseClicked

    private void btnNoivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoivoMouseClicked
        new Menu_Noivo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNoivoMouseClicked

    private void btnOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrcamentoMouseClicked
        new Menu_Orcamento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrcamentoMouseClicked

    private void btnGerenciarConvidadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarConvidadosMouseClicked
        new Menu_GerenciarConvidados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGerenciarConvidadosMouseClicked

      public void limparTelaCadastro(){
        jTextField6.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField4.setText("");
      }
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Convidados conv = new Convidados();

        try {
            String Nome;
            String Telefone;
            String Restricao;
            String Parentesco;

            Nome = jTextField6.getText();
            Telefone = jTextField5.getText();
            Restricao = jTextField7.getText();
            Parentesco = jTextField4.getText();

            conv.setNome(Nome);
            conv.setTelefone(Telefone);
            conv.setRestricao(Restricao);
            conv.setParentesco(Parentesco);

            conv.insereConvidados(conv);

            JOptionPane.showMessageDialog(null, "Convidado inserido com sucesso!");
            limparTelaCadastro();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limparTelaCadastro();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_AdicionarConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_AdicionarConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_AdicionarConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_AdicionarConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_AdicionarConvidado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraMenu;
    private javax.swing.JPanel btnAdicionarConvidado;
    private javax.swing.JPanel btnConvidados;
    private javax.swing.JPanel btnEvento;
    private javax.swing.JPanel btnGerenciarConvidados;
    private javax.swing.JPanel btnNoiva;
    private javax.swing.JPanel btnNoivo;
    private javax.swing.JPanel btnOrcamento;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
