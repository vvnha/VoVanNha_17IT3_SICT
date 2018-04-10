package baitap10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;

public class main {

	private JFrame frame;
	private JTextField tfDate;

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
		
		JLabel lblDate = new JLabel("Ng\u00E0y th\u00E1ng gi\u1EDD ");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(152, 31, 112, 45);
		frame.getContentPane().add(lblDate);
		
		tfDate = new JTextField();
		tfDate.setBounds(85, 77, 248, 34);
		frame.getContentPane().add(tfDate);
		tfDate.setColumns(10);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Date date= new Date();
				tfDate.setText(date.toString());
			}			
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClick.setBounds(148, 122, 127, 27);
		frame.getContentPane().add(btnClick);
	}

}
