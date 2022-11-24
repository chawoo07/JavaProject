
import java.util.TreeMap;

class Main {
    static Show show = new Show();
    static Input input = new Input();
    static Add add = new Add();
    static Del del = new Del();
    static Exit exit = new Exit();

    static TreeMap<Integer, String> writeMap = new TreeMap<>();
    static TreeMap<Integer, String> writeInMap = new TreeMap<>();
    protected int count = 1;


    public static void main(String[] args) {
        show.show();
        System.out.println();
    }


}


