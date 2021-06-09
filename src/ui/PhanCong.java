package ui;




public class PhanCong extends javax.swing.JFrame {

    
    public PhanCong() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnTTCN = new javax.swing.JButton();
        pn_GDPhanCong = new javax.swing.JPanel();
        lblThemCT = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();
        lblTimPB = new javax.swing.JLabel();
        cbbTKPB = new javax.swing.JComboBox<>();
        lblTimMaNV = new javax.swing.JLabel();
        txtTimMaNV = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        lblTimTen = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        pn_PhanCV = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        lblChonCT = new javax.swing.JLabel();
        cbbCT = new javax.swing.JComboBox<>();
        lbl_CVNgoai = new javax.swing.JLabel();
        Rbtn_GSV = new javax.swing.JRadioButton();
        Rbtn_ChiHuyCT = new javax.swing.JRadioButton();
        Rbtn_NVThietKe = new javax.swing.JRadioButton();
        Rbtn_NVTuVan = new javax.swing.JRadioButton();
        Rbtn_NVXD = new javax.swing.JRadioButton();
        lbl_CVTrong = new javax.swing.JLabel();
        Rbtn_GSNB = new javax.swing.JRadioButton();
        Rbtn_QLCL = new javax.swing.JRadioButton();
        Rbtn_CVPTSP = new javax.swing.JRadioButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        lbl_PCCV = new javax.swing.JLabel();
        lbl_CVTrong1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMT = new javax.swing.JTextArea();
        lblStartDay = new javax.swing.JLabel();
        cbbNgayBD = new javax.swing.JComboBox<>();
        lblEndDay = new javax.swing.JLabel();
        cbbNgayKT = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn1.setBackground(new java.awt.Color(44, 62, 80));

        btnBack.setText("BACK");

        btnTTCN.setText("THÔNG TIN CÁ NHÂN");
        btnTTCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTCNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTTCN, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnTTCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_GDPhanCong.setBackground(new java.awt.Color(255, 255, 224));

