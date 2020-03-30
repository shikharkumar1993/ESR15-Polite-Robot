package thepoliteRoboteng;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class level4meal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level4meal frame = new level4meal();
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
	public level4meal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JLabel question = new JLabel("Would be happy to know ");
		question.setForeground(new Color(0, 0, 153));
		question.setFont(new Font("Tahoma", Font.BOLD, 90));
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(0, 0, 1342, 102);
		contentPane.add(question);
		
		JButton meat = new JButton("Meat");
		meat.setFocusable(false);
		meat.setForeground(new Color(0, 102, 153));
		meat.setFont(new Font("Tahoma", Font.BOLD, 60));
		meat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.firstChoice = "meat";
				setTable set = new setTable();
				set.setVisible(true);
				ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
						try {
							myClient.sendM(2); //connect to server and send '2' for meat
						} catch (Exception e) {
							e.printStackTrace();
						} 
						
						System.out.println ("finish ros set table - red");
						level4end obj = new level4end();
						obj.setVisible(true);
					}
				};
				Timer timer = new Timer(500, listener);
				timer.setRepeats(false);
				timer.start();	
			}
		});
		meat.setBounds(765, 346, 425, 87);
		contentPane.add(meat);
		
		JButton diary = new JButton("Dairy");
		diary.setFocusable(false);
		diary.setForeground(new Color(0, 102, 153));
		diary.setFont(new Font("Tahoma", Font.BOLD, 60));
		diary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.firstChoice = "dairy";
				setTable set = new setTable();
				set.setVisible(true);
				
				 ActionListener listener = new ActionListener(){
				        public void actionPerformed(ActionEvent event){
							try {
								myClient.sendM(1); //connect to server and send '1' for dairy
							} catch (Exception e) {
								e.printStackTrace();
							} 
							System.out.println ("finish ros set table - blue");
							level4end obj = new level4end();
							obj.setVisible(true);
				        }
				    };
				    Timer timer = new Timer(500, listener);
				    timer.setRepeats(false);
				    timer.start();
				
			}
		});
		diary.setBounds(765, 476, 425, 87);
		contentPane.add(diary);
		
		JButton nevermind = new JButton("\r\nI do not care");
		nevermind.setFocusable(false);
		nevermind.setForeground(new Color(0, 102, 153));
		nevermind.setFont(new Font("Tahoma", Font.BOLD, 60));
		nevermind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
							level4end obj = new level4end();
							obj.setVisible(true);
				        }
				    };
				    Timer timer = new Timer(500, listener);
				    timer.setRepeats(false);
				    timer.start();
				
			}
		});
		nevermind.setBounds(765, 600, 425, 87);
		contentPane.add(nevermind);
		
		JLabel lblWhatKindOf = new JLabel("what kind of meal to set ");
		lblWhatKindOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatKindOf.setForeground(new Color(0, 0, 153));
		lblWhatKindOf.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblWhatKindOf.setBounds(0, 108, 1352, 102);
		contentPane.add(lblWhatKindOf);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(115, 281, 512, 379);
		Image img = new ImageIcon(this.getClass().getResource("/setTable.jpg")).getImage() ;
		imageLabel.setIcon(new ImageIcon (img));
		contentPane.add(imageLabel);
		
		JLabel lblNewLabel = new JLabel("on the table?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setBounds(666, 205, 603, 80);
		contentPane.add(lblNewLabel);
	}
}
