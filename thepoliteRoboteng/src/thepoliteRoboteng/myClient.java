
package thepoliteRoboteng;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myClient {
	public static Socket socket;
    public Scanner scanner;
    
    
    public myClient(InetAddress serverAddress, int serverPort) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.scanner = new Scanner(System.in);
    }
    
    public void start() throws IOException {
  /*      String input;
        System.out.println("String input");
  //      while (true) {
            input = scanner.nextLine();
            System.out.println("input = scanner.nextLine");
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
            System.out.println("PrintWriter");
            out.println(input);
            out.flush()*/
    	
          //StreamReader to read the response from the server
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
             BufferedReader reader = new BufferedReader(streamReader);
          //Get the response message and print it to console	
             String responseMessage = reader.readLine();
             System.out.println(responseMessage);
  //      }
    }
      
    public static void sendM (int type) throws Exception {
    	try {
    	myClient client = new myClient(
              //InetAddress.getByName("10.0.2.155"), 
               InetAddress.getByName("132.72.96.29"),
               Integer.parseInt("5005")); 
   /*     myClient client = new myClient(
        InetAddress.getByName("127.0.0.1"), 
    	Integer.parseInt("55473")); */ 
        
        System.out.println("\r\nConnected to Server: " + client.socket.getInetAddress());
        
        OutputStream os = client.socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        String number = "";
        if (type == 1)
        	number = "1";
        else if (type == 2)
        	number = "2";
        else if (type == 3)
        	number = "3";
        else
        	number = "4";

        String sendMessage = number + "\n";
        bw.write(sendMessage);
        bw.flush();
        System.out.println("Message sent to the server : "+sendMessage);
        client.start();
    	} catch (Exception e) {
            System.out.println(e);
        }
   	
    }
}