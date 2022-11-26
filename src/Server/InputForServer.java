package Server;


public class InputForServer extends ServerMain {
    
    void inputForServer(int num) throws Exception {
        switch (num) {
            case 1: 
            	showforserver.listShowServer();
            	break;
            case 2:
            	showforserver.lineShowServer();
            	break;
            case 3:
            	showforserver.listShowServer();
            	delServer.delServer();
            	break;
            case 4:
            	Writer writer = new Writer();
            	writer.overWrite();
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
