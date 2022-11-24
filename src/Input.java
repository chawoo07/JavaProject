

public class Input extends Main{


    void input(int num) {
        switch (num) {
            case 1: 
            	show.show();
            	break;
            case 2:
            	add.add();
            	break;
            case 3:
            	show.inShow();
            	break;
            case 4:
            	del.del();
            	break;
            case 0:
            	exit.exit();
            	break;
            default:{
                System.out.println("잘못된 입력입니다.");
                input.input(1);
            }

        }
    }


}
