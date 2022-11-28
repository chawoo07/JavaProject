package Server;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Set;
import java.util.regex.Pattern;

public class SenderForServer extends ServerMain {
	private DataOutputStream out = null;
	String[] tokens = null;
	
	public SenderForServer(Socket socket) throws Exception {
		this.out = new DataOutputStream(socket.getOutputStream());
	}
	
	public void responseTestToClient() {
		try {
			if (out != null) {
				out.writeUTF("TEST");
			} else {
				System.out.println("OutPutStream is Null");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void responseAllToClient() throws Exception {
		try {
			if (out != null) {
				if (writeMap.size() < 1) {
					out.writeUTF("글이 없거나 데이터에 에러가 있습니다.");	
				} else {
					Set<Integer> set = writeInMap.keySet();
					for (Integer key : set) {
						out.writeUTF(key + "|" + writeMap.get(key));
					}
				}
			} else {
				System.out.println("OutPutStream is Null");
			}
		} catch (Exception e){
	        e.printStackTrace();
	        out.writeUTF("수신 에러");
	        System.out.println("수신 에러");
	    }
	}
	
	public void responseOneToClient(int key) throws Exception {
		try {
			if (out != null) {
				out.writeUTF(key + "|" + writeInMap.get(key));
			} else {
				System.out.println("OutPutStream is Null");
			}
		} catch (Exception e){
	        e.printStackTrace();
	        out.writeUTF("수신 에러");
	        System.out.println("수신 에러");
	    }
	}
	
	public void responseAddToClient(String str) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("수신 : " + str);
			this.tokens = str.split(Pattern.quote("|"));
			AddForServer.addArr(this.tokens[0], this.tokens[1], this.tokens[2], this.tokens[3]);
	        out.writeUTF("수신 완료");
	        System.out.print(">>");
	    } catch (Exception e){
	        e.printStackTrace();
	        out.writeUTF("수신 에러");
	        System.out.println("수신 에러");
	    }
	}

	public void responseDelToClient(int key) throws Exception {
		// TODO Auto-generated method stub
		try {
			delServer.delete(key);
	        out.writeUTF(key + "번 글 삭제 완료");
	    } catch (Exception e){
	        e.printStackTrace();
	        out.writeUTF("삭제 에러");
	        System.out.println("삭제 요청 처리 에러");
	    }
	}
	
	public void responseInvalidToClient() throws Exception {
		try {
			if (out != null) {
				out.writeUTF("Invalid Request");
			} else {
				System.out.println("OutPutStream is Null");
			}
		} catch (Exception e){
	        e.printStackTrace();
	        out.writeUTF("수신 에러");
	        System.out.println("수신 에러");
	    }
	}
}
