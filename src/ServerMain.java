import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerMain extends Main {
	
	public ServerMain() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(7777);
		Socket socket = null;
		int accessCount = 0;
		List<Socket> sockets = new ArrayList<Socket>();
		SenderForServer sender = new SenderForServer();
		List<RecieverForServer> recieveres = new ArrayList<RecieverForServer>();
		
		GetAccessForServer rev = new GetAccessForServer(sender, recieveres, serverSocket, sockets, accessCount);
		rev.start();
		
		while(true) {
			show.serverMenu();
		}
	}

}
