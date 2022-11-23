import java.util.Scanner;

public class Input extends Main{


    void input(int num) {
        switch (num) {
            case 1 -> show.Show();
            case 2 -> add.Add();
            case 3 -> show.inShow();
            case 4 -> del.Del();
            case 0 -> exit.Exit();
            default -> {
                System.out.println("잘못된 입력입니다.");
                input.input(1);
            }

        }
    }


}
