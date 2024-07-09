import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Handouts extends Modules{
	static String[] page1 = {"C:/Users/Ranie/Desktop/System/Estudy/Handouts/01 Handouts 1.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/02 Handouts 1.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/03 Handouts 1.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/04 Handouts 1.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/05 Handouts 1.txt"};
							 
	static String[] page2 = {"C:/Users/Ranie/Desktop/System/Estudy/Handouts/01 Handouts 2.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/02 Handouts 2.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/03 Handouts 2.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/04 Handouts 2.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/05 Handouts 2.txt"};
							 
	static String[] page3 = {"C:/Users/Ranie/Desktop/System/Estudy/Handouts/01 Handouts 3.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/02 Handouts 3.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/03 Handouts 3.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/04 Handouts 3.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/05 Handouts 3.txt"};
							 
	static String[] page4 = {"C:/Users/Ranie/Desktop/System/Estudy/Handouts/01 Handouts 4.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/02 Handouts 4.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/03 Handouts 4.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/04 Handouts 4.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/05 Handouts 4.txt"};
							 
	static String[] page5 = {"C:/Users/Ranie/Desktop/System/Estudy/Handouts/01 Handouts 5.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/02 Handouts 5.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/03 Handouts 5.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/04 Handouts 5.txt",
							 "C:/Users/Ranie/Desktop/System/Estudy/Handouts/05 Handouts 5.txt"};

	Handouts(){
	}

	public static void read(String path){
		try{
			File file = new File(path);
			Scanner scan = new Scanner(file);
		
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
		}catch(Exception e){
			System.out.println("\nFile cannot find");
		}
	}


}
