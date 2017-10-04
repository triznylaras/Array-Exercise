import java.util.*;

public class ArrayFive {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(4, "white");
		hmap.put(6, "green");
		hmap.put(11, "red");
		
		String val = (String)hmap.get(4);
		
		System.out.println(val);
	}
}
