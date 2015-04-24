import java.util.Scanner;
public class PreguntarNombre {
	public static Scanner in = new Scanner(System.in);
	
	public static String askname(){
		String name,lastname;
		System.out.print("Enter your first name: ");
		name = in.nextLine();
		System.out.print("Now enter your last name: ");
		lastname = in.nextLine();
		String fullname = name + " " + lastname;
		return fullname;
	}
}
