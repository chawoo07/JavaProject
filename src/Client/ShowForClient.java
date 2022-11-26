package Client;
import java.util.Scanner;

public class ShowForClient extends ClientMain {
    Scanner sc = new Scanner(System.in);
    int select;
    
    public void clientMenu(Sender sender) {
        System.out.println("1.목록 2.등록 3.내용 4.삭제 0.종료");
        System.out.print(">>");
        try {
        	select = sc.nextInt();
            inputforclient.inputForClient(select, sender);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("에러가 발생했습니다.");
        }
    }
  
    public void listShowClient(Sender sender) throws Exception {
    	System.out.println("==============================");
        System.out.println("번호|제목|작성자|작성일");
        System.out.println("------------------------------");
        sender.requestAllToServer();
        System.out.println("==============================");
    }

    public void lineShowClient(Sender sender) throws Exception {
    	listShowClient(sender);
        System.out.print("조회할 글 번호를 입력해 주세요.>>");
        try {
        	sender.requestOneToServer(sc.nextInt());
        } catch (Exception e) {
        	System.out.println("제대로 입력해주세요.");
        	e.printStackTrace();            
        }
        
    }
}