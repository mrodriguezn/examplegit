import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name, lastname;
		System.out.print("Enter your first name: ");
		name = in.nextLine();
		System.out.print("Now enter your last name: ");
		lastname = in.nextLine();
		System.out.println("Hello, "+name+" "+ lastname+"!");
	}

}
