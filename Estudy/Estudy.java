import java.util.*;
public class Estudy{
	static Scanner xd = new Scanner(System.in);
	static Storing get = new Storing();
	
	public static void main(String args[]){
	for(int s = 0; s < 50; s++) System.out.println();
do{	
	System.out.println("\nWelcome to Estudy!");
	System.out.println("\n[1] Log-in");
	System.out.println("[2] Register");
	System.out.println("[3] Exit");
	System.out.print("\nOption: ");
		char pick = xd.next().charAt(0);
	for(int s = 0; s < 50; s++) System.out.println();	
	
	if(pick == '1'){
		System.out.println("\nLog-in");
		System.out.println("\nPlease enter your Username and Password below");
		System.out.print("Username: ");
			String user = xd.next();
		System.out.print("Password: ");
			String pass = xd.next();
		
		Login log = new Login();
		log.verify1(user, pass);
	}
	else if(pick == '2'){
		register();
	}
	else if(pick == '3'){
		System.out.println("\nThank you! Bye!");		
		System.exit(0);
	}
	else{
		System.out.println("\nPlease Pick a Number Again");
	}	
}while(true);				
	}
		
	public static void register(){
	System.out.println("\nRegister");
	System.out.println("\nPlease enter the following:");
	System.out.print("Name: ");
		String name = xd.next();
	System.out.print("Surname: ");
		String surname = xd.next();
	System.out.print("Email: ");
		String email = xd.next();
	System.out.print("Contact number: ");
		String contact = xd.next();
	System.out.print("Username: ");
		String username = xd.next();
	System.out.print("Password: ");
		String password = xd.next();
do{	
	System.out.println("\nDouble check your datails before you submit");
	System.out.println("[1] Submit");
	System.out.println("[2] Cancel");
	System.out.print("\nOption: ");
		char pick = xd.next().charAt(0);
	
	if(pick == '1'){
		Storing put = new Storing(name, surname, email, contact, username, password);
		for(int s = 0; s < 50; s++) System.out.println();
		System.out.println("Saved");
		break;
	}
	else if(pick == '2'){
		for(int s = 0; s < 50; s++) System.out.println();
		System.out.println("Cancelled");
		break;
	}
	else{
		for(int s = 0; s < 50; s++) System.out.println();
		System.out.println("invalid. Please Pick a Number Again");
	}

}while(true);

	
	}









}