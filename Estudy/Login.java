import java.util.*;
public class Login extends Estudy{
	static Scanner xd = new Scanner(System.in);
	static Storing get = new Storing();
	static int index = 0;
	
	public static void verify1(String user, String pass){
		if(user.equals("Teacher") && pass.equals("1234")){
			for(int s = 0; s < 50; s++) System.out.println();
			Teacher teach = new Teacher();
			teach.monitor();
		}
		else{
			verify2(user, pass);
		}		
	}
	
	public static void verify2(String user, String pass){
		if(get.Username.contains(user)){
			do{
				if(user.equals(get.Username.get(index))){
					verify3(pass);
					break;
				}
				else{
					index++;
				}
			}while(true);
		}
		else{
			for(int s = 0; s < 50; s++) System.out.println();
			System.out.println("\nIncorrect Username or Password");
		}
	}
	
	public static void verify3(String pass){
		if(pass.equals(get.Password.get(index))){
			for(int s = 0; s < 50; s++) System.out.println();
			System.out.println("\nLogin Successful");
			System.out.println("\nWelcome, " + get.Name.get(index) + "!");
			System.out.print("\n[enter any key] ");
				char pick = xd.next().charAt(0);
			
			for(int s = 0; s < 50; s++) System.out.println();
			Student stud = new Student();
			stud.dashboard(index);	
			index -= index;
			
		}
		else{
			for(int s = 0; s < 50; s++) System.out.println();
			System.out.println("\nIncorrect Username or Password");
			index -= index;
		}
	}
}