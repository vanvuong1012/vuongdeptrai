package ui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import connectDB.ConnectDB;
//import ui.FrameMain;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class GD_DangNhap extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Username;
	private JPasswordField txt_PassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_DangNhap frame = new GD_DangNhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the frame.
	 */
	public GD_DangNhap() {
		setTitle("Đây Là Đăng Nhập");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(420, 150, 525, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 5, 5));
		contentPane.setBackground(new java.awt.Color(255,255,224));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon = new ImageIcon("image/BCnhanvien.png");
		JLabel lblnewimg = new JLabel(icon);
		lblnewimg.setBounds(0, -50, 190, 340);
		contentPane.add(lblnewimg);		
		
		JLabel lblLog = new JLabel("Đăng Nhập");
		lblLog.setFont(new Font("Arial", Font.BOLD, 32));
		lblLog.setBounds(170, 15, 226, 50);
		contentPane.add(lblLog);
		
		JLabel lblUsername = new JLabel("TK:");
		lblUsername.setBounds(195, 105, 27, 20);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("MK:");
		lblPassword.setBounds(195, 150, 27, 14);
		contentPane.add(lblPassword);
		
		txt_Username = new JTextField();
		txt_Username.setBounds(225, 105, 150, 20);
		contentPane.add(txt_Username);
		txt_Username.setColumns(10);
		
		txt_PassWord = new JPasswordField();
		txt_PassWord.setBounds(225, 148, 150, 20);
		contentPane.add(txt_PassWord);
		txt_PassWord.setColumns(10);
		
		JButton btn_Login = new JButton("Login");

		btn_Login.setBounds(80, 258, 103, 23);
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evenLogin();
			}
			
		});
		btn_Login.setBounds(400, 95, 100, 85);
		contentPane.add(btn_Login);
		
//		JButton btn_Exit = new JButton("ThoÃ¡t ");
//		btn_Exit.setBounds(249, 159, 105, 23);
//		btn_Exit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				int hoi = JOptionPane.showConfirmDialog(null,"Báº¡n cÃ³ muá»‘n thoÃ¡t khÃ´ng?",null,JOptionPane.YES_NO_OPTION);
//				if(hoi ==JOptionPane.YES_NO_OPTION){
//					System.exit(0);
//				}
//			}
//		});
//		btn_Exit.setBounds(400, 165, 100, 35);
//		contentPane.add(btn_Exit);
	}
	public void evenLogin(){
		String user_Name =txt_Username.getText().trim();
		String passWord= txt_PassWord.getText().trim();
		String sql = "SELECT *FROM tbl_TaiKhoan WHERE tenTaiKhoan='"+user_Name+"' AND matKhau='"+passWord+"'";
		try {
			ResultSet rs = ConnectDB.executeQuery(sql);
			GD_Chinh gd_Chinh = new GD_Chinh();
			GD_DangNhap frame_Login = new GD_DangNhap();
				while(rs.next()){

					
					frame_Login.setVisible(false);
//					frame.setVisible(true);
					setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
					frame_Login.disable();
					frame_Login.dispose();
					dispose();
					setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
					JOptionPane.showMessageDialog(null,"Đăng Nhập Thành Công!!!");
					return;
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"Sai Tài Khoản Hoặc Mật Khẩu !!!  Vui Lòng Thử Lại!");
	}
}
