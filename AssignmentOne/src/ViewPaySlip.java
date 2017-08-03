import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


public class ViewPaySlip extends JFrame {

	private JPanel contentPane;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(56, 117, 108, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(55, 142, 87, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblJulySalarySlip = new JLabel("July Salary Slip");
		lblJulySalarySlip.setBounds(131, 58, 198, 34);
		contentPane.add(lblJulySalarySlip);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setBounds(55, 193, 87, 14);
		contentPane.add(lblBasicSalary);
		
		JLabel lblConveyanceAllowance = new JLabel("Conveyance Allowance");
		lblConveyanceAllowance.setBounds(56, 218, 137, 14);
		contentPane.add(lblConveyanceAllowance);
		
		JLabel lblBasicPay = new JLabel("Basic Pay");
		lblBasicPay.setBounds(56, 247, 109, 14);
		contentPane.add(lblBasicPay);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(56, 278, 109, 14);
		contentPane.add(lblInsurance);
		
		JLabel lblNetSalary = new JLabel("Net Salary");
		lblNetSalary.setBounds(55, 303, 109, 14);
		contentPane.add(lblNetSalary);
		
		JLabel lblGrossSalary = new JLabel("Gross Salary");
		lblGrossSalary.setBounds(55, 328, 109, 14);
		contentPane.add(lblGrossSalary);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(55, 167, 87, 14);
		contentPane.add(lblDepartment);
	}

}
