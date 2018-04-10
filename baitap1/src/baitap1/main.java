package baitap1;

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
		
		JLabel lbNhap = new JLabel("Nh\u1EADp chu\u1ED7i");
		lbNhap.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbNhap.setBounds(10, 76, 149, 35);
		frame.getContentPane().add(lbNhap);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tfNhap.setBounds(134, 79, 158, 29);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		JButton btnDem = new JButton("\u0110\u1EBFm");
		btnDem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			String nhap=tfNhap.getText();
			int dem=0;
			for(int i=0;i<=nhap.length();i++) {
				dem=i;
			}
			String a=Integer.toString(dem);
			tfXuat.setText(a);
			}
		});
		
		btnDem.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDem.setBounds(335, 79, 89, 35);
		frame.getContentPane().add(btnDem);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tfXuat.setBounds(134, 126, 158, 29);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
	}
}
