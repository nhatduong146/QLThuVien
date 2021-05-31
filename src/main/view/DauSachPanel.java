/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.awt.BorderLayout;
import static java.lang.String.format;
import static java.lang.String.format;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import main.dao.DocGiaDao;
import main.dao.DauSachDao;
import main.dao.ThongTinMuonTraDao;
import main.dao.NhaXuatBanDao;
import main.dao.TacGiaDao;
import main.dao.TheLoaiDao;
import main.dao.TuaSachDao;
import main.model.DocGia;
import main.model.TacGia;
import main.model.TheLoai;
import main.model.TuaSach;
import main.model.DauSach;
import main.model.NhaXuatBan;
import main.model.ThongTinMuonTra;

/**
 *
 * @author Admin
 */
public class DauSachPanel extends javax.swing.JPanel {

    DefaultTableModel modelDauSach;
    DocGiaDao userDG;
    DauSachDao userDS;
    ThongTinMuonTraDao userTTMT;
    NhaXuatBanDao userNXB;
    TacGiaDao userTG;
    TheLoaiDao userTL;
    TuaSachDao userTS;
    SimpleDateFormat f = new SimpleDateFormat("MMMM dd, yyyy");

    /**
     * Creates new form DM_sachJPanel
     */
    public DauSachPanel() {
        initComponents();
        modelDauSach = new DefaultTableModel();
        userDS = new DauSachDao();
        userNXB = new NhaXuatBanDao();
        userTS = new TuaSachDao();
        userTG = new TacGiaDao();
        userTL = new TheLoaiDao();
        tblDauSach.setModel(modelDauSach);
        modelDauSach.addColumn("STT");
        modelDauSach.addColumn("Mã đầu sách");
        modelDauSach.addColumn("Mã tựa sách");
        modelDauSach.addColumn("Ngôn ngữ");
        modelDauSach.addColumn("Mã nhà xuất bản");
        tblDauSach.setRowHeight(40);
        ShowDauSach();
    }

