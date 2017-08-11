import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class MainP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainP frame = new MainP();
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
	public MainP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNext = new JButton("Get Started");
		btnNext.setHorizontalAlignment(SwingConstants.LEFT);
		btnNext.setForeground(new Color(0, 0, 0));
		btnNext.setBackground(new Color(255, 160, 122));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					contentPane.setVisible(false);			
					ContactUs contact = new ContactUs();
					contact.setVisible(true);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(243, 284, 124, 23);
		contentPane.add(btnNext);
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(112, 242, -92, 2);
		contentPane.add(textArea_1);
		
		JTextArea txtrAPayrollSystem = new JTextArea();
		txtrAPayrollSystem.setWrapStyleWord(true);
		txtrAPayrollSystem.setBackground(new Color(211, 211, 211));
		txtrAPayrollSystem.setFont(new Font("Elephant", Font.PLAIN, 12));
		txtrAPayrollSystem.setLineWrap(true);
		txtrAPayrollSystem.setText("A payroll system is software designed to organize  all the tasks of employee payment and the filing of employee taxes. These tasks can include keeping track of hours, calculating wages, withholding taxes and deductions, printing and delivering checks and paying employment taxes to the govt." +
				"" +
				"" +
				"                                                                                                                                               We are providing an employee information related to his/her wages and profile.");
		txtrAPayrollSystem.setBounds(33, 123, 542, 91);
		contentPane.add(txtrAPayrollSystem);
		
		JLabel label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Building.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(20, 65, 600, 365);
		contentPane.add(label);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home Home = new Home();
				Home.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setBounds(20, 28, 101, 37);
		contentPane.add(btnHome);
		
		JButton btnContactUs = new JButton("CONTACT US");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ContactUs contact = new ContactUs();
				contact.setVisible(true);
			}
		});
		btnContactUs.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnContactUs.setBounds(112, 28, 132, 37);
		contentPane.add(btnContactUs);
		
		JButton btnEmployeeDetails = new JButton("EMPLOYEE DETAILS");
		btnEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Employee_Details emp = new Employee_Details();
				emp.setVisible(true);
		}
		});
		btnEmployeeDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEmployeeDetails.setBounds(243, 28, 189, 35);
		contentPane.add(btnEmployeeDetails);
		
		JButton btnViewSalarySlip = new JButton("VIEW SALARY SLIP");
		btnViewSalarySlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewPaySlipp pay = new ViewPaySlipp();
				pay.setVisible(true);
			}
		});
		btnViewSalarySlip.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewSalarySlip.setBounds(427, 28, 178, 35);
		contentPane.add(btnViewSalarySlip);
	}
}
