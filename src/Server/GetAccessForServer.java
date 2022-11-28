package Server;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class GetAccessForServer extends Thread {
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private List<Socket> sockets = null;
	private List<RecieverForServer> recieve = null;
	
	public GetAccessForServer(List<RecieverForServer> recieve, ServerSocket serverSocket, List<Socket> sockets) {
		// TODO Auto-generated constructor stub
		this.recieve = recieve;
		this.serverSocket = serverSocket;
		this.sockets = sockets;
	}
	
	public void run() {
		while(true) {
	 		try {
				this.socket = serverSocket.accept();
				this.sockets.add(this.socket);
				this.recieve.add(new RecieverForServer());
				this.recieve.get(ServerMain.access).addSocket(sockets.get(ServerMain.access));
				this.recieve.get(ServerMain.access).start();
				System.out.println(this.socket.getInetAddress() + " 접속");
				System.out.println((ServerMain.access + 1) + "명 접속중");
				ServerMain.access++;
				System.out.print(">>");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
