import java.awt.EventQueue;

    import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

    import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

    public class LoginPage1 {

        private JFrame frame;
        private JTextField UserName;
        private JTextField Password;

        /**
        * Launch the application.
        */
        public static void main(String[] args) 
        {
            EventQueue.invokeLater(new Runnable() 
            {
                public void run() 
                {
                    try 
                    {
                        LoginPage1 window = new LoginPage1();
                        window.frame.setVisible(true);
                    } catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            });
        }

        /**
        * Create the application.
        */
        public LoginPage1() {
            initialize();
        }

        /**
        * Initialize the contents of the frame.
        */
        private void initialize() {
            frame = new JFrame();
            frame.setBounds(150, 150, 750, 405);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().setLayout(null);
            
            final JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setBounds(0, 0, 772, 364);
            frame.getContentPane().add(panel);
            panel.setLayout(null);
            
            JLabel lblLoginPage = new JLabel("Login Page");
            lblLoginPage.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblLoginPage.setBounds(192, 21, 115, 31);
            panel.add(lblLoginPage);
            
            JLabel lblUserName = new JLabel("User Name:");
            lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 16));
            lblUserName.setBounds(125, 95, 95, 14);
            panel.add(lblUserName);
                        
            UserName = new JTextField();
            UserName.setBounds(221, 89, 109, 20);
            panel.add(UserName);
            UserName.setColumns(10);
            
            JLabel lblPassword = new JLabel("Password:");
            lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
            lblPassword.setBounds(125, 135, 75, 14);
            panel.add(lblPassword);
           
            Password = new JTextField();
            Password.setBounds(221, 134, 109, 20);
            panel.add(Password);
            Password.setColumns(10);
          
            
            JButton btnLogin = new JButton("Login");
            btnLogin.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent arg0) {
                    if(UserName.getText().isEmpty() || Password.getText().isEmpty())
                    {
                      JOptionPane.showMessageDialog(null, "Please enter Username and Password."+"!");
                }
                    else if(UserName.getText().equals("admin") && Password.getText().equals("admin"))
                {
                    JOptionPane.showMessageDialog(null, "Login Successful." + "!");
    				panel.setVisible(false);			
    				MainP Main = new MainP();
    				Main.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password." + "!");     
                }
                }
        });
            btnLogin.setBounds(111, 207, 89, 23);
            panel.add(btnLogin);
            
            JLabel lblNewLabel = new JLabel("");
    		Image img = new ImageIcon(this.getClass().getResource("/ipayroll-logo-300x176.jpg")).getImage();
    		lblNewLabel.setIcon(new ImageIcon(img));
    		lblNewLabel.setBounds(370, 52, 328, 190);
    		panel.add(lblNewLabel);
    		
    		JLabel lblNewLabel_1 = new JLabel("");
    		Image img1 = new ImageIcon(this.getClass().getResource("/Welcome-Picture-.jpg")).getImage();
    		lblNewLabel_1.setIcon(new ImageIcon(img1));
    		lblNewLabel_1.setBounds(0, 0, 881, 412);
    		panel.add(lblNewLabel_1);
    
        }
    }