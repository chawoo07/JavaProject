import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class RecieverForServer extends Thread {
	private DataInputStream in;
	private String str = null;
	
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
				this.str = this.in.readUTF();
				System.out.println(this.str);
				System.out.print(">>");
				for (int i = 0; i < Sender.out.size(); i++) {
					if (Sender.out.get(i) != null) {
						Sender.out.get(i).writeUTF(this.str);
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
