import java.util.*;
public class Quizzes extends Modules{
	static Scanner xd = new Scanner(System.in);
	static Storing get = new Storing();
	static Questions question = new Questions();
	static Answers answer = new Answers();
	static char ans;
	static char cho;
	
	public static void quiz(int Index){
	do{
		try{
			System.out.println("\nWhat do you want to take?");
			System.out.println("[1] Quiz 1 Computer Programming");
			System.out.println("[2] Quiz 2 Data Structure and Algorithms");
			System.out.println("[3] Quiz 3 Human-Computer Interaction");
			System.out.println("[4] Quiz 4 Object Oriented Programming");
			System.out.println("[5] Quiz 5 System Administration and Maintenance");
			System.out.println("[6] Exit");
			System.out.print("\nOption: ");
				int pick = xd.nextInt();
			for(int s = 0; s < 50; s++) System.out.println();
			
			if(pick > 0 && pick < 6){
				take(index, pick);
			}
			else if(pick == 6){
				System.out.println("\nExit Successfuly");
				break;
			}
			else{
				System.out.println("\nPick a Number Again");
			}	
		}catch(Exception e){
			for(int s = 0; s < 50; s++) System.out.println();
			System.out.println("\nSorry, Please Pick a Number.");
        	xd.nextLine();
		}
	}while(true);	
			
	}
	
	public static void take(int index, int quizNum){
		if(get.QTake1.get(index) == quizNum || get.QTake2.get(index) == quizNum ||
		   get.QTake3.get(index) == quizNum || get.QTake4.get(index) == quizNum ||
		   get.QTake5.get(index) == quizNum){
			do{	
				System.out.println("\nYou already take this quiz");
				System.out.println("\n[1] Review the quiz");
				System.out.println("[2] Exit");
				System.out.print("\nOption: ");
					char pick = xd.next().charAt(0);
				for(int s = 0; s < 50; s++) System.out.println();
				
				if(pick == '1'){
					Checker check = new Checker();
					quizNum -= 1;
					check.result(index, quizNum);
					break;
				}
				else if(pick == '2'){
					System.out.println("\nExit Successfuly");
					break;
				}
				else{
					System.out.println("Please Pick a Correct Number Again");
				}		
			}while(true);	
		}
		else{
			quizNum -= 1;
			number1(index, quizNum);
		}
		
	}
		
	public static void number1(int index, int quizNum){
		do{
			System.out.println("\n" + question.Q1[quizNum]);
			System.out.println("A) " + question.C1[quizNum][0]);
			System.out.println("B) " + question.C1[quizNum][1]);
			System.out.println("C) " + question.C1[quizNum][2]);
			System.out.println("D) " + question.C1[quizNum][3]);
			
			System.out.println("\nResponse: " + answer.one(index, quizNum));
			
			System.out.println("\n[1] Answer");
			System.out.println("[2] Next");
			System.out.print("\nOption: ");
				cho = xd.next().charAt(0);
			
			if(cho == '1'){
				System.out.print("\nAnswer: ");
					ans = xd.next().charAt(0);
				answer.setOne(index, quizNum, ans);
				for(int s = 0; s < 50; s++) System.out.println();
			}
			else if(cho == '2'){
				for(int s = 0; s < 50; s++) System.out.println();
				number2(index, quizNum);
				break;
			}
			else{
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nPlease Pick a Correct Number Again");
			}
		}while(true);
	}
		
	public static void number2(int index, int quizNum){
		do{	
			System.out.println("\n" + question.Q2[quizNum]);
			System.out.println("A) " + question.C2[quizNum][0]);
			System.out.println("B) " + question.C2[quizNum][1]);
			System.out.println("C) " + question.C2[quizNum][2]);
			System.out.println("D) " + question.C2[quizNum][3]);
			
			System.out.println("\nResponse: " + answer.two(index, quizNum));
			
			System.out.println("\n[1] Answer");
			System.out.println("[2] Next");
			System.out.println("[3] Previous");
			System.out.print("\nOption: ");
				cho = xd.next().charAt(0);
			
			if(cho == '1'){
				System.out.print("\nAnswer: ");
				ans = xd.next().charAt(0);
				answer.setTwo(index, quizNum, ans);
				for(int s = 0; s < 50; s++) System.out.println();
			}
			else if(cho == '2'){
				for(int s = 0; s < 50; s++) System.out.println();
				number3(index, quizNum);
				break;
			}
			else if(cho == '3'){
				for(int s = 0; s < 50; s++) System.out.println();
				number1(index, quizNum);
				break;
			}
			else{
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nPlease Pick a Correct Number Again");
			}
		}while(true);
	}
		
