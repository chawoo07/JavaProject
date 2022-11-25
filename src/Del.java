import java.util.Scanner;

class Del extends Main {
    Scanner sc = new Scanner(System.in);
    
    public void del(){
	    int wn = 0;
	    System.out.println("삭제하실 글번호를 입력해주세요.");
	    try {
	        wn = sc.nextInt();
	        writeMap.remove(wn);
	        writeInMap.remove(wn);
	        input.input(1);
	    }catch (Exception e){
	        e.printStackTrace();
	        System.out.println("제대로 입력해주세요.");
	        input.input(1);
	    }
    }
}
