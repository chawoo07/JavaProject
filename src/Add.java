

import java.util.Date;
import java.util.Scanner;

public class Add extends Main {
    Date date = new Date();
    Scanner sc = new Scanner(System.in);

    String[] write = new String[4];
    String title = null;
    String text = null;
    String author = null;
    String nowTime = null;

    public void add() throws Exception {
        System.out.print("제목 >> ");
        this.title = sc.nextLine();
        System.out.print("내용 >> ");
        this.text = sc.nextLine();
        System.out.print("글쓴이 >>");
        this.author = sc.nextLine();
        this.nowTime = date.toString(); //지금 시간
        addArr(this.title, this.text, this.author, this.nowTime);
    }

    static void addArr(String title, String text, String author, String nowTime) throws Exception {
        
        writeInMap.put(count, title + "|" + text + "|" + author + "|" + nowTime);
        writeMap.put(count, title + "|" + author + "|" + nowTime);
        Writer writer = new Writer();
        count = (writeInMap.size() + 1);
        //System.out.println(writeInMap.get((writeInMap.size() - 1)).toString());
       
        writer.overWrite();
        System.out.println("작성했습니다.");
    }
}


