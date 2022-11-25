import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class GetAccessForServer extends Thread {
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private List<Socket> sockets = null;
	private SenderForServer sender = null;
	private List<RecieverForServer> recieve = null;
	private int accessCount;
	
	public GetAccessForServer(SenderForServer sender, List<RecieverForServer> recieve, ServerSocket serverSocket, List<Socket> sockets, int count) {
		// TODO Auto-generated constructor stub
		this.sender = sender;
		this.recieve = recieve;
		this.serverSocket = serverSocket;
		this.sockets = sockets;
		this.accessCount = count;
	}
	
	public void run() {
		while(true) {
	 		try {
				this.socket = serverSocket.accept();
				this.sockets.add(this.socket);
				this.sender.addSocket(this.socket);
				this.recieve.add(new RecieverForServer());
				this.recieve.get(this.accessCount).addSocket(sockets.get(accessCount));
				this.recieve.get(accessCount).start();
				this.accessCount++;
				System.out.println((this.accessCount + 1) + "명 접속중");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
