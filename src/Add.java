

import java.util.Date;
import java.util.Scanner;

public class Add extends Main {
    Date date = new Date();


    Scanner sc = new Scanner(System.in);

    String[] write = new String[4];
    String title = null;
    String text = null;
    String writer = null;
    String nowTime = null;

    public void Add() {
        System.out.print("제목 >> ");
        title = sc.next();
        System.out.print("내용 >> ");
        text = sc.next();
        System.out.print("글쓴이 >>");
        writer = sc.next();
        nowTime = date.toString(); //지금 시간
        addArr(title, text, writer, nowTime);
        input.input(1);

    }

    void addArr(String title, String text, String writer, String nowTime) {
        System.out.println("작성했습니다.");
        writeInMap.put(super.count, title + "  " + text + "  " + writer + "  " + nowTime);
        writeMap.put(super.count, title + "  " + writer + "  " + nowTime);


        super.count++;
    }


}