        lblThemCT.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblThemCT.setText("PHÂN CÔNG NHÂN VIÊN");

        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "PC123", "Nguyễn Văn Vương", "HNV45621", "TICOS COFFE", "28/03/2020", "19/02/2021", "NV Xây Dựng", "Làm móng"},
                {"100", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Phân Công", "Tên Nhân Viên", "Mã Nhân Viên", "Tên Công Trình", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Công Việc", "Mô Tả"
            }
        ));
        jScrollPane2.setViewportView(tblQLNV);
        if (tblQLNV.getColumnModel().getColumnCount() > 0) {
            tblQLNV.getColumnModel().getColumn(0).setMinWidth(70);
            tblQLNV.getColumnModel().getColumn(0).setMaxWidth(70);
            tblQLNV.getColumnModel().getColumn(1).setMinWidth(90);
            tblQLNV.getColumnModel().getColumn(1).setMaxWidth(90);
            tblQLNV.getColumnModel().getColumn(3).setMinWidth(90);
            tblQLNV.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        lblTimPB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimPB.setText("Phòng Ban:");

        cbbTKPB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "Nhân sự", "Quản lý", "Kế Toán" }));
        cbbTKPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTKPBActionPerformed(evt);
            }
        });

        lblTimMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimMaNV.setText("Mã Nhân Viên:");

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        lblTimTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimTen.setText("Tên Nhân Viên:");

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTim.setText("TÌM KIẾM");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_GDPhanCongLayout = new javax.swing.GroupLayout(pn_GDPhanCong);
        pn_GDPhanCong.setLayout(pn_GDPhanCongLayout);
        pn_GDPhanCongLayout.setHorizontalGroup(
            pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_GDPhanCongLayout.createSequentialGroup()
                .addGroup(pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_GDPhanCongLayout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(lblThemCT))
                    .addGroup(pn_GDPhanCongLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTimPB)
                            .addComponent(lblTimTen))
                        .addGap(18, 18, 18)
                        .addGroup(pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_GDPhanCongLayout.createSequentialGroup()
                                .addComponent(cbbTKPB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lblTimMaNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(364, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        pn_GDPhanCongLayout.setVerticalGroup(
            pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_GDPhanCongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThemCT)
                .addGroup(pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_GDPhanCongLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTimPB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTKPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_GDPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTimTen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_GDPhanCongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_PhanCV.setBackground(new java.awt.Color(255, 255, 255));

        lblMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaNV.setText("Mã Nhân Viên:");

        lblTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenNV.setText("Họ Và Tên:");

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        lblChonCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChonCT.setText("Chọn Công Trình:");

        cbbCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn công trình", "TICOS Coffee", "VINCOM Gò Vấp", "AMA Villa" }));
        cbbCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCTActionPerformed(evt);
            }
        });

        lbl_CVNgoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_CVNgoai.setText("Công việc bên ngoài:");

        Rbtn_GSV.setText("Giám sát viên");

        Rbtn_ChiHuyCT.setText("Chỉ Huy CT");

        Rbtn_NVThietKe.setText("NV Thiết kế");

        Rbtn_NVTuVan.setText("NV Tư Vấn ");

        Rbtn_NVXD.setText("NV Xây dựng ");

        lbl_CVTrong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_CVTrong.setText("Công việc bên trong:");

        Rbtn_GSNB.setText("Giám sát  nội bộ");

        Rbtn_QLCL.setText("Quản lý chất lượng");
        Rbtn_QLCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_QLCLActionPerformed(evt);
            }
        });

        Rbtn_CVPTSP.setText("Chuyên viên Phát triển SP");

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLuu.setText("Lưu");

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoaTrang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoaTrang.setText("Xóa trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        lbl_PCCV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PCCV.setForeground(new java.awt.Color(205, 85, 85));
        lbl_PCCV.setText("--PHÂN CÔNG CÔNG VIỆC--");

        lbl_CVTrong1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_CVTrong1.setText("Mô Tả:");

        txtMT.setColumns(20);
        txtMT.setRows(5);
        jScrollPane1.setViewportView(txtMT);

        lblStartDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStartDay.setText("Ngày Bắt Đầu:");

        cbbNgayBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020" }));
        cbbNgayBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNgayBDActionPerformed(evt);
            }
        });

        lblEndDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEndDay.setText("Ngày Kết Thúc:");

        cbbNgayKT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020" }));
        cbbNgayKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNgayKTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_PhanCVLayout = new javax.swing.GroupLayout(pn_PhanCV);
        pn_PhanCV.setLayout(pn_PhanCVLayout);
        pn_PhanCVLayout.setHorizontalGroup(
            pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_PhanCVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaNV)
                    .addComponent(lblTenNV)
                    .addGroup(pn_PhanCVLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_PhanCVLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_PhanCVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_PhanCVLayout.createSequentialGroup()
                        .addComponent(lbl_CVTrong)
                        .addGap(19, 19, 19)
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rbtn_CVPTSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Rbtn_GSNB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Rbtn_QLCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pn_PhanCVLayout.createSequentialGroup()
                            .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_CVNgoai)
                                .addComponent(lblChonCT))
                            .addGap(18, 18, 18)
                            .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbbCT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_PhanCVLayout.createSequentialGroup()
                                    .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Rbtn_ChiHuyCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Rbtn_NVThietKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Rbtn_NVXD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rbtn_NVTuVan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rbtn_GSV, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_PhanCVLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_PCCV)
                            .addGap(72, 72, 72)))
                    .addGroup(pn_PhanCVLayout.createSequentialGroup()
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartDay)
                            .addComponent(lblEndDay))
                        .addGap(54, 54, 54)
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_PhanCVLayout.createSequentialGroup()
                        .addComponent(lbl_CVTrong1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_PhanCVLayout.setVerticalGroup(
            pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_PhanCVLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNV)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_PCCV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChonCT)
                    .addComponent(cbbCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CVNgoai)
                    .addGroup(pn_PhanCVLayout.createSequentialGroup()
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rbtn_ChiHuyCT)
                            .addComponent(Rbtn_GSV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rbtn_NVThietKe)
                            .addComponent(Rbtn_NVTuVan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rbtn_NVXD)))
                .addGap(18, 18, 18)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rbtn_GSNB)
                    .addComponent(lbl_CVTrong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_QLCL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_CVPTSP)
                .addGap(18, 18, 18)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDay)
                    .addComponent(cbbNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndDay)
                    .addComponent(cbbNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CVTrong1))
                .addGap(52, 52, 52)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_PhanCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_PhanCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_GDPhanCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_PhanCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pn_GDPhanCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnTTCNActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cbbTKPBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void cbbCTActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void Rbtn_QLCLActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void cbbNgayBDActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void cbbNgayKTActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhanCong().setVisible(true);
            }
        });
    }

                        
    private javax.swing.JRadioButton Rbtn_CVPTSP;
    private javax.swing.JRadioButton Rbtn_ChiHuyCT;
    private javax.swing.JRadioButton Rbtn_GSNB;
    private javax.swing.JRadioButton Rbtn_GSV;
    private javax.swing.JRadioButton Rbtn_NVThietKe;
    private javax.swing.JRadioButton Rbtn_NVTuVan;
    private javax.swing.JRadioButton Rbtn_NVXD;
    private javax.swing.JRadioButton Rbtn_QLCL;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnTTCN;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cbbCT;
    private javax.swing.JComboBox<String> cbbNgayBD;
    private javax.swing.JComboBox<String> cbbNgayKT;
    private javax.swing.JComboBox<String> cbbTKPB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChonCT;
    private javax.swing.JLabel lblEndDay;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblStartDay;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblThemCT;
    private javax.swing.JLabel lblTimMaNV;
    private javax.swing.JLabel lblTimPB;
    private javax.swing.JLabel lblTimTen;
    private javax.swing.JLabel lbl_CVNgoai;
    private javax.swing.JLabel lbl_CVTrong;
    private javax.swing.JLabel lbl_CVTrong1;
    private javax.swing.JLabel lbl_PCCV;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn_GDPhanCong;
    private javax.swing.JPanel pn_PhanCV;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextArea txtMT;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimMaNV;
    // End of variables declaration                   
}
