import java.util.*;
public class Games extends Student {
	static Scanner xd = new Scanner(System.in);
	
	public static void gameMenu(){
	do{
		System.out.println("\nWhat game do you want to play?");
		System.out.println("[1] What's on your bag?");
		System.out.println("[2] Word upside down");
		System.out.println("[3] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			game1();
		}
		else if(pick == '2'){
			game2();
		}
		else if(pick == '3'){
			System.out.println("Exit Successfuly");
			break;
		}
		else{
			System.out.println("Please Pick a Number Again");
		}
	}while(true);
		
   }
   
   
   public static void game1(){
       Scanner v = new Scanner (System.in);
       LinkedList<String> subs = new LinkedList<>();
       Stack<String> bag = new Stack <>();
   do{    
       System.out.println("\nAre you ready to go to school?");
       System.out.println("Just play this game");
       System.out.println("\n[1] Play");
       System.out.println("[2] Exit");
       System.out.print("\nOption: ");
     		char pick = xd.next().charAt(0);
     	for(int s = 0; s < 50; s++) System.out.println();
     	
       if(pick == '1'){
       		do{
		       subs.add("\n'Computer Programming'");
		       subs.add("\n'Data Structures and Algorithms'");
		       subs.add("\n'Human-Computer Interaction'");
		       subs.add("\n'Object Oriented Programming'");
		       subs.add("\n'System Administration and Maintenance'");
		       System.out.println("Select any of this Subjects: " +subs);
		       
		       System.out.print("\nHow many subjects do you want to study?\nPress [1-5]: ");
		       int a = v.nextInt();
		       
		       System.out.println("\nChoose a letter to put the Subject(s) on your Bag.\nPress 'C', 'D', 'H', 'O', or 'S'. ");
		
		       for( int i = 1;  i  <= a; i++){
		           System.out.print("\nSubject(s) "+ i + " of " + a + ": ");
		           String xx = v.next();
		           
		           if (xx.equals ("C")||xx.equals ("c")){
		               bag.push("\nComputer Programming");
		           }
		           
		           else if (xx.equals ("D")||xx.equals ("d")){
		               bag.push("\nData Structures and Algorithms");
		           }
		           
		           else if (xx.equals ("H")||xx.equals ("h")){
		               bag.push("\nHuman-Computer Interaction");
		           }
		           
		           else if (xx.equals ("O")||xx.equals ("o")){
		               bag.push("\nObject Oriented Programming");
		           }
		           
		           else if (xx.equals ("S")||xx.equals ("s")){
		               bag.push("\nSystem Administration and Maintenance");
		           }
		           
		   			else {
		       			System.out.println("Pick from ['C', 'D', 'H', 'O', or 'S']! Try Again.");
		   			}    
		       
		       }
		       for(int s = 0; s < 50; s++) System.out.println();
		       System.out.println("Your bag now has: " +bag);
		
			while(true){
		             
		       System.out.print("\nPress P to put the Subject(s) on your Bag. ");
		       String put = v.next();
		       for(int s = 0; s < 50; s++) System.out.println();
		       
		       if (put.equals ("P")|| put.equals ("p")){
					bag.pop();
		               
		           if (bag.isEmpty()){
		               System.out.print("\nYour Bag is now ready.");
		               System.out.print("\n\n[enter any key] ");
		               		char any = xd.next().charAt(0);
		               	for(int s = 0; s < 50; s++) System.out.println();
		               break;
		           }
				}         
		       else {
		           System.out.println("\nNot Valid!");
		       }         
		       System.out.println("\nSubjets(s) in the Bag: " +bag);
		           
		       }                 
		                            
			}while(false);    
   
       }
       else if(pick == '2'){
       		System.out.println("Exit Successfuly");
       		break;
       }
       else{
       		System.out.println("\nPlease Pick a Number Again");
       }
   }while(true);
}
 


	public static void game2(){
	do{
		System.out.println("\nAre you curious about how to read a word when it is reversed?");
		System.out.println("Just play this game");
		System.out.println("\n[1] Play");
		System.out.println("[2] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
			
		if(pick == '1'){
			System.out.print("\nEnter a Word: ");
			String word = xd.next();
			
			Stack<Character> sta = new Stack<>();
			for(int i = 0; i < word.length(); i++){
				sta.push(word.charAt(i));
			}
			System.out.print("\nReversed word: ");	
			while(!sta.empty()){
				System.out.print(sta.pop());
			}
			System.out.print("\n\n[enter any key] ");
				char any = xd.next().charAt(0);
			for(int s = 0; s < 50; s++) System.out.println();
		}
		else{
			System.out.println("Exit Successfuly");
			break;	
		}
	}while(true);	
		
		
	}





}

