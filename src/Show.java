import java.util.Scanner;

public class Show extends Main {
    Scanner sc = new Scanner(System.in);
    int num;

    void Show() {

        int j = 0;
        System.out.println("==============================");
        System.out.println("번호  제목  작성자     작성일");
        System.out.println("------------------------------");

        for (int i = 1; i <= writeMap.size() + j; i++) {
            if (writeMap.get(i) == null) {
                j++;
                continue;
            } else {
                System.out.println(i + "  " + writeMap.get(i));
            }
        }
        if (writeMap.size() != 0)
            System.out.println("------------------------------");
        System.out.println("1.목록 2.등록 3.내용 4.삭제 0.종료");
        try {
            num = sc.nextInt();
            input.input(num);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요. 종료합니다.");

        }

    }

    void inShow() {
        System.out.print(" 위에 게시판 번호중 하나를 입력해 주세요.>>");
        try {
            num = sc.nextInt();
            if (writeInMap.get(num) == null) {
                System.out.println(" 존재하지 않는 글입니다.");
            } else {
                System.out.println("==============================");
                System.out.println("번호  제목  내용  작성자     작성일");
                System.out.println(num + "  " + writeInMap.get(num));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("제대로 입력해주세요.");

        }
        show2();
    }

    void show2() {
        System.out.println("==============================");
        System.out.println("번호  제목  작성자     작성일");
        System.out.println("------------------------------");
        System.out.println("1.목록 2.등록 3.내용 4.삭제 0.종료");
        try {
            num = sc.nextInt();
            input.input(num);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("제대로 입력해주세요.");
            input.input(1);
        }
    }

}