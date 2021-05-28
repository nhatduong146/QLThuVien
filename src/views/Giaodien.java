/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


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
public class Giaodien extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel1;
    DefaultTableModel defaultTableModel2;
    DefaultTableModel defaultTableModel3;
    DefaultTableModel defaultTableModel4;
    DefaultTableModel defaultTableModel5;
    DefaultTableModel defaultTableModel6;
    DefaultTableModel defaultTableModel7;
    DefaultTableModel defaultTableModel8;
    DefaultTableModel defaultTableModel9;
    DocGiaDao userDG;
    DauSachDao userDS;
    ThongTinMuonTraDao userTTMT;
    NhaXuatBanDao userNXB;
    TacGiaDao userTG;
    TheLoaiDao userTL;
    TuaSachDao userTS;
  SimpleDateFormat f= new SimpleDateFormat("MMMM dd, yyyy");   
    /**
     * Creates new form NewJFrame
     */
    public Giaodien() {
        initComponents();
     
        defaultTableModel1 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userDG = new DocGiaDao();
        defaultTableModel2 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userDS = new DauSachDao();
        defaultTableModel3 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userTTMT = new ThongTinMuonTraDao();
        defaultTableModel4 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userNXB = new NhaXuatBanDao();
        defaultTableModel5 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userTG = new TacGiaDao();
        defaultTableModel6 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userTS = new TuaSachDao();
        defaultTableModel7 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        userTL = new TheLoaiDao();
        defaultTableModel8 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };
        defaultTableModel9 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
             
    };

        tblDocGia1.setModel(defaultTableModel1);
        defaultTableModel1.addColumn("STT");
        defaultTableModel1.addColumn("MaDocGia");
        defaultTableModel1.addColumn("Họ Tên");
        defaultTableModel1.addColumn("Giới tính");
        defaultTableModel1.addColumn("Ngày Sinh");
        defaultTableModel1.addColumn("Địa chỉ");
        defaultTableModel1.addColumn("SĐT");
        defaultTableModel1.addColumn("Ngày đăng kí");
        defaultTableModel1.addColumn("Ngày hết hạn ĐK");
        List<DocGia> user_DG = userDG.getAll();
        int sttdg = 0;
        for (DocGia users : user_DG) {
            sttdg++;
            defaultTableModel1.addRow(new Object[]{sttdg, users.getMaDG(), users.getHoten(), users.getGioiTinh(), users.getNgaySinh(), users.getDiaChi(), users.getSdt(), users.getNgayDK(), users.getNgayHetHan()});
        }

        tblMuontraSach2.setModel(defaultTableModel2);
        defaultTableModel2.addColumn("STT");
        defaultTableModel2.addColumn("MaMuon");
        defaultTableModel2.addColumn("MaDocGia");
        defaultTableModel2.addColumn("MaDauSach");
        defaultTableModel2.addColumn("Số lượng");
        defaultTableModel2.addColumn("Ngày mượn");
        defaultTableModel2.addColumn("Ngày hẹn trả");
        defaultTableModel2.addColumn("Ngày trả");
        defaultTableModel2.addColumn("Ghi chú");
        List<ThongTinMuonTra> user_TTMT1 = userTTMT.getAll();
        int sttttmt = 0;
        for (ThongTinMuonTra users : user_TTMT1) {
            sttttmt++;
            defaultTableModel2.addRow(new Object[]{sttttmt, users.getMaMuon(), users.getMaDG(), users.getMaDS(), users.getSoLuong(), users.getNgayMuon(), users.getNgayHenTra(), users.getNgayTra(), users.getGhiChu()});
        }

        tbldanhmucSach3.setModel(defaultTableModel3);
        defaultTableModel3.addColumn("STT");
        defaultTableModel3.addColumn("MaDauSach");
        defaultTableModel3.addColumn("MaTuaSach");
        defaultTableModel3.addColumn("NgonNgu");
        defaultTableModel3.addColumn("MaNXB");
        List<DauSach> user_DS = userDS.getAll();
        int sttds = 0;
        for (DauSach users : user_DS) {
            sttds++;
            defaultTableModel3.addRow(new Object[]{sttds, users.getMaDS(), users.getMaTS(), users.getNgonNgu(), users.getMaNXB()});
        }

        tblNhaSanXuat4.setModel(defaultTableModel4);
        defaultTableModel4.addColumn("STT");
        defaultTableModel4.addColumn("MaNXB");
        defaultTableModel4.addColumn("Tên NXB");
        List<NhaXuatBan> user_NXB= userNXB.getAll();
        int sttnxb = 0;
        for (NhaXuatBan users : user_NXB) {
            sttnxb++;
            defaultTableModel4.addRow(new Object[]{sttnxb, users.getMaNXB(), users.getTenNXB()});
        }

        tblTacgia4.setModel(defaultTableModel5);
        defaultTableModel5.addColumn("STT");
        defaultTableModel5.addColumn("MaTacGia");
        defaultTableModel5.addColumn("Tên tác giả");
        List<TacGia> user_TG = userTG.getAll();
        int stttg = 0;
        for (TacGia users : user_TG) {
            stttg++;
            cbbMaTacGia5.addItem(users.getMaTG());
            defaultTableModel5.addRow(new Object[]{stttg, users.getMaTG(), users.getHoten()});
        }

        tblTuaSach5.setModel(defaultTableModel6);
        defaultTableModel6.addColumn("STT");
        defaultTableModel6.addColumn("MaTuaSach");
        defaultTableModel6.addColumn("Tên tựa sách");
        defaultTableModel6.addColumn("MaTacGia");
        defaultTableModel6.addColumn("MaTheLoai");
        defaultTableModel6.addColumn("Tóm tắt");
        defaultTableModel6.addColumn("Số lượng");
        List<TuaSach> user_TS = userTS.getAll();
        int sttts = 0;
        for (TuaSach users : user_TS) {
            sttts++;
            CbbTenSach2.addItem(users.getTenTS());
            defaultTableModel6.addRow(new Object[]{sttts, users.getMaTS(), users.getTenTS(), users.getMaTG(), users.getMaTL(), users.getTomTat(), users.getSoLuong()});
        }

        tblTheLoai5.setModel(defaultTableModel7);
        defaultTableModel7.addColumn("STT");
        defaultTableModel7.addColumn("MaTheLoai");
        defaultTableModel7.addColumn("Tên thể loại");
        List<TheLoai> user_TL = userTL.getAll();
        int stttl = 0;
        for (TheLoai users : user_TL) {
            stttl++;
            cbbMaTheLoai5.addItem(users.getMaTL());
            defaultTableModel7.addRow(new Object[]{stttl, users.getMaTL(), users.getTenTL()});
        }

        tblChiTietPhieuMuon6.setModel(defaultTableModel8);
        defaultTableModel8.addColumn("STT");
        defaultTableModel8.addColumn("MaMuon");
        defaultTableModel8.addColumn("MaDocGia");
        defaultTableModel8.addColumn("Tên Sách");
        defaultTableModel8.addColumn("Số lượng");
        defaultTableModel8.addColumn("Ngày mượn");
        defaultTableModel8.addColumn("Ngày hẹn trả");
        defaultTableModel8.addColumn("Ngày trả");
        List<ThongTinMuonTra> user_TTMT2 = userTTMT.getAll();
        int sttttmt2 = 0;
        for (ThongTinMuonTra user : user_TTMT2) {
            sttttmt2++;
            List<DauSach> user_DS2 = userDS.getAll();
            for (DauSach users : user_DS2) {
                if (user.getMaDS().equals(users.getMaDS())) {
                    List<TuaSach> user_TS2 = userTS.getAll();
                    for (TuaSach userss : user_TS2) {
                        if (users.getMaTS().equals(userss.getMaTS())) {
                            defaultTableModel8.addRow(new Object[]{sttttmt2, user.getMaMuon(), user.getMaDG(), userss.getTenTS(), user.getSoLuong(), user.getNgayMuon(), user.getNgayHenTra(), user.getNgayTra()});
                        }
                    }
                }
            }
        }

        tblThongKe6.setModel(defaultTableModel9);
        defaultTableModel9.addColumn("STT");
        defaultTableModel9.addColumn("MaDocGia");
        defaultTableModel9.addColumn("Họ Tên");
        defaultTableModel9.addColumn("Giới tính");
        defaultTableModel9.addColumn("Ngày Sinh");
        defaultTableModel9.addColumn("Địa chỉ");
        defaultTableModel9.addColumn("SĐT");
        defaultTableModel9.addColumn("Ngày đăng kí");
        defaultTableModel9.addColumn("Ngày hết hạn ĐK");
        List<DocGia> user_DG2 = userDG.getAll();
        int sttdg2 = 0;
        for (DocGia users : user_DG2) {
            sttdg2++;
            defaultTableModel9.addRow(new Object[]{sttdg2, users.getMaDG(), users.getHoten(), users.getGioiTinh(), users.getNgaySinh(), users.getDiaChi(), users.getSdt(), users.getNgayDK(), users.getNgayHetHan()});
        }
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        txtMaDocGia1 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        txtngayDK1 = new com.toedter.calendar.JDateChooser();
        txtngayEndDK1 = new com.toedter.calendar.JDateChooser();
        jPanel28 = new javax.swing.JPanel();
        btnThem1 = new javax.swing.JButton();
        btnCapnhat1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnLuu1 = new javax.swing.JButton();
        btTracuu1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocGia1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        txtMaMuon2 = new javax.swing.JLabel();
        txtMaDG2 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnXoa2 = new javax.swing.JButton();
        btnCapnhat2 = new javax.swing.JButton();
        btnThem2 = new javax.swing.JButton();
        btnLuu2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMuontraSach2 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbldanhmucSach3 = new javax.swing.JTable();
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
        jPanel25 = new javax.swing.JPanel();
        txtTenNXB3 = new javax.swing.JTextField();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btTracuu4_1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTenNhaSX4 = new javax.swing.JTextField();
        btnXoa4 = new javax.swing.JButton();
        btnCapnhat4 = new javax.swing.JButton();
        btnThem4 = new javax.swing.JButton();
        btnLuu4 = new javax.swing.JButton();
        txtMaNXB4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNhaSanXuat4 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        btTracuu4_2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtTenTacgia4 = new javax.swing.JTextField();
        btnXoa5 = new javax.swing.JButton();
        btnCapnhat5 = new javax.swing.JButton();
        btnThem5 = new javax.swing.JButton();
        btnLuu5 = new javax.swing.JButton();
        txtMaTacGia4 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblTacgia4 = new javax.swing.JTable();
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
        btnXoa7 = new javax.swing.JButton();
        btnCapnhat7 = new javax.swing.JButton();
        btnThem7 = new javax.swing.JButton();
        btnLuu7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txtMaTheLoai5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTuaSach5 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblTheLoai5 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        rdbtnDSDGDangki = new javax.swing.JRadioButton();
        rdbtnDSDGtrehan = new javax.swing.JRadioButton();
        rdbtnChiTietPhieuMuon = new javax.swing.JRadioButton();
        btnThongke8 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblChiTietPhieuMuon6 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblThongKe6 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

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
                        .addComponent(txtMaDocGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDiaChi1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(txtHoten1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtngayEndDK1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtngayDK1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaDocGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHoten1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtngayDK1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtngayEndDK1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnThem1.setBackground(new java.awt.Color(0, 102, 102));
        btnThem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem1.setForeground(new java.awt.Color(255, 255, 255));
        btnThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem1.setText("Add");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnCapnhat1.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat1.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat1.setText("Refresh");
        btnCapnhat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat1ActionPerformed(evt);
            }
        });

        btnXoa1.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa1.setText("Delete");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        btnLuu1.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu1.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu1.setText("Save");
        btnLuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu1ActionPerformed(evt);
            }
        });

        btTracuu1.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu1.setText("Tra cứu");
        btTracuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa1)
                    .addComponent(btnCapnhat1))
                .addGap(22, 22, 22)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLuu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTracuu1)
                .addGap(75, 75, 75))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btTracuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem1))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblDocGia1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDocGia1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblDocGia1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tblDocGia1AncestorMoved(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Đọc giả     ", new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Person-Male-Light-icon-24.png")), jPanel1); // NOI18N

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

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
        btTracuu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu2.setText("Tra cứu");
        btTracuu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu2ActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel23)
                    .addComponent(jLabel20))
                .addGap(32, 32, 32)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayTra2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaDG2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNgayHenTra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CbbTenSach2, 0, 332, Short.MAX_VALUE)
                            .addComponent(txtGhichu2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTracuu2)
                        .addGap(57, 57, 57))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgayMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(txtNgayHenTra2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtMaMuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtMaDG2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbbTenSach2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGhichu2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btTracuu2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(txtNgayTra2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/library.png"))); // NOI18N

        btnXoa2.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa2.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa2.setText("Delete");
        btnXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa2ActionPerformed(evt);
            }
        });

        btnCapnhat2.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat2.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat2.setText("Refresh");
        btnCapnhat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat2ActionPerformed(evt);
            }
        });

        btnThem2.setBackground(new java.awt.Color(0, 102, 102));
        btnThem2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem2.setForeground(new java.awt.Color(255, 255, 255));
        btnThem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem2.setText("Add");
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });

        btnLuu2.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu2.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu2.setText("Save");
        btnLuu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(91, 91, 91))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapnhat2))
                .addGap(22, 22, 22)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLuu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2)
                    .addComponent(btnCapnhat2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel17))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblMuontraSach2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMuontraSach2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMuontraSach2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblMuontraSach2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tblMuontraSach2);

        jButton15.setBackground(java.awt.SystemColor.activeCaption);
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/thoat.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mượn - trả sách    ", new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png")), jPanel2); // NOI18N

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tbldanhmucSach3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "TenSach", "MaDauSach", "LoaiSach", "Soluong"
            }
        ));
        tbldanhmucSach3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbldanhmucSach3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbldanhmucSach3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(tbldanhmucSach3);

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

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(txtTenNXB3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(txtTenNXB3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/icons8-library-100.png"))); // NOI18N

        btnXoa3.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa3.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa3.setText("Delete");
        btnXoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa3ActionPerformed(evt);
            }
        });

        btnCapnhat3.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat3.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat3.setText("Refresh");
        btnCapnhat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat3ActionPerformed(evt);
            }
        });

        btnThem3.setBackground(new java.awt.Color(0, 102, 102));
        btnThem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem3.setForeground(new java.awt.Color(255, 255, 255));
        btnThem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem3.setText("Add");
        btnThem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem3ActionPerformed(evt);
            }
        });

        btnLuu3.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu3.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu3.setText("Save");
        btnLuu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu3ActionPerformed(evt);
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
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapnhat3))
                .addGap(22, 22, 22)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLuu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu3)
                    .addComponent(btnXoa3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem3)
                    .addComponent(btnCapnhat3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        btTracuu3.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu3.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu3.setText("Tra cứu");

        buttonGroup2.add(RdbtnDamuon4);
        RdbtnDamuon4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        RdbtnDamuon4.setText("Đã mượn");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel37.setText("Ngôn ngữ:");

        buttonGroup2.add(RdbtnChuamuon4);
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
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(txtMaDauSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btTracuu3))
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTenSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttheloai3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTacGia3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(64, 64, 64)
                                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(48, 48, 48)
                                        .addComponent(RdbtnDamuon4)
                                        .addGap(18, 18, 18)
                                        .addComponent(RdbtnChuamuon4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNgonNgu3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13))
                    .addComponent(btTracuu3)
                    .addComponent(txtMaDauSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RdbtnChuamuon4)
                            .addComponent(jLabel37)
                            .addComponent(txtNgonNgu3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RdbtnDamuon4, javax.swing.GroupLayout.Alignment.TRAILING))))
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

        jTabbedPane2.addTab("Danh mục sách   ", new javax.swing.ImageIcon(getClass().getResource("/icon/resources/menu.png")), jPanel3); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(java.awt.SystemColor.activeCaption);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhà sản xuất"));

        btTracuu4_1.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu4_1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu4_1.setText("Tra cứu");
        btTracuu4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu4_1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Mã NSX:");

        jLabel27.setText("Tên nhà sản xuất:");

        btnXoa4.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa4.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa4.setText("Delete");
        btnXoa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa4ActionPerformed(evt);
            }
        });

        btnCapnhat4.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat4.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat4.setText("Refresh");
        btnCapnhat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat4ActionPerformed(evt);
            }
        });

        btnThem4.setBackground(new java.awt.Color(0, 102, 102));
        btnThem4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem4.setForeground(new java.awt.Color(255, 255, 255));
        btnThem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem4.setText("Add");
        btnThem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem4ActionPerformed(evt);
            }
        });

        btnLuu4.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu4.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu4.setText("Save");
        btnLuu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtMaNXB4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btTracuu4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTenNhaSX4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCapnhat4)
                            .addComponent(btnXoa4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuu4))))
                .addGap(89, 89, 89))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel26))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btTracuu4_1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtMaNXB4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtTenNhaSX4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu4)
                    .addComponent(btnXoa4))
                .addGap(47, 47, 47)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat4)
                    .addComponent(btnThem4))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tblNhaSanXuat4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhà sản xuất"));
        tblNhaSanXuat4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhaSanXuat4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblNhaSanXuat4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(tblNhaSanXuat4);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tác giả"));

        btTracuu4_2.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu4_2.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu4_2.setText("Tra cứu");
        btTracuu4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu4_2ActionPerformed(evt);
            }
        });

        jLabel33.setText("Mã tác giả:");

        jLabel35.setText("Tên tác giả:");

        btnXoa5.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa5.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa5.setText("Delete");
        btnXoa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa5ActionPerformed(evt);
            }
        });

        btnCapnhat5.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat5.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat5.setText("Refresh");
        btnCapnhat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat5ActionPerformed(evt);
            }
        });

        btnThem5.setBackground(new java.awt.Color(0, 102, 102));
        btnThem5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem5.setForeground(new java.awt.Color(255, 255, 255));
        btnThem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem5.setText("Add");
        btnThem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem5ActionPerformed(evt);
            }
        });

        btnLuu5.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu5.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu5.setText("Save");
        btnLuu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35))
                .addGap(39, 39, 39)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtMaTacGia4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btTracuu4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenTacgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhat5))
                .addGap(124, 124, 124)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThem5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu5))
                .addGap(106, 106, 106))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTracuu4_2)
                    .addComponent(txtMaTacGia4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtTenTacgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa5)
                    .addComponent(btnLuu5))
                .addGap(48, 48, 48)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat5)
                    .addComponent(btnThem5))
                .addGap(40, 40, 40))
        );

        tblTacgia4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTacgia4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTacgia4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
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
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11))
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Tra cứu theo NSX - tác giả   ", new javax.swing.ImageIcon(getClass().getResource("/icon/resources/research.png")), jPanel4); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(java.awt.SystemColor.activeCaption);

        jPanel22.setBackground(java.awt.SystemColor.activeCaption);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tựa sách"));

        jLabel29.setText("Mã tựa sách:");

        jLabel30.setText("Tên tựa sách:");

        jLabel31.setText("Mã tác giả:");

        cbbMaTacGia5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel34.setText("ND tóm tắt:");

        btTracuu5_1.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu5_1.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu5_1.setText("Tra cứu");
        btTracuu5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu5_1ActionPerformed(evt);
            }
        });

        jLabel32.setText("Mã thể loại:");

        cbbMaTheLoai5.setBackground(new java.awt.Color(204, 255, 255));

        txtNDtomtat5.setColumns(20);
        txtNDtomtat5.setRows(5);
        jScrollPane7.setViewportView(txtNDtomtat5);

        btnXoa6.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa6.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa6.setText("Delete");
        btnXoa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa6ActionPerformed(evt);
            }
        });

        btnCapnhat6.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat6.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat6.setText("Refresh");
        btnCapnhat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat6ActionPerformed(evt);
            }
        });

        btnThem6.setBackground(new java.awt.Color(0, 102, 102));
        btnThem6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem6.setForeground(new java.awt.Color(255, 255, 255));
        btnThem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem6.setText("Add");
        btnThem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem6ActionPerformed(evt);
            }
        });

        btnLuu6.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu6.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu6.setText("Save");
        btnLuu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu6ActionPerformed(evt);
            }
        });

        jLabel36.setText("Số lượng:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoLuong5)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(cbbMaTheLoai5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbMaTacGia5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTentuaSach5)
                            .addComponent(txtMaTuaSach5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel36))
                .addGap(64, 64, 64)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapnhat6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTracuu5_1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaTuaSach5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTracuu5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtTentuaSach5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cbbMaTacGia5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel32))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbbMaTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnXoa6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuu6)
                        .addGap(10, 10, 10)))
                .addGap(20, 20, 20)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btnThem6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapnhat6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel34)
                                .addGap(18, 43, Short.MAX_VALUE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtSoLuong5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin thể loại"));

        btTracuu5_2.setBackground(new java.awt.Color(0, 102, 102));
        btTracuu5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTracuu5_2.setForeground(new java.awt.Color(255, 255, 255));
        btTracuu5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo (2).png"))); // NOI18N
        btTracuu5_2.setText("Tra cứu");
        btTracuu5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTracuu5_2ActionPerformed(evt);
            }
        });

        jLabel38.setText("Mã thể loại:");

        jLabel39.setText("Tên thể loại:");

        btnXoa7.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa7.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/delete (2).png"))); // NOI18N
        btnXoa7.setText("Delete");
        btnXoa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa7ActionPerformed(evt);
            }
        });

        btnCapnhat7.setBackground(new java.awt.Color(0, 102, 102));
        btnCapnhat7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapnhat7.setForeground(new java.awt.Color(255, 255, 255));
        btnCapnhat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/refresh (2).png"))); // NOI18N
        btnCapnhat7.setText("Refresh");
        btnCapnhat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat7ActionPerformed(evt);
            }
        });

        btnThem7.setBackground(new java.awt.Color(0, 102, 102));
        btnThem7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem7.setForeground(new java.awt.Color(255, 255, 255));
        btnThem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/add-button (1).png"))); // NOI18N
        btnThem7.setText("Add");
        btnThem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem7ActionPerformed(evt);
            }
        });

        btnLuu7.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu7.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/floppy-disk (1).png"))); // NOI18N
        btnLuu7.setText("Save");
        btnLuu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu7ActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/seo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(txtMaTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapnhat7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTracuu5_2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btTracuu5_2)
                            .addComponent(jLabel38))
                        .addGap(85, 85, 85)
                        .addComponent(btnLuu7)
                        .addGap(28, 28, 28)
                        .addComponent(btnThem7))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtMaTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39)
                                .addComponent(txtTenTheLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoa7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel28)))))
                .addGap(18, 18, 18)
                .addComponent(btnCapnhat7)
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
                .addGap(0, 0, 0))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 335, Short.MAX_VALUE)
        );

        tblTuaSach5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTuaSach5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTuaSach5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(tblTuaSach5);

        jButton18.setBackground(java.awt.SystemColor.activeCaption);

        tblTheLoai5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTheLoai5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTheLoai5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane8.setViewportView(tblTheLoai5);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(756, 756, 756)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 684, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tra cứu theo thể loại - tựa sách   ", new javax.swing.ImageIcon(getClass().getResource("/icon/resources/search (1).png")), jPanel5); // NOI18N

        jPanel6.setBackground(java.awt.SystemColor.activeCaption);
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê"));

        jLabel40.setText("Từ ngày:");

        jLabel41.setText("Đến");

        buttonGroup3.add(rdbtnDSDGDangki);
        rdbtnDSDGDangki.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rdbtnDSDGDangki.setText("Danh sách độc giả đăng kí");

        buttonGroup3.add(rdbtnDSDGtrehan);
        rdbtnDSDGtrehan.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rdbtnDSDGtrehan.setText("Danh sách độc giả trễ hạn");

        buttonGroup3.add(rdbtnChiTietPhieuMuon);
        rdbtnChiTietPhieuMuon.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rdbtnChiTietPhieuMuon.setText("Chi tiết phiếu mượn");

        btnThongke8.setBackground(new java.awt.Color(0, 102, 102));
        btnThongke8.setForeground(new java.awt.Color(255, 255, 255));
        btnThongke8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Actions-view-choose-icon-24.png"))); // NOI18N
        btnThongke8.setText("Thống kê");
        btnThongke8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongke8ActionPerformed(evt);
            }
        });

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết phiếu mượn"));

        tblChiTietPhieuMuon6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MaMuon", "MaDG", "TenSach", "Soluong", "NgayMuon"
            }
        ));
        tblChiTietPhieuMuon6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbtnDSDGtrehan)
                                    .addComponent(rdbtnDSDGDangki))
                                .addGap(108, 108, 108)
                                .addComponent(btnThongke8))
                            .addComponent(rdbtnChiTietPhieuMuon))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)))
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel41)))
                .addGap(43, 43, 43)
                .addComponent(rdbtnDSDGDangki)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rdbtnDSDGtrehan)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThongke8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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
        tblThongKe6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(tblThongKe6);

        jButton20.setBackground(java.awt.SystemColor.activeCaption);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane9)
                .addContainerGap())
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thống kê   ", new javax.swing.ImageIcon(getClass().getResource("/icon/resources/stats.png")), jPanel6); // NOI18N

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
                .addContainerGap(220, Short.MAX_VALUE)
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

        jPanel17.setBackground(java.awt.SystemColor.activeCaption);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resources/Login-icon-32.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDocGia1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDocGia1AncestorAdded
        // TODO add your handling code here:

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
                txtMaNXB4.setText(String.valueOf(tblNhaSanXuat4.getValueAt(row, 1)));
                txtTenNhaSX4.setText(String.valueOf(tblNhaSanXuat4.getValueAt(row, 2)));
              
            }
        });
    }//GEN-LAST:event_tblNhaSanXuat4AncestorAdded

    private void tblTacgia4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTacgia4AncestorAdded
        // TODO add your handling code here
        ListSelectionModel listSelectionModel = tblTacgia4.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblTacgia4.getSelectedRow();
                txtMaTacGia4.setText(String.valueOf(tblTacgia4.getValueAt(row, 1)));
                txtTenTacgia4.setText(String.valueOf(tblTacgia4.getValueAt(row, 2)));
              
            }
        });
    }//GEN-LAST:event_tblTacgia4AncestorAdded

    private void tbldanhmucSach3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbldanhmucSach3AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tbldanhmucSach3.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbldanhmucSach3.getSelectedRow();
                txtMaDauSach3.setText(String.valueOf(tbldanhmucSach3.getValueAt(row, 1)));
                    String string = String.valueOf(tbldanhmucSach3.getValueAt(row, 1));
          
           
                List<DauSach> user_DS2 = userDS.getAll();
                for (DauSach users_DS : user_DS2) {
                if (string.equals(users_DS.getMaDS())) {
                    List<TuaSach> user_TS2 = userTS.getAll();
                    for (TuaSach users_TS : user_TS2) {
                        if (users_DS.getMaTS().equals(users_TS.getMaTS())) {
                          txtTenSach3.setText(users_TS.getTenTS());
                          List<TheLoai> user_TL2 = userTL.getAll();
                        for(TheLoai userss : user_TL2){
                            if (users_TS.getMaTL().equals(userss.getMaTL())){
                                txttheloai3.setText(userss.getTenTL());
                           }
                        }
                        List<TacGia> user_TG2 = userTG.getAll();
                        for(TacGia users_TG : user_TG2){
                            if (users_TS.getMaTG().equals(users_TG.getMaTG())){
                                txtTacGia3.setText(users_TG.getHoten());
                            }
                        }
                        if(users_TS.getSoLuong()>0){
                          RdbtnChuamuon4.setSelected(true);
                        }
                        else
                        {
                            RdbtnDamuon4.setSelected(true);
                        }
                        txtNDtomluoc3.setText(users_TS.getTomTat());
                        }
                        
                        
                    }
                }
            
            }
                txtNgonNgu3.setText(String.valueOf(tbldanhmucSach3.getValueAt(row, 3)));
                List<NhaXuatBan> user_NXB = userNXB.getAll();
                for(NhaXuatBan users :user_NXB){
                    if(users.getMaNXB().equals(String.valueOf(tbldanhmucSach3.getValueAt(row, 4))))
                    {
                        txtTenNXB3.setText(users.getTenNXB());
                    }
                }
            }
                   
        
                
        });
    }//GEN-LAST:event_tbldanhmucSach3AncestorAdded

    private void btTracuu4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu4_1ActionPerformed
        // TODO add your handling code here:
        String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Nhà xuất bản.",JOptionPane.INFORMATION_MESSAGE);
        
        defaultTableModel4.setRowCount(0);
        List<NhaXuatBan> user_NXB = userNXB.findByName(str);
        int sttnxb = 0;
        for (NhaXuatBan users : user_NXB) {
            sttnxb++;
            defaultTableModel4.addRow(new Object[]{sttnxb, users.getMaNXB(), users.getTenNXB()});
        }
        if (defaultTableModel4.getRowCount()==0){
            JOptionPane.showMessageDialog(Giaodien.this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
            List<NhaXuatBan> user_NXB2 = userNXB.getAll();
        int sttnxb2 = 0;
        for (NhaXuatBan users : user_NXB2) {
            sttnxb2++;
            defaultTableModel4.addRow(new Object[]{sttnxb2, users.getMaNXB(), users.getTenNXB()});
        }
        }
    }//GEN-LAST:event_btTracuu4_1ActionPerformed

    private void tblMuontraSach2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblMuontraSach2AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblMuontraSach2.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblMuontraSach2.getSelectedRow();
                txtMaMuon2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 1)));
                txtMaDG2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 2)));
                String string = String.valueOf(tblMuontraSach2.getValueAt(row, 3));
                List<ThongTinMuonTra> user_TTMT2 = userTTMT.getAll();
                for (ThongTinMuonTra user : user_TTMT2) {
                    List<DauSach> user_DS2 = userDS.getAll();
                    for (DauSach users : user_DS2) {
                        if (string.equals(users.getMaDS())) {
                            List<TuaSach> user_TS2 = userTS.getAll();
                            for (TuaSach userss : user_TS2) {
                                if (users.getMaTS().equals(userss.getMaTS())) {
                                    CbbTenSach2.setSelectedItem(userss.getTenTS());
                                }
                            }
                        }
                    }
                }
                txtSoluong2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 4)));
                txtGhichu2.setText(String.valueOf(tblMuontraSach2.getValueAt(row, 8)));
                     
                String str1 = String.valueOf(tblMuontraSach2.getValueAt(row, 5));
                String str2 = String.valueOf(tblMuontraSach2.getValueAt(row, 6));
                String str3="";
                if(String.valueOf(tblMuontraSach2.getValueAt(row, 7))!=null){
                    str3+=String.valueOf(tblMuontraSach2.getValueAt(row, 7));
                }
                else
                    str3="";
                try {
                    Date NgayMuon = f.parse(str1);
                    Date NgayHenTra = f.parse(str2);
                    Date NgayTra = f.parse(str3);
                        txtNgayMuon2.setDate(NgayMuon);
                        txtNgayHenTra2.setDate(NgayHenTra);
                        txtNgayTra2.setDate(NgayTra);
                } catch (ParseException ex) {
                    Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_tblMuontraSach2AncestorAdded

    private void tblTheLoai5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTheLoai5AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblTheLoai5.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblTheLoai5.getSelectedRow();
                txtMaTheLoai5.setText(String.valueOf(tblTheLoai5.getValueAt(row, 1)));
                txtTenTheLoai5.setText(String.valueOf(tblTheLoai5.getValueAt(row, 2)));
              
            }
        });
    }//GEN-LAST:event_tblTheLoai5AncestorAdded

    private void tblTuaSach5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTuaSach5AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tblTuaSach5.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblTuaSach5.getSelectedRow();
                txtMaTuaSach5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 1)));
                txtTentuaSach5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 2)));
                cbbMaTacGia5.setSelectedItem(String.valueOf(tblTuaSach5.getValueAt(row, 3)));
                cbbMaTheLoai5.setSelectedItem(String.valueOf(tblTuaSach5.getValueAt(row, 4)));
                txtNDtomtat5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 5)));
                txtSoLuong5.setText(String.valueOf(tblTuaSach5.getValueAt(row, 6)));
            }
        });
    }//GEN-LAST:event_tblTuaSach5AncestorAdded

    private void txttheloai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttheloai3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttheloai3ActionPerformed

    private void txtTenSach3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSach3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSach3ActionPerformed

    private void tblDocGia1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDocGia1AncestorMoved
        // TODO add your handling code here:
              
        
         ListSelectionModel listSelectionModel = tblDocGia1.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblDocGia1.getSelectedRow();
                txtMaDocGia1.setText(String.valueOf(tblDocGia1.getValueAt(row, 1)));
                txtHoten1.setText(String.valueOf(tblDocGia1.getValueAt(row, 2)));
                if (String.valueOf(tblDocGia1.getValueAt(row, 3)).equals("Nam")) {
                    RdbtnNam1.setSelected(true);
                } else {
                    RdbtnNu1.setSelected(true);
                }
                txtDiaChi1.setText(String.valueOf(tblDocGia1.getValueAt(row, 5)));
                txtSoDT1.setText(String.valueOf(tblDocGia1.getValueAt(row, 6)));
               
                String str1 = String.valueOf(tblDocGia1.getValueAt(row, 4));
                String str2 = String.valueOf(tblDocGia1.getValueAt(row, 7));
                String str3 = String.valueOf(tblDocGia1.getValueAt(row, 8));
                try {

                Date Dob = f.parse(str1);
                Date NgayDK = f.parse(str2);
                Date NgayEndDK = f.parse(str3);
                      jDateChooser3.setDate(Dob);
                      txtngayDK1.setDate(NgayDK);
                      txtngayEndDK1.setDate(NgayEndDK);
                } catch (ParseException ex) {
                    Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
                }
               

       
                    
               
               
                
          
            }
        });

    }//GEN-LAST:event_tblDocGia1AncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn đóng ứng dụng không");
            if (confident == JOptionPane.YES_OPTION) {
                this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btTracuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu1ActionPerformed
        // TODO add your handling code here:
         String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Độc giả",JOptionPane.INFORMATION_MESSAGE);
        
        defaultTableModel1.setRowCount(0);
        List<DocGia> user_DG = userDG.findByName(str);
        int sttdg=0;
        for(DocGia users : user_DG){
            sttdg++;
            defaultTableModel1.addRow(new Object[]{sttdg, users.getMaDG(), users.getHoten(), users.getGioiTinh(), users.getNgaySinh(), users.getDiaChi(), users.getSdt(), users.getNgayDK(), users.getNgayHetHan()});
        }
        if (defaultTableModel1.getRowCount()==0){
            JOptionPane.showMessageDialog(Giaodien.this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
             List<DocGia> user_DG2 = userDG.getAll();
        int sttdg2 = 0;
        for (DocGia users : user_DG2) {
            sttdg2++;
            defaultTableModel1.addRow(new Object[]{sttdg2, users.getMaDG(), users.getHoten(), users.getGioiTinh(), users.getNgaySinh(), users.getDiaChi(), users.getSdt(), users.getNgayDK(), users.getNgayHetHan()});
        }
        }
    }//GEN-LAST:event_btTracuu1ActionPerformed

    private void btnCapnhat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat1ActionPerformed
        // TODO add your handling code here:
        txtDiaChi1.setText("");
        txtMaDocGia1.setText("");
        txtHoten1.setText("");
        txtSoDT1.setText("");
        RdbtnNam1.setSelected(false);
        RdbtnNu1.setSelected(false);
        String str1 ="";
        try {
            jDateChooser3.setDate(f.parse(str1));
            txtngayDK1.setDate(f.parse(str1));
            txtngayEndDK1.setDate(f.parse(str1));
        } catch (ParseException ex) {
            Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
        }
        defaultTableModel1.setRowCount(0);
        List<DocGia> user_DG2 = userDG.getAll();
        int sttdg2 = 0;
        for (DocGia users : user_DG2) {
            sttdg2++;
            defaultTableModel1.addRow(new Object[]{sttdg2, users.getMaDG(), users.getHoten(), users.getGioiTinh(), users.getNgaySinh(), users.getDiaChi(), users.getSdt(), users.getNgayDK(), users.getNgayHetHan()});
        }
    }//GEN-LAST:event_btnCapnhat1ActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
        int row = tblDocGia1.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn người muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Độc giả này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                int dem=0;
                String maDG = String.valueOf(tblDocGia1.getValueAt(row, 1));
                List<ThongTinMuonTra> user_ttmt = userTTMT.getAll();
                for(ThongTinMuonTra users : user_ttmt){
                    if (users.getMaDG().equals(maDG)){
                        if(users.getNgayTra()==null){
                            dem++;
                        }
                    }}
                if (dem>0){
                    JOptionPane.showMessageDialog(Giaodien.this,"Không thể xóa Độc giả vì đang mượn sách","Thông báo", JOptionPane.ERROR_MESSAGE );
                }
                else
                {
                     userDG.remove(maDG);
                defaultTableModel1.removeRow(row);
 
                }
                         
                }
              
                
            }
            
        
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        String ngaySinh = f.format(jDateChooser3.getDate());
        String ngayDK = f.format(txtngayDK1.getDate());
        String ngayEndDK = f.format(txtngayEndDK1.getDate());
      
        String gioitinh="";
        if (RdbtnNam1.isSelected())
            gioitinh+="Nam";
        else
            gioitinh+="Nữ";
        DocGia docGia = new DocGia();
        docGia.setHoten(txtHoten1.getText());
        docGia.setDiaChi(txtDiaChi1.getText());
        docGia.setGioiTinh(gioitinh);
        docGia.setSdt(txtSoDT1.getText());
        docGia.setNgaySinh(ngaySinh);
        docGia.setNgayDK(ngayDK);
        docGia.setNgayHetHan(ngayEndDK);
        List<DocGia> list = new ArrayList<DocGia>();
        list.add(docGia);
        userDG.insert(docGia);
        
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnCapnhat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat2ActionPerformed
        // TODO add your handling code here:
        txtMaMuon2.setText("");
        txtMaDG2.setText("");
        CbbTenSach2.setSelectedItem(0);
        List<TuaSach> user_TS = userTS.getAll();
        for(TuaSach users : user_TS){
            CbbTenSach2.addItem(users.getTenTS());
        }
        txtGhichu2.setText("");
        txtSoluong2.setText("");