    public void ShowDauSach() {
        List<DauSach> dausach = userDS.getAll();
        int stt = 0;
        modelDauSach.setRowCount(0);
        for (DauSach show : dausach) {
            stt++;
            modelDauSach.addRow(new Object[]{stt, show.getMaDS(), show.getMaTS(), show.getNgonNgu(), show.getMaNXB()});

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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDauSach = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTenSach3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttheloai3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTacGia3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNDtomluoc3 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnXoa3 = new javax.swing.JButton();
        btnCapnhat3 = new javax.swing.JButton();
        btnThem3 = new javax.swing.JButton();
        btnLuu3 = new javax.swing.JButton();
        btTracuu3 = new javax.swing.JButton();
        txtMaDauSach3 = new javax.swing.JLabel();
        RdbtnDamuon4 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        txtNgonNgu3 = new javax.swing.JTextField();
        RdbtnChuamuon4 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        txtTenNXB3 = new javax.swing.JTextField();

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tblDauSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "TenSach", "MaDauSach", "LoaiSach", "Soluong"
            }
        ));
        tblDauSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDauSachMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDauSach);

        jButton16.setBackground(java.awt.SystemColor.activeCaption);
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/thoat.png"))); // NOI18N

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin danh mục sách"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel12.setText("Tên sách:");

        txtTenSach3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSach3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel13.setText("Mã đầu sách:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel14.setText("Tên thể loại");

        txttheloai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttheloai3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel15.setText("Tác giả:");

        txtNDtomluoc3.setColumns(20);
        txtNDtomluoc3.setRows(5);
        jScrollPane2.setViewportView(txtNDtomluoc3);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel25.setText("Nội dung tóm lược:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel24.setText("Tình trạng:");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/icons8-library-100.png"))); // NOI18N

        btnXoa3.setBackground(new java.awt.Color(0, 102, 153));
        btnXoa3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa3.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa3.setText("Delete");
        btnXoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa3ActionPerformed(evt);
            }
        });

        btnCapnhat3.setBackground(new java.awt.Color(0, 102, 153));
        btnCapnhat3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat3.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat3.setText("Refresh");
        btnCapnhat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat3ActionPerformed(evt);
            }
        });

        btnThem3.setBackground(new java.awt.Color(0, 102, 153));
        btnThem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem3.setForeground(new java.awt.Color(255, 255, 255));
        btnThem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem3.setText("Add");
        btnThem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem3ActionPerformed(evt);
            }
        });

        btnLuu3.setBackground(new java.awt.Color(0, 102, 153));
        btnLuu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu3.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu3.setText("Save");
        btnLuu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu3ActionPerformed(evt);
            }
        });

        btTracuu3.setBackground(new java.awt.Color(0, 102, 153));
        btTracuu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu3.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu3.setText("Tra cứu");
        btTracuu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(btnXoa3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLuu3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(btnCapnhat3)
                                .addGap(41, 41, 41)
                                .addComponent(btnThem3)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(btTracuu3)
                        .addGap(93, 93, 93))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btTracuu3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem3)
                    .addComponent(btnCapnhat3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        RdbtnDamuon4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        RdbtnDamuon4.setText("Đã mượn");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel37.setText("Ngôn ngữ:");

        RdbtnChuamuon4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        RdbtnChuamuon4.setText("Chưa mượn");
        RdbtnChuamuon4.setFocusable(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel42.setText("Tên NXB:");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttheloai3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacGia3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaDauSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel42))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNXB3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(RdbtnDamuon4)
                                .addGap(18, 18, 18)
                                .addComponent(RdbtnChuamuon4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgonNgu3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(txtMaDauSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txttheloai3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTacGia3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtNgonNgu3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenNXB3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RdbtnDamuon4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RdbtnChuamuon4)))))
                .addGap(24, 24, 24)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenSach3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSach3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSach3ActionPerformed

    private void txttheloai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttheloai3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttheloai3ActionPerformed

    private void btnXoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa3ActionPerformed
        // TODO add your handling code here:
        int row = tblDauSach.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Danh mục muốn xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            int confident = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa Danh mục này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maDS = String.valueOf(tblDauSach.getValueAt(row, 1));
                userDS.remove(maDS);
                JOptionPane.showConfirmDialog(this, "Xóa danh mục thành công");
                txtMaDauSach3.setText("");
                txtTenSach3.setText("");
                txttheloai3.setText("");
                txtTacGia3.setText("");
                RdbtnChuamuon4.setSelected(false);
                RdbtnDamuon4.setSelected(false);
                txtNDtomluoc3.setText("");
                txtNgonNgu3.setText("");
                txtTenNXB3.setText("");
                ShowDauSach();

            }

        }
    }//GEN-LAST:event_btnXoa3ActionPerformed

    private void btnCapnhat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat3ActionPerformed
        // TODO add your handling code here:
        txtMaDauSach3.setText("");
        txtTenSach3.setText("");
        txttheloai3.setText("");
        txtTacGia3.setText("");
        RdbtnChuamuon4.setSelected(false);
        RdbtnDamuon4.setSelected(false);
        txtNDtomluoc3.setText("");
        txtNgonNgu3.setText("");
        txtTenNXB3.setText("");
        ShowDauSach();
    }//GEN-LAST:event_btnCapnhat3ActionPerformed

    private void btnThem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem3ActionPerformed
        // TODO add your handling code here:

        DauSach dauSach = new DauSach();
        List<TuaSach> user_TS = userTS.getAll();
        int dem1 = 0;
        int dem2 = 0;
        for (TuaSach users : user_TS) {
            dem1++;
            if (users.getTenTS().equals(txtTenSach3.getText())) {
                dauSach.setMaTS(users.getMaTS());
                break;
            } else {
                dem2++;
            }
        }
        if (dem1 == dem2) {
            JOptionPane.showMessageDialog(this, "Không có tên sách bạn đã nhập!\n Vui lòng kiểm tra lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            dauSach.setNgonNgu(txtNgonNgu3.getText());
            List<NhaXuatBan> user_NXB = userNXB.getAll();
            int dem3 = 0;
            int dem4 = 0;
            for (NhaXuatBan users : user_NXB) {
                dem3++;
                if (users.getTenNXB().equals(txtTenNXB3.getText())) {
                    dauSach.setMaNXB(users.getMaNXB());
                } else {
                    dem4++;
                }
            }
            if (dem3 == dem4) {
                JOptionPane.showMessageDialog(this, "Không có tên Nhà xuất bản bạn đã nhập!\n Vui lòng kiểm tra lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {

                userDS.insert(dauSach);

                JOptionPane.showConfirmDialog(this, "Thêm danh mục thành công");
                txtMaDauSach3.setText("");
                txtTenSach3.setText("");
                txttheloai3.setText("");
                txtTacGia3.setText("");
                RdbtnChuamuon4.setSelected(false);
                RdbtnDamuon4.setSelected(false);
                txtNDtomluoc3.setText("");
                txtNgonNgu3.setText("");
                txtTenNXB3.setText("");
                ShowDauSach();
            }
        }
    }//GEN-LAST:event_btnThem3ActionPerformed

    private void btnLuu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu3ActionPerformed
        // TODO add your handling code here:
        DauSach dauSach = new DauSach();
        dauSach.setMaDS(txtMaDauSach3.getText());
        dauSach.setMaTS(txtMaDauSach3.getText());
        List<TuaSach> user_TS = userTS.getAll();
        int dem1 = 0;
        int dem2 = 0;
        for (TuaSach users : user_TS) {
            dem1++;
            if (users.getTenTS().equals(txtTenSach3.getText())) {
                dauSach.setMaTS(users.getMaTS());
                break;
            } else {
                dem2++;
            }
        }
        if (dem1 == dem2) {
            JOptionPane.showMessageDialog(this, "Không có tên sách bạn đã nhập!\n Vui lòng kiểm tra lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            dauSach.setNgonNgu(txtNgonNgu3.getText());
            List<NhaXuatBan> user_NXB = userNXB.getAll();
            int dem3 = 0;
            int dem4 = 0;
            for (NhaXuatBan users : user_NXB) {
                dem3++;
                if (users.getTenNXB().equals(txtTenNXB3.getText())) {
                    dauSach.setMaNXB(users.getMaNXB());
                } else {
                    dem4++;
                }
            }
            if (dem3 == dem4) {
                JOptionPane.showMessageDialog(this, "Không có tên Nhà xuất bản bạn đã nhập!\n Vui lòng kiểm tra lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {

                userDS.update(dauSach);
                JOptionPane.showConfirmDialog(this, "Cập nhật danh mục thành công");
                txtMaDauSach3.setText("");
                txtTenSach3.setText("");
                txttheloai3.setText("");
                txtTacGia3.setText("");
                RdbtnChuamuon4.setSelected(false);
                RdbtnDamuon4.setSelected(false);
                txtNDtomluoc3.setText("");
                txtNgonNgu3.setText("");
                txtTenNXB3.setText("");
                ShowDauSach();
            }
        }
    }//GEN-LAST:event_btnLuu3ActionPerformed

    private void btTracuu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu3ActionPerformed
        // TODO add your handling code here:
            String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Tựa sách",JOptionPane.INFORMATION_MESSAGE);

        List<TuaSach> tuasach = userTS.findByName(str);
        for(TuaSach user : tuasach){
            List<DauSach> dausach = userDS.findByName(user.getMaTS());
            int stt=0;
            modelDauSach.setRowCount(0);
            for(DauSach show : dausach){
                txtTenSach3.setText(show.getMaDS());
                stt++;
                modelDauSach.addRow(new Object[]{stt, show.getMaDS(), show.getMaTS(), show.getNgonNgu(), show.getMaNXB()});

            }
            if (modelDauSach.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
                ShowDauSach();
            }
        }
    }//GEN-LAST:event_btTracuu3ActionPerformed

    private void tblDauSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDauSachMouseClicked
        // TODO add your handling code here:
        int row = tblDauSach.getSelectedRow();
        txtMaDauSach3.setText(String.valueOf(tblDauSach.getValueAt(row, 1)));
        String string = String.valueOf(tblDauSach.getValueAt(row, 1));

        List<DauSach> user_DS2 = userDS.getAll();
        for (DauSach users_DS : user_DS2) {
            if (string.equals(users_DS.getMaDS())) {
                List<TuaSach> user_TS2 = userTS.getAll();
                for (TuaSach users_TS : user_TS2) {
                    if (users_DS.getMaTS().equals(users_TS.getMaTS())) {
                        txtTenSach3.setText(users_TS.getTenTS());
                        List<TheLoai> user_TL2 = userTL.getAll();
                        for (TheLoai userss : user_TL2) {
                            if (users_TS.getMaTL().equals(userss.getMaTL())) {
                                txttheloai3.setText(userss.getTenTL());
                            }
                        }
                        List<TacGia> user_TG2 = userTG.getAll();
                        for (TacGia users_TG : user_TG2) {
                            if (users_TS.getMaTG().equals(users_TG.getMaTG())) {
                                txtTacGia3.setText(users_TG.getHoten());
                            }
                        }
                        if (users_TS.getSoLuong() > 0) {
                            RdbtnChuamuon4.setSelected(true);
                        } else {
                            RdbtnDamuon4.setSelected(true);
                        }
                        txtNDtomluoc3.setText(users_TS.getTomTat());
                    }

                }
            }

        }
        txtNgonNgu3.setText(String.valueOf(tblDauSach.getValueAt(row, 3)));
        List<NhaXuatBan> user_NXB = userNXB.getAll();
        for (NhaXuatBan users : user_NXB) {
            if (users.getMaNXB().equals(String.valueOf(tblDauSach.getValueAt(row, 4)))) {
                txtTenNXB3.setText(users.getTenNXB());
            }
        }
    }//GEN-LAST:event_tblDauSachMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdbtnChuamuon4;
    private javax.swing.JRadioButton RdbtnDamuon4;
    private javax.swing.JButton btTracuu3;
    private javax.swing.JButton btnCapnhat3;
    private javax.swing.JButton btnLuu3;
    private javax.swing.JButton btnThem3;
    private javax.swing.JButton btnXoa3;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDauSach;
    private javax.swing.JLabel txtMaDauSach3;
    private javax.swing.JTextArea txtNDtomluoc3;
    private javax.swing.JTextField txtNgonNgu3;
    private javax.swing.JTextField txtTacGia3;
    private javax.swing.JTextField txtTenNXB3;
    private javax.swing.JTextField txtTenSach3;
    private javax.swing.JTextField txttheloai3;
    // End of variables declaration//GEN-END:variables
}