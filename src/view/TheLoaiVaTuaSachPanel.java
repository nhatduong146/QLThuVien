/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import static java.lang.String.format;
import static java.lang.String.format;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import dao.DocGiaDao;
import dao.DauSachDao;
import dao.ThongTinMuonTraDao;
import dao.NhaXuatBanDao;
import dao.TacGiaDao;
import dao.TheLoaiDao;
import dao.TuaSachDao;
import model.DocGia;
import model.TacGia;
import model.TheLoai;
import model.TuaSach;
import model.DauSach;
import model.NhaXuatBan;
import model.ThongTinMuonTra;

/**
 *
 * @author Admin
 */
public class TheLoaiVaTuaSachPanel extends javax.swing.JPanel {

    DefaultTableModel modelTuaSach;
    DefaultTableModel modelTheLoai;

    DocGiaDao userDG;
    DauSachDao userDS;
    ThongTinMuonTraDao userTTMT;
    NhaXuatBanDao userNXB;
    TacGiaDao userTG;
    TheLoaiDao userTL;
    TuaSachDao userTS;
    SimpleDateFormat f = new SimpleDateFormat("MMMM dd, yyyy");

    /**
     * Creates new form TheLoai_tuaSachJPanel
     */
    public TheLoaiVaTuaSachPanel() {
        initComponents();
        modelTuaSach = new DefaultTableModel();
        modelTheLoai = new DefaultTableModel();
        userTS = new TuaSachDao();
        userTL = new TheLoaiDao();
        userTG = new TacGiaDao();
        tblTheLoai5.setModel(modelTheLoai);
        modelTheLoai.addColumn("STT");
        modelTheLoai.addColumn("Mã thể loại");
        modelTheLoai.addColumn("Tên thể loại");
        ShowTheLoai();
        tblTuaSach5.setModel(modelTuaSach);
        modelTuaSach.addColumn("STT");
        modelTuaSach.addColumn("Mã tựa sách");
        modelTuaSach.addColumn("Tên tựa sách");
        modelTuaSach.addColumn("Mã tác giả");
        modelTuaSach.addColumn("Mã thể loại");
        modelTuaSach.addColumn("Tóm tắt");
        modelTuaSach.addColumn("Số lượng");

        tblTheLoai5.setRowHeight(40);
        tblTuaSach5.setRowHeight(40);
        tblTheLoai5.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblTuaSach5.getColumnModel().getColumn(0).setPreferredWidth(10);

        ShowTuaSach();
        List<TacGia> tacgia = userTG.getAll();
        for (TacGia show : tacgia) {
            cbbMaTacGia5.addItem(show.getMaTG());
        }
        List<TheLoai> theloai = userTL.getAll();
        for (TheLoai show : theloai) {
            cbbMaTheLoai5.addItem(show.getMaTL());
        }
    }

    public void ShowTuaSach() {
        List<TuaSach> tuasach = userTS.getAll();
        int stt = 0;
        modelTuaSach.setRowCount(0);
        for (TuaSach show : tuasach) {
            stt++;
            modelTuaSach.addRow(new Object[]{stt, show.getMaTS(), show.getTenTS(), show.getMaTG(), show.getMaTL(), show.getTomTat(), show.getSoLuong()});
        }
    }

