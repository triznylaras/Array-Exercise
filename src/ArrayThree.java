import java.util.*;

public class ArrayThree {
public static void main(String[] args) {
	HashMap<String,String> hmap = new HashMap<String,String>();
	hmap.put("Italy", "Rome");
	hmap.put("Luxembourg", "Luxembourg");
	hmap.put("Belgium", "Brussels");
	hmap.put("Denmark", "Copenhagen");
	hmap.put("Finland", "Helsinki");
	hmap.put("France", "Paris");
	hmap.put("Slovakia", "Bratislava");
	hmap.put("Slovenia", "Ljubljana");
	hmap.put("Germany", "Berlin");
	hmap.put("Greece", "Athens");
	hmap.put("Ireland", "Dublin");
	hmap.put("Netherlands", "Amsterdam");
	hmap.put("Portugal", "Lisbon");
	hmap.put("Spain", "Madrid");
	hmap.put("Sweden", "Stockholm");
	hmap.put("United Kingdom", "London");
	hmap.put("Cyprus", "Nicosia");
	hmap.put("Lithuania", "Vilnius");
	hmap.put("Czech Republic", "Prague");
	hmap.put("Estonia", "Tallin");
	hmap.put("Hungary", "Budapest");
	hmap.put("Latvia", "Riga");
	hmap.put("Malta", "Valetta");
	hmap.put("Austria", "Vienna");
	hmap.put("Poland", "Warsaw");
	
	System.out.println("Before Sorting :");
	Set set = hmap.entrySet();
	Iterator iterator = set.iterator();
	while(iterator.hasNext()) {
		Map.Entry me = (Map.Entry)iterator.next();
		System.out.print("The capital of " + me.getKey() + " is ");
		System.out.println(me.getValue());
	}
	Map<String,String> map = new TreeMap<String,String>(hmap);
	System.out.println("\nAfter Sorting :");
	Set set2 = map.entrySet();
	Iterator iterator2 = set2.iterator();
	while(iterator2.hasNext()) {
		Map.Entry me2 =(Map.Entry)iterator2.next();
		System.out.print("The capital of " + me2.getKey() + " is ");
		System.out.println(me2.getValue());
	}
}
}
