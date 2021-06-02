package main.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class DocGiaPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocGiaPanel
     */
    DefaultTableModel modelDocGia;
    DocGiaDao docGiaDao;
    ThongTinMuonTraDao userTTMT;
    SimpleDateFormat f = new SimpleDateFormat("MMMM dd, yyyy");
    static int maxPageItem = 8;

    public DocGiaPanel() {
        initComponents();
        modelDocGia = new DefaultTableModel() {
            @Override
            public java.lang.Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 9) {
                    return Boolean.class;
                } else {
                    return String.class;
                }
            }
        };

        tblDocGia1.setModel(modelDocGia);
        docGiaDao = new DocGiaDao();
        userTTMT = new ThongTinMuonTraDao();

        modelDocGia.addColumn("STT");
        modelDocGia.addColumn("Mã độc giả");
        modelDocGia.addColumn("Họ tên");
        modelDocGia.addColumn("Giới tính");
        modelDocGia.addColumn("Ngày sinh");
        modelDocGia.addColumn("Địa chỉ");
        modelDocGia.addColumn("SĐT");
        modelDocGia.addColumn("Ngày đăng kí");
        modelDocGia.addColumn("Ngày hết hạn");
        modelDocGia.addColumn("Đánh dấu");

        tblDocGia1.setRowHeight(40);
        tblDocGia1.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblDocGia1.getColumnModel().getColumn(3).setPreferredWidth(10);
        tblDocGia1.getColumnModel().getColumn(9).setPreferredWidth(10);

        setCbbItems();

        ShowDocGia(docGiaDao.getByPage(maxPageItem, 1), 0);

    }

    public void setCbbItems() {
        cbbDocGia.removeAllItems();
        for (int i = 1; i <= docGiaDao.getTotalPage(maxPageItem); i++) {
            cbbDocGia.addItem(String.valueOf(i));
        }
    }

    public void ShowDocGia() {
        List<DocGia> docgia = docGiaDao.getAll();
        modelDocGia.setRowCount(0);
        int stt = 0;
        for (DocGia show : docgia) {
            stt++;
            modelDocGia.addRow(new Object[]{stt, show.getMaDG(), show.getHoten(), show.getGioiTinh(), show.getNgaySinh(),
                show.getDiaChi(), show.getSdt(), show.getNgayDK(), show.getNgayHetHan(), false});
        }
    }

    public void ShowDocGia(List<DocGia> docgia, int viTri) {
        modelDocGia.setRowCount(0);
        int stt = 0;
        stt = stt + viTri;
        for (DocGia show : docgia) {
            stt++;
            modelDocGia.addRow(new Object[]{stt, show.getMaDG(), show.getHoten(), show.getGioiTinh(), show.getNgaySinh(),
                show.getDiaChi(), show.getSdt(), show.getNgayDK(), show.getNgayHetHan(), false});
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSoDT1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChi1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        RdbtnNam1 = new javax.swing.JRadioButton();
        RdbtnNu1 = new javax.swing.JRadioButton();
        txtMaDocGia1 = new javax.swing.JLabel();
        txtNgaySinh1 = new com.toedter.calendar.JDateChooser();
        txtngayDK1 = new com.toedter.calendar.JDateChooser();
        txtngayEndDK1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocGia1 = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        btnThem1 = new javax.swing.JButton();
        btnCapnhat1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnLuu1 = new javax.swing.JButton();
        btTracuu1 = new javax.swing.JButton();
        cbbDocGia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnTruoc = new javax.swing.JButton();
        btnTiepTheo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết đọc giả"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã đọc giả:");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, -1, 31));

        jLabel3.setText("Số điện thoại:");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 30, -1, 30));
        jPanel8.add(txtSoDT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 30, 200, 30));

        jLabel4.setText("Địa chỉ:");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 142, -1, -1));

        txtHoTen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTen1ActionPerformed(evt);
            }
        });
        jPanel8.add(txtHoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 78, 476, 30));

        jLabel5.setText("Họ tên:");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, -1));
        jPanel8.add(txtDiaChi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 132, 287, 30));

        jLabel6.setText("Ngày sinh:");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 194, -1, -1));

        jLabel7.setText("Ngày đăng kí:");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 253, -1, -1));

        jLabel8.setText("Ngày hết hạn:");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 301, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Giới tính"));

        buttonGroup1.add(RdbtnNam1);
        RdbtnNam1.setText("Nam");

        buttonGroup1.add(RdbtnNu1);
        RdbtnNu1.setText("Nữ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RdbtnNam1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(RdbtnNu1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdbtnNam1)
                    .addComponent(RdbtnNu1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));
        jPanel8.add(txtMaDocGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, 31));
        jPanel8.add(txtNgaySinh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 180, 287, 30));
        jPanel8.add(txtngayDK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 239, 287, 30));
        jPanel8.add(txtngayEndDK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 287, 287, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 740, 340));

        tblDocGia1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDocGia1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDocGia1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblDocGia1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblDocGia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocGia1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDocGia1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1100, 350));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThem1.setBackground(new java.awt.Color(0, 102, 153));
        btnThem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem1.setForeground(new java.awt.Color(255, 255, 255));
        btnThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem1.setText("Add");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });
        jPanel28.add(btnThem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        btnCapnhat1.setBackground(new java.awt.Color(0, 102, 153));
        btnCapnhat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat1.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat1.setText("Refresh");
        btnCapnhat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat1ActionPerformed(evt);
            }
        });
        jPanel28.add(btnCapnhat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 41));

        btnXoa1.setBackground(new java.awt.Color(0, 102, 153));
        btnXoa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa1.setText("Delete");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });
        jPanel28.add(btnXoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, 41));

        btnLuu1.setBackground(new java.awt.Color(0, 102, 153));
        btnLuu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu1.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu1.setText("Update");
        btnLuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu1ActionPerformed(evt);
            }
        });
        jPanel28.add(btnLuu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 72, 110, 41));

        btTracuu1.setBackground(new java.awt.Color(0, 102, 153));
        btTracuu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu1.setText("Tra cứu");
        btTracuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu1ActionPerformed(evt);
            }
        });
        jPanel28.add(btTracuu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 44));

        jPanel1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 1, 350, 340));

        cbbDocGia.setEditable(true);
        cbbDocGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDocGiaActionPerformed(evt);
            }
        });
        jPanel1.add(cbbDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 710, 60, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trang");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, 50, 30));

        btnTruoc.setText("Trước");
        btnTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruocActionPerformed(evt);
            }
        });
        jPanel1.add(btnTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, -1, 30));

        btnTiepTheo.setText("Tiếp theo");
        btnTiepTheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTheoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTiepTheo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 710, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        String ngaySinh = f.format(txtNgaySinh1.getDate());
        String ngayDK = f.format(txtngayDK1.getDate());
        String ngayEndDK = f.format(txtngayEndDK1.getDate());

        String gioitinh = "";
        if (RdbtnNam1.isSelected()) {
            gioitinh += "Nam";
        } else {
            gioitinh += "Nữ";
        }
        DocGia docGia = new DocGia();
        docGia.setHoten(txtHoTen1.getText());
        docGia.setDiaChi(txtDiaChi1.getText());
        docGia.setGioiTinh(gioitinh);
        docGia.setSdt(txtSoDT1.getText());
        docGia.setNgaySinh(ngaySinh);
        docGia.setNgayDK(ngayDK);
        docGia.setNgayHetHan(ngayEndDK);
        docGiaDao.insert(docGia);

        int totalPage = docGiaDao.getTotalPage(maxPageItem);
        if (totalPage == cbbDocGia.getItemCount() + 1) {
            cbbDocGia.addItem(String.valueOf(totalPage));
        }
        cbbDocGia.setSelectedIndex(totalPage - 1);

        txtHoTen1.setText("");
        txtMaDocGia1.setText("");
        txtDiaChi1.setText("");
        txtSoDT1.setText("");
        RdbtnNam1.setSelected(false);
        RdbtnNu1.setSelected(false);
        JOptionPane.showConfirmDialog(this, "Thêm thành công");
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnCapnhat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat1ActionPerformed
        // TODO add your handling code here:
        txtHoTen1.setText("");
        txtMaDocGia1.setText("");
        txtDiaChi1.setText("");
        txtSoDT1.setText("");
        if (RdbtnNam1.isSelected()) {

            RdbtnNam1.setSelected(false);
        } else {
            RdbtnNu1.setSelected(false);
        }

        ShowDocGia(docGiaDao.getByPage(maxPageItem, 1), 0);
    }//GEN-LAST:event_btnCapnhat1ActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
        Boolean kiemTra = false;
        int row = tblDocGia1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người muốn xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            int confident = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa Độc giả này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                for (int i = 0; i < tblDocGia1.getRowCount(); i++) {
                    Boolean bool = Boolean.valueOf(tblDocGia1.getValueAt(i, 9).toString());
                    if (bool == true) {
                        kiemTra = true;
                        String maDS = String.valueOf(tblDocGia1.getValueAt(i, 1));
                        docGiaDao.remove(maDS);
                    }
                }

                if (!kiemTra) {
                    String maDS = String.valueOf(tblDocGia1.getValueAt(row, 1));
                    docGiaDao.remove(maDS);
                }

                int selectedPage = Integer.parseInt(cbbDocGia.getSelectedItem().toString());
                ShowDocGia(docGiaDao.getByPage(maxPageItem, selectedPage), (selectedPage - 1) * maxPageItem);
                txtHoTen1.setText("");
                txtMaDocGia1.setText("");
                txtDiaChi1.setText("");
                txtSoDT1.setText("");
                RdbtnNam1.setSelected(false);
                RdbtnNu1.setSelected(false);
                JOptionPane.showConfirmDialog(this, "Xóa thành công");

            }

        }

    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnLuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu1ActionPerformed
        // TODO add your handling code here:

        String ngaySinh = f.format(txtNgaySinh1.getDate());
        String ngayDK = f.format(txtngayDK1.getDate());
        String ngayEndDK = f.format(txtngayEndDK1.getDate());

        String gioitinh = "";
        if (RdbtnNam1.isSelected()) {
            gioitinh += "Nam";
        } else {
            gioitinh += "Nữ";
        }
        DocGia docGia = new DocGia();
        docGia.setMaDG(txtMaDocGia1.getText());
        docGia.setHoten(txtHoTen1.getText());
        docGia.setDiaChi(txtDiaChi1.getText());
        docGia.setGioiTinh(gioitinh);
        docGia.setSdt(txtSoDT1.getText());
        docGia.setNgaySinh(ngaySinh);
        docGia.setNgayDK(ngayDK);
        docGia.setNgayHetHan(ngayEndDK);
        docGiaDao.update(docGia);
        ShowDocGia();
        int selectedPage = Integer.parseInt(cbbDocGia.getSelectedItem().toString());
        ShowDocGia(docGiaDao.getByPage(maxPageItem, selectedPage), (selectedPage - 1) * maxPageItem);
        JOptionPane.showConfirmDialog(this, "Cập nhật thành thành công");


    }//GEN-LAST:event_btnLuu1ActionPerformed

    private void btTracuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu1ActionPerformed
        // TODO add your handling code here:
        String str = JOptionPane.showInputDialog(this, "Vui lòng nhập tên Độc giả", JOptionPane.INFORMATION_MESSAGE);
        if (str != null) {
            modelDocGia.setRowCount(0);
            List<DocGia> user_DG = docGiaDao.findByName(str);
            int sttdg = 0;
            for (DocGia users : user_DG) {
                sttdg++;
                modelDocGia.addRow(new Object[]{sttdg, users.getMaDG(), users.getHoten(), users.getGioiTinh(), users.getNgaySinh(), users.getDiaChi(), users.getSdt(), users.getNgayDK(), users.getNgayHetHan()});
            }
            if (modelDocGia.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy", "Thông báo", JOptionPane.ERROR_MESSAGE);
                ShowDocGia();
            }
        }

    }//GEN-LAST:event_btTracuu1ActionPerformed

    private void tblDocGia1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDocGia1AncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_tblDocGia1AncestorAdded

    private void txtHoTen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTen1ActionPerformed

    private void tblDocGia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocGia1MouseClicked
        // TODO add your handling code here:
        int row = tblDocGia1.getSelectedRow();
        txtMaDocGia1.setText(String.valueOf(tblDocGia1.getValueAt(row, 1)));
        txtHoTen1.setText(String.valueOf(tblDocGia1.getValueAt(row, 2)));
        txtSoDT1.setText(String.valueOf(tblDocGia1.getValueAt(row, 6)));
        txtDiaChi1.setText(String.valueOf(tblDocGia1.getValueAt(row, 5)));
        if (String.valueOf(tblDocGia1.getValueAt(row, 3)).equals("Nam")) {
            RdbtnNam1.setSelected(true);
        } else {
            RdbtnNu1.setSelected(true);
        }
        String ngaySinh = String.valueOf(tblDocGia1.getValueAt(row, 4));
        String ngayDK = String.valueOf(tblDocGia1.getValueAt(row, 7));
        String ngayEndDK = String.valueOf(tblDocGia1.getValueAt(row, 8));
        try {

            Date dob = f.parse(ngaySinh);
            Date NgayDK = f.parse(ngayDK);
            Date NgayendDK = f.parse(ngayEndDK);
            txtNgaySinh1.setDate(dob);
            txtngayDK1.setDate(NgayDK);
            txtngayEndDK1.setDate(NgayendDK);
        } catch (ParseException e) {
        }


    }//GEN-LAST:event_tblDocGia1MouseClicked

    private void cbbDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDocGiaActionPerformed
        int selectedPage = Integer.parseInt(cbbDocGia.getSelectedItem().toString());
        ShowDocGia(docGiaDao.getByPage(maxPageItem, selectedPage), (selectedPage - 1) * maxPageItem);
    }//GEN-LAST:event_cbbDocGiaActionPerformed

    private void btnTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruocActionPerformed
        cbbDocGia.setSelectedIndex(cbbDocGia.getSelectedIndex() == 0 ? 0 : cbbDocGia.getSelectedIndex() - 1);
    }//GEN-LAST:event_btnTruocActionPerformed

    private void btnTiepTheoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTheoActionPerformed
        int totalPage = docGiaDao.getTotalPage(maxPageItem);
        cbbDocGia.setSelectedIndex(cbbDocGia.getSelectedIndex() == totalPage - 1 ? totalPage - 1 : cbbDocGia.getSelectedIndex() + 1);
    }//GEN-LAST:event_btnTiepTheoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdbtnNam1;
    private javax.swing.JRadioButton RdbtnNu1;
    private javax.swing.JButton btTracuu1;
    private javax.swing.JButton btnCapnhat1;
    private javax.swing.JButton btnLuu1;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnTiepTheo;
    private javax.swing.JButton btnTruoc;
    private javax.swing.JButton btnXoa1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbDocGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDocGia1;
    private javax.swing.JTextField txtDiaChi1;
    private javax.swing.JTextField txtHoTen1;
    private javax.swing.JLabel txtMaDocGia1;
    private com.toedter.calendar.JDateChooser txtNgaySinh1;
    private javax.swing.JTextField txtSoDT1;
    private com.toedter.calendar.JDateChooser txtngayDK1;
    private com.toedter.calendar.JDateChooser txtngayEndDK1;
    // End of variables declaration//GEN-END:variables
}
