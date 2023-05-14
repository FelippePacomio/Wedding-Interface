/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.weddinginterface.interface_principal;

import br.weddinginterface.model.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Tips
 */
public class Menu_GerenciarConvidados extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Noiva
     * @throws java.sql.SQLException
     * 
     */
    

    public Menu_GerenciarConvidados() throws SQLException {
        initComponents();
        DefaultTableModel c_Nome = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(c_Nome));
    }

    public void LerTabelaConvidados(String C_Nome) throws SQLException {

        DefaultTableModel c_Nome = (DefaultTableModel) jTable1.getModel();
        c_Nome.setNumRows(0);

        Convidados conv = new Convidados();

        for (Convidados con : conv.listarConvidados(C_Nome)) {

            c_Nome.addRow(new Object[]{
                con.getNome(),
                con.getTelefone(),
                con.getRestricao(),
                con.getParentesco()
            });
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
        btnOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnNoiva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        btnNoivo.setBackground(new java.awt.Color(253, 214, 218));
        btnNoivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnConvidados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnAdicionarConvidado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnGerenciarConvidados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wedding Interface(red).png"))); // NOI18N
        background.add(jLabel24);
        jLabel24.setBounds(300, 80, 1133, 164);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(370, 380, 960, 402);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("REMOVER");
        background.add(jLabel5);
        jLabel5.setBounds(800, 290, 80, 21);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("BUSCAR");
        background.add(jLabel6);
        jLabel6.setBounds(430, 270, 62, 21);
        background.add(jTextField1);
        jTextField1.setBounds(430, 290, 220, 30);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        background.add(jLabel7);
        jLabel7.setBounds(730, 280, 40, 40);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        background.add(jLabel9);
        jLabel9.setBounds(390, 280, 32, 40);

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2);
        jButton2.setBounds(790, 330, 90, 23);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        background.add(jButton3);
        jButton3.setBounds(500, 330, 72, 23);

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventoMousePressed

    }//GEN-LAST:event_btnEventoMousePressed

    Color mySelect = new Color(255, 161, 170);
    Color myUnSelect = new Color(253, 214, 218);
    Color mySubUnSelect = new Color(232, 194, 194);
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
        try {
            new Menu_GerenciarConvidados().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            new Menu_GerenciarConvidados().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnGerenciarConvidadosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   Conexao conexao = new Conexao();
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este convidado?");
        if(confirma==JOptionPane.YES_OPTION){
            String sql = "DELETE FROM tb_convidados WHERE c_Nome = ?";
            try{
                PreparedStatement stmt = null;
                stmt = conexao.getConexao().prepareStatement(sql);
                stmt.setString(1, jTextField1.getText());
                int apagado = stmt.executeUpdate();
                if(apagado>0){
                    JOptionPane.showMessageDialog(null,"Convidado Removido com Sucesso!");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }                       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
           LerTabelaConvidados(jTextField1.getText());
       } catch(SQLException ex){
          
       }                          
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu_GerenciarConvidados().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu_GerenciarConvidados.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
