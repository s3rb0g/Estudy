import java.util.*;
public class Checker extends Quizzes{
	static Storing get = new Storing();
	static Scanner xd = new Scanner(System.in);
	static Questions question = new Questions();
	static Answers answer = new Answers();
	static char[][] ans =  {{'B', 'D', 'A', 'A', 'A'},
							{'A', 'B', 'D', 'A', 'C'},
							{'B', 'D', 'A', 'D', 'A'},
							{'D', 'D', 'B', 'A', 'C'},
							{'A', 'A', 'A', 'D', 'B'}};	
	
	public static void review(int index, int quizNum){
		System.out.println("\n" + question.Q1[quizNum]);
		System.out.println("Response: " + answer.one(index, quizNum));
		
		System.out.println("\n" + question.Q2[quizNum]);
		System.out.println("Response: " + answer.two(index, quizNum));
		
		System.out.println("\n" + question.Q3[quizNum]);
		System.out.println("Response: " + answer.three(index, quizNum));
		
		System.out.println("\n" + question.Q4[quizNum]);
		System.out.println("Response: " + answer.four(index, quizNum));
		
		System.out.println("\n" + question.Q5[quizNum]);
		System.out.println("Response: " + answer.five(index, quizNum));
	
	do{	
		System.out.println("\n\n[1] Edit");
		System.out.println("[2] Submit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			Quizzes quiz = new Quizzes();
			quiz.number1(index, quizNum);
			break;
		}
		else if(pick == '2'){
			checking(index, quizNum);
			result(index, quizNum);
			break;
		}
		else{
			System.out.println("\nPlease Pick a Correct Number");
		}
		
	}while(true);	
			
	}
	
	public static void checking(int index, int quizNum){
		int count = 0;	
		
		for(int i = 0; i < 5; i++){
			switch(i){
				case 0:
					if(answer.one(index, quizNum) == ans[quizNum][i]){
						count++;
					}break;
				case 1:
					if(answer.two(index, quizNum) == ans[quizNum][i]){
						count++;
					}break;
				case 2:
					if(answer.three(index, quizNum) == ans[quizNum][i]){
						count++;
					}break;
				case 3:
					if(answer.four(index, quizNum) == ans[quizNum][i]){
						count++;
					}break;
				case 4:
					if(answer.five(index, quizNum) == ans[quizNum][i]){
						count++;
					}break;				
			}
			
		}
		count *= 2;
		if(quizNum == 0){
			get.Score1.set(index, count);
			get.QTake1.set(index, 1);
		}
		else if(quizNum == 1){
			get.Score2.set(index, count);
			get.QTake2.set(index, 2);
		}
		else if(quizNum == 2){
			get.Score3.set(index, count);
			get.QTake3.set(index, 3);
		}
		else if(quizNum == 3){
			get.Score4.set(index, count);
			get.QTake4.set(index, 4);
		}
		else if(quizNum == 4){
			get.Score5.set(index, count);
			get.QTake5.set(index, 5);
		}

	}
	
	public static void result(int index, int quizNum){
		System.out.println("\n" + question.Q1[quizNum]);
		System.out.println("Response: " + answer.one(index, quizNum));
		System.out.println("Correct answer: " + ans[quizNum][0]);
		
		System.out.println("\n" + question.Q2[quizNum]);
		System.out.println("Response: " + answer.two(index, quizNum));
		System.out.println("Correct answer: " + ans[quizNum][1]);
		
		System.out.println("\n" + question.Q3[quizNum]);
		System.out.println("Response: " + answer.three(index, quizNum));
		System.out.println("Correct answer: " + ans[quizNum][2]);
		
		System.out.println("\n" + question.Q4[quizNum]);
		System.out.println("Response: " + answer.four(index, quizNum));
		System.out.println("Correct answer: " + ans[quizNum][3]);
		
		System.out.println("\n" + question.Q5[quizNum]);
		System.out.println("Response: " + answer.five(index, quizNum));
		System.out.println("Correct answer: " + ans[quizNum][4]);
		
		int score = 0;
		if(quizNum == 0){
			score = get.Score1.get(index);
		}
		else if(quizNum == 1){
			score = get.Score2.get(index);
		}
		else if(quizNum == 2){
			score = get.Score3.get(index);
		}
		else if(quizNum == 3){
			score = get.Score4.get(index);
		}
		else if(quizNum == 4){
			score = get.Score5.get(index);
		}
	
		System.out.println("\nYou got " + score + "/10.");
		score -= score;
		
		System.out.print("\n\n[enter any key] ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
			
			
			
			
			
	}
	
}