package Client;
import java.net.Socket;
import java.util.Scanner;

class ClientMain  {
	static AddForClient addforclient = new AddForClient();
    static DelClient delClient = new DelClient();
    static InputForClient inputforclient = new InputForClient();
    static ShowForClient showforclient = new ShowForClient();
    static Exit exit = new Exit();
    static boolean connected = false;
    
	public static void main(String[] args) {
        Socket socket = null;
        Sender sender = null;
        Reciever reciever = null;
        Scanner sc = new Scanner(System.in);
        
        
		while (true) {
			try {
				socket = new Socket("localhost", 7777);
				reciever = new Reciever(socket);
				sender = new Sender(socket);
				reciever.setDaemon(true);
		        reciever.start();
		        connected = true;
		        System.out.println("서버 접속 성공");
		        while (connected) {
					showforclient.clientMenu(sender);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				String str = "";
				connected = false;
				System.out.println("서버 접속 실패");
				System.out.print("재시도 할까요? (Y >> 재시도) >>");
				str = sc.nextLine();
				if (str.contains("Y") || str.contains("y") ) {
					System.out.println("재시도");
					continue;
				} else {
					System.out.println("종료");
					break;
				}
				
			}
		}
		sc.close();
    }
}


