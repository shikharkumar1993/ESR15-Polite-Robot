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

public class level4start extends JFrame {

	private JPanel contentPane;
	private JLabel stoper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level4start frame = new level4start();
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
	public level4start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel question = new JLabel("start setting up the table?");
		question.setForeground(new Color(0, 0, 153));
		question.setFont(new Font("Tahoma", Font.BOLD, 80));
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(20, 111, 1322, 107);
		contentPane.add(question);
		
		stoper = new JLabel("");
		stoper.setFont(new Font("Tahoma", Font.PLAIN, 50));
		stoper.setName("stopper");
		stoper.setBounds(125, 284, 101, 51);
		contentPane.add(stoper);
		stoper.setVisible(false);
		
		JButton nowButton = new JButton("Now");
		nowButton.setFocusable(false);
		nowButton.setForeground(new Color(0, 102, 153));
		nowButton.setFont(new Font("Tahoma", Font.BOLD, 60));
		nowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				level4meal obj = new level4meal ();
				obj.setVisible(true);
			}
		});
		nowButton.setBounds(738, 278, 499, 87);
		contentPane.add(nowButton);
		
		JButton oneMButton = new JButton("\r\nIn a minute");
		oneMButton.setFocusable(false);
		oneMButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stoper.setVisible(true);
				oneMButton.setEnabled(false);
				Timer timer = new Timer(1000, new ActionListener() {
				    private int count = 60;
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        if (count <= 0) {
				        	stoper.setVisible(false);
				            ((Timer)e.getSource()).stop();
				            count = 60;
				            oneMButton.setEnabled(true);
				        } else {
				        	stoper.setText(Integer.toString(count));
				            count--;
				        }
				    }
				});
				timer.start();
			}
		});
		oneMButton.setForeground(new Color(0, 102, 153));
		oneMButton.setFont(new Font("Tahoma", Font.BOLD, 60));
		oneMButton.setBounds(738, 416, 499, 87);
		contentPane.add(oneMButton);
		
		JButton twoMButton = new JButton("\r\nIn two minutes");
		twoMButton.setFocusable(false);
		twoMButton.setForeground(new Color(0, 102, 153));
		twoMButton.setFont(new Font("Tahoma", Font.BOLD, 60));
		twoMButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stoper.setVisible(true);
				twoMButton.setEnabled(false);
				Timer timer = new Timer(1000, new ActionListener() {
				    private int count = 120;
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        if (count <= 0) {
				        	stoper.setVisible(false);
				            ((Timer)e.getSource()).stop();
				            count = 120;
				            twoMButton.setEnabled(true);
				        } else {
				        	stoper.setText(Integer.toString(count));
				            count--;
				        }
				    }
				});
				timer.start();
			}
		});
		twoMButton.setBounds(738, 556, 499, 87);
		contentPane.add(twoMButton);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(115, 281, 512, 379);
		Image img = new ImageIcon(this.getClass().getResource("/setTable.jpg")).getImage() ;
		imageLabel.setIcon(new ImageIcon (img));
		contentPane.add(imageLabel);
		
		JLabel lblWhenDoYou = new JLabel("\r\nWhen do you want me to");
		lblWhenDoYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhenDoYou.setForeground(new Color(0, 0, 153));
		lblWhenDoYou.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblWhenDoYou.setBounds(10, 0, 1332, 101);
		contentPane.add(lblWhenDoYou);

	}

}

