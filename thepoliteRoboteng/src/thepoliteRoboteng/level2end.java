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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class level2end extends JFrame {

	private JPanel contentPane;
	private JLabel question;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level2end frame = new level2end();
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
	public level2end() {
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
			public void actionPerformed(ActionEvent arg0) {
				chagePlate cp = new chagePlate();
				cp.setVisible(true);
				ActionListener listener = new ActionListener(){
			        public void actionPerformed(ActionEvent event){
			        	int i = 0 ;
						if (Main.firstChoice == "meat")
							i = 3 ;
						else
							i = 4 ; 
						System.out.println(i);
			        	try {
							myClient.sendM(i); //connect to server and send '3' to change for dairy, or '4' to change for meat
						} catch (Exception e2) {
							e2.printStackTrace();
						}
						System.out.println ("end switch plate");
						finish obj = new finish();
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
				finish obj = new finish();
				obj.setVisible(true);
			}
		});
		buttonYes.setBounds(770, 333, 404, 122);
		contentPane.add(buttonYes);
		
		question = new JLabel("Are you satisfied");
		question.setForeground(new Color(0, 0, 153));
		question.setFont(new Font("Tahoma", Font.BOLD, 90));
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(10, 31, 1332, 102);
		contentPane.add(question);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(115, 281, 512, 379);
		Image img = new ImageIcon(this.getClass().getResource("/setTable.jpg")).getImage() ;
		imageLabel.setIcon(new ImageIcon (img));
		contentPane.add(imageLabel);
		
		JLabel lblFromTheTable = new JLabel("\r\nfrom the table?");
		lblFromTheTable.setHorizontalAlignment(SwingConstants.CENTER);
		lblFromTheTable.setForeground(new Color(0, 0, 153));
		lblFromTheTable.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblFromTheTable.setBounds(10, 132, 1332, 102);
		contentPane.add(lblFromTheTable);
		

	}
}
