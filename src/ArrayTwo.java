
public class ArrayTwo {
	public static void main(String[] args) {
		String[] color = {"white", "green", "red"};
		
		System.out.print(color[0] + ", " + color[1] + ", " + color[2] + ",\n");
		
		for(int i=0; i<color.length; i++) {
		System.out.println("- " + color[i+1] + "\n- " + color[i] + "\n- " + color[i+2]);
	}
}
}