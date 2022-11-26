package Client;


import java.util.Date;
import java.util.Scanner;

public class AddForClient extends ClientMain {
    Date date = new Date();
    Scanner sc = new Scanner(System.in);

    String[] write = new String[4];
    String title = null;
    String text = null;
    String author = null;
    String nowTime = null;

    public void add(Sender sender) throws Exception {
        System.out.print("제목>>>>");
        this.title = sc.nextLine();
        System.out.print("내용>>>>");
        this.text = sc.nextLine();
        System.out.print("글쓴이>>");
        this.author = sc.nextLine();
        this.nowTime = date.toString(); //지금 시간
        addArr(this.title, this.text, this.author, this.nowTime, sender);
    }
    
    static void addArr(String title, String text, String author, String time, Sender sender) throws Exception {
    	sender.requestAddToServer(title + "|" + text + "|" + author + "|" + time);
    }
}


