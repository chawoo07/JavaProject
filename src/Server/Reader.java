package Server;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.regex.Pattern;

public class Reader extends ServerMain{
	
	private BufferedReader reader;
	private String str = null;
	String[] tokens = null;
	
	public Reader() throws Exception {
		super();
		this.reader = new BufferedReader(new FileReader(src));
	}
	
	public void read() throws Exception {
		// TODO Auto-generated method stub
		while ((this.str = this.reader.readLine()) != null) {
			System.out.println("읽음 : " + this.str);
			this.tokens = this.str.split(Pattern.quote("|"));
			AddForServer.addArr(this.tokens[0], this.tokens[1], this.tokens[2], this.tokens[3]);
		}
	}
}
