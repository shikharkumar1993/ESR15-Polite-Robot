package thepoliteRoboteng;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class level2start extends JFrame {

	private JPanel contentPane;
	private JLabel stoper;
	private JLabel question;
	private JLabel lblSettingUpThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level2start frame = new level2start();
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
	public level2start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		stoper = new JLabel("");
		stoper.setFont(new Font("Tahoma", Font.PLAIN, 50));
		stoper.setName("stopper");
		stoper.setBounds(172, 283, 102, 61);
		contentPane.add(stoper);
		stoper.setVisible(false);
		
		
		JButton buttonNo = new JButton("No");
		buttonNo.setFocusable(false);
		buttonNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stoper.setVisible(true);
				buttonNo.setEnabled(false);
				Timer timer = new Timer(1000, new ActionListener() {
				    private int count = 60;
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        if (count <= 0) {
				        	stoper.setVisible(false);
				            ((Timer)e.getSource()).stop();
				            count = 60;
				            buttonNo.setEnabled(true);
				        } else {
				            stoper.setText(Integer.toString(count));
				            count--;
				        }
				    }
				});
				timer.start();
			}
		});

		buttonNo.setForeground(new Color(0, 102, 153));
		buttonNo.setFont(new Font("Tahoma", Font.BOLD, 65));
		
		buttonNo.setBounds(816, 495, 338, 125);
		contentPane.add(buttonNo);
		
		JButton buttonYes = new JButton("Yes");
		buttonYes.setFocusable(false);
		buttonYes.setForeground(new Color(0, 102, 153));
		buttonYes.setFont(new Font("Tahoma", Font.BOLD, 65));
		buttonYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level2meal obj = new level2meal();
				obj.setVisible(true);
			}
		});
		buttonYes.setBounds(816, 313, 338, 125);
		contentPane.add(buttonYes);
		
		question = new JLabel("Do you want to start");
		question.setForeground(new Color(0, 0, 153));
		question.setFont(new Font("Tahoma", Font.BOLD, 90));
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(10, 11, 1342, 125);
		contentPane.add(question);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(164, 283, 512, 379);
		Image img = new ImageIcon(this.getClass().getResource("/setTable.jpg")).getImage() ;
		imageLabel.setIcon(new ImageIcon (img));
		contentPane.add(imageLabel);
			
		lblSettingUpThe = new JLabel("setting up the table now?");
		lblSettingUpThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettingUpThe.setForeground(new Color(0, 0, 153));
		lblSettingUpThe.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblSettingUpThe.setBounds(10, 119, 1342, 125);
		contentPane.add(lblSettingUpThe);
		
	}
}

