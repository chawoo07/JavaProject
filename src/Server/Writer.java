package Server;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Set;

public class Writer extends ServerMain{
	
	BufferedWriter writer;
	String str = null;
	
	public Writer() throws Exception {
		super();
		
	}

	public void overWrite() throws Exception {
		// TODO Auto-generated method stub
		this.writer = new BufferedWriter(new FileWriter(src, false));
		if (writeInMap.size() >= 1) {
			Set<Integer> set = writeInMap.keySet();
			for (Integer key : set) {
				this.writer.write(writeInMap.get(key));
				this.writer.newLine();
				System.out.println("저장 " + writeInMap.get(key));
			}
		} else {
			System.out.println("저장 할 글이 없습니다.");
		}
		this.writer.close();
	}

	public void write() throws Exception {
		// TODO Auto-generated method stub
		this.writer = new BufferedWriter(new FileWriter(src, true));
		if (writeInMap.size() >= 1) {
			Set<Integer> set = writeInMap.keySet();
			for (Integer key : set) {
				this.writer.write(writeInMap.get(key));
				this.writer.newLine();
				System.out.println("저장 " + writeInMap.get(key));
			}
		} else {
			System.out.println("저장 할 글이 없습니다.");
		}
		this.writer.close();
	}

}
