package Client;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.SocketException;

public class Sender {
	public static DataOutputStream out;
	private String str = null;
	
	Sender(Socket socket) throws Exception {
		this.out = new DataOutputStream(socket.getOutputStream());
	}
	
	public void requestAllToServer() throws Exception {
		try {
			if (out != null)
				out.writeUTF("All");
	        Thread.sleep(500);
		} catch (SocketException e) {
			// TODO: handle exception
			System.out.println("연결에 문제가 있습니다.");
		}
		
	}
	
	public void requestOneToServer(int key) throws Exception {
		try {
			if (out != null) {
				out.writeUTF("One");
				out.writeUTF(String.valueOf(key));
			}
	        Thread.sleep(500);
		} catch (SocketException e) {
			// TODO: handle exception
			e.fillInStackTrace();
			System.out.println("연결에 문제가 있습니다.");
		}
		
	}
	
	public void requestAddToServer(String str) throws Exception {
		try {
			if (out != null) {
				out.writeUTF("Add");
				out.writeUTF(str);
			}
	        Thread.sleep(500);
		} catch (SocketException e) {
			// TODO: handle exception
			System.out.println("연결에 문제가 있습니다.");
		}
		
	}
	
	public void requestDeleteToServer(int key) throws Exception {
		try {
			if (out != null) {
				out.writeUTF("Del");
				out.writeUTF(String.valueOf(key));
			}
	        Thread.sleep(500);
		} catch (SocketException e) {
			// TODO: handle exception
			System.out.println("연결에 문제가 있습니다.");
		}
		
	}
}
