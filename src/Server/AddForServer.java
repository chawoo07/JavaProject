package Server;


import java.util.Date;
import java.util.Scanner;

public class AddForServer extends ServerMain {
    Date date = new Date();
    Scanner sc = new Scanner(System.in);

    String[] write = new String[4];
    String title = null;
    String text = null;
    String author = null;
    String nowTime = null;

    public void add() throws Exception {
        System.out.print("제목>>>>");
        this.title = sc.nextLine();
        System.out.print("내용>>>>");
        this.text = sc.nextLine();
        System.out.print("글쓴이>>");
        this.author = sc.nextLine();
        this.nowTime = date.toString(); //지금 시간
        addArr(this.title, this.text, this.author, this.nowTime);
    }

    static void addAndWriteArr(String title, String text, String author, String time) throws Exception {

        writeInMap.put((writeInMap.size() + 1), title + "|" + text + "|" + author + "|" + time);
        writeMap.put((writeMap.size() + 1), title + "|" + author + "|" + time);
        Writer writer = new Writer();
        writer.overWrite();
        System.out.println("저장 했습니다.");
    }
    
    static void addArr(String title, String text, String author, String time) throws Exception {
    	writeInMap.put((writeInMap.size() + 1), title + "|" + text + "|" + author + "|" + time);
        writeMap.put((writeMap.size() + 1), title + "|" + author + "|" + time);
        System.out.println("읽기 성공.");
    }
}


