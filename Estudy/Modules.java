import java.util.*;
public class Modules extends Student{
	static Scanner xd = new Scanner(System.in);
	static Handouts handout = new Handouts();
	static Storing get = new Storing();
	static Progress prog = new Progress();
	static int pageNum;
	static String path;
	
	public static void handouts(int index){
	do{
		try{
			System.out.println("\nWhat do you want to browse?");
			System.out.println("[1] Computer Programming 		          \tProgress: " + get.Progress1.get(index) + "%");
			System.out.println("[2] Data Structure and Algorithms         \tProgress: " + get.Progress2.get(index) + "%");
			System.out.println("[3] Human-Computer Interaction            \tProgress: " + get.Progress3.get(index) + "%");
			System.out.println("[4] Object Oriented Programming           \tProgress: " + get.Progress4.get(index) + "%");
			System.out.println("[5] System Administration and Maintenance \tProgress: " + get.Progress5.get(index) + "%");
			System.out.println("[6] Exit");
			System.out.print("\nOption: ");
				int pick = xd.nextInt();
			for(int s = 0; s < 50; s++) System.out.println();
			
			if(pick > 0 && pick < 6){
				pick -= 1;
				page1(index, pick);
				
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
	
	public static void page1(int index, int handNum){
		pageNum = 1;
		prog.progress(index, handNum, pageNum);	
		path = handout.page1[handNum];	
		handout.read(path);
		
		System.out.println("\n[1] Next");
		System.out.println("[2] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			page2(index, handNum);
		}
		else if(pick == '2'){
			System.out.println("\nExit Successfuly");
		}
		else{
			System.out.println("\nPlease Pick a Number Again");
			page1(index, handNum);
		}
			
	}
	
	public static void page2(int index, int handNum){
		pageNum = 2;
		prog.progress(index, handNum, pageNum);	
		path = handout.page2[handNum];	
		handout.read(path);
		
		System.out.println("\n[1] Next");
		System.out.println("[2] Previous");
		System.out.println("[3] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			page3(index, handNum);
		}
		else if(pick == '2'){
			page1(index, handNum);
		}
		else if(pick == '3'){
			System.out.println("\nExit Successfuly");
		}
		else{
			System.out.println("\nInvalid Syntax");
			page2(index, handNum);
		}
			
	}
	
	public static void page3(int index, int handNum){
		pageNum = 3;
		prog.progress(index, handNum, pageNum);	
		path = handout.page3[handNum];	
		handout.read(path);
		
		System.out.println("\n[1] Next");
		System.out.println("[2] Previous");
		System.out.println("[3] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			page4(index, handNum);
		}
		else if(pick == '2'){
			page2(index, handNum);
		}
		else if(pick == '3'){
			System.out.println("\nExit Successfuly");
		}
		else{
			System.out.println("\nInvalid Syntax");
			page3(index, handNum);
		}
	}
	
	public static void page4(int index, int handNum){
		pageNum = 4;
		prog.progress(index, handNum, pageNum);	
		path = handout.page4[handNum];	
		handout.read(path);
		
		System.out.println("\n[1] Next");
		System.out.println("[2] Previous");
		System.out.println("[3] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			page5(index, handNum);
		}
		else if(pick == '2'){
			page3(index, handNum);
		}
		else if(pick == '3'){
			System.out.println("\nExit Successfuly");
		}
		else{
			System.out.println("\nInvalid Syntax");
			page4(index, handNum);
		}
	}
	
	public static void page5(int index, int handNum){
		pageNum = 5;
		prog.progress(index, handNum, pageNum);	
		path = handout.page5[handNum];	
		handout.read(path);
		
		System.out.println("\n[1] Previous");
		System.out.println("[2] Exit");
		System.out.print("\nOption: ");
			char pick = xd.next().charAt(0);
		for(int s = 0; s < 50; s++) System.out.println();
		
		if(pick == '1'){
			page4(index, handNum);
		}
		else if(pick == '2'){
			System.out.println("\nExit Successfuly");
		}
		else{
			System.out.println("\nInvalid Syntax");
			page5(index, handNum);
		}
	}
	
	
	
	
}