//        try {
//            txtNgayMuon2.setDate(f.parse(""));
//            txtNgayHenTra2.setDate(f.parse(""));
//            txtNgayTra2.setDate(f.parse(""));
//        } catch (ParseException ex) {
//            Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
//        }
        defaultTableModel2.setRowCount(0);
        List<ThongTinMuonTra> user_TTMT = userTTMT.getAll();
        int sttttmt=0;
        for(ThongTinMuonTra users : user_TTMT){
            sttttmt++;
            defaultTableModel2.addRow(new Object[]{sttttmt,users.getMaMuon(),users.getMaDG(),users.getMaDS(),users.getSoLuong(),users.getMaMuon(),users.getNgayHenTra(),users.getNgayTra()});
        }
    }//GEN-LAST:event_btnCapnhat2ActionPerformed

    private void btnXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2ActionPerformed
        // TODO add your handling code here:
           int row = tblMuontraSach2.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn Đơn mượn muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Đơn mượn này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                int dem=0;
                String maMuon = String.valueOf(tblMuontraSach2.getValueAt(row, 1));
                List<ThongTinMuonTra> user_ttmt = userTTMT.getAll();
                for(ThongTinMuonTra users : user_ttmt){
                        if(users.getNgayTra()!=""){
                            dem++;
                        }
                    }
                if (dem==0){
                    JOptionPane.showMessageDialog(Giaodien.this,"Không thể xóa Đơn mượn vì đang mượn sách","Thông báo", JOptionPane.ERROR_MESSAGE );
                }
                else
                {
                userTTMT.remove(maMuon);
                defaultTableModel2.removeRow(row);
 
                }
                         
                }
              
                
            }
        
    }//GEN-LAST:event_btnXoa2ActionPerformed

    private void btTracuu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu2ActionPerformed
        // TODO add your handling code here:
      String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Độc giả",JOptionPane.INFORMATION_MESSAGE);
    
        List<DocGia> user_DG = userDG.findByName(str);
        for(DocGia user : user_DG){
            
      List<ThongTinMuonTra> user_TTMT = userTTMT.findByName(user.getMaDG());
        int sttttmt=0;
        defaultTableModel2.setRowCount(0);
        for(ThongTinMuonTra users : user_TTMT){
            sttttmt++;            
            defaultTableModel2.addRow(new Object[]{sttttmt, users.getMaMuon(), users.getMaDG(), users.getMaDS(), users.getSoLuong(), users.getNgayMuon(), users.getNgayHenTra(), users.getNgayTra(), users.getGhiChu()});
        }
        if (defaultTableModel2.getRowCount()==0){
            JOptionPane.showMessageDialog(Giaodien.this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
        List<ThongTinMuonTra> user_TTMT2 = userTTMT.getAll();
        int sttttmt2=0;
        for(ThongTinMuonTra users : user_TTMT2){
            sttttmt2++;
            defaultTableModel2.addRow(new Object[]{sttttmt2, users.getMaMuon(), users.getMaDG(), users.getMaDS(), users.getSoLuong(), users.getNgayMuon(), users.getNgayHenTra(), users.getNgayTra(), users.getGhiChu()});
        }
        }
                }
        
    }//GEN-LAST:event_btTracuu2ActionPerformed

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        // TODO add your handling code here:
         String ngayMuon = f.format(txtNgayMuon2.getDate());
        String ngayHenTra = f.format(txtNgayHenTra2.getDate());
        String ngayTra = f.format(txtNgayTra2.getDate());
        ThongTinMuonTra thongTinMuonTra = new ThongTinMuonTra();
        thongTinMuonTra.setMaDG(txtMaDG2.getText());
        String tensach = String.valueOf(CbbTenSach2.getSelectedItem());
        List<TuaSach> user_TS = userTS.getAll();
        for(TuaSach user : user_TS){
            if(user.getTenTS().equals(tensach)){
            List<DauSach> user_DS = userDS.getAll();
            for(DauSach users : user_DS){
                if (user.getMaTS().equals(users.getMaTS()))
                    thongTinMuonTra.setMaDS(users.getMaDS());
            }
            }
        }
        thongTinMuonTra.setSoLuong(Integer.valueOf(txtSoluong2.getText()));
        thongTinMuonTra.setNgayMuon(ngayMuon);
        thongTinMuonTra.setNgayHenTra(ngayHenTra);
        thongTinMuonTra.setNgayTra(ngayTra);
        List<ThongTinMuonTra> list = new ArrayList<ThongTinMuonTra>();
        list.add(thongTinMuonTra);
        userTTMT.insert(thongTinMuonTra);
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void btnLuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu1ActionPerformed
        // TODO add your handling code here:
        
          String ngaySinh = f.format(jDateChooser3.getDate());
        String ngayDK = f.format(txtngayDK1.getDate());
        String ngayEndDK = f.format(txtngayEndDK1.getDate());
      
        String gioitinh="";
        if (RdbtnNam1.isSelected())
            gioitinh+="Nam";
        else
            gioitinh+="Nữ";
        DocGia docGia = new DocGia();
        docGia.setMaDG(txtMaDocGia1.getText());
        docGia.setHoten(txtHoten1.getText());
        docGia.setDiaChi(txtDiaChi1.getText());
        docGia.setGioiTinh(gioitinh);
        docGia.setSdt(txtSoDT1.getText());
        docGia.setNgaySinh(ngaySinh);
        docGia.setNgayDK(ngayDK);
        docGia.setNgayHetHan(ngayEndDK);
        List<DocGia> list = new ArrayList<DocGia>();
        list.add(docGia);
        userDG.update(docGia);
    }//GEN-LAST:event_btnLuu1ActionPerformed

    private void btnLuu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu2ActionPerformed
        // TODO add your handling code here:
         String ngayMuon = f.format(txtNgayMuon2.getDate());
        String ngayHenTra = f.format(txtNgayHenTra2.getDate());
        String ngayTra = f.format(txtNgayTra2.getDate());
        ThongTinMuonTra thongTinMuonTra = new ThongTinMuonTra();
        thongTinMuonTra.setMaDG(txtMaDG2.getText());
        String tensach = String.valueOf(CbbTenSach2.getSelectedItem());
        List<TuaSach> user_TS = userTS.getAll();
        for(TuaSach user : user_TS){
            if(user.getTenTS().equals(tensach)){
            List<DauSach> user_DS = userDS.getAll();
            for(DauSach users : user_DS){
                if (user.getMaTS().equals(users.getMaTS()))
                    thongTinMuonTra.setMaDS(users.getMaDS());
            }
            }
        }
        thongTinMuonTra.setMaMuon(txtMaMuon2.getText());
        thongTinMuonTra.setSoLuong(Integer.valueOf(txtSoluong2.getText()));
        thongTinMuonTra.setNgayMuon(ngayMuon);
        thongTinMuonTra.setNgayHenTra(ngayHenTra);
        thongTinMuonTra.setNgayTra(ngayTra);
        List<ThongTinMuonTra> list = new ArrayList<ThongTinMuonTra>();
        list.add(thongTinMuonTra);
        userTTMT.update(thongTinMuonTra);
    }//GEN-LAST:event_btnLuu2ActionPerformed

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
         defaultTableModel3.setRowCount(0);
         List<DauSach> user_DS = userDS.getAll();
         int sttds=0;
         for(DauSach users : user_DS){
             sttds++;
             defaultTableModel3.addRow(new Object[]{sttds,users.getMaDS(),users.getMaTS(),users.getNgonNgu(),users.getMaNXB()});
         }
    }//GEN-LAST:event_btnCapnhat3ActionPerformed

    private void btnXoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa3ActionPerformed
        // TODO add your handling code here:
            int row = tbldanhmucSach3.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn Danh mục muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Danh mục này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maDS = String.valueOf(tbldanhmucSach3.getValueAt(row, 1));
                userDS.remove(maDS);
                defaultTableModel3.removeRow(row);
           
                }
              
                
            }
    }//GEN-LAST:event_btnXoa3ActionPerformed

    private void btnThem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem3ActionPerformed
        // TODO add your handling code here:
        
        DauSach dauSach = new DauSach();
        List<TuaSach> user_TS = userTS.getAll();
        int dem1=0;
        int dem2=0;
        for(TuaSach users : user_TS){
            dem1++;
            if (users.getTenTS().equals(txtTenSach3.getText())){
                dauSach.setMaTS(users.getMaTS());
                break;
            }
            else{
                dem2++;
            }
        }
        if(dem1==dem2){
           JOptionPane.showMessageDialog(Giaodien.this,"Không có tên sách bạn đã nhập!\n Vui lòng kiểm tra lại","Thông báo", JOptionPane.ERROR_MESSAGE ); 
        }
        else
        {
            dauSach.setNgonNgu(txtNgonNgu3.getText());
            List<NhaXuatBan> user_NXB = userNXB.getAll();
            int dem3=0;
            int dem4=0;
            for(NhaXuatBan users : user_NXB){
                dem3++;
                if (users.getTenNXB().equals(txtTenNXB3.getText())){
                    dauSach.setMaNXB(users.getMaNXB());
                }
                else
                    dem4++;
            }
            if (dem3==dem4){
                JOptionPane.showMessageDialog(Giaodien.this,"Không có tên Nhà xuất bản bạn đã nhập!\n Vui lòng kiểm tra lại","Thông báo", JOptionPane.ERROR_MESSAGE );
            }
            else
            {
                List<DauSach> list = new ArrayList<DauSach>();
                list.add(dauSach);
                userDS.insert(dauSach);
                
            }
        }
    }//GEN-LAST:event_btnThem3ActionPerformed

    private void btnCapnhat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat4ActionPerformed
        // TODO add your handling code here:
        txtTenNhaSX4.setText("");
        txtMaNXB4.setText("");
        defaultTableModel4.setRowCount(0);
        List<NhaXuatBan> user_NXB = userNXB.getAll();
        int sttnxb=0;
        for(NhaXuatBan users : user_NXB){
            sttnxb++;
            defaultTableModel4.addRow(new Object[]{sttnxb,users.getMaNXB(),users.getTenNXB()});
        }
    }//GEN-LAST:event_btnCapnhat4ActionPerformed

    private void btnXoa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa4ActionPerformed
        // TODO add your handling code here:
        
          int row = tblNhaSanXuat4.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn Nhà xuất bản muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Nhà xuất bản này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maNXB = String.valueOf(tblNhaSanXuat4.getValueAt(row, 1));
                userNXB.remove(maNXB);
                defaultTableModel4.removeRow(row);
 
                } 
            }
        
    }//GEN-LAST:event_btnXoa4ActionPerformed

    private void btnThem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem4ActionPerformed
        // TODO add your handling code here:
        NhaXuatBan nhaXuatBan = new NhaXuatBan();
        nhaXuatBan.setTenNXB(txtTenNhaSX4.getText());
        List<NhaXuatBan> list = new ArrayList<NhaXuatBan>();
        list.add(nhaXuatBan);
        userNXB.insert(nhaXuatBan);
    }//GEN-LAST:event_btnThem4ActionPerformed

    private void btnLuu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu4ActionPerformed
        // TODO add your handling code here:
        NhaXuatBan nhaXuatBan = new NhaXuatBan();
        nhaXuatBan.setMaNXB(txtMaNXB4.getText());
        nhaXuatBan.setTenNXB(txtTenNhaSX4.getText());
        List<NhaXuatBan> list = new ArrayList<NhaXuatBan>();
        list.add(nhaXuatBan);
        userNXB.update(nhaXuatBan);
    }//GEN-LAST:event_btnLuu4ActionPerformed

    private void btnCapnhat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat5ActionPerformed
        // TODO add your handling code here:
        txtMaTacGia4.setText("");
        txtTenTacgia4.setText("");
        defaultTableModel5.setRowCount(0);
        List<TacGia> user_TG = userTG.getAll();
        int stttg = 0;
        for(TacGia users: user_TG){
            stttg++;
            defaultTableModel5.addRow(new Object[]{stttg,users.getMaTG(),users.getHoten()});
        }
    }//GEN-LAST:event_btnCapnhat5ActionPerformed

    private void btnXoa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa5ActionPerformed
        // TODO add your handling code here:
          int row = tblTacgia4.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn Tác giá muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Tác giả này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maTG = String.valueOf(tblTacgia4.getValueAt(row, 1));
                userTG.remove(maTG);
                defaultTableModel5.removeRow(row);
                } 
            }
    }//GEN-LAST:event_btnXoa5ActionPerformed

    private void btnThem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem5ActionPerformed
        // TODO add your handling code here:
        TacGia tacGia = new TacGia();
        tacGia.setHoten(txtTenTacgia4.getText());
        List<TacGia> list = new ArrayList<TacGia>();
        list.add(tacGia);
        userTG.insert(tacGia);
    }//GEN-LAST:event_btnThem5ActionPerformed

    private void btnLuu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu5ActionPerformed
        // TODO add your handling code here:
        TacGia tacGia = new TacGia();
        tacGia.setMaTG(txtMaTacGia4.getText());
        tacGia.setHoten(txtTenTacgia4.getText());
        List<TacGia> list = new ArrayList<TacGia>();
        list.add(tacGia);
        userTG.update(tacGia);
    }//GEN-LAST:event_btnLuu5ActionPerformed

    private void btnCapnhat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat6ActionPerformed
        // TODO add your handling code here:
        txtMaTuaSach5.setText("");
        txtTentuaSach5.setText("");
        cbbMaTacGia5.setSelectedItem(0);
        List<TacGia> user_TG = userTG.getAll();
        for(TacGia users : user_TG){
            cbbMaTacGia5.addItem(users.getMaTG());
        }
        cbbMaTheLoai5.setSelectedItem(0);
        List<TheLoai> user_TL = userTL.getAll();
        for(TheLoai users: user_TL){
            cbbMaTheLoai5.addItem(users.getMaTL());
        }
        txtSoLuong5.setText("");
        
        txtNDtomtat5.setText("");
        defaultTableModel6.setRowCount(0);
        List<TuaSach> user_TS = userTS.getAll();
        int sttts =0;
        for(TuaSach users:user_TS){
            sttts++;
            defaultTableModel6.addRow(new Object[]{sttts,users.getMaTS(),users.getTenTS(),users.getMaTG(),users.getMaTL(),users.getTomTat(),users.getSoLuong()});
        }
    }//GEN-LAST:event_btnCapnhat6ActionPerformed

    private void btnXoa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa6ActionPerformed
        // TODO add your handling code here:
         int row = tblTuaSach5.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn Tựa sách muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Tựa sách này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maTS = String.valueOf(tblTuaSach5.getValueAt(row, 1));
                userTS.remove(maTS);
                defaultTableModel6.removeRow(row);
                } 
            }
    }//GEN-LAST:event_btnXoa6ActionPerformed

    private void btnThem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem6ActionPerformed
        // TODO add your handling code here:
        TuaSach tuaSach = new TuaSach();
        tuaSach.setTenTS(txtTentuaSach5.getText());
        tuaSach.setMaTG(String.valueOf(cbbMaTacGia5.getSelectedItem()));
        tuaSach.setMaTL(String.valueOf(cbbMaTheLoai5.getSelectedItem()));
        tuaSach.setTomTat(txtNDtomtat5.getText());
        tuaSach.setSoLuong(Integer.valueOf(txtSoLuong5.getText()));
        List<TuaSach> list = new ArrayList<TuaSach>();
        list.add(tuaSach);
        userTS.insert(tuaSach);
        
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
        List<TuaSach> list = new ArrayList<TuaSach>();
        list.add(tuaSach);
        userTS.update(tuaSach);
    }//GEN-LAST:event_btnLuu6ActionPerformed

    private void btnCapnhat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat7ActionPerformed
        // TODO add your handling code here:
        
        txtMaTheLoai5.setText("");
        txtTenTheLoai5.setText("");
        defaultTableModel7.setRowCount(0);
        List<TheLoai> user_TL = userTL.getAll();
        int stttl=0;
        for(TheLoai users : user_TL){
            stttl++;
            defaultTableModel7.addRow(new Object[]{stttl,users.getMaTL(),users.getTenTL()});
        }
    }//GEN-LAST:event_btnCapnhat7ActionPerformed

    private void btnXoa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa7ActionPerformed
        // TODO add your handling code here:
        int row = tblTheLoai5.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(Giaodien.this,"Vui lòng chọn Thể loại muốn xóa","Thông báo", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(Giaodien.this, "Bạn có chắc muốn xóa Thể loại này hay không!");
            if (confident == JOptionPane.YES_OPTION) {
                String maTL = String.valueOf(tblTheLoai5.getValueAt(row, 1));
                userTL.remove(maTL);
                defaultTableModel7.removeRow(row);
                } 
            }
    }//GEN-LAST:event_btnXoa7ActionPerformed

    private void btnThem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem7ActionPerformed
        // TODO add your handling code here:
        TheLoai theLoai = new TheLoai();
        theLoai.setTenTL(txtTenTheLoai5.getText());
        List<TheLoai> list = new ArrayList<TheLoai>();
        list.add(theLoai);
        userTL.insert(theLoai);
    }//GEN-LAST:event_btnThem7ActionPerformed

    private void btnLuu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu7ActionPerformed
        // TODO add your handling code here:
         TheLoai theLoai = new TheLoai();
         theLoai.setMaTL(txtMaTheLoai5.getText());
        theLoai.setTenTL(txtTenTheLoai5.getText());
        List<TheLoai> list = new ArrayList<TheLoai>();
        list.add(theLoai);
        userTL.insert(theLoai);
    }//GEN-LAST:event_btnLuu7ActionPerformed

    private void btnLuu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu3ActionPerformed
        // TODO add your handling code here:
           DauSach dauSach = new DauSach();
        dauSach.setMaTS(txtMaDauSach3.getText());
        List<TuaSach> user_TS = userTS.getAll();
        int dem1=0;
        int dem2=0;
        for(TuaSach users : user_TS){
            dem1++;
            if (users.getTenTS().equals(txtTenSach3.getText())){
                dauSach.setMaTS(users.getMaTS());
                break;
            }
            else{
                dem2++;
            }
        }
        if(dem1==dem2){
           JOptionPane.showMessageDialog(Giaodien.this,"Không có tên sách bạn đã nhập!\n Vui lòng kiểm tra lại","Thông báo", JOptionPane.ERROR_MESSAGE ); 
        }
        else
        {
            dauSach.setNgonNgu(txtNgonNgu3.getText());
            List<NhaXuatBan> user_NXB = userNXB.getAll();
            int dem3=0;
            int dem4=0;
            for(NhaXuatBan users : user_NXB){
                dem3++;
                if (users.getTenNXB().equals(txtTenNXB3.getText())){
                    dauSach.setMaNXB(users.getMaNXB());
                }
                else
                    dem4++;
            }
            if (dem3==dem4){
                JOptionPane.showMessageDialog(Giaodien.this,"Không có tên Nhà xuất bản bạn đã nhập!\n Vui lòng kiểm tra lại","Thông báo", JOptionPane.ERROR_MESSAGE );
            }
            else
            {
                List<DauSach> list = new ArrayList<DauSach>();
                list.add(dauSach);
                userDS.update(dauSach);
                
            }
        }
    }//GEN-LAST:event_btnLuu3ActionPerformed

    private void btTracuu4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu4_2ActionPerformed
        // TODO add your handling code here:
         String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Tác giả.",JOptionPane.INFORMATION_MESSAGE);
        
        defaultTableModel5.setRowCount(0);
        List<TacGia> user_TG = userTG.findByName(str);
        int stttg = 0;
        for (TacGia users : user_TG) {
            stttg++;
            defaultTableModel5.addRow(new Object[]{stttg, users.getMaTG(), users.getHoten()});
        }
        if (defaultTableModel5.getRowCount()==0){
            JOptionPane.showMessageDialog(Giaodien.this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
            List<TacGia> user_TG2 = userTG.getAll();
        int sttnxb2 = 0;
        for (TacGia users : user_TG2) {
            sttnxb2++;
            defaultTableModel5.addRow(new Object[]{sttnxb2, users.getMaTG(), users.getHoten()});
        }
        }
    }//GEN-LAST:event_btTracuu4_2ActionPerformed

    private void btTracuu5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu5_1ActionPerformed
        // TODO add your handling code here:
         String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Tựa sách.",JOptionPane.INFORMATION_MESSAGE);
        
        defaultTableModel6.setRowCount(0);
        List<TuaSach> user_TS = userTS.findByName(str);
        int sttts = 0;
        for (TuaSach users : user_TS) {
            sttts++;
            defaultTableModel6.addRow(new Object[]{sttts, users.getMaTS(), users.getTenTS(), users.getMaTG(), users.getMaTL(), users.getTomTat(), users.getSoLuong()});
        }
        if (defaultTableModel6.getRowCount()==0){
            JOptionPane.showMessageDialog(Giaodien.this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
          List<TuaSach> user_TS2 = userTS.getAll();
        int sttts2 = 0;
        for (TuaSach users : user_TS2) {
            sttts2++;
            defaultTableModel6.addRow(new Object[]{sttts2, users.getMaTS(), users.getTenTS(), users.getMaTG(), users.getMaTL(), users.getTomTat(), users.getSoLuong()});
        }
        }
    }//GEN-LAST:event_btTracuu5_1ActionPerformed

    private void btTracuu5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTracuu5_2ActionPerformed
        // TODO add your handling code here:
        String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên Thể loại.",JOptionPane.INFORMATION_MESSAGE);
        
        defaultTableModel7.setRowCount(0);
        List<TheLoai> user_TL = userTL.findByName(str);
        int stttl = 0;
        for (TheLoai users : user_TL) {
            stttl++;
            defaultTableModel7.addRow(new Object[]{stttl, users.getMaTL(), users.getTenTL()});
        }
        if (defaultTableModel7.getRowCount()==0){
            JOptionPane.showMessageDialog(Giaodien.this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
         List<TheLoai> user_TL2 = userTL.findByName(str);
        int stttl2 = 0;
        for (TheLoai users : user_TL2) {
            stttl2++;
            defaultTableModel7.addRow(new Object[]{stttl2, users.getMaTL(), users.getTenTL()});
        }
        }
    }//GEN-LAST:event_btTracuu5_2ActionPerformed

    private void btnThongke8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongke8ActionPerformed
        // TODO add your handling code here:
        new ThongkeForm().setVisible(true);
    }//GEN-LAST:event_btnThongke8ActionPerformed

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
                new Giaodien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbTenSach2;
    private javax.swing.JRadioButton RdbtnChuamuon4;
    private javax.swing.JRadioButton RdbtnDamuon4;
    private javax.swing.JRadioButton RdbtnNam1;
    private javax.swing.JRadioButton RdbtnNu1;
    private javax.swing.JButton btTracuu1;
    private javax.swing.JButton btTracuu2;
    private javax.swing.JButton btTracuu3;
    private javax.swing.JButton btTracuu4_1;
    private javax.swing.JButton btTracuu4_2;
    private javax.swing.JButton btTracuu5_1;
    private javax.swing.JButton btTracuu5_2;
    private javax.swing.JButton btnCapnhat1;
    private javax.swing.JButton btnCapnhat2;
    private javax.swing.JButton btnCapnhat3;
    private javax.swing.JButton btnCapnhat4;
    private javax.swing.JButton btnCapnhat5;
    private javax.swing.JButton btnCapnhat6;
    private javax.swing.JButton btnCapnhat7;
    private javax.swing.JButton btnLuu1;
    private javax.swing.JButton btnLuu2;
    private javax.swing.JButton btnLuu3;
    private javax.swing.JButton btnLuu4;
    private javax.swing.JButton btnLuu5;
    private javax.swing.JButton btnLuu6;
    private javax.swing.JButton btnLuu7;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnThem3;
    private javax.swing.JButton btnThem4;
    private javax.swing.JButton btnThem5;
    private javax.swing.JButton btnThem6;
    private javax.swing.JButton btnThem7;
    private javax.swing.JButton btnThongke8;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JButton btnXoa3;
    private javax.swing.JButton btnXoa4;
    private javax.swing.JButton btnXoa5;
    private javax.swing.JButton btnXoa6;
    private javax.swing.JButton btnXoa7;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbbMaTacGia5;
    private javax.swing.JComboBox<String> cbbMaTheLoai5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
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
    private javax.swing.JTable tblTacgia4;
    private javax.swing.JTable tblTheLoai5;
    private javax.swing.JTable tblThongKe6;
    private javax.swing.JTable tblTuaSach5;
    private javax.swing.JTable tbldanhmucSach3;
    private javax.swing.JTextField txtDiaChi1;
    private javax.swing.JTextField txtGhichu2;
    private javax.swing.JTextField txtHoten1;
    private javax.swing.JTextField txtMaDG2;
    private javax.swing.JLabel txtMaDauSach3;
    private javax.swing.JLabel txtMaDocGia1;
    private javax.swing.JLabel txtMaMuon2;
    private javax.swing.JLabel txtMaNXB4;
    private javax.swing.JLabel txtMaTacGia4;
    private javax.swing.JLabel txtMaTheLoai5;
    private javax.swing.JLabel txtMaTuaSach5;
    private javax.swing.JTextArea txtNDtomluoc3;
    private javax.swing.JTextArea txtNDtomtat5;
    private com.toedter.calendar.JDateChooser txtNgayHenTra2;
    private com.toedter.calendar.JDateChooser txtNgayMuon2;
    private com.toedter.calendar.JDateChooser txtNgayTra2;
    private javax.swing.JTextField txtNgonNgu3;
    private javax.swing.JTextField txtSoDT1;
    private javax.swing.JTextField txtSoLuong5;
    private javax.swing.JTextField txtSoluong2;
    private javax.swing.JTextField txtTacGia3;
    private javax.swing.JTextField txtTenNXB3;
    private javax.swing.JTextField txtTenNhaSX4;
    private javax.swing.JTextField txtTenSach3;
    private javax.swing.JTextField txtTenTacgia4;
    private javax.swing.JTextField txtTenTheLoai5;
    private javax.swing.JTextField txtTentuaSach5;
    private com.toedter.calendar.JDateChooser txtngayDK1;
    private com.toedter.calendar.JDateChooser txtngayEndDK1;
    private javax.swing.JTextField txttheloai3;
    // End of variables declaration//GEN-END:variables
}
