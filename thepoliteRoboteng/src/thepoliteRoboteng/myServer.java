package thepoliteRoboteng;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class myServer {
    private ServerSocket server;
    private static Socket socket;
    public myServer(String ipAddress) throws Exception {
        if (ipAddress != null && !ipAddress.isEmpty()) 
          this.server = new ServerSocket(0, 1, InetAddress.getByName(ipAddress));
        else 
          this.server = new ServerSocket(0, 1, InetAddress.getLocalHost());
    }
    private void listen() throws Exception {
        String data = null;
        while (true) {
        Socket client = this.server.accept();
        
        //Reading the message from the client
        String clientAddress = client.getInetAddress().getHostAddress();
        System.out.println("\r\nNew connection from " + clientAddress);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));  
        data = in.readLine();
   //     while ( (data = in.readLine()) != null ) {

            System.out.println("\r\nMessage from " + clientAddress + ": " + data);
            Thread.sleep(5000);
     
          //get the message and write it to the socket as response
            String message = "finish";
            PrintWriter writer = new PrintWriter(client.getOutputStream());
            String response = "Response : " + message;
            System.out.println(response);
            writer.println(response);
            writer.close(); 
        }
        
    }
    
    public InetAddress getSocketAddress() {
        return this.server.getInetAddress();
    }
    
    public int getPort() {
        return this.server.getLocalPort();
    }
    public static void main(String[] args) throws Exception {
    	myServer app = new myServer("127.0.0.1");
        System.out.println("\r\nRunning Server: " + 
                "Host=" + app.getSocketAddress().getHostAddress() + 
                " Port=" + app.getPort());
        
        app.listen();
    }
}

// java -cp Test7319.jar thePoliteRobot.myServer

