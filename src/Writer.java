import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer extends Main{
	
	BufferedWriter writer;
	String str = null;
	
	public Writer() throws Exception {
		super();
		
	}

	public void overWrite() throws Exception {
		// TODO Auto-generated method stub
		this.writer = new BufferedWriter(new FileWriter(src, false));
		if (writeInMap.size() >= 1) {
			for (int i = 1; i <= count; i++) {
				this.writer.write(writeInMap.get(i) + ";");
				System.out.println("저장 " + writeInMap.get(i));
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
			for (int i = 1; i <= count; i++) {
				this.writer.write(writeInMap.get(i) + ";");
				System.out.println("저장 " + writeInMap.get(i));
			}
		} else {
			System.out.println("저장 할 글이 없습니다.");
		}
		this.writer.close();
	}

}
