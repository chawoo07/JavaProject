import java.util.Scanner;

public class Show extends Main {
    Scanner sc = new Scanner(System.in);
    int num;
    
    public void menu() {
        System.out.println("1.목록 2.등록 3.내용 4.삭제 0.종료");
        try {
            num = sc.nextInt();
            input.input(num);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요. 종료합니다.");
        }
    }
    
    public void serverMenu() {
        System.out.println("1.목록 2.내용 3.삭제 4.저장 0.종료");
        try {
            num = sc.nextInt();
            input.inputForServer(num);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요. 종료합니다.");
        }
    }
    
    public void listShow() {
    	if ((writeMap.size() > 0) && (writeInMap.size() > 0) && (writeInMap.size() == writeMap.size())) {
    		int j = 0;
    		System.out.println("==============================");
            System.out.println("번호|제목|작성자|작성일");
            System.out.println("------------------------------");
            for (int i = 1; i <= writeMap.size() + j; i++) {
                if (writeMap.get(i) == null) {
                    j++;
                    continue;
                } else {
                    System.out.println(i + "|" + writeMap.get(i));
                }
            }
            System.out.println("==============================");
		} else {
			System.out.println("데이터 에러");
		}
        menu();
    }

    void lineShow() {
    	listShow();
        System.out.print(" 위의 게시판 번호중 하나를 입력해 주세요.>>");
        try {
            num = sc.nextInt();
            if (writeInMap.get(num) == null) {
                System.out.println(" 존재하지 않는 글입니다.");
            } else {
                System.out.println("==============================");
                System.out.println("번호|제목|내용|작성자|작성일");
                System.out.println(num + "|" + writeInMap.get(num));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요.");
        }
        menu();
    }
    
    public void listShowServer() {
    	if ((writeMap.size() > 0) && (writeInMap.size() > 0) && (writeInMap.size() == writeMap.size())) {
    		int j = 0;
    		System.out.println("==============================");
            System.out.println("번호|제목|작성자|작성일");
            System.out.println("------------------------------");
            for (int i = 1; i <= writeMap.size() + j; i++) {
                if (writeMap.get(i) == null) {
                    j++;
                    continue;
                } else {
                    System.out.println(i + "|" + writeMap.get(i));
                }
            }
            System.out.println("==============================");
		} else {
			System.out.println("글이 없거나 데이터에 에러가 있습니다.");
		}
        serverMenu();
    }

    void lineShowServer() {
    	listShowServer();
        System.out.print(" 위의 게시판 번호중 하나를 입력해 주세요.>>");
        try {
            num = sc.nextInt();
            if (writeInMap.get(num) == null) {
                System.out.println(" 존재하지 않는 글입니다.");
            } else {
                System.out.println("==============================");
                System.out.println("번호|제목|내용|작성자|작성일");
                System.out.println(num + "|" + writeInMap.get(num));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요.");
        }
        serverMenu();
    }
}