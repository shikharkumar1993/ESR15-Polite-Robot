package thepoliteRoboteng;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class level4end extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level4end frame = new level4end();
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
	public level4end() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel question = new JLabel("Are you satisfied with the ");
		question.setForeground(new Color(0, 0, 153));
		question.setFont(new Font("Tahoma", Font.BOLD, 90));
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(0, 119, 1342, 99);
		contentPane.add(question);
		
		JButton yesB = new JButton("Yes");
		yesB.setFocusable(false);
		yesB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level4tnx obj = new level4tnx();
				obj.setVisible(true);
			}
		});
		yesB.setForeground(new Color(0, 102, 153));
		yesB.setFont(new Font("Tahoma", Font.BOLD, 65));
		yesB.setBounds(230, 327, 890, 149);
		contentPane.add(yesB);
		
		JButton noB = new JButton("No,\r\nI'd rather change a plate");
		noB.setFocusable(false);
		noB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
							level4tnx obj = new level4tnx();
							obj.setVisible(true);
						}
					};
					
					Timer timer = new Timer(500, listener);
					timer.setRepeats(false);
					timer.start();
				}
		});
		noB.setForeground(new Color(0, 102, 153));
		noB.setFont(new Font("Tahoma", Font.BOLD, 57));
		noB.setBounds(230, 532, 890, 157);
		contentPane.add(noB);
		
		JLabel lblIFinishedThe = new JLabel("I finished setting the table");
		lblIFinishedThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblIFinishedThe.setForeground(new Color(0, 0, 153));
		lblIFinishedThe.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblIFinishedThe.setBounds(0, 0, 1342, 137);
		contentPane.add(lblIFinishedThe);
		
		JLabel labelGood = new JLabel("");
		labelGood.setBounds(1150, 327, 157, 149);
		Image img = new ImageIcon(this.getClass().getResource("/goodSmily.PNG")).getImage() ;
		labelGood.setIcon(new ImageIcon (img));
		contentPane.add(labelGood);
		
		JLabel labelBad = new JLabel("");
		labelBad.setBounds(1137, 532, 157, 157);
		Image img2 = new ImageIcon(this.getClass().getResource("/badSmily.jpg")).getImage() ;
		labelBad.setIcon(new ImageIcon (img2));
		contentPane.add(labelBad);
		
		JLabel lblNewLabel = new JLabel("arrangement?");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblNewLabel.setBounds(361, 217, 679, 99);
		contentPane.add(lblNewLabel);
		
	}
}
