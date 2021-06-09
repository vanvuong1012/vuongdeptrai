package ui;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import dao.NhanVien_DAO;
import entity.NhanVien;

public class GD_QuanLyNV extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
	private DefaultTableModel modelNV;

	public GD_QuanLyNV() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		 
		jScrollPane1 = new javax.swing.JScrollPane();
		tblNV = new javax.swing.JTable();
		pn2 = new javax.swing.JPanel();
		btnQLNV = new javax.swing.JButton();
		btnQLPB = new javax.swing.JButton();
		btnQLCT = new javax.swing.JButton();
		pn3 = new javax.swing.JPanel();
		lblTuoi = new javax.swing.JLabel();
		txtTenNV = new javax.swing.JTextField();
		lblSDT = new javax.swing.JLabel();
		cbbCT = new javax.swing.JComboBox<>();
		lblPB = new javax.swing.JLabel();
		txtMaNV = new javax.swing.JTextField();
		cbbPB = new javax.swing.JComboBox<>();
		lblCT = new javax.swing.JLabel();
		lblGT = new javax.swing.JLabel();
		lblMaNV = new javax.swing.JLabel();
		RbtnNam = new javax.swing.JRadioButton();
		RbtnNu = new javax.swing.JRadioButton();
		lblTenNV = new javax.swing.JLabel();
		lblDiaChi = new javax.swing.JLabel();
		txtDiaChi = new javax.swing.JTextField();
		cbbTuoi = new javax.swing.JComboBox<>();
		lblThemNV = new javax.swing.JLabel();
		lblTimNV = new javax.swing.JLabel();
		btnTim = new javax.swing.JButton();
		txtTimKiem = new javax.swing.JTextField();
		lblTimTen = new javax.swing.JLabel();
		lblTimPB = new javax.swing.JLabel();
		cbbTKPB = new javax.swing.JComboBox<>();
		cbbTKCT = new javax.swing.JComboBox<>();
		lblTimCT = new javax.swing.JLabel();
		btnLuu = new javax.swing.JButton();
		btnXoa = new javax.swing.JButton();
		btnCapNhat = new javax.swing.JButton();
		btnXoaTrang = new javax.swing.JButton();
		txtSDT = new javax.swing.JTextField();
		lblCMND = new javax.swing.JLabel();
		txtCMND = new javax.swing.JTextField();
		pn1 = new javax.swing.JPanel();
		btnBack = new javax.swing.JButton();
		btnTTCN = new javax.swing.JButton();
		
		DocDuLieuDatabaseVaoTable();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		tblNV.setModel(new javax.swing.table.DefaultTableModel(
//				new Object[][] {
//						{ "1", "123", "Nguyễn Văn Vương", "10-12-2000", null, "213213414", "CEO",
//								"36 Lý Thường Kiệt, Phường 7, Gò Vấp, tp.Hồ Chí Minh", "Nhân Sự" },
//						{ "2", "Lê Quang Nhật", "0388489433", "123456785", "Nam", null, "1999",
//								"36 Lý Thường Kiệt, Phường 7, Gò Vấp, tp.Hồ Chí Minh", "Marketing", "CT012" },
//						{ "3", "Nguyễn Thế Hậu", "097745685", "123456123", "Nam", null, "2000",
//								"36 Lý Thường Kiệt, Phường 7, Gò Vấp, tp.Hồ Chí Minh", "Nhân sự", "CT456" },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null },
//						{ null, null, null, null, null, null, null, null, null, null } },
				new String[] { "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính ",
						"Số CMND", "Chức Vụ", "Địa Chỉ", "Số Điện Thoại", "Phòng Ban"}) }
			/**
			 * 
			 */
			
			private static final long serialVersionUID = 1L;
			Class[] types = new Class[] { java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
					java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class,
					java.lang.Object.class, java.lang.Object.class, java.lang.Object.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tblNV);

		pn2.setBackground(new java.awt.Color(255, 255, 224));

		btnQLNV.setText("QUẢN LÝ NHÂN VIÊN");

		btnQLPB.setText("QUẢN LÝ PHÒNG BAN");

		btnQLCT.setText("QUẢN LÝ CÔNG TRÌNH");

		javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
		pn2.setLayout(pn2Layout);
		pn2Layout.setHorizontalGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn2Layout.createSequentialGroup().addContainerGap()
						.addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnQLNV, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnQLPB, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnQLCT, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
						.addContainerGap()));
		pn2Layout.setVerticalGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(btnQLPB, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(btnQLCT, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(81, 81, 81)));

		pn3.setBackground(new java.awt.Color(255, 255, 224));

		lblTuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblTuoi.setText("Tuổi:");

		txtTenNV.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTenNVActionPerformed(evt);
			}
		});

		lblSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblSDT.setText("Số Điện Thoại:");

		cbbCT.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "Nhân sự", "Quản lý", "Kế Toán" }));
		cbbCT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbbCTActionPerformed(evt);
			}
		});

		lblPB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblPB.setText("Phòng Ban:");

		cbbPB.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "Nhân sự", "Quản lý", "Kế Toán" }));

		lblCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblCT.setText("Công trình:");

		lblGT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblGT.setText("Giới Tính:");

		lblMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblMaNV.setText("Mã Nhân Viên:");

		RbtnNam.setText("Nam");

		RbtnNu.setText("Nữ");

		lblTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblTenNV.setText("Họ Và Tên:");

		lblDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblDiaChi.setText("Địa Chỉ:");

		cbbTuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016",
				"2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006" }));
		cbbTuoi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbbTuoiActionPerformed(evt);
			}
		});

		lblThemNV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		lblThemNV.setText("THÊM NHÂN VIÊN");

		lblTimNV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		lblTimNV.setText("TÌM KIẾM NHÂN VIÊN");

		btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btnTim.setText("TÌM KIẾM");
		btnTim.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTimActionPerformed(evt);
			}
		});

		txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTimKiemActionPerformed(evt);
			}
		});

		lblTimTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblTimTen.setText("Tên:");

		lblTimPB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblTimPB.setText("Phòng ban:");

		cbbTKPB.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "Nhân sự", "Quản lý", "Kế Toán" }));
		cbbTKPB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbbTKPBActionPerformed(evt);
			}
		});

		cbbTKCT.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Project 1", "project 2", "project 3" }));
		cbbTKCT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbbTKCTActionPerformed(evt);
			}
		});

		lblTimCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblTimCT.setText("Công trình:");

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

		lblCMND.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblCMND.setText("Số CMND:");

		txtCMND.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCMNDActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
		pn3.setLayout(pn3Layout);
		pn3Layout.setHorizontalGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn3Layout.createSequentialGroup().addGroup(pn3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pn3Layout.createSequentialGroup().addGap(34, 34, 34).addGroup(pn3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pn3Layout.createSequentialGroup().addGroup(pn3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout
												.createSequentialGroup().addComponent(lblCMND).addGap(42, 42, 42)
												.addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 281,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(pn3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblDiaChi).addComponent(lblSDT))
												.addGap(18, 18, 18))
										.addGroup(pn3Layout.createSequentialGroup().addGroup(pn3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(pn3Layout.createSequentialGroup().addGap(108, 108, 108)
														.addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE,
																280, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(lblMaNV)
												.addGroup(pn3Layout.createSequentialGroup().addComponent(lblPB)
														.addGap(35, 35, 35).addComponent(cbbPB,
																javax.swing.GroupLayout.PREFERRED_SIZE, 157,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGap(159, 159, 159)
												.addGroup(pn3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblCT).addComponent(lblTuoi))
												.addGap(41, 41, 41)))
										.addGroup(pn3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 280,
														Short.MAX_VALUE)
												.addComponent(txtDiaChi).addComponent(cbbCT, 0, 280, Short.MAX_VALUE)
												.addComponent(cbbTuoi, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)))
								.addGroup(pn3Layout.createSequentialGroup()
										.addGroup(
												pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblTenNV).addComponent(lblGT))
										.addGap(58, 58, 58).addComponent(RbtnNam).addGap(41, 41, 41)
										.addComponent(RbtnNu))
								.addGroup(pn3Layout.createSequentialGroup()
										.addGroup(
												pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblTimPB).addComponent(lblTimTen))
										.addGap(33, 33, 33)
										.addGroup(pn3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(pn3Layout.createSequentialGroup()
														.addComponent(cbbTKPB, javax.swing.GroupLayout.PREFERRED_SIZE,
																151, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblTimCT)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(cbbTKCT, javax.swing.GroupLayout.PREFERRED_SIZE,
																151, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 442,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(16, 16, 16).addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE,
												116, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(pn3Layout.createSequentialGroup().addGap(142, 142, 142).addComponent(txtTenNV,
								javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(pn3Layout.createSequentialGroup().addGap(389, 389, 389).addComponent(lblThemNV))
						.addGroup(
								pn3Layout.createSequentialGroup().addGap(176, 176, 176)
										.addGroup(pn3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(lblTimNV)
												.addGroup(pn3Layout.createSequentialGroup()
														.addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE,
																115, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(61, 61, 61)
														.addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE,
																120, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(57, 57, 57).addComponent(btnCapNhat,
																javax.swing.GroupLayout.PREFERRED_SIZE, 106,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(64, 64, 64).addComponent(btnXoaTrang)))
						.addContainerGap(74, Short.MAX_VALUE)));
		pn3Layout.setVerticalGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn3Layout.createSequentialGroup().addGroup(pn3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										pn3Layout.createSequentialGroup().addContainerGap().addComponent(lblPB))
								.addGroup(pn3Layout.createSequentialGroup().addGap(81, 81, 81)
										.addGroup(pn3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(cbbPB, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(cbbCT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCT))))
						.addGroup(pn3Layout.createSequentialGroup().addContainerGap().addComponent(lblThemNV)))
						.addGap(23, 23, 23)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMaNV)
								.addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTuoi).addComponent(cbbTuoi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblSDT, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblTenNV)
										.addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblDiaChi)
								.addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCMND).addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(RbtnNam).addComponent(RbtnNu).addComponent(lblGT))
						.addGap(18, 18, 18)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18).addComponent(lblTimNV).addGap(32, 32, 32)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cbbTKCT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTimPB, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTimCT, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbbTKPB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTimTen, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTim))
						.addContainerGap(22, Short.MAX_VALUE)));

		pn1.setBackground(new java.awt.Color(44, 62, 80));

		btnBack.setText("BACK");

		btnTTCN.setText("THÔNG TIN CÁ NHÂN");

		javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
		pn1.setLayout(pn1Layout);
		pn1Layout.setHorizontalGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn1Layout.createSequentialGroup().addContainerGap()
						.addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(btnTTCN, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(16, Short.MAX_VALUE)));
		pn1Layout.setVerticalGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn1Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTTCN, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 1475, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
								.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(pn3,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 1455,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 818, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pn2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));

		pack();
	}// </editor-fold>

	private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void cbbCTActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void cbbTuoiActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void cbbTKPBActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void cbbTKCTActionPerformed(java.awt.event.ActionEvent evt) {
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

	private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	
	private void DocDuLieuDatabaseVaoTable() {
		List<NhanVien> list = nhanVien_DAO.getallNhanVien();
		for (NhanVien nv : list) {
//			modelNV.addRow(new Object[] { nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getNgaySinh(), nv.isGioiTinh() ? "Nam" : "Nữ",
//					nv.getSoCMND(), nv.getChucVu().getTenChucVu(), nv.getDiaChi(), nv.getSoDT(), nv.getPhongBan().getMaPhongBan()});
//		modelNV.addRow(nv.toString().split(";"));
		System.out.println(nv);
		}
		
	}

	
	
	/**
	 * @param args the command line arguments
	 */
//	private void DocDuLieuDatabaseVaoTable1() {
//		List<NhanVien> list=nhanVien_DAO.getallNhanVien();
//		for(NhanVien nv:list) {
//			modelNV.addRow(new Object[] {nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getNgaySinh(), nv.isGioiTinh() ? "Nam" : "Nu", nv.getSoCMND(),
//					nv.getChucVu(), nv.getSoDT(), nv.getPhongBan()});
//		}
		
	
	public static void main(String args[]) {

		try {
			
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GD_QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GD_QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GD_QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GD_QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GD_QuanLyNV().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JRadioButton RbtnNam;
	private javax.swing.JRadioButton RbtnNu;
	private javax.swing.JButton btnBack;
	private javax.swing.JButton btnCapNhat;
	private javax.swing.JButton btnLuu;
	private javax.swing.JButton btnQLCT;
	private javax.swing.JButton btnQLNV;
	private javax.swing.JButton btnQLPB;
	private javax.swing.JButton btnTTCN;
	private javax.swing.JButton btnTim;
	private javax.swing.JButton btnXoa;
	private javax.swing.JButton btnXoaTrang;
	private javax.swing.JComboBox<String> cbbCT;
	private javax.swing.JComboBox<String> cbbPB;
	private javax.swing.JComboBox<String> cbbTKCT;
	private javax.swing.JComboBox<String> cbbTKPB;
	private javax.swing.JComboBox<String> cbbTuoi;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lblCMND;
	private javax.swing.JLabel lblCT;
	private javax.swing.JLabel lblDiaChi;
	private javax.swing.JLabel lblGT;
	private javax.swing.JLabel lblMaNV;
	private javax.swing.JLabel lblPB;
	private javax.swing.JLabel lblSDT;
	private javax.swing.JLabel lblTenNV;
	private javax.swing.JLabel lblThemNV;
	private javax.swing.JLabel lblTimCT;
	private javax.swing.JLabel lblTimNV;
	private javax.swing.JLabel lblTimPB;
	private javax.swing.JLabel lblTimTen;
	private javax.swing.JLabel lblTuoi;
	private javax.swing.JPanel pn1;
	private javax.swing.JPanel pn2;
	private javax.swing.JPanel pn3;
	private javax.swing.JTable tblNV;
	private javax.swing.JTextField txtCMND;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtMaNV;
	private javax.swing.JTextField txtSDT;
	private javax.swing.JTextField txtTenNV;
	private javax.swing.JTextField txtTimKiem;
	// End of variables declaration
}
