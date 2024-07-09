import java.util.*;
public class Student extends Login{
	static Scanner xd = new Scanner(System.in);
	static Storing get = new Storing();
	
	public static void dashboard(int index){
	do{
		System.out.println("\nDashboard");
		System.out.println("[1] Profile");
		System.out.println("[2] Modules");
		System.out.println("[3] Quizzes");
		System.out.println("[4] Minigames");
		System.out.println("[5] Log-out");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			System.out.println("\nDetails:");
			System.out.println("\nStudent Name: " + get.Name.get(index));
			System.out.println("\nStudent Surname: " + get.Surname.get(index));
			System.out.println("\nStudent Email: " + get.Email.get(index));
			System.out.println("\nStudent Contact Number: " + get.Contact.get(index));
			System.out.println("\nStudent Username: " + get.Username.get(index));
			System.out.print("\n\n[enter any key] ");
				char any = xd.next().charAt(0);	
			for(int s = 0; s < 50; s++) System.out.println();	
		}
		else if(pick == '2'){
			Modules mod = new Modules();
			mod.handouts(index);
		}
		else if(pick == '3'){
			System.out.println("\nInstruction:");
			System.out.println("\nYou can only take the quiz once.");
			System.out.println("Once you open the quiz, you cannot cancel or exit it.");
			System.out.println("There is no time taking the quiz.");
			System.out.println("Lower case Letter is considered wrong.");
			System.out.println("You can review and edit your answers before you submit.");
			System.out.print("\n[enter any key] ");
				pick = xd.next().charAt(0);
			for(int s = 0; s < 50; s++) System.out.println();
			
			Quizzes qui = new Quizzes();
			qui.quiz(index);
							
		}
		else if(pick == '4'){
			Games game = new Games();
			game.gameMenu();
		}
		else if(pick == '5'){
			System.out.println("Logged out successfuly");
			break;
		}
		else{
			System.out.println("\nInvalid Syntax");
		}
	}while(true);	
	}
}