import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.UIManager;


public class ContactUs extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs frame = new ContactUs();
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
	public ContactUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(123, 143, 138, -28);
		contentPane.add(lblNewLabel);
		Image img1 = new ImageIcon(this.getClass().getResource("/Building.png")).getImage();
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(423, 467, 89, -47);
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(535, 384, 107, 36);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);			
				Employee_Details emp = new Employee_Details();
				emp.setVisible(true);
			}
		});
		
		JTextArea txtrContactUsAt = new JTextArea();
		txtrContactUsAt.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrContactUsAt.setBackground(new Color(175, 238, 238));
		txtrContactUsAt.setToolTipText("");
		txtrContactUsAt.setWrapStyleWord(true);
		txtrContactUsAt.setLineWrap(true);
		txtrContactUsAt.setText("IPayroll NZ                                          Contact Us at :            IPayroll HR solutions     Fax : 02040 54 21         Mobile : 02045784112      Email : Hr@ipayroll.co.nz");
		txtrContactUsAt.setBounds(29, 159, 265, 187);
		contentPane.add(txtrContactUsAt);
		
		JLabel lblContactUs = new JLabel("CONTACT US");
		lblContactUs.setVerticalAlignment(SwingConstants.TOP);
		lblContactUs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContactUs.setBackground(new Color(192, 192, 192));
		lblContactUs.setBounds(196, 11, 178, 52);
		contentPane.add(lblContactUs);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(99, 74, 125, -12);
		contentPane.add(separator);
		
		JLabel label = new JLabel("-------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(41, 45, 518, 14);
		contentPane.add(label);
		
		JLabel lblWedLoveTo = new JLabel("We'd love to help!");
		lblWedLoveTo.setBackground(new Color(175, 238, 238));
		lblWedLoveTo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblWedLoveTo.setBounds(191, 74, 219, 27);
		contentPane.add(lblWedLoveTo);
		
		JLabel lblYouCanAlso = new JLabel("You can also reach us at ");
		lblYouCanAlso.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblYouCanAlso.setBackground(Color.LIGHT_GRAY);
		lblYouCanAlso.setBounds(347, 143, 178, 19);
		contentPane.add(lblYouCanAlso);
		
		JLabel lblImage = new JLabel("");
		Image img11 = new ImageIcon(this.getClass().getResource("/Facebook.png")).getImage();
		lblImage.setIcon(new ImageIcon(img11));
		lblImage.setBounds(335, 152, 224, 202);
		contentPane.add(lblImage);
			}
}
