package thepoliteRoboteng;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	
	private JPanel contentPane;
	public static String firstChoice = new String ("");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* level 1 */
		JButton greenB = new JButton("");
		greenB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level1start first = new level1start();
				try {
					first.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		
		greenB.setBackground(Color.GREEN);
		greenB.setBounds(405, 274, 165, 142);
		contentPane.add(greenB);
		
		/* level 2 */
		JButton blueB = new JButton("");
		blueB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level2start obj = new level2start();
				try {
					obj.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		blueB.setBackground(Color.BLUE);
		blueB.setBounds(640, 274, 165, 142);
		contentPane.add(blueB);
		
		/* level 4 */
		JButton redB = new JButton("");
		redB.setBackground(Color.RED);
		redB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level4Hello obj = new level4Hello();
				obj.setVisible(true);
			}
		});
		redB.setBounds(897, 274, 165, 142);
		contentPane.add(redB);
	}	
}
