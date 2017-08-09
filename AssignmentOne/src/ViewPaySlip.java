import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;


public class ViewPaySlip extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPaySlip frame = new ViewPaySlip();
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
	public ViewPaySlip() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeId.setBounds(55, 56, 108, 28);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeName.setBounds(54, 85, 124, 28);
		contentPane.add(lblEmployeeName);
		
		JLabel lblJulySalarySlip = new JLabel("July Salary Slip");
		lblJulySalarySlip.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJulySalarySlip.setBounds(146, 11, 198, 34);
		contentPane.add(lblJulySalarySlip);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBasicSalary.setBounds(55, 163, 108, 23);
		contentPane.add(lblBasicSalary);
		
		JLabel lblConveyanceAllowance = new JLabel("Conveyance Allowance");
		lblConveyanceAllowance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConveyanceAllowance.setBounds(55, 193, 171, 23);
		contentPane.add(lblConveyanceAllowance);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInsurance.setBounds(55, 255, 109, 23);
		contentPane.add(lblInsurance);
		
		JLabel lblNetSalary = new JLabel("Net Salary");
		lblNetSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNetSalary.setBounds(55, 284, 109, 23);
		contentPane.add(lblNetSalary);
		
		JLabel lblGrossSalary = new JLabel("Gross Salary");
		lblGrossSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrossSalary.setBounds(54, 307, 109, 23);
		contentPane.add(lblGrossSalary);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(55, 124, 108, 28);
		contentPane.add(lblDepartment);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk.setBounds(174, 404, 89, 28);
		contentPane.add(btnOk);
		
		textField = new JTextField();
		textField.setBounds(282, 91, 109, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(282, 124, 109, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(282, 161, 109, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(282, 193, 109, 23);
		contentPane.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(282, 258, 109, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(282, 292, 109, 28);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(282, 331, 109, 23);
		contentPane.add(textField_7);
		
		JLabel lblNoOfWorking = new JLabel("No. of Working Days");
		lblNoOfWorking.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNoOfWorking.setBounds(55, 337, 162, 20);
		contentPane.add(lblNoOfWorking);
		
		JLabel lblLossOfPay = new JLabel("Loss of Pay");
		lblLossOfPay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLossOfPay.setBounds(55, 362, 98, 28);
		contentPane.add(lblLossOfPay);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(282, 360, 109, 23);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(282, 61, 109, 23);
		contentPane.add(textField_9);
	}
}
