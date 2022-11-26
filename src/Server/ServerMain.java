package Server;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ServerMain {
	static String src = "List.txt";
    static AddForServer addforserver = new AddForServer();
	static DelServer delServer = new DelServer();
	static InputForServer inputforserver = new InputForServer();
	static ShowForServer showforserver = new ShowForServer();
	
	static TreeMap<Integer, String> writeMap = new TreeMap<>();
    static TreeMap<Integer, String> writeInMap = new TreeMap<>();
    static int count = 0;
    static int access = 0;
    
    static Exit exit = new Exit();
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(7777);
		List<Socket> sockets = new ArrayList<Socket>();
		Reader reader = new Reader();
		List<RecieverForServer> recieveres = new ArrayList<RecieverForServer>();
		
		GetAccessForServer getAccess = new GetAccessForServer(recieveres, serverSocket, sockets);
		getAccess.setDaemon(true);
		getAccess.start();
		
		reader.read();
		
		count = writeInMap.size();
		while(true) {
			showforserver.serverMenu();
		}
	}

}
