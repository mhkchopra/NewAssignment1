import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee_Details extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Details frame = new Employee_Details();
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
	public Employee_Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 488);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeDetails = new JLabel("EMPLOYEE DETAILS");
		lblEmployeeDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmployeeDetails.setBounds(168, 11, 269, 29);
		contentPane.add(lblEmployeeDetails);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeId.setBackground(new Color(192, 192, 192));
		lblEmployeeId.setBounds(26, 67, 123, 19);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee First Name");
		lblEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeName.setBackground(new Color(192, 192, 192));
		lblEmployeeName.setBounds(26, 109, 170, 19);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailId.setBounds(26, 197, 76, 19);
		contentPane.add(lblEmailId);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(26, 237, 76, 19);
		contentPane.add(lblAddress);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesignation.setBounds(26, 288, 110, 19);
		contentPane.add(lblDesignation);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(26, 328, 110, 19);
		contentPane.add(lblDepartment);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			}
		});
		btnOk.setBounds(107, 391, 89, 29);
		contentPane.add(btnOk);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);			
				ContactUs Cus = new ContactUs();
				Cus.setVisible(true);
			}
		});
		btnNext.setBounds(317, 391, 89, 29);
		contentPane.add(btnNext);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(249, 106, 157, 29);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(249, 194, 157, 29);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(249, 285, 157, 29);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(249, 234, 157, 29);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(249, 325, 157, 29);
		contentPane.add(textArea_5);
		
		JLabel lblEmployeeLastName = new JLabel("Employee Last Name");
		lblEmployeeLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeLastName.setBounds(26, 153, 157, 19);
		contentPane.add(lblEmployeeLastName);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(249, 146, 157, 29);
		contentPane.add(textArea_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(249, 66, 157, 29);
		contentPane.add(textArea);
		
		JLabel lblNew = new JLabel("New ");
		lblNew.setBounds(442, 64, 170, 290);
		contentPane.add(lblNew);
		
		
	}
}
