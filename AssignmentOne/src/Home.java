import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(243, 0, 219, 50);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAboutUs = new JTextArea();
		txtrAboutUs.setBackground(new Color(211, 211, 211));
		txtrAboutUs.setFont(new Font("Elephant", Font.PLAIN, 12));
		txtrAboutUs.setText("About Us : IPayroll is an application of New Zealand government comapany which provide Breif information of employees along with their Wages details.");
		txtrAboutUs.setLineWrap(true);
		txtrAboutUs.setWrapStyleWord(true);
		txtrAboutUs.setBounds(10, 85, 250, 237);
		contentPane.add(txtrAboutUs);
		
		JLabel label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Employee.jpg")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(270, 30, 419, 390);
		contentPane.add(label);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);			
				ContactUs contact = new ContactUs();
				contact.setVisible(true);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(92, 338, 97, 33);
		contentPane.add(btnNext);
	}
}
