package Client;
import javax.swing.plaf.SliderUI;

public class InputForClient extends ClientMain {


    void inputForClient(int num, Sender sender) throws Exception {
        switch (num) {
            case 1: 
            	showforclient.listShowClient(sender);
            	break;
            case 2:
            	addforclient.add(sender);
            	break;
            case 3:
            	showforclient.lineShowClient(sender);
            	break;
            case 4:
            	delClient.delClient(sender);
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
