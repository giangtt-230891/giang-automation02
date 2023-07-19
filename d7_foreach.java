import java.util.ArrayList;
import java.util.List;

public class d7_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
        list.add("An");
        list.add("Binh");
        list.add("Cuc");
        list.add("Hoa");
        list.add("Hong");
        for (String obj : list) {
            System.out.println(obj);
        }
	}

}
