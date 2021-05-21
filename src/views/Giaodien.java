/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.LB_Service;
import dao.LB_Search;
import dao.LB_EditDaTa;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.LB_User_DG;
import model.LB_User_Muon;
import model.LB_User_TSTL;
import model.LB_User_DM;
import model.LB_User_NXBTG;

/**
 *
 * @author Admin
 */
public class Giaodien extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel1;
    DefaultTableModel defaultTableModel2;
    DefaultTableModel defaultTableModel3;
    DefaultTableModel defaultTableModel4;
    DefaultTableModel defaultTableModel5;
    DefaultTableModel defaultTableModel6;
    DefaultTableModel defaultTableModel7;
    LB_Service userService;

    /**
     * Creates new form NewJFrame
     */
    public Giaodien() throws SQLException {
        initComponents();
        defaultTableModel1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        defaultTableModel2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        defaultTableModel3 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        defaultTableModel4 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        defaultTableModel5 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        defaultTableModel6 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        defaultTableModel7 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        userService = new LB_Service();
        tblDocGia1.setModel(defaultTableModel1);
        defaultTableModel1.addColumn("STT");
        defaultTableModel1.addColumn("MaDocGia");
        defaultTableModel1.addColumn("HoTenDG");
        defaultTableModel1.addColumn("NgaySinh");
        defaultTableModel1.addColumn("GioiTinh");
        defaultTableModel1.addColumn("DiaChi");
        defaultTableModel1.addColumn("NgayDangKi");
        defaultTableModel1.addColumn("NgayHetHanDK");
        defaultTableModel1.addColumn("SDT");

        try {
            List<LB_User_DG> users = userService.GetAll_DocGia();
            for (LB_User_DG user : users) {
                defaultTableModel1.addRow(new Object[]{user.GetSTT(), user.GetMaDG(), user.GetHoTenDG(), user.GetNgaySinh(), user.GetGioiTinh(), user.GetDiaChi(), user.GetNgayDK(), user.GetNgayHetHanDK(), user.GetSDT()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblMuontraSach2.setModel(defaultTableModel2);
        defaultTableModel2.addColumn("STT");
        defaultTableModel2.addColumn("MaMuon");
        defaultTableModel2.addColumn("MaDG");
        defaultTableModel2.addColumn("NgayMuon");
        defaultTableModel2.addColumn("NgayHenTra");
        defaultTableModel2.addColumn("SoLuong");
        defaultTableModel2.addColumn("GhiChu");
        defaultTableModel2.addColumn("Ngaytra");
        try {
            List<LB_User_TSTL> users = userService.GetAll_TS_B();
            for (LB_User_TSTL user : users) {
                CbbTenSach2.addItem(user.GetTenTL());
            }
            List<LB_User_Muon> user = userService.GetAll_Return_B();
            for (LB_User_Muon userss : user) {
                defaultTableModel2.addRow(new Object[]{userss.GetSTT(), userss.GetMaMuon(), userss.GetMaDG(), userss.GetNgayMuon(), userss.GetNgayHenTra(),
                    userss.GetSoLuong(), userss.GetGhiChu(), userss.GetNgayTra()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
        }

        tbldanhmucSach3.setModel(defaultTableModel3);
        defaultTableModel3.addColumn("STT");
        defaultTableModel3.addColumn("TenSach");
        defaultTableModel3.addColumn("MaDauSach");
        defaultTableModel3.addColumn("The Loai");
        defaultTableModel3.addColumn("So Luong");

        List<LB_User_DM> user_ds = userService.GetAll_DS_B();
        for (LB_User_DM user : user_ds) {
            CbbMadausach3.addItem(user.GetMaDS());
        }

        List<LB_User_DM> user_dm = userService.GetAll_DM_B();
        for (LB_User_DM user : user_dm) {
            defaultTableModel3.addRow(new Object[]{user.GetSTT(), user.GetTenCS(), user.GetMaDS(), user.GetTenTL(), user.GetSoLuong()});
        }
        tblNhaSanXuat4.setModel(defaultTableModel4);
        defaultTableModel4.addColumn("STT");
        defaultTableModel4.addColumn("MaNXB");
        defaultTableModel4.addColumn("TenNXB");

        List<LB_User_NXBTG> user_NXB = userService.GetAll_NXB();
        for (LB_User_NXBTG user : user_NXB) {
            defaultTableModel4.addRow(new Object[]{user.GetSTT_NXB(), user.GetMaNXB(), user.GetTenNXB()});
        }

        tblTacgia4.setModel(defaultTableModel5);
        defaultTableModel5.addColumn("STT");
        defaultTableModel5.addColumn("MaTacGia");
        defaultTableModel5.addColumn("TenTacGia");
        List<LB_User_NXBTG> user_TG = userService.GetAll_TacGia();
        for (LB_User_NXBTG user : user_TG) {
            defaultTableModel5.addRow(new Object[]{user.GetSTT_TG(), user.GetMaTG(), user.GetTenTG()});
        }

        tblTTTuaSach5.setModel(defaultTableModel6);
        defaultTableModel6.addColumn("STT");
        defaultTableModel6.addColumn("MaTuaSach");
        defaultTableModel6.addColumn("TenTuaSach");
        defaultTableModel6.addColumn("MaTheLoai");
        defaultTableModel6.addColumn("MaTacGia");

        List<LB_User_NXBTG> user_TG1 = userService.GetAll_TacGia();
        for (LB_User_NXBTG user : user_TG) {
            cbbMatacGia5.addItem(user.GetMaTG());
        }

        List<LB_User_TSTL> user_TL1 = userService.GetAll_TL_B();
        for (LB_User_TSTL user : user_TL1) {
            cbbMatheLoai5.addItem(user.GetMaTL());
        }

        List<LB_User_TSTL> user_TS = userService.GetAll_TS_B();
        for (LB_User_TSTL user : user_TS) {
            defaultTableModel6.addRow(new Object[]{user.GetSTT_TS(), user.GetMaTS(), user.GetTenTL(), user.GetMaTL(), user.GetMaTG()});
        }

        tblTTTheoLoai5.setModel(defaultTableModel7);
        defaultTableModel7.addColumn("STT");
        defaultTableModel7.addColumn("MaTheLoai");
        defaultTableModel7.addColumn("TenTheLoai");

        List<LB_User_TSTL> user_TL = userService.GetAll_TL_B();
        for (LB_User_TSTL user : user_TL) {
            defaultTableModel7.addRow(new Object[]{user.GetSTT_TL(), user.GetMaTL(), user.GetTenTL()});
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

        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMadocgia1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSoDT1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHoten1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        RdbtnNam1 = new javax.swing.JRadioButton();
        RdbtnNu1 = new javax.swing.JRadioButton();
        txtNgaySinh1 = new com.toedter.calendar.JDateChooser();
        txtNgayDK1 = new com.toedter.calendar.JDateChooser();
        txtNgayEndDK1 = new com.toedter.calendar.JDateChooser();
        btnThem1 = new javax.swing.JButton();
        btnCapnhat1 = new javax.swing.JButton();
        btnLuu1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocGia1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btThem4_1 = new javax.swing.JButton();
        btnLuu4_1 = new javax.swing.JButton();
        btnCapnhat4_1 = new javax.swing.JButton();
        btnXoa4_1 = new javax.swing.JButton();
        btTracuu4_1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTenNhaSX4 = new javax.swing.JTextField();
        txtMaNhaSX4 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNhaSanXuat4 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        btThem4_2 = new javax.swing.JButton();
        btnLuu4_2 = new javax.swing.JButton();
        btnCapnhat4_2 = new javax.swing.JButton();
        btnXoa4_2 = new javax.swing.JButton();
        btTracuu4_2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtTenTacgia4 = new javax.swing.JTextField();
        txtMaTacgia4 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblTacgia4 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtMatuasach5 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtTentuaSach5 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cbbMatacGia5 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        btTracuu5_1 = new javax.swing.JButton();
        btThem5_1 = new javax.swing.JButton();
        btnXoa5_1 = new javax.swing.JButton();
        btnLuu5_1 = new javax.swing.JButton();
        btnCapnhat5_1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cbbMatheLoai5 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtNDtomtat5 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        btThem5_2 = new javax.swing.JButton();
        btnLuu5_2 = new javax.swing.JButton();
        btnCapnhat5_2 = new javax.swing.JButton();
        btnXoa5_2 = new javax.swing.JButton();
        btTracuu5_2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtTenTheLoai5 = new javax.swing.JTextField();
        txtMaTheLoai5 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTTTuaSach5 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblTTTheoLoai5 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtTungay6 = new javax.swing.JTextField();
        btTungay6 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        txtDen6 = new javax.swing.JTextField();
        btnDen6 = new javax.swing.JButton();
        rdbtnDSDGDangki = new javax.swing.JRadioButton();
        rdbtnDSDGtrehan = new javax.swing.JRadioButton();
        rdbtnChiTietPhieuMuon = new javax.swing.JRadioButton();
        btnThongke6 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblChiTietPhieuMuon6 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblThongKe6 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtMaMuon2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMadocgia2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CbbTenSach2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtSoluong2 = new javax.swing.JTextField();
        txtGhichu2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btTracuu2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNgayMuon2 = new com.toedter.calendar.JDateChooser();
        txtNgayHenTra2 = new com.toedter.calendar.JDateChooser();
        txtNgayTra2 = new com.toedter.calendar.JDateChooser();
        btThem2 = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();
        btnCapnhat2 = new javax.swing.JButton();
        btnLuu2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMuontraSach2 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbldanhmucSach3 = new javax.swing.JTable();
        btThem3 = new javax.swing.JButton();
        btnLuu3 = new javax.swing.JButton();
        btnXoa3 = new javax.swing.JButton();
        btnCapnhat3 = new javax.swing.JButton();
        btTracuu3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMaSch3 = new javax.swing.JTextField();
        txttheloai3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CbbMadausach3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTenSach3 = new javax.swing.JTextField();
        txtTacGia3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        RdbtnDamuon3 = new javax.swing.JRadioButton();
        RdbtnChuamuon3 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNDtomluoc3 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jPanel7.setBackground(java.awt.SystemColor.activeCaption);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết đọc giả"));

        jLabel2.setText("Mã đọc giả:");

        jLabel3.setText("Số điện thoại:");

        jLabel4.setText("Địa chỉ:");

        jLabel5.setText("Họ tên:");

        jLabel6.setText("Ngày sinh:");

        jLabel7.setText("Ngày đăng kí:");

        jLabel8.setText("Ngày hết hạn:");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Giới tính"));

        buttonGroup3.add(RdbtnNam1);
        RdbtnNam1.setText("Nam");

        buttonGroup3.add(RdbtnNu1);
        RdbtnNu1.setText("Nữ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RdbtnNam1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(RdbtnNu1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdbtnNam1)
                    .addComponent(RdbtnNu1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtMadocgia1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDiaChi1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtHoten1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaySinh1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtNgayDK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayEndDK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMadocgia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoten1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtNgayDK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtNgayEndDK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThem1.setBackground(new java.awt.Color(0, 102, 102));
        btnThem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem1.setForeground(new java.awt.Color(255, 255, 255));
        btnThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btnThem1.setText("Thêm");

        btnCapnhat1.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat1.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat1.setText("Reset");

        btnLuu1.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu1.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu1.setText("Lưu");

        btnXoa1.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa1.setText("Xóa");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapnhat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem1)
                    .addComponent(btnCapnhat1))
                .addGap(94, 94, 94)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu1)
                    .addComponent(btnXoa1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(tblDocGia1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Đọc giả", jPanel1);

        jPanel12.setBackground(java.awt.SystemColor.activeCaption);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhà sản xuất"));

        btThem4_1.setBackground(new java.awt.Color(0, 102, 102));
        btThem4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem4_1.setForeground(new java.awt.Color(255, 255, 255));
        btThem4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btThem4_1.setText("Thêm");

        btnLuu4_1.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu4_1.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu4_1.setText("Lưu");

        btnCapnhat4_1.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat4_1.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat4_1.setText("Reset");

        btnXoa4_1.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa4_1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa4_1.setText("Xóa");

        btTracuu4_1.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu4_1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search-icon-32.png"))); // NOI18N
        btTracuu4_1.setText("Tra cứu");
        btTracuu4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu4_1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Mã NSX:");

        jLabel27.setText("Tên nhà sản xuất:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem4_1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btnCapnhat4_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLuu4_1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(btnXoa4_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtMaNhaSX4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTracuu4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenNhaSX4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtMaNhaSX4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btTracuu4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtTenNhaSX4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem4_1)
                    .addComponent(btnLuu4_1))
                .addGap(40, 40, 40)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat4_1)
                    .addComponent(btnXoa4_1))
                .addGap(31, 31, 31))
        );

        tblNhaSanXuat4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhà sản xuất"));
        tblNhaSanXuat4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhaSanXuat4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblNhaSanXuat4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(tblNhaSanXuat4);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tác giả"));

        btThem4_2.setBackground(new java.awt.Color(0, 102, 102));
        btThem4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem4_2.setForeground(new java.awt.Color(255, 255, 255));
        btThem4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btThem4_2.setText("Thêm");

        btnLuu4_2.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu4_2.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu4_2.setText("Lưu");

        btnCapnhat4_2.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat4_2.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat4_2.setText("Reset");

        btnXoa4_2.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa4_2.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa4_2.setText("Xóa");

        btTracuu4_2.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu4_2.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search-icon-32.png"))); // NOI18N
        btTracuu4_2.setText("Tra cứu");

        jLabel33.setText("Mã tác giả:");

        jLabel35.setText("Tên tác giả:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaTacgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTracuu4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenTacgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btThem4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhat4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa4_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu4_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtMaTacgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTracuu4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtTenTacgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem4_2)
                    .addComponent(btnLuu4_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat4_2)
                    .addComponent(btnXoa4_2))
                .addGap(31, 31, 31))
        );

        tblTacgia4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTacgia4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTacgia4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane11.setViewportView(tblTacgia4);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11))
                .addGap(36, 36, 36))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Tra cứu theo NSX - tác giả", jPanel4);

        jPanel14.setBackground(java.awt.SystemColor.activeCaption);

        jPanel22.setBackground(java.awt.SystemColor.activeCaption);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tựa sách"));

        jLabel29.setText("Mã tựa sách:");

        jLabel30.setText("Tên tựa sách:");

        jLabel31.setText("Mã tác giả:");

        cbbMatacGia5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel34.setText("ND tóm tắt:");

        btTracuu5_1.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu5_1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search-icon-32.png"))); // NOI18N
        btTracuu5_1.setText("Tra cứu");

        btThem5_1.setBackground(new java.awt.Color(0, 102, 102));
        btThem5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem5_1.setForeground(new java.awt.Color(255, 255, 255));
        btThem5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btThem5_1.setText("Thêm");

        btnXoa5_1.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa5_1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa5_1.setText("Xóa");

        btnLuu5_1.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu5_1.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu5_1.setText("Lưu");

        btnCapnhat5_1.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat5_1.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat5_1.setText("Reset");

        jLabel32.setText("Mã thể loại:");

        cbbMatheLoai5.setBackground(new java.awt.Color(204, 255, 255));

        txtNDtomtat5.setColumns(20);
        txtNDtomtat5.setRows(5);
        jScrollPane7.setViewportView(txtNDtomtat5);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(jLabel32))
                .addGap(32, 32, 32)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(txtMatuasach5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTracuu5_1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(cbbMatheLoai5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbMatacGia5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTentuaSach5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCapnhat5_1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnXoa5_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThem5_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu5_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtMatuasach5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTracuu5_1)
                    .addComponent(btThem5_1))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtTentuaSach5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cbbMatacGia5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(cbbMatheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addGap(0, 74, Short.MAX_VALUE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 30, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa5_1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapnhat5_1)
                        .addGap(32, 32, 32)
                        .addComponent(btnLuu5_1)
                        .addGap(25, 25, 25))))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin thể loại"));

        btThem5_2.setBackground(new java.awt.Color(0, 102, 102));
        btThem5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem5_2.setForeground(new java.awt.Color(255, 255, 255));
        btThem5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btThem5_2.setText("Thêm");

        btnLuu5_2.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu5_2.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu5_2.setText("Lưu");

        btnCapnhat5_2.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat5_2.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat5_2.setText("Reset");

        btnXoa5_2.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa5_2.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa5_2.setText("Xóa");

        btTracuu5_2.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu5_2.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search-icon-32.png"))); // NOI18N
        btTracuu5_2.setText("Tra cứu");

        jLabel38.setText("Mã thể loại:");

        jLabel39.setText("Tên thể loại:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtMaTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btTracuu5_2))
                            .addComponent(txtTenTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btThem5_2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(btnCapnhat5_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa5_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLuu5_2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtMaTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btTracuu5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem5_2)
                    .addComponent(btnLuu5_2))
                .addGap(40, 40, 40)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat5_2)
                    .addComponent(btnXoa5_2))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblTTTuaSach5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTTTuaSach5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTTTuaSach5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(tblTTTuaSach5);

        jButton18.setBackground(java.awt.SystemColor.activeCaption);

        tblTTTheoLoai5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTTTheoLoai5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTTTheoLoai5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane8.setViewportView(tblTTTheoLoai5);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 969, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(872, 872, 872)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Tra cứu theo thể loại - tựa sách", jPanel5);

        jPanel6.setBackground(java.awt.SystemColor.activeCaption);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê"));

        jLabel40.setText("Từ ngày:");

        btTungay6.setBackground(new java.awt.Color(0, 102, 102));
        btTungay6.setForeground(new java.awt.Color(255, 255, 255));
        btTungay6.setText("...");

        jLabel41.setText("Đến");

        btnDen6.setBackground(new java.awt.Color(0, 102, 102));
        btnDen6.setForeground(new java.awt.Color(255, 255, 255));
        btnDen6.setText("...");

        buttonGroup3.add(rdbtnDSDGDangki);
        rdbtnDSDGDangki.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rdbtnDSDGDangki.setText("Danh sách độc giả đăng kí");

        buttonGroup3.add(rdbtnDSDGtrehan);
        rdbtnDSDGtrehan.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rdbtnDSDGtrehan.setText("Danh sách độc giả trễ hạn");

        buttonGroup3.add(rdbtnChiTietPhieuMuon);
        rdbtnChiTietPhieuMuon.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rdbtnChiTietPhieuMuon.setText("Chi tiết phiếu mượn");

        btnThongke6.setBackground(new java.awt.Color(0, 102, 102));
        btnThongke6.setForeground(new java.awt.Color(255, 255, 255));
        btnThongke6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-view-choose-icon-24.png"))); // NOI18N
        btnThongke6.setText("Thống kê");

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết phiếu mượn"));

        tblChiTietPhieuMuon6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MaMuon", "MaDG", "TenSach", "Soluong", "NgayMuon"
            }
        ));
        jScrollPane10.setViewportView(tblChiTietPhieuMuon6);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnChiTietPhieuMuon)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rdbtnDSDGtrehan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdbtnDSDGDangki, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(108, 108, 108)
                                .addComponent(btnThongke6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtTungay6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btTungay6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41)
                                .addGap(32, 32, 32)
                                .addComponent(txtDen6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnDen6)))
                .addGap(32, 32, 32)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTungay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(btTungay6)
                    .addComponent(jLabel41)
                    .addComponent(txtDen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDen6))
                .addGap(44, 44, 44)
                .addComponent(rdbtnDSDGDangki)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rdbtnDSDGtrehan))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnThongke6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(rdbtnChiTietPhieuMuon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        tblThongKe6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MaDocGia", "HoTenDocGia", "NgaySinh", "GioiTinh", "DiaChi", "NgayDangKy", "NgayHetHan", "SoDienThoai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblThongKe6);

        jButton20.setBackground(java.awt.SystemColor.activeCaption);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thống kê", jPanel6);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jPanel20.setBackground(java.awt.SystemColor.activeCaption);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin mượn trả"));

        jLabel16.setText("Mã mượn:");

        jLabel18.setText("Mã đọc giả");

        jLabel19.setText("Tên sách:");

        jLabel21.setText("Ngày mượn:");

        jLabel22.setText("Ngày hẹn trả:");

        CbbTenSach2.setBackground(new java.awt.Color(204, 255, 255));
        CbbTenSach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbbTenSach2ActionPerformed(evt);
            }
        });

        jLabel20.setText("Số lượng:");

        jLabel23.setText("Ghi chú:");

        btTracuu2.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu2.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search-icon-32.png"))); // NOI18N
        btTracuu2.setText("Tra cứu");

        jLabel9.setText("Ngày trả:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23))
                .addGap(32, 32, 32)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CbbTenSach2, 0, 332, Short.MAX_VALUE)
                            .addComponent(txtGhichu2))
                        .addGap(36, 36, 36)
                        .addComponent(btTracuu2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel21Layout.createSequentialGroup()
                                .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayTra2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMadocgia2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaMuon2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNgayHenTra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNgayMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtMaMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtMadocgia2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgayMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(txtNgayHenTra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(CbbTenSach2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtGhichu2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTracuu2)
                        .addGap(62, 62, 62)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(txtNgayTra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        btThem2.setBackground(new java.awt.Color(0, 102, 102));
        btThem2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem2.setForeground(new java.awt.Color(255, 255, 255));
        btThem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btThem2.setText("Thêm");

        btnXoa2.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa2.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa2.setText("Xóa");

        btnCapnhat2.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat2.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat2.setText("Reset");

        btnLuu2.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu2.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu2.setText("Lưu");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btThem2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnLuu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhat2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem2)
                    .addComponent(btnCapnhat2))
                .addGap(52, 52, 52)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu2)
                    .addComponent(btnXoa2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblMuontraSach2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMuontraSach2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblMuontraSach2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tblMuontraSach2);

        jButton15.setBackground(java.awt.SystemColor.activeCaption);
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/thoat.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/120_quyen_sach_nói-1-300x300.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mượn - trả sách", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        tbldanhmucSach3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh mục sách"));
        tbldanhmucSach3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "TenSach", "MaDauSach", "LoaiSach", "Soluong"
            }
        ));
        tbldanhmucSach3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbldanhmucSach3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbldanhmucSach3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(tbldanhmucSach3);

        btThem3.setBackground(new java.awt.Color(0, 102, 102));
        btThem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem3.setForeground(new java.awt.Color(255, 255, 255));
        btThem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-document-edit-icon-48.png"))); // NOI18N
        btThem3.setText("Thêm");

        btnLuu3.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu3.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Save-icon-48.png"))); // NOI18N
        btnLuu3.setText("Lưu");

        btnXoa3.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa3.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnXoa3.setText("Xóa");

        btnCapnhat3.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat3.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/new-icon-48.png"))); // NOI18N
        btnCapnhat3.setText("Reset");

        btTracuu3.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu3.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search-icon-32.png"))); // NOI18N
        btTracuu3.setText("Tra cứu");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mã sách:");

        txttheloai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttheloai3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tên sách:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mã đầu sách:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tên thể loại");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tác giả:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tình trạng:");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup3.add(RdbtnDamuon3);
        RdbtnDamuon3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        RdbtnDamuon3.setText("Đã mượn");

        buttonGroup3.add(RdbtnChuamuon3);
        RdbtnChuamuon3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        RdbtnChuamuon3.setText("Chưa mượn");
        RdbtnChuamuon3.setFocusable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RdbtnDamuon3)
                .addGap(27, 27, 27)
                .addComponent(RdbtnChuamuon3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdbtnDamuon3)
                    .addComponent(RdbtnChuamuon3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nội dung tóm lược:");

        txtNDtomluoc3.setColumns(20);
        txtNDtomluoc3.setRows(5);
        jScrollPane2.setViewportView(txtNDtomluoc3);

        jButton16.setBackground(java.awt.SystemColor.activeCaption);
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/thoat.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMaSch3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btTracuu3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CbbMadausach3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTenSach3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel24)
                            .addComponent(jLabel14))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTacGia3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                            .addComponent(txttheloai3))))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapnhat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtMaSch3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btTracuu3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtTenSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(CbbMadausach3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txttheloai3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTacGia3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel24)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btnCapnhat3)
                            .addGap(61, 61, 61)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoa3)
                                .addComponent(btnLuu3)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btThem3)
                            .addGap(118, 118, 118))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Danh mục sách", jPanel3);

        jPanel9.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/home2.png"))); // NOI18N
        jLabel1.setText("THƯ VIỆN SÁCH TRƯỜNG ĐẠI HỌC SƯ PHẠM KĨ THUẬT");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttheloai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttheloai3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttheloai3ActionPerformed

    private void tblMuontraSach2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblMuontraSach2AncestorAdded
        // TODO add your handling code here:

        ListSelectionModel listSelectionModel = tblMuontraSach2.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblMuontraSach2.getSelectedRow();

                txtMaMuon2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 1)));
                txtMadocgia2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 2)));
                txtSoluong2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 5)));
                txtGhichu2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 6)));
                try {
                    List<LB_User_Muon> user_r = userService.GetAll_Return_B();
                    for (LB_User_Muon user : user_r) {
                        if (user.GetMaMuon().equals(String.valueOf(tblMuontraSach2.getValueAt(row, 1)))) {
                            CbbTenSach2.getModel().setSelectedItem(user.GetMaCS());
                            List<LB_User_DM> user_cs = userService.GetAll_DM_B();
                            for (LB_User_DM users : user_cs) {
                                if (users.getMaCS().equals(user.GetMaCS())) {
                                    CbbTenSach2.getModel().setSelectedItem(users.GetTenCS());
                                }
                            }
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }//GEN-LAST:event_tblMuontraSach2AncestorAdded

    private void tblDocGia1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDocGia1AncestorAdded
        // TODO add your handling code here:

        ListSelectionModel listSelectionModel = tblDocGia1.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblDocGia1.getSelectedRow();

                txtMadocgia1.setText(String.valueOf(tblDocGia1.getValueAt(row, 1)));
                txtSoDT1.setText(String.valueOf(tblDocGia1.getValueAt(row, 8)));
                txtDiaChi1.setText(String.valueOf(tblDocGia1.getValueAt(row, 5)));
                txtHoten1.setText(String.valueOf(tblDocGia1.getValueAt(row, 2)));
//                txtNgaySinh1.setDate((String.valueOf(tblDocGia1.getValueAt(row,3))));
//                txtNgayDK1.setDate((String.valueOf(tblDocGia1.getValueAt(row,6))));
//                txtNgayEndDK1.setDate((String.valueOf(tblDocGia1.getValueAt(row,7))));
                if (String.valueOf(tblDocGia1.getValueAt(row, 4)) == "Nam") {
                    RdbtnNam1.setSelected(true);
                } else {
                    RdbtnNu1.setSelected(true);
                }
            }
        });
    }//GEN-LAST:event_tblDocGia1AncestorAdded

    private void CbbTenSach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbbTenSach2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbbTenSach2ActionPerformed

    private void tblNhaSanXuat4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblNhaSanXuat4AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblNhaSanXuat4.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblNhaSanXuat4.getSelectedRow();
                txtMaNhaSX4.setText(String.valueOf(tblNhaSanXuat4.getValueAt(row, 1)));
                txtTenNhaSX4.setText(String.valueOf(tblNhaSanXuat4.getValueAt(row, 2)));
            }
        });
    }//GEN-LAST:event_tblNhaSanXuat4AncestorAdded

    private void tblTacgia4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTacgia4AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblTacgia4.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblTacgia4.getSelectedRow();
                txtMaTacgia4.setText(String.valueOf(tblTacgia4.getValueAt(row, 1)));
                txtTenTacgia4.setText(String.valueOf(tblTacgia4.getValueAt(row, 2)));
            }
        });
    }//GEN-LAST:event_tblTacgia4AncestorAdded

    private void tblTTTuaSach5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTTTuaSach5AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblTTTuaSach5.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblTTTuaSach5.getSelectedRow();
                txtMatuasach5.setText(String.valueOf(tblTTTuaSach5.getValueAt(row, 1)));
                txtTentuaSach5.setText(String.valueOf(tblTTTuaSach5.getValueAt(row, 2)));
                cbbMatacGia5.getModel().setSelectedItem(String.valueOf(tblTTTuaSach5.getValueAt(row, 3)));
                cbbMatheLoai5.getModel().setSelectedItem(String.valueOf(tblTTTuaSach5.getValueAt(row, 4)));
                List<LB_User_TSTL> user_TS;
                try {
                    user_TS = userService.GetAll_TS_B();
                    for (LB_User_TSTL user : user_TS) {
                        if (user.GetMaTS().equals(String.valueOf(tblTTTuaSach5.getValueAt(row, 1)))) {
                            txtNDtomtat5.setText(user.GetTomtat());
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }//GEN-LAST:event_tblTTTuaSach5AncestorAdded

    private void tblTTTheoLoai5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTTTheoLoai5AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblTTTheoLoai5.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblTTTheoLoai5.getSelectedRow();
                txtMaTheLoai5.setText(String.valueOf(tblTTTheoLoai5.getValueAt(row, 1)));
                txtTenTheLoai5.setText(String.valueOf(tblTTTheoLoai5.getValueAt(row, 2)));
            }
        });
    }//GEN-LAST:event_tblTTTheoLoai5AncestorAdded

    private void tbldanhmucSach3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbldanhmucSach3AncestorAdded
        // TODO add your handling code here:

        ListSelectionModel listSelectionModel = tbldanhmucSach3.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbldanhmucSach3.getSelectedRow();

                try {
                    List<LB_User_DM> user_dm = userService.GetAll_DM_B();
                    for (LB_User_DM user : user_dm) {

                        if (user.GetTenCS().equals(String.valueOf(tbldanhmucSach3.getValueAt(row, 1)))) {
                            txtMaSch3.setText(user.getMaCS());
                        }

                        if (user.GetMaDS().equals(String.valueOf(tbldanhmucSach3.getValueAt(row, 2)))) {
                            txttheloai3.setText(user.GetTenTL());
                        }
                    }
                    String str = "";
                    String str1 = "";
                    List<LB_User_DM> user_dm1 = userService.GetAll_DM_B();
                    for (LB_User_DM user : user_dm1) {
                        if (String.valueOf(tbldanhmucSach3.getValueAt(row, 2)).equals(user.GetMaDS())) {
                            str = str + user.GetMaDS();

                        }
                    }
                    List<LB_User_DM> user_dm2 = userService.GetAll_DS_B();
                    for (LB_User_DM user : user_dm2) {
                        if (user.GetMaDS().equals(str)) {

                            str1 = str1 + user.GetMaTS();

                        }
                    }
                    List<LB_User_TSTL> usre_ts = userService.GetAll_TS_B();
                    for (LB_User_TSTL user : usre_ts) {

                        if (user.GetMaTS().equals(str1)) {
                            List<LB_User_NXBTG> user_tg = userService.GetAll_TacGia();
                            for (LB_User_NXBTG users : user_tg) {
                                if (user.GetMaTG().equals(users.GetMaTG())) {
                                    txtTacGia3.setText(users.GetTenTG());
                                }
                            }
                        }
                    }
                    if (Integer.valueOf(String.valueOf(tbldanhmucSach3.getValueAt(row, 4))) <= 0) {
                        RdbtnDamuon3.setSelected(true);
                    } else {
                        RdbtnChuamuon3.setSelected(true);
                    }
                    List<LB_User_DM> users = userService.GetAll_DM_B();
                    for (LB_User_DM user : users) {
                        if (user.GetMaDS().equals(String.valueOf(tbldanhmucSach3.getValueAt(row, 2)))) {
                            txtNDtomluoc3.setText(user.GetTomTat());
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
                }

                txtTenSach3.setText(String.valueOf(tbldanhmucSach3.getValueAt(row, 1)));
                CbbMadausach3.getModel().setSelectedItem(String.valueOf(tbldanhmucSach3.getValueAt(row, 2)));

            }
        });

    }//GEN-LAST:event_tbldanhmucSach3AncestorAdded

    private void btTracuu4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu4_1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btTracuu4_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Giaodien().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbMadausach3;
    private javax.swing.JComboBox<String> CbbTenSach2;
    private javax.swing.JRadioButton RdbtnChuamuon3;
    private javax.swing.JRadioButton RdbtnDamuon3;
    private javax.swing.JRadioButton RdbtnNam1;
    private javax.swing.JRadioButton RdbtnNu1;
    private javax.swing.JButton btThem2;
    private javax.swing.JButton btThem3;
    private javax.swing.JButton btThem4_1;
    private javax.swing.JButton btThem4_2;
    private javax.swing.JButton btThem5_1;
    private javax.swing.JButton btThem5_2;
    private javax.swing.JButton btTracuu2;
    private javax.swing.JButton btTracuu3;
    private javax.swing.JButton btTracuu4_1;
    private javax.swing.JButton btTracuu4_2;
    private javax.swing.JButton btTracuu5_1;
    private javax.swing.JButton btTracuu5_2;
    private javax.swing.JButton btTungay6;
    private javax.swing.JButton btnCapnhat1;
    private javax.swing.JButton btnCapnhat2;
    private javax.swing.JButton btnCapnhat3;
    private javax.swing.JButton btnCapnhat4_1;
    private javax.swing.JButton btnCapnhat4_2;
    private javax.swing.JButton btnCapnhat5_1;
    private javax.swing.JButton btnCapnhat5_2;
    private javax.swing.JButton btnDen6;
    private javax.swing.JButton btnLuu1;
    private javax.swing.JButton btnLuu2;
    private javax.swing.JButton btnLuu3;
    private javax.swing.JButton btnLuu4_1;
    private javax.swing.JButton btnLuu4_2;
    private javax.swing.JButton btnLuu5_1;
    private javax.swing.JButton btnLuu5_2;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThongke6;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JButton btnXoa3;
    private javax.swing.JButton btnXoa4_1;
    private javax.swing.JButton btnXoa4_2;
    private javax.swing.JButton btnXoa5_1;
    private javax.swing.JButton btnXoa5_2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbbMatacGia5;
    private javax.swing.JComboBox<String> cbbMatheLoai5;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton rdbtnChiTietPhieuMuon;
    private javax.swing.JRadioButton rdbtnDSDGDangki;
    private javax.swing.JRadioButton rdbtnDSDGtrehan;
    private javax.swing.JTable tblChiTietPhieuMuon6;
    private javax.swing.JTable tblDocGia1;
    private javax.swing.JTable tblMuontraSach2;
    private javax.swing.JTable tblNhaSanXuat4;
    private javax.swing.JTable tblTTTheoLoai5;
    private javax.swing.JTable tblTTTuaSach5;
    private javax.swing.JTable tblTacgia4;
    private javax.swing.JTable tblThongKe6;
    private javax.swing.JTable tbldanhmucSach3;
    private javax.swing.JTextField txtDen6;
    private javax.swing.JTextField txtDiaChi1;
    private javax.swing.JTextField txtGhichu2;
    private javax.swing.JTextField txtHoten1;
    private javax.swing.JTextField txtMaMuon2;
    private javax.swing.JTextField txtMaNhaSX4;
    private javax.swing.JTextField txtMaSch3;
    private javax.swing.JTextField txtMaTacgia4;
    private javax.swing.JTextField txtMaTheLoai5;
    private javax.swing.JTextField txtMadocgia1;
    private javax.swing.JTextField txtMadocgia2;
    private javax.swing.JTextField txtMatuasach5;
    private javax.swing.JTextArea txtNDtomluoc3;
    private javax.swing.JTextArea txtNDtomtat5;
    private com.toedter.calendar.JDateChooser txtNgayDK1;
    private com.toedter.calendar.JDateChooser txtNgayEndDK1;
    private com.toedter.calendar.JDateChooser txtNgayHenTra2;
    private com.toedter.calendar.JDateChooser txtNgayMuon2;
    private com.toedter.calendar.JDateChooser txtNgaySinh1;
    private com.toedter.calendar.JDateChooser txtNgayTra2;
    private javax.swing.JTextField txtSoDT1;
    private javax.swing.JTextField txtSoluong2;
    private javax.swing.JTextField txtTacGia3;
    private javax.swing.JTextField txtTenNhaSX4;
    private javax.swing.JTextField txtTenSach3;
    private javax.swing.JTextField txtTenTacgia4;
    private javax.swing.JTextField txtTenTheLoai5;
    private javax.swing.JTextField txtTentuaSach5;
    private javax.swing.JTextField txtTungay6;
    private javax.swing.JTextField txttheloai3;
    // End of variables declaration//GEN-END:variables
}
