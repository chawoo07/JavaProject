package Server;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class RecieverForServer extends Thread {
	private DataInputStream in;
	private String str = null;
	private SenderForServer sender = null;
	private Socket socket = null;
	
	public void addSocket(Socket socket) {
		try {		
			this.in = new DataInputStream(socket.getInputStream());
			this.sender = new SenderForServer(socket);
			this.socket = socket;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		while (this.in != null) {
			try {
				this.str = this.in.readUTF();
				
				System.out.println("GetRequestType : " + this.str);
				System.out.print(">>");
				switch (this.str) {
				case "All":
					this.sender.responseAllToClient();
					break;
				case "One":
					this.str = this.in.readUTF();
					this.sender.responseOneToClient(Integer.parseInt(this.str));
					break;
				case "Add":
					this.str = this.in.readUTF();
					this.sender.responseAddToClient(this.str);
					break;
				case "Del":
					this.str = this.in.readUTF();
					this.sender.responseDelToClient(Integer.parseInt(this.str));
					break;
				default:
					System.out.println("Invalid Request");
					this.sender.responseInvalidToClient();
					break;
				}
			} catch (SocketException e) {
				System.out.println(this.socket.getInetAddress() + " : 접속 해제");
				this.in = null;
				ServerMain.access--;
				System.out.println(">>");
				this.interrupt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try {
					this.sender.responseInvalidToClient();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Invalid Request");
			} 
		}
	}
}
