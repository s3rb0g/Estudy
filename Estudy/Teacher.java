import java.util.*;
public class Teacher extends Login{
	static Scanner xd = new Scanner(System.in);
	static Storing get = new Storing();
	static PriorityQueue<String> priority = new PriorityQueue<>();
	static String alpha;
	static int index = 0;
	static int count = 0;
	public static void monitor(){
		do{
			System.out.println("\nDashboard");
			System.out.println("[1] Students' Info");
			System.out.println("[2] Modules' Progress");
			System.out.println("[3] Quizzes' Scores");
			System.out.println("[4] Log-out");
			System.out.print("\nOption: ");
				char pick = xd.next().charAt(0);
			for(int s = 0; s < 50; s++) System.out.println();
				
			if(pick == '1'){
				sInfo();
			}
			else if(pick == '2'){
				mProgress();
			}
			else if(pick == '3'){
				qScores();
			}
			else if(pick == '4'){
				System.out.println("Logged out Successfuly");
				break;
			}
			else{
				System.out.println("Please Pick a Correct Number");
			}
			
		}while(true);
		
	}
	
	public static void sInfo(){
		do{
		System.out.println("\nStudent list\n");
		for(String surname: get.Surname){
			priority.offer(surname);
		}
		count -= count;
		while(!priority.isEmpty()){
			alpha = priority.poll();
			alphabet(alpha);
			
		}
			System.out.println("\n[1] To see details");
			System.out.println("[2] Exit");
			System.out.print("\nOption: ");
				char pick = xd.next().charAt(0);			
			
			if(pick == '1'){
				info();
			}
			else if(pick == '2'){
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nExit Successfuly");
				break;
			}
			else{
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nPick a Number Again");
			}	
		}while(true);	
			
	}

	public static void alphabet(String alpha){
		do{
			if(get.Surname.get(index).equals(alpha)){
				count++;
				System.out.println(count + ". " + get.Surname.get(index) + ", " + get.Name.get(index));
				System.out.println("----------------------");
				index -= index;
				break;
			}
			else{
				index++;
			}
		}while(true);
	}
	
	public static void info(){
		do{		
			try{	
				System.out.println("\nChoose the number of the student you want to see the details");
				System.out.print("\nStudent Number: ");
					int pick = xd.nextInt();
				for(int s = 0; s < 50; s++) System.out.println();
					
				if(pick > 0 && pick <= get.Surname.size()){
					nfo(pick);
					System.out.print("\n[enter any key} ");
						char any = xd.next().charAt(0);
					for(int s = 0; s < 50; s++) System.out.println();
					break;
						
				}
				else{
					System.out.println("\nPick a number of the student again");
				}
			}catch(Exception e){
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nSorry, Please Pick a Number");
				xd.nextLine();
			}
		}while(true);	
	}
	
	
	public static void nfo(int pick){
		String cho = " ";
		for(String surname: get.Surname){
			priority.offer(surname);
		}
		
		for(int i = 1; i <= pick; i++){
			cho = priority.poll();
		}

		do{
			if(get.Surname.get(index).equals(cho)){
				System.out.println("\nDetails:");
				System.out.println("\nStudent Name: " + get.Name.get(index));
				System.out.println("\nStudent Surname: " + get.Surname.get(index));
				System.out.println("\nStudent Email: " + get.Email.get(index));
				System.out.println("\nStudent Contact Number: " + get.Contact.get(index));
				System.out.println("\nStudent Username: " + get.Username.get(index));
				index -= index;
				break;
			}
			else{
				index++;
			}
		}while(true);
	}

	
	public static void mProgress(){
		System.out.println("\nModule Progress Record");
		System.out.println("\nNames \t\t\t\t\t Computer  \t\tData Structure" +
		"\t\tHuman-Computer  \tObject Oriented   \tSystem Administration ");
		
		System.out.println("      \t\t\t\t\tProgramming  \tand Algorithms" +
		"\t\tInteraction  \t\tProgramming  \t\tand Maintenance");
		System.out.println("------------------------------------------------------"+
			"----------------------------------------------------------------------");	
		for(String surname: get.Surname){
			priority.offer(surname);
		}
		
		while(!priority.isEmpty()){
			alpha = priority.poll();
			progress(alpha);	
		}
		System.out.print("\n\n[enter any key] ");
			char any = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
	}
	
	public static void progress(String alpha){
		do{
			if(get.Surname.get(index).equals(alpha)){
				System.out.println("\n" + get.Surname.get(index) +", "+ get.Name.get(index));
				System.out.println("\t\t\t\t\t\t\t "+ get.Progress1.get(index) +"%    \t\t\t"+ get.Progress2.get(index) 
					+"% \t\t\t\t\t"+ get.Progress3.get(index) +"% \t\t\t\t\t"+ get.Progress4.get(index) +"% \t\t\t\t\t"
					+ get.Progress5.get(index) +"%");
					 
				System.out.println("------------------------------------------------------"+
					"----------------------------------------------------------------------");
				index -= index;
				break;
			}
			else{
				index++;
			}
		}while(true);
	}
	
	
	public static void qScores(){
		System.out.println("\nQuiz Record");
		System.out.println("\nNames \t\t\t\t\t Quiz1 \t\tQuiz2 \t\tQuiz3 \t\tQuiz4 \t\tQuiz5");	
		System.out.println("--------------------------------------------------------------------------------------");	
		for(String surname: get.Surname){
			priority.offer(surname);
		}
		
		while(!priority.isEmpty()){
			alpha = priority.poll();
			score(alpha);	
		}
		System.out.print("\n\n[enter any key] ");
			char any = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
	}
	
	public static void score(String alpha){
		do{
			if(get.Surname.get(index).equals(alpha)){
				System.out.println("\n" + get.Surname.get(index) +", "+ get.Name.get(index));
				System.out.println("\t\t\t\t\t\t "+ get.Score1.get(index) +"/10  \t\t"+ get.Score2.get(index) +"/10 \t\t"+
					 get.Score3.get(index) +"/10 \t\t"+ get.Score4.get(index) +"/10 \t\t"+ get.Score5.get(index) +"/10");
				System.out.println("--------------------------------------------------------------------------------------");
				index -= index;
				break;
			}
			else{
				index++;
			}
		}while(true);
	}
	
	
	
}