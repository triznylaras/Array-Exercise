import java.util.*;

public class ArrayEight {
	public static void main(String[] args) {
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Sophia", 31);
		hmap.put("Jacob", 41);
		hmap.put("William", 39);
		hmap.put("Ramesh", 40);
		
		System.out.println("Before Sorting :");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		Map<String,Integer> map = new TreeMap<String,Integer>(hmap);
		System.out.println("\nAfter Ascending Sorting by Keys :");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry me2 =(Map.Entry)iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}
		
		Map<String,Integer> map2 = sortByValues(hmap);
		System.out.println("\nAfter Ascending Sorting by Values :");
		Set set3 = map.entrySet();
		Iterator iterator3 = set3.iterator();
		while(iterator3.hasNext()) {
			Map.Entry me3 =(Map.Entry)iterator3.next();
			System.out.print(me3.getKey() + ": ");
			System.out.println(me3.getValue());
		}
}

	private static Map<String, Integer> sortByValues(HashMap<String, Integer> hmap) {
		// TODO Auto-generated method stub
		return null;
	}
}
