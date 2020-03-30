package thepoliteRoboteng;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class level4Hello extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level4Hello frame = new level4Hello();
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
	public level4Hello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel m1 = new JLabel("\r\nHello,");
		m1.setBackground(Color.WHITE);
		m1.setForeground(new Color(0, 0, 153));
		m1.setFont(new Font("Tahoma", Font.BOLD, 99));
		m1.setHorizontalAlignment(SwingConstants.CENTER);
		m1.setBounds(10, 26, 1332, 89);
		contentPane.add(m1);
		
		
		JLabel m2 = new JLabel("\r\nI'm a robot cookie.");
		m2.setHorizontalAlignment(SwingConstants.CENTER);
		m2.setForeground(new Color(0, 0, 153));
		m2.setFont(new Font("Tahoma", Font.BOLD, 85));
		m2.setBackground(Color.WHITE);
		m2.setBounds(10, 155, 1332, 89);
		contentPane.add(m2);
		
		JLabel m3 = new JLabel("I would be happy to arrange");
		m3.setHorizontalAlignment(SwingConstants.CENTER);
		m3.setForeground(new Color(0, 0, 153));
		m3.setFont(new Font("Tahoma", Font.BOLD, 85));
		m3.setBackground(Color.WHITE);
		m3.setBounds(10, 290, 1332, 109);
		contentPane.add(m3);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level4start obj = new level4start();
				obj.setVisible(true);
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 65));
		btnNewButton.setBounds(559, 585, 211, 99);
		contentPane.add(btnNewButton);
		
		JLabel m4 = new JLabel("the table for you.");
		m4.setHorizontalAlignment(SwingConstants.CENTER);
		m4.setForeground(new Color(0, 0, 153));
		m4.setFont(new Font("Tahoma", Font.BOLD, 85));
		m4.setBackground(Color.WHITE);
		m4.setBounds(10, 437, 1332, 109);
		contentPane.add(m4);
		
		
	}
}
