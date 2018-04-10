package baitap5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class main {

	private JFrame frame;
	private JTextField tfNhap;
	private JTextField tfXuat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNhap = new JLabel("Nh\u1EADp chu\u1ED7i ch\u1EEF:");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap.setBounds(12, 60, 112, 24);
		frame.getContentPane().add(lblNhap);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap.setBounds(145, 59, 164, 28);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		
		
		JLabel lblChuHoa = new JLabel("Chu\u1ED7i ch\u1EEF th\u01B0\u1EDDng l\u00E0:");
		lblChuHoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChuHoa.setBounds(10, 125, 146, 24);
		frame.getContentPane().add(lblChuHoa);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat.setBounds(145, 124, 164, 28);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		JButton btnChuyen = new JButton("Chuy\u1EC3n");
		btnChuyen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nhap=tfNhap.getText();
				String thuong=nhap.toLowerCase();
				tfXuat.setText(thuong);
			}
		});
		btnChuyen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChuyen.setBounds(312, 82, 112, 44);
		frame.getContentPane().add(btnChuyen);
	}

}