    public void ShowTheLoai() {
        List<TheLoai> theloai = userTL.getAll();
        int stt = 0;
        modelTheLoai.setRowCount(0);
        for (TheLoai show : theloai) {
            stt++;
            modelTheLoai.addRow(new Object[]{stt, show.getMaTL(), show.getTenTL()});
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

        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTentuaSach5 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cbbMaTacGia5 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        btTracuu5_1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cbbMaTheLoai5 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtNDtomtat5 = new javax.swing.JTextArea();
        btnXoa6 = new javax.swing.JButton();
        btnCapnhat6 = new javax.swing.JButton();
        btnThem6 = new javax.swing.JButton();
        btnLuu6 = new javax.swing.JButton();
        txtMaTuaSach5 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtSoLuong5 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        btTracuu5_2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtTenTheLoai5 = new javax.swing.JTextField();
        btnCapnhat7 = new javax.swing.JButton();
        btnThem7 = new javax.swing.JButton();
        btnLuu7 = new javax.swing.JButton();
        txtMaTheLoai5 = new javax.swing.JLabel();
        btnXoa7 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTuaSach5 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblTheLoai5 = new javax.swing.JTable();

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(0, 102, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(0, 102, 153));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tựa sách"));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Mã tựa sách:");
        jPanel23.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 42, -1, 31));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Tên tựa sách:");
        jPanel23.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 86, -1, 30));
        jPanel23.add(txtTentuaSach5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 86, 240, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Mã tác giả:");
        jPanel23.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 133, -1, -1));

        cbbMaTacGia5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel23.add(cbbMaTacGia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 126, 240, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("ND tóm tắt:");
        jPanel23.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btTracuu5_1.setBackground(new java.awt.Color(0, 102, 153));
        btTracuu5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu5_1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu5_1.setText("Tra cứu");
        btTracuu5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu5_1ActionPerformed(evt);
            }
        });
        jPanel23.add(btTracuu5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 120, 41));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Mã thể loại:");
        jPanel23.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        cbbMaTheLoai5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel23.add(cbbMaTheLoai5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 174, 240, 30));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtNDtomtat5.setColumns(20);
        txtNDtomtat5.setRows(5);
        jScrollPane7.setViewportView(txtNDtomtat5);

        jPanel23.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 224, 240, 38));

        btnXoa6.setBackground(new java.awt.Color(0, 102, 153));
        btnXoa6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa6.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa6.setText("Xóa");
        btnXoa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa6ActionPerformed(evt);
            }
        });
        jPanel23.add(btnXoa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 140, 40));

        btnCapnhat6.setBackground(new java.awt.Color(0, 102, 153));
        btnCapnhat6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat6.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat6.setText("Làm mới");
        btnCapnhat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat6ActionPerformed(evt);
            }
        });
        jPanel23.add(btnCapnhat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 140, 40));

        btnThem6.setBackground(new java.awt.Color(0, 102, 153));
        btnThem6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem6.setForeground(new java.awt.Color(255, 255, 255));
        btnThem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem6.setText("Thêm mới");
        btnThem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem6ActionPerformed(evt);
            }
        });
        jPanel23.add(btnThem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 140, -1));

        btnLuu6.setBackground(new java.awt.Color(0, 102, 153));
        btnLuu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu6.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu6.setText("Cập nhật");
        btnLuu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu6ActionPerformed(evt);
            }
        });
        jPanel23.add(btnLuu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 140, 40));
        jPanel23.add(txtMaTuaSach5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 42, 230, 31));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Số lượng:");
        jPanel23.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 282, -1, -1));
        jPanel23.add(txtSoLuong5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 275, 240, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin thể loại"));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btTracuu5_2.setBackground(new java.awt.Color(0, 102, 153));
        btTracuu5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu5_2.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu5_2.setText("Tra cứu");
        btTracuu5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu5_2ActionPerformed(evt);
            }
        });
        jPanel15.add(btTracuu5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, 40));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Mã thể loại:");
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, -1, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Tên thể loại:");
        jPanel15.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 97, 90, 30));
        jPanel15.add(txtTenTheLoai5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 200, 30));

        btnCapnhat7.setBackground(new java.awt.Color(0, 102, 153));
        btnCapnhat7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat7.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat7.setText("Làm mới");
        btnCapnhat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat7ActionPerformed(evt);
            }
        });
        jPanel15.add(btnCapnhat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 41));

        btnThem7.setBackground(new java.awt.Color(0, 102, 153));
        btnThem7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem7.setForeground(new java.awt.Color(255, 255, 255));
        btnThem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem7.setText(" Thêm mới");
        btnThem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem7ActionPerformed(evt);
            }
        });
        jPanel15.add(btnThem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, -1));

        btnLuu7.setBackground(new java.awt.Color(0, 102, 153));
        btnLuu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu7.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu7.setText("Cập nhật");
        btnLuu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu7ActionPerformed(evt);
            }
        });
        jPanel15.add(btnLuu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, 40));
        jPanel15.add(txtMaTheLoai5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 31));

        btnXoa7.setBackground(new java.awt.Color(0, 102, 153));
        btnXoa7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa7.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa7.setText("Xóa");
        btnXoa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa7ActionPerformed(evt);
            }
        });
        jPanel15.add(btnXoa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 41));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1309, -1));

        tblTuaSach5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTuaSach5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblTuaSach5);

        jPanel14.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 332, 727, 380));

        jButton18.setBackground(java.awt.SystemColor.activeCaption);
        jPanel14.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 1410, 110, 51));

        tblTheLoai5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTheLoai5MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblTheLoai5);

        jPanel14.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 332, 370, 380));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1311, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btTracuu5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu5_1ActionPerformed
        // TODO add your handling code here:
        String str = JOptionPane.showInputDialog(this, "Vui lòng nhập tên Tựa sách.", JOptionPane.INFORMATION_MESSAGE);

        modelTuaSach.setRowCount(0);
        List<TuaSach> user_TS = userTS.findByName(str);
        int sttts = 0;
        for (TuaSach users : user_TS) {
            sttts++;
            modelTuaSach.addRow(new Object[]{sttts, users.getMaTS(), users.getTenTS(), users.getMaTG(), users.getMaTL(), users.getTomTat(), users.getSoLuong()});
        }
        if (modelTuaSach.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy", "Thông báo", JOptionPane.ERROR_MESSAGE);
            ShowTuaSach();
        }
    }//GEN-LAST:event_btTracuu5_1ActionPerformed

    private void btnXoa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa6ActionPerformed
        // TODO add your handling code here:
        int row = tblTuaSach5.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Tựa sách muốn xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            int confident = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa Tựa sách này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maTS = String.valueOf(tblTuaSach5.getValueAt(row, 1));
                userTS.remove(maTS);
                JOptionPane.showConfirmDialog(this, "Xóa thành công");
                txtMaTuaSach5.setText("");
                txtTentuaSach5.setText("");
                cbbMaTacGia5.setSelectedIndex(0);

                cbbMaTheLoai5.setSelectedIndex(0);

                txtSoLuong5.setText("");

                txtNDtomtat5.setText("");
                ShowTuaSach();
            }
        }
    }//GEN-LAST:event_btnXoa6ActionPerformed

    private void btnCapnhat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat6ActionPerformed
        // TODO add your handling code here:
        txtMaTuaSach5.setText("");
        txtTentuaSach5.setText("");
        cbbMaTacGia5.setSelectedIndex(0);

        cbbMaTheLoai5.setSelectedIndex(0);

        txtSoLuong5.setText("");

        txtNDtomtat5.setText("");
        ShowTuaSach();

    }//GEN-LAST:event_btnCapnhat6ActionPerformed

    private void btnThem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem6ActionPerformed
        // TODO add your handling code here:
        TuaSach tuaSach = new TuaSach();
        tuaSach.setTenTS(txtTentuaSach5.getText());
        tuaSach.setMaTG(String.valueOf(cbbMaTacGia5.getSelectedItem()));
        tuaSach.setMaTL(String.valueOf(cbbMaTheLoai5.getSelectedItem()));
        tuaSach.setTomTat(txtNDtomtat5.getText());
       
        if (txtTentuaSach5.getText().equals("")){
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập đầy đủ thông tin");
        }
        
        else
        {
        tuaSach.setSoLuong(Integer.valueOf(txtSoLuong5.getText()));
        userTS.insert(tuaSach);
        ShowTuaSach();
        
        txtMaTuaSach5.setText("");
        txtTentuaSach5.setText("");
        cbbMaTacGia5.setSelectedIndex(0);
        cbbMaTheLoai5.setSelectedIndex(0);
        txtSoLuong5.setText("");
        txtNDtomtat5.setText("");
        JOptionPane.showConfirmDialog(this, "Thêm thành công");}


    }//GEN-LAST:event_btnThem6ActionPerformed

    private void btnLuu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu6ActionPerformed
        // TODO add your handling code here:
        TuaSach tuaSach = new TuaSach();
        tuaSach.setMaTS(txtMaTuaSach5.getText());
        tuaSach.setTenTS(txtTentuaSach5.getText());
        tuaSach.setMaTG(String.valueOf(cbbMaTacGia5.getSelectedItem()));
        tuaSach.setMaTL(String.valueOf(cbbMaTheLoai5.getSelectedItem()));
        tuaSach.setTomTat(txtNDtomtat5.getText());
        tuaSach.setSoLuong(Integer.valueOf(txtSoLuong5.getText()));
         if (!txtTentuaSach5.getText().equals("") && !txtSoLuong5.getText().equals("")){
        userTS.update(tuaSach);
        ShowTuaSach();
        txtMaTuaSach5.setText("");
        txtTentuaSach5.setText("");
        cbbMaTacGia5.setSelectedIndex(0);
        cbbMaTheLoai5.setSelectedIndex(0);
        txtSoLuong5.setText("");
        txtNDtomtat5.setText("");
        JOptionPane.showConfirmDialog(this, "Cập nhật thành công");}
        else
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập đầy đủ thông tin!");

    }//GEN-LAST:event_btnLuu6ActionPerformed

    private void btTracuu5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu5_2ActionPerformed
        // TODO add your handling code here:
        String str = JOptionPane.showInputDialog(this, "Vui lòng nhập tên Thể loại.", JOptionPane.INFORMATION_MESSAGE);

        modelTheLoai.setRowCount(0);
        List<TheLoai> user_TL = userTL.findByName(str);
        int stttl = 0;
        for (TheLoai users : user_TL) {
            stttl++;
            modelTheLoai.addRow(new Object[]{stttl, users.getMaTL(), users.getTenTL()});
        }
        if (modelTheLoai.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy", "Thông báo", JOptionPane.ERROR_MESSAGE);
            ShowTheLoai();
        }
    }//GEN-LAST:event_btTracuu5_2ActionPerformed

    private void btnXoa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa7ActionPerformed
        // TODO add your handling code here:
        int row = tblTheLoai5.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Thể loại muốn xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            int confident = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa Thể loại này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maTL = String.valueOf(tblTheLoai5.getValueAt(row, 1));
                userTL.remove(maTL);
                JOptionPane.showConfirmDialog(this, "Xóa thành công");
                ShowTheLoai();
                txtMaTheLoai5.setText("");
                txtTenTheLoai5.setText("");
            }
        }
    }//GEN-LAST:event_btnXoa7ActionPerformed

    private void btnCapnhat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat7ActionPerformed
        // TODO add your handling code here:

        txtMaTheLoai5.setText("");
        txtTenTheLoai5.setText("");

        ShowTheLoai();
    }//GEN-LAST:event_btnCapnhat7ActionPerformed

    private void btnThem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem7ActionPerformed
        // TODO add your handling code here:
        TheLoai theLoai = new TheLoai();
        theLoai.setTenTL(txtTenTheLoai5.getText());
        if (!txtTenTheLoai5.getText().equals("")) {
            userTL.insert(theLoai);
            ShowTheLoai();
            txtTenTheLoai5.setText("");
            txtMaTheLoai5.setText("");
            JOptionPane.showConfirmDialog(this, "Thêm thành công");
        } else
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập tên thể loại");
    }//GEN-LAST:event_btnThem7ActionPerformed

    private void btnLuu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu7ActionPerformed
        // TODO add your handling code here:
        TheLoai theLoai = new TheLoai();
        theLoai.setMaTL(txtMaTheLoai5.getText());
        theLoai.setTenTL(txtTenTheLoai5.getText());
        if (!txtTenTheLoai5.getText().equals("")) {
            userTL.insert(theLoai);
            ShowTheLoai();
            txtTenTheLoai5.setText("");
            txtMaTheLoai5.setText("");
            JOptionPane.showConfirmDialog(this, "Cập nhật thành công");
        } else
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập tên thể loại");
    }//GEN-LAST:event_btnLuu7ActionPerformed

    private void tblTuaSach5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTuaSach5MouseClicked
        // TODO add your handling code here:

        int row = tblTuaSach5.getSelectedRow();
        txtMaTuaSach5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 1)));
        txtTentuaSach5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 2)));
        cbbMaTacGia5.setSelectedItem(String.valueOf(tblTuaSach5.getValueAt(row, 3)));
        cbbMaTheLoai5.setSelectedItem(String.valueOf(tblTuaSach5.getValueAt(row, 4)));
        txtNDtomtat5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 5)));
        txtSoLuong5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 6)));
    }//GEN-LAST:event_tblTuaSach5MouseClicked

    private void tblTheLoai5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTheLoai5MouseClicked
        // TODO add your handling code here:

        int row = tblTheLoai5.getSelectedRow();
        txtMaTheLoai5.setText(String.valueOf(tblTheLoai5.getValueAt(row, 1)));
        txtTenTheLoai5.setText(String.valueOf(tblTheLoai5.getValueAt(row, 2)));
    }//GEN-LAST:event_tblTheLoai5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTracuu5_1;
    private javax.swing.JButton btTracuu5_2;
    private javax.swing.JButton btnCapnhat6;
    private javax.swing.JButton btnCapnhat7;
    private javax.swing.JButton btnLuu6;
    private javax.swing.JButton btnLuu7;
    private javax.swing.JButton btnThem6;
    private javax.swing.JButton btnThem7;
    private javax.swing.JButton btnXoa6;
    private javax.swing.JButton btnXoa7;
    private javax.swing.JComboBox<String> cbbMaTacGia5;
    private javax.swing.JComboBox<String> cbbMaTheLoai5;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tblTheLoai5;
    private javax.swing.JTable tblTuaSach5;
    private javax.swing.JLabel txtMaTheLoai5;
    private javax.swing.JLabel txtMaTuaSach5;
    private javax.swing.JTextArea txtNDtomtat5;
    private javax.swing.JTextField txtSoLuong5;
    private javax.swing.JTextField txtTenTheLoai5;
    private javax.swing.JTextField txtTentuaSach5;
    // End of variables declaration//GEN-END:variables
}
