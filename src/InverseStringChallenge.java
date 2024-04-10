import java.util.Scanner;

public class InverseStringChallenge {
	
	public static void main(String[] args) {
		String txt = getString();
		invertString(txt);
    }
    public static String getString() {
		Scanner read = new Scanner(System.in);
		System.out.println("Inform your name, or say something: ");
		return read.nextLine(); 		
	}
	
    public static void invertString(String str) {
		System.out.print("\n");
		for (int i = str.length(); i > 0; i --) {
		System.out.print(str.substring(i-1, i));
		}
	}
}
