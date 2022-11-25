import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Reciever extends Thread {
	private DataInputStream in;
	
	public void addSocket(Socket socket) {
		try {		
			this.in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		while (this.in != null) {
			try {
				System.out.println(this.in.readUTF());
				System.out.print(">>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
