package br.weddinginterface.interface_principal;

import br.weddinginterface.model.*;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Menu_Evento extends javax.swing.JFrame {

    Color mySelect = new Color(255, 161, 170);
    Color myUnSelect = new Color(253, 214, 218);
    Color mySubUnSelect = new Color(232, 194, 194);
    Evento eve = new Evento();

    public Menu_Evento() {
        initComponents();
        mostrarEvento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        barraMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOrcamento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnNoiva = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnNoivo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEvento = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnConvidados = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnAdicionarConvidado = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnGerenciarConvidados = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBuffet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtConvites = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLocacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtLembrancas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtMusica = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField9 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        txtCustoCerimonia = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel4.setText("               OR�AMENTO");

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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        barraMenu.add(btnNoiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, -1));

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

        barraMenu.add(btnNoivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 300, -1));

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

        background.add(barraMenu);
        barraMenu.setBounds(0, 0, 300, 1080);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        background.add(jLabel11);
        jLabel11.setBounds(1450, 980, 280, 180);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        background.add(jLabel12);
        jLabel12.setBounds(1420, 0, 280, 320);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        background.add(jLabel13);
        jLabel13.setBounds(1440, 340, 280, 320);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
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
        jButton1.setBounds(880, 930, 110, 23);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notas-musicais.png"))); // NOI18N
        background.add(jLabel6);
        jLabel6.setBounds(1010, 610, 40, 40);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setText("M�SICA");
        background.add(jLabel5);
        jLabel5.setBounds(1060, 610, 100, 21);

        txtBuffet.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtBuffet.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBuffet.setToolTipText("Informe o valor gasto com o buffet.");
        txtBuffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuffetActionPerformed(evt);
            }
        });
        background.add(txtBuffet);
        txtBuffet.setBounds(430, 730, 190, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setText("ANOTA��ES");
        background.add(jLabel7);
        jLabel7.setBounds(640, 800, 100, 21);

        txtConvites.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtConvites.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtConvites.setToolTipText("Informe o valor gasto com convites.");
        txtConvites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvitesActionPerformed(evt);
            }
        });
        background.add(txtConvites);
        txtConvites.setBounds(760, 630, 190, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setText("BUFFET");
        background.add(jLabel8);
        jLabel8.setBounds(400, 710, 100, 21);

        txtLocacao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLocacao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLocacao.setToolTipText("Informe o valor gasto com a loca��o.");
        txtLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocacaoActionPerformed(evt);
            }
        });
        background.add(txtLocacao);
        txtLocacao.setBounds(430, 630, 190, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setText("HOR�RIO DA CERIM�NIA");
        background.add(jLabel9);
        jLabel9.setBounds(1060, 320, 210, 21);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel10.setText("CONVITES");
        background.add(jLabel10);
        jLabel10.setBounds(730, 610, 100, 21);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel17.setText("LEMBRAN�AS");
        background.add(jLabel17);
        jLabel17.setBounds(730, 710, 120, 21);

        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField4.setToolTipText("Informe o endere�o do local do evento.");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        background.add(jTextField4);
        jTextField4.setBounds(400, 340, 220, 30);

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField5.setToolTipText("Informe o endere�o do buffet.");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        background.add(jTextField5);
        jTextField5.setBounds(400, 430, 220, 30);

        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField6.setToolTipText("Informe a hora do evento.");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        background.add(jTextField6);
        jTextField6.setBounds(1060, 340, 220, 30);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel18.setText("DATA DA CERIM�NIA");
        background.add(jLabel18);
        jLabel18.setBounds(730, 320, 220, 21);

        txtLembrancas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLembrancas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLembrancas.setToolTipText("Informe o valor gasto com lembran�as.");
        txtLembrancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLembrancasActionPerformed(evt);
            }
        });
        background.add(txtLembrancas);
        txtLembrancas.setBounds(760, 730, 190, 30);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholder (2).png"))); // NOI18N
        background.add(jLabel19);
        jLabel19.setBounds(360, 610, 30, 40);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario.png"))); // NOI18N
        background.add(jLabel21);
        jLabel21.setBounds(680, 320, 40, 40);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tempo-livre.png"))); // NOI18N
        background.add(jLabel22);
        jLabel22.setBounds(1010, 320, 40, 40);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convite.png"))); // NOI18N
        background.add(jLabel23);
        jLabel23.setBounds(680, 610, 40, 40);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bandeja.png"))); // NOI18N
        background.add(jLabel28);
        jLabel28.setBounds(360, 720, 40, 40);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente.png"))); // NOI18N
        background.add(jLabel29);
        jLabel29.setBounds(680, 710, 40, 40);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wedding Interface(red).png"))); // NOI18N
        background.add(jLabel24);
        jLabel24.setBounds(300, 100, 1133, 164);

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel27.setText("M�SICA");
        background.add(jLabel27);
        jLabel27.setBounds(1060, 610, 100, 21);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholder (2).png"))); // NOI18N
        background.add(jLabel31);
        jLabel31.setBounds(360, 410, 30, 40);

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel32.setText("ENDERE�O DO BUFFET");
        background.add(jLabel32);
        jLabel32.setBounds(400, 410, 220, 21);

        txtMusica.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMusica.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMusica.setToolTipText("Informe o valor gasto com m�sicos/DJ's.");
        txtMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMusicaActionPerformed(evt);
            }
        });
        background.add(txtMusica);
        txtMusica.setBounds(1090, 630, 190, 30);

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel30.setText("LOCA��O");
        background.add(jLabel30);
        jLabel30.setBounds(400, 610, 100, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(640, 820, 390, 86);

        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField9.setToolTipText("Informe a data do evento.");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        background.add(jTextField9);
        jTextField9.setBounds(730, 340, 220, 30);

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel33.setText("ENDERE�O DA CERIM�MIA");
        background.add(jLabel33);
        jLabel33.setBounds(400, 320, 220, 21);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholder (2).png"))); // NOI18N
        background.add(jLabel34);
        jLabel34.setBounds(360, 320, 30, 40);

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel35.setText("DATA DA RECEP��O");
        background.add(jLabel35);
        jLabel35.setBounds(730, 410, 220, 21);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario.png"))); // NOI18N
        background.add(jLabel36);
        jLabel36.setBounds(680, 410, 40, 40);

        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField10.setToolTipText("Informe a data da recep��o.");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        background.add(jTextField10);
        jTextField10.setBounds(730, 430, 220, 30);

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel37.setText("HOR�RIO DA RECEP��O");
        background.add(jLabel37);
        jLabel37.setBounds(1060, 410, 210, 21);

        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField11.setToolTipText("Informe a hora da recep��o.");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        background.add(jTextField11);
        jTextField11.setBounds(1060, 430, 220, 30);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tempo-livre.png"))); // NOI18N
        background.add(jLabel38);
        jLabel38.setBounds(1010, 410, 40, 40);

        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField12.setToolTipText("Informe o card�pio.");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        background.add(jTextField12);
        jTextField12.setBounds(400, 520, 220, 30);

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel39.setText("CARD�PIO");
        background.add(jLabel39);
        jLabel39.setBounds(400, 500, 100, 21);

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bandeja.png"))); // NOI18N
        background.add(jLabel40);
        jLabel40.setBounds(350, 510, 40, 40);
        background.add(jSeparator1);
        jSeparator1.setBounds(360, 570, 910, 20);

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel41.setText("CUSTO DA CERIM�NIA");
        background.add(jLabel41);
        jLabel41.setBounds(1060, 710, 210, 21);

        txtCustoCerimonia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCustoCerimonia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCustoCerimonia.setToolTipText("Informe o valor gasto com a cerim�nia.");
        txtCustoCerimonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoCerimoniaActionPerformed(evt);
            }
        });
        background.add(txtCustoCerimonia);
        txtCustoCerimonia.setBounds(1090, 730, 190, 30);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente.png"))); // NOI18N
        background.add(jLabel42);
        jLabel42.setBounds(1010, 710, 40, 40);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel43.setToolTipText("");
        background.add(jLabel43);
        jLabel43.setBounds(1730, 10, 280, 300);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel44.setToolTipText("");
        background.add(jLabel44);
        jLabel44.setBounds(1730, 920, 280, 180);

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel45.setToolTipText("");
        background.add(jLabel45);
        jLabel45.setBounds(1740, 330, 280, 300);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel46.setToolTipText("");
        background.add(jLabel46);
        jLabel46.setBounds(1730, 610, 280, 300);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel47.setToolTipText("");
        background.add(jLabel47);
        jLabel47.setBounds(1730, 610, 280, 300);

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
        jButton2.setBounds(690, 930, 110, 23);

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("R$");
        background.add(jLabel48);
        jLabel48.setBounds(1040, 630, 62, 30);

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("R$");
        background.add(jLabel49);
        jLabel49.setBounds(1040, 730, 62, 30);

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("R$");
        background.add(jLabel50);
        jLabel50.setBounds(710, 630, 62, 30);

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("R$");
        background.add(jLabel51);
        jLabel51.setBounds(710, 730, 62, 30);

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("R$");
        background.add(jLabel52);
        jLabel52.setBounds(380, 630, 62, 30);

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("R$");
        background.add(jLabel53);
        jLabel53.setBounds(380, 730, 62, 30);

        jScrollPane2.setViewportView(background);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 820));

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

    private void txtBuffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuffetActionPerformed
    }//GEN-LAST:event_txtBuffetActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void txtLembrancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLembrancasActionPerformed
    }//GEN-LAST:event_txtLembrancasActionPerformed

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

    private void adicionarEvento() {

        String enderecoCerimonia, enderecoBuffet, horaCerimonia, horaRecepcao,
                dataRecepcao, dataCerimonia, cardapio, anotacoes;
        Double valorBuffet, valorCerimonia, lembrancas, musica, locacao, convites;

        try {
            enderecoCerimonia = jTextField4.getText();
            dataCerimonia = jTextField9.getText();
            enderecoBuffet = jTextField5.getText();
            dataRecepcao = jTextField10.getText();
            horaRecepcao = jTextField11.getText();
            cardapio = jTextField12.getText();
            anotacoes = jTextArea1.getText();
            locacao = Double.parseDouble(txtLocacao.getText());
            convites = Double.parseDouble(txtConvites.getText());
            musica = Double.parseDouble(txtMusica.getText());
            valorBuffet = Double.parseDouble(txtBuffet.getText());
            lembrancas = Double.parseDouble(txtLembrancas.getText());
            horaCerimonia = jTextField6.getText();
            valorCerimonia = Double.parseDouble(txtCustoCerimonia.getText());

            eve.setEnderecoCerimonia(enderecoCerimonia);
            eve.setCardapio(cardapio);
            eve.setAnotacoes(anotacoes);
            eve.setLocacao(locacao);
            eve.setHoraCerimonia(horaCerimonia);
            eve.setValorCerimonia(valorCerimonia);
            eve.setLembrancas(lembrancas);
            eve.setEnderecoBuffet(enderecoBuffet);
            eve.setHoraRecepcao(horaRecepcao);
            eve.setDataRecepcao(dataRecepcao);
            eve.setDataCerimonia(dataCerimonia);
            eve.setValorBuffet(valorBuffet);
            eve.setMusica(musica);
            eve.setConvites(convites);

            Evento.instancia.setAnotacoes(anotacoes);
            Evento.instancia.setEnderecoCerimonia(enderecoCerimonia);
            Evento.instancia.setCardapio(cardapio);
            Evento.instancia.setConvites(convites);
            Evento.instancia.setDataCerimonia(dataCerimonia);
            Evento.instancia.setDataRecepcao(dataRecepcao);
            Evento.instancia.setEnderecoBuffet(enderecoBuffet);
            Evento.instancia.setHoraCerimonia(horaCerimonia);
            Evento.instancia.setHoraRecepcao(horaRecepcao);
            Evento.instancia.setLembrancas(lembrancas);
            Evento.instancia.setLocacao(locacao);
            Evento.instancia.setMusica(musica);
            Evento.instancia.setValorBuffet(valorBuffet);
            Evento.instancia.setValorCerimonia(valorCerimonia);

            eve.inserirEvento(eve);

            Orcamento.instancia.setGastoEvento(locacao + valorBuffet + valorCerimonia + lembrancas + musica + convites);

            JOptionPane.showMessageDialog(
                    null, "Evento inserido com sucesso!");
            mostrarEvento();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }

    public void mostrarEvento() {
        try {
            if (Evento.instancia.id > 0) {

                Locale locale = new Locale("en", "US"); // Locale personalizado para usar ponto como separador decimal
                DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
                symbols.setDecimalSeparator('.'); // Define o ponto como separador decimal
                DecimalFormat decimalFormat = new DecimalFormat("0.00", symbols);

                String enderecoCerimonia = Evento.instancia.getEnderecoCerimonia();
                String enderecoBuffet = Evento.instancia.getEnderecoBuffet();
                String horaCerimonia = Evento.instancia.getHoraCerimonia();
                String horaRecepcao = Evento.instancia.getHoraRecepcao();
                String dataRecepcao = Evento.instancia.getDataRecepcao();
                String dataCerimonia = Evento.instancia.getDataCerimonia();
                String cardapio = Evento.instancia.getCardapio();
                String anotacoes = Evento.instancia.getAnotacoes();

                String musicaFormatado = decimalFormat.format(Evento.instancia.getMusica());
                String lembrancasFormatado = decimalFormat.format(Evento.instancia.getLembrancas());
                String convitesFormatado = decimalFormat.format(Evento.instancia.getConvites());
                String custoFormatado = decimalFormat.format(Evento.instancia.getValorCerimonia());
                String buffetFormatado = decimalFormat.format(Evento.instancia.getValorBuffet());
                String locacaoFormatado = decimalFormat.format(Evento.instancia.getLocacao());

                txtMusica.setText(musicaFormatado);
                txtLembrancas.setText(lembrancasFormatado);
                txtConvites.setText(convitesFormatado);
                txtCustoCerimonia.setText(custoFormatado);
                txtBuffet.setText(buffetFormatado);
                txtLocacao.setText(locacaoFormatado);
                jTextField4.setText(enderecoCerimonia);
                jTextField5.setText(enderecoBuffet);
                jTextField12.setText(cardapio);
                jTextField10.setText(dataRecepcao);
                jTextField9.setText(dataCerimonia);
                jTextField6.setText(horaCerimonia);
                jTextField11.setText(horaRecepcao);
                jTextArea1.setText(anotacoes);

            } else {
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adicionarEvento();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limparTelaCadastroEvento() {
        jTextField4.setText("");
        jTextField9.setText("");
        jTextField5.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextArea1.setText("");
        txtLocacao.setText("");
        txtConvites.setText("");
        txtMusica.setText("");
        txtBuffet.setText("");
        txtLembrancas.setText("");
        jTextField6.setText("");
        txtCustoCerimonia.setText("");
    }
    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void txtCustoCerimoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoCerimoniaActionPerformed
    }//GEN-LAST:event_txtCustoCerimoniaActionPerformed

    private void btnOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrcamentoMouseClicked
        new Menu_Orcamento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrcamentoMouseClicked

    private void btnGerenciarConvidadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerenciarConvidadosMouseClicked
        new Menu_GerenciarConvidados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGerenciarConvidadosMouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void txtLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocacaoActionPerformed
    }//GEN-LAST:event_txtLocacaoActionPerformed

    private void txtConvitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvitesActionPerformed
    }//GEN-LAST:event_txtConvitesActionPerformed

    private void txtMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMusicaActionPerformed
    }//GEN-LAST:event_txtMusicaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limparTelaCadastroEvento();
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
            java.util.logging.Logger.getLogger(Menu_Evento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Evento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Evento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Evento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Evento().setVisible(true);
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtBuffet;
    private javax.swing.JTextField txtConvites;
    private javax.swing.JTextField txtCustoCerimonia;
    private javax.swing.JTextField txtLembrancas;
    private javax.swing.JTextField txtLocacao;
    private javax.swing.JTextField txtMusica;
    // End of variables declaration//GEN-END:variables
}
