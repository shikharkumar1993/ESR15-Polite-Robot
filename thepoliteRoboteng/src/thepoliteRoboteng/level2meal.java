package thepoliteRoboteng;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class level2meal extends JFrame {
 
 	private JPanel contentPane;
	private JLabel question;
	private JLabel lblMeatMealUtensils;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level2meal frame = new level2meal();
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
	public level2meal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonNo = new JButton("No");
		buttonNo.setFocusable(false);
		buttonNo.setForeground(new Color(0, 102, 153));
		buttonNo.setFont(new Font("Tahoma", Font.BOLD, 65));
		buttonNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.firstChoice = "dairy";
				setTable set = new setTable();
				set.setVisible(true);				
				 ActionListener listener = new ActionListener(){
				        public void actionPerformed(ActionEvent event){
							try {
								myClient.sendM(1); //connect to server and send '1'
							} catch (Exception e) {
								e.printStackTrace();
							} 
							
							System.out.println ("finish ros set table - blue");
							level2end obj = new level2end();
							obj.setVisible(true);
				        }
				    };
				    Timer timer = new Timer(500, listener);
				    timer.setRepeats(false);
				    timer.start();

			}
		});
		buttonNo.setBounds(770, 503, 404, 122);
		contentPane.add(buttonNo);
		
		JButton buttonYes = new JButton("Yes");
		buttonYes.setFocusable(false);
		buttonYes.setForeground(new Color(0, 102, 153));
		buttonYes.setFont(new Font("Tahoma", Font.BOLD, 65));
		buttonYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.firstChoice = "meat";
				setTable set = new setTable();
				set.setVisible(true);
				 ActionListener listener = new ActionListener(){
				        public void actionPerformed(ActionEvent event){
							try {
								myClient.sendM(2); //connect to server and send '2'
							} catch (Exception e) {
								e.printStackTrace();
							} 
							
							System.out.println ("finish ros set table - red");
							level2end obj = new level2end();
							obj.setVisible(true);
				        }
				 };
			     Timer timer = new Timer(500, listener);
				 timer.setRepeats(false);
			     timer.start();
			}
		});
		buttonYes.setBounds(770, 333, 404, 122);
		contentPane.add(buttonYes);
		
		question = new JLabel("Do you want to use");
		question.setForeground(new Color(0, 0, 153));
		question.setFont(new Font("Tahoma", Font.BOLD, 90));
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(10, 11, 1332, 88);
		contentPane.add(question);
		
		lblMeatMealUtensils = new JLabel("meat meal utensils?");
		lblMeatMealUtensils.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeatMealUtensils.setForeground(new Color(0, 0, 153));
		lblMeatMealUtensils.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblMeatMealUtensils.setBounds(10, 132, 1332, 89);
		contentPane.add(lblMeatMealUtensils);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(115, 281, 512, 379);
		Image img = new ImageIcon(this.getClass().getResource("/setTable.jpg")).getImage() ;
		imageLabel.setIcon(new ImageIcon (img));
		contentPane.add(imageLabel);
		
	}

}
