package thepoliteRoboteng;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class level4tnx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level4tnx frame = new level4tnx();
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
	public level4tnx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tnx = new JLabel("Thank you very much");
		tnx.setBackground(Color.WHITE);
		tnx.setForeground(new Color(0, 0, 153));
		tnx.setFont(new Font("Tahoma", Font.BOLD, 85));
		tnx.setHorizontalAlignment(SwingConstants.CENTER);
		tnx.setBounds(11, 235, 1352, 89);
		contentPane.add(tnx);
		
		JLabel apetite = new JLabel("Bon appetit!");
		apetite.setBackground(Color.WHITE);
		apetite.setHorizontalAlignment(SwingConstants.CENTER);
		apetite.setForeground(new Color(0, 0, 153));
		apetite.setFont(new Font("Tahoma", Font.BOLD, 99));
		apetite.setBounds(11, 364, 1342, 109);
		contentPane.add(apetite);
		
	/*	JLabel frame = new JLabel("");
		frame.setBounds(0, 0, 1363, 740);
		Image img = new ImageIcon(this.getClass().getResource("/frame.jpg")).getImage() ;
		frame.setIcon(new ImageIcon (img));
		contentPane.add(frame);*/
		
		JLabel label = new JLabel("New label");
		label.setBounds(942, 192, -475, 283);
		contentPane.add(label);
		
	}

}
