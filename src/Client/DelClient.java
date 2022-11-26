package Client;
import java.util.Scanner;

class DelClient extends ClientMain {
    Scanner sc = new Scanner(System.in);
    
    public void delClient(Sender sender) {
    	int key = 0;
	    System.out.println("삭제하실 글번호를 입력해주세요.");
	    System.out.print(">>");
	    try {
	    	key = sc.nextInt();
	    	sender.requestDeleteToServer(key);
	    }catch (Exception e){
	        e.printStackTrace();
	        System.out.println("제대로 입력해주세요.");
	    }
    }
}
