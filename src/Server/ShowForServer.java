package Server;
import java.util.Scanner;
import java.util.Set;

public class ShowForServer extends ServerMain {
    Scanner sc = new Scanner(System.in);
    int select;
    
    public void serverMenu() {
        System.out.println("1.목록 2.내용 3.삭제 4.저장 0.종료");
        System.out.print(">>");
        try {
        	select = sc.nextInt();
        	inputforserver.inputForServer(select);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요.");
        }
    }
    
    public void listShowServer() {
    	if ((writeMap.size() > 0) && (writeInMap.size() > 0) && (writeInMap.size() == writeMap.size())) {
    		System.out.println("==============================");
            System.out.println("번호|제목|작성자|작성일자");
            System.out.println("------------------------------");
            Set<Integer> key = writeMap.keySet();
            for (Integer i : key) {
            	System.out.println(i + "|" + writeMap.get(i));
			}
            System.out.println("==============================");
		} else {
			System.out.println("글이 없거나 데이터에 에러가 있습니다.");
		}
    }

    void lineShowServer() {
    	listShowServer();
        System.out.print("조회할 글 번호를 입력해 주세요.>>");
        try {
        	select = sc.nextInt();
            if (writeInMap.get(select) == null) {
                System.out.println(" 존재하지 않는 글입니다.");
            } else {
                System.out.println("==============================");
                System.out.println("번호|제목|내용|작성자|작성일자");
                System.out.println("------------------------------");
                System.out.println(select + "|" + writeInMap.get(select));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요.");
        }
    }
}