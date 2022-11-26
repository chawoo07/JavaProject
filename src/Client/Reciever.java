package Client;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class Reciever extends Thread {
	private DataInputStream in;
	
	public Reciever(Socket socket) throws Exception {
		// TODO Auto-generated constructor stub
		this.in = new DataInputStream(socket.getInputStream());
	}
	

	public void run() {
		while (true) {
			try {
				if (this.in != null) {
					System.out.println(this.in.readUTF());
				}
			} catch (SocketException e) {
				System.out.println("접속 해제");
				ClientMain.connected = false;
				this.in = null;
				this.interrupt();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