	public static void number3(int index, int quizNum){
		do{
			System.out.println("\n" + question.Q3[quizNum]);
			System.out.println("A) " + question.C3[quizNum][0]);
			System.out.println("B) " + question.C3[quizNum][1]);
			System.out.println("C) " + question.C3[quizNum][2]);
			System.out.println("D) " + question.C3[quizNum][3]);
			
			System.out.println("\nResponse: " + answer.three(index, quizNum));
			
			System.out.println("\n[1] Answer");
			System.out.println("[2] Next");
			System.out.println("[3] Previous");
			System.out.print("\nOption: ");
				cho = xd.next().charAt(0);
			
			if(cho == '1'){
				System.out.print("\nAnswer: ");
				ans = xd.next().charAt(0);
				answer.setThree(index, quizNum, ans);
				for(int s = 0; s < 50; s++) System.out.println();
			}
			else if(cho == '2'){
				for(int s = 0; s < 50; s++) System.out.println();
				number4(index, quizNum);
				break;
			}
			else if(cho == '3'){
				for(int s = 0; s < 50; s++) System.out.println();
				number2(index, quizNum);
				break;
			}
			else{
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nPlease Pick a Correct Number Again");
			}
		}while(true);
	}
		
	public static void number4(int index, int quizNum){
		do{
			System.out.println("\n" + question.Q4[quizNum]);
			System.out.println("A) " + question.C4[quizNum][0]);
			System.out.println("B) " + question.C4[quizNum][1]);
			System.out.println("C) " + question.C4[quizNum][2]);
			System.out.println("D) " + question.C4[quizNum][3]);
			
			System.out.println("\nResponse: " + answer.four(index, quizNum));

			System.out.println("\n[1] Answer");
			System.out.println("[2] Next");
			System.out.println("[3] Previous");
			System.out.print("\nOption: ");
				cho = xd.next().charAt(0);
			
			if(cho == '1'){
				System.out.print("\nAnswer: ");
				ans = xd.next().charAt(0);
				answer.setFour(index, quizNum, ans);
				for(int s = 0; s < 50; s++) System.out.println();
			}
			else if(cho == '2'){
				for(int s = 0; s < 50; s++) System.out.println();
				number5(index, quizNum);
				break;
			}
			else if(cho == '3'){
				for(int s = 0; s < 50; s++) System.out.println();
				number3(index, quizNum);
				break;
			}
			else{
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nPlease Pick a Correct Number Again");
			}
		}while(true);
	}
		
	public static void number5(int index, int quizNum){
		do{
			System.out.println("\n" + question.Q5[quizNum]);
			System.out.println("A) " + question.C5[quizNum][0]);
			System.out.println("B) " + question.C5[quizNum][1]);
			System.out.println("C) " + question.C5[quizNum][2]);
			System.out.println("D) " + question.C5[quizNum][3]);
			
			System.out.println("\nResponse: " + answer.five(index, quizNum));
		
	
			System.out.println("\n[1] Answer");	
			System.out.println("[2] Previous");
			System.out.println("[3] Done");
			System.out.print("\nOption: ");
				cho = xd.next().charAt(0);
			
			if(cho == '1'){
				System.out.print("\nAnswer: ");
				ans = xd.next().charAt(0);
				answer.setFive(index, quizNum, ans);
				for(int s = 0; s < 50; s++) System.out.println();
			}
			else if(cho == '2'){
				for(int s = 0; s < 50; s++) System.out.println();
				number4(index, quizNum);
				break;
			}
			else if(cho == '3'){
				for(int s = 0; s < 50; s++) System.out.println();
				Checker check = new Checker();
				check.review(index, quizNum);
				break;
			}
			else{
				for(int s = 0; s < 50; s++) System.out.println();
				System.out.println("\nPlease Pick a Correct Number Again");
			}
		}while(true);
	}
}