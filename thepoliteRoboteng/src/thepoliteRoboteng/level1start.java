package thepoliteRoboteng;

import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class level1start {
	
	public level1start() {
    }
	
	public void start() throws Exception {
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
					finish obj = new finish();
					obj.setVisible(true);
		        }
		    };
		    Timer timer = new Timer(500, listener);
		    timer.setRepeats(false);
		    timer.start();
	}
}
