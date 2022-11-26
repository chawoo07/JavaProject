package Server;
import java.util.Scanner;

class DelServer extends ServerMain {
    Scanner sc = new Scanner(System.in);
  
    public void delServer() throws Exception{
	    int wn = 0;
	    
	    System.out.println("삭제하실 글번호를 입력해주세요.");
	    System.out.print(">>");
	    wn = sc.nextInt();
	    this.delete(wn);
	    
    }
    
    public void delete(int key) {
    	int size = 0;
    	String str1 = "";
    	String str2 = "";
    	try {
	    	size = writeInMap.size();
	        
	        writeMap.remove(key);
	        writeInMap.remove(key);
	        for (int i = key; i < writeInMap.size(); i++) {
	        	str1 = writeMap.get(i + 1);
	        	str2 = writeInMap.get(i + 1);
				writeMap.put(i, str1);
				writeInMap.put(i, str2);
			} 
	        writeMap.remove(size);
	        writeInMap.remove(size);
	        System.out.println(key + "번글 삭제");
	    }catch (Exception e){
	        e.printStackTrace();
	        System.out.println("삭제 오류");
	    }
    }
}
