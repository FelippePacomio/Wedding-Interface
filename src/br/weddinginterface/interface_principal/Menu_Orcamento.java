package br.weddinginterface.interface_principal;

import br.weddinginterface.model.*;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Menu_Orcamento extends javax.swing.JFrame {

    Color mySelect = new Color(255, 161, 170);
    Color myUnSelect = new Color(253, 214, 218);
    Color mySubUnSelect = new Color(232, 194, 194);

    public Menu_Orcamento() {
        initComponents();
        mostrarOrcamento();
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
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

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
                .addContainerGap(36, Short.MAX_VALUE))
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
        jLabel11.setBounds(1350, 980, 280, 180);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        background.add(jLabel12);
        jLabel12.setBounds(1350, 0, 280, 320);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        background.add(jLabel13);
        jLabel13.setBounds(1350, 340, 280, 320);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        background.add(jLabel14);
        jLabel14.setBounds(1350, 670, 280, 320);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wedding Interface(red).png"))); // NOI18N
        background.add(jLabel24);
        jLabel24.setBounds(280, 70, 1133, 164);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("VALOR RESTANTE");
        background.add(jLabel5);
        jLabel5.setBounds(1050, 500, 150, 21);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setText("GASTO EVENTO");
        jLabel6.setToolTipText("");
        background.add(jLabel6);
        jLabel6.setBounds(490, 500, 170, 21);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("R$ 0,00");
        background.add(jLabel7);
        jLabel7.setBounds(1050, 400, 100, 21);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setText("GASTO TOTAL");
        jLabel8.setToolTipText("");
        background.add(jLabel8);
        jLabel8.setBounds(810, 500, 170, 21);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setText("GASTO NOIVA");
        jLabel9.setToolTipText("");
        background.add(jLabel9);
        jLabel9.setBounds(810, 380, 170, 21);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel10.setText("GASTO NOIVO");
        jLabel10.setToolTipText("");
        background.add(jLabel10);
        jLabel10.setBounds(1050, 380, 170, 21);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel17.setText("R$ 0,00");
        background.add(jLabel17);
        jLabel17.setBounds(490, 520, 100, 21);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel18.setText("R$ 0,00");
        background.add(jLabel18);
        jLabel18.setBounds(810, 520, 100, 21);

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel40.setText("R$ 0,00");
        jLabel40.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel40InputMethodTextChanged(evt);
            }
        });
        background.add(jLabel40);
        jLabel40.setBounds(1050, 520, 100, 20);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/real-brasileiro.png"))); // NOI18N
        background.add(jLabel21);
        jLabel21.setBounds(1010, 510, 40, 40);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noivo (1).png"))); // NOI18N
        background.add(jLabel22);
        jLabel22.setBounds(1010, 380, 40, 50);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aliancas-de-casamento.png"))); // NOI18N
        background.add(jLabel23);
        jLabel23.setBounds(450, 500, 40, 50);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noiva.png"))); // NOI18N
        background.add(jLabel27);
        jLabel27.setBounds(770, 380, 40, 50);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/financeiro.png"))); // NOI18N
        background.add(jLabel28);
        jLabel28.setBounds(770, 500, 40, 50);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel29.setToolTipText("");
        background.add(jLabel29);
        jLabel29.setBounds(1640, 10, 280, 300);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel30.setToolTipText("");
        background.add(jLabel30);
        jLabel30.setBounds(1800, 950, 280, 180);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel31.setToolTipText("");
        background.add(jLabel31);
        jLabel31.setBounds(1650, 330, 280, 300);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel32.setToolTipText("");
        background.add(jLabel32);
        jLabel32.setBounds(1640, 610, 280, 300);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flores3 (180�נ200�px) (280�נ300�px).png"))); // NOI18N
        jLabel33.setToolTipText("");
        background.add(jLabel33);
        jLabel33.setBounds(1640, 610, 280, 300);

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALVAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2);
        jButton2.setBounds(780, 620, 110, 30);

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("GASTO PREVISTO");
        background.add(jLabel34);
        jLabel34.setBounds(490, 380, 150, 21);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/real-brasileiro.png"))); // NOI18N
        background.add(jLabel35);
        jLabel35.setBounds(450, 390, 40, 40);

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setToolTipText("Insira o gasto previsto para o casamento.");
        jTextField2.setMinimumSize(new java.awt.Dimension(100, 30));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        background.add(jTextField2);
        jTextField2.setBounds(520, 400, 150, 30);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setText("R$ 0,00");
        jLabel19.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel19InputMethodTextChanged(evt);
            }
        });
        background.add(jLabel19);
        jLabel19.setBounds(810, 400, 100, 20);

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("R$");
        background.add(jLabel36);
        jLabel36.setBounds(472, 400, 60, 30);

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1910, 1080));

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

    public void mostrarOrcamento() {

        try {
            double gastoPrevisto = Orcamento.instancia.getGastoPrevisto();
            double gastoEvento = Orcamento.instancia.getGastoEvento();
            double gastoNoivo = Orcamento.instancia.getGastoNoivo();
            double gastoNoiva = Orcamento.instancia.getGastoNoiva();
            double gastoTotal = gastoEvento + gastoNoivo + gastoNoiva;
            double valorRestante = gastoPrevisto - gastoTotal;

            Orcamento.instancia.setGastoTotal(gastoTotal);
            Orcamento.instancia.setValorRestante(valorRestante);

            DecimalFormat decimalFormat = new DecimalFormat("0.00");

            String restanteFormatado = decimalFormat.format(Orcamento.instancia.getValorRestante());
            String noivaFormatado = decimalFormat.format(Orcamento.instancia.getGastoNoiva());
            String noivoFormatado = decimalFormat.format(Orcamento.instancia.getGastoNoivo());
            String eventoFormatado = decimalFormat.format(Orcamento.instancia.getGastoEvento());
            String totalFormatado = decimalFormat.format(Orcamento.instancia.getGastoTotal());

            jLabel40.setText("R$ " + restanteFormatado);
            jLabel19.setText("R$ " + noivaFormatado);
            jLabel17.setText("R$ " + eventoFormatado);
            jLabel7.setText("R$ " + noivoFormatado);
            jLabel18.setText("R$ " + totalFormatado);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void jLabel40InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel40InputMethodTextChanged
    }//GEN-LAST:event_jLabel40InputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Orcamento orc = new Orcamento();

        try {
            double valorPrevisto;

            valorPrevisto = Double.parseDouble(jTextField2.getText());

            orc.setGastoPrevisto(valorPrevisto);

            Orcamento.instancia.setGastoPrevisto(valorPrevisto);

            JOptionPane.showMessageDialog(null, "Or�amento inserido com sucesso!");
            mostrarOrcamento();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel19InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel19InputMethodTextChanged
    }//GEN-LAST:event_jLabel19InputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Menu_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Orcamento().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getjLabel19() {
        return jLabel40;
    }

    public void setjLabel19(javax.swing.JLabel jLabel19) {
        this.jLabel40 = jLabel19;
    }

}
