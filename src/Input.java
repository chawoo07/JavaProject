

public class Input extends Main {


    void input(int num) throws Exception {
        switch (num) {
            case 1: 
            	show.listShow();
            	break;
            case 2:
            	add.add();
            	break;
            case 3:
            	show.lineShow();
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
    
    void inputForServer(int num) throws Exception {
        switch (num) {
            case 1: 
            	show.listShow();
            	break;
            case 2:
            	show.lineShowServer();
            	break;
            case 3:
            	del.del();
            	break;
            case 4:
            	Writer writer = new Writer();
            	writer.write();
            	break;
            case 0:
            	exit.exit();
            	break;
            default:{
                System.out.println("잘못된 입력입니다.");
            }

        }
    }


}
