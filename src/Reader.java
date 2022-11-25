import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;

public class Reader extends Main{
	
	BufferedReader reader;
	String str = null;
	
	public Reader() throws Exception {
		super();
		this.reader = new BufferedReader(new FileReader(src));
	}
	public void write() throws Exception {
		// TODO Auto-generated method stub
		Set<Integer> key = writeMap.keySet();
		while ((this.str = this.reader.readLine()) != null) {
			System.out.println("읽음 : " + this.str);
		}
	}
}
