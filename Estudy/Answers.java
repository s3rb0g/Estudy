import java.util.*;
public class Answers extends Quizzes{
	static Storing get = new Storing();
	static char go;
	public static char one(int index, int quizNum){
		if(quizNum == 0){
			go = get.Quiz11.get(index);
		}
		else if(quizNum == 1){
			go = get.Quiz21.get(index);
		}
		else if(quizNum == 2){
			go = get.Quiz31.get(index);
		}
		else if(quizNum == 3){
			go = get.Quiz41.get(index);
		}
		else if(quizNum == 4){
			go = get.Quiz51.get(index);
		}	
			
		return go;			
	}
	
	public static char two(int index, int quizNum){
		if(quizNum == 0){
			go = get.Quiz12.get(index);
		}
		else if(quizNum == 1){
			go = get.Quiz22.get(index);
		}
		else if(quizNum == 2){
			go = get.Quiz32.get(index);
		}
		else if(quizNum == 3){
			go = get.Quiz42.get(index);
		}
		else if(quizNum == 4){
			go = get.Quiz52.get(index);
		}	
			
		return go;			
	}
	
	public static char three(int index, int quizNum){
		if(quizNum == 0){
			go = get.Quiz13.get(index);
		}
		else if(quizNum == 1){
			go = get.Quiz23.get(index);
		}
		else if(quizNum == 2){
			go = get.Quiz33.get(index);
		}
		else if(quizNum == 3){
			go = get.Quiz43.get(index);
		}
		else if(quizNum == 4){
			go = get.Quiz53.get(index);
		}	
			
		return go;			
	}
	
	public static char four(int index, int quizNum){
		if(quizNum == 0){
			go = get.Quiz14.get(index);
		}
		else if(quizNum == 1){
			go = get.Quiz24.get(index);
		}
		else if(quizNum == 2){
			go = get.Quiz34.get(index);
		}
		else if(quizNum == 3){
			go = get.Quiz44.get(index);
		}
		else if(quizNum == 4){
			go = get.Quiz54.get(index);
		}	
			
		return go;			
	}
	
	public static char five(int index, int quizNum){
		if(quizNum == 0){
			go = get.Quiz15.get(index);
		}
		else if(quizNum == 1){
			go = get.Quiz25.get(index);
		}
		else if(quizNum == 2){
			go = get.Quiz35.get(index);
		}
		else if(quizNum == 3){
			go = get.Quiz45.get(index);
		}
		else if(quizNum == 4){
			go = get.Quiz55.get(index);
		}	
			
		return go;			
	}
	
	
	public static void setOne(int index, int quizNum, char ans){
		if(quizNum == 0){
			get.Quiz11.set(index, ans);
		}
		else if(quizNum == 1){
			get.Quiz21.set(index, ans);
		}
		else if(quizNum == 2){
			get.Quiz31.set(index, ans);
		}
		else if(quizNum == 3){
			get.Quiz41.set(index, ans);
		}
		else if(quizNum == 4){
			get.Quiz51.set(index, ans);
		}	
	}
	
	public static void setTwo(int index, int quizNum, char ans){
		if(quizNum == 0){
			get.Quiz12.set(index, ans);
		}
		else if(quizNum == 1){
			get.Quiz22.set(index, ans);
		}
		else if(quizNum == 2){
			get.Quiz32.set(index, ans);
		}
		else if(quizNum == 3){
			get.Quiz42.set(index, ans);
		}
		else if(quizNum == 4){
			get.Quiz52.set(index, ans);
		}	
	}
	
	public static void setThree(int index, int quizNum, char ans){
		if(quizNum == 0){
			get.Quiz13.set(index, ans);
		}
		else if(quizNum == 1){
			get.Quiz23.set(index, ans);
		}
		else if(quizNum == 2){
			get.Quiz33.set(index, ans);
		}
		else if(quizNum == 3){
			get.Quiz43.set(index, ans);
		}
		else if(quizNum == 4){
			get.Quiz53.set(index, ans);
		}	
	}
	
	public static void setFour(int index, int quizNum, char ans){
		if(quizNum == 0){
			get.Quiz14.set(index, ans);
		}
		else if(quizNum == 1){
			get.Quiz24.set(index, ans);
		}
		else if(quizNum == 2){
			get.Quiz34.set(index, ans);
		}
		else if(quizNum == 3){
			get.Quiz44.set(index, ans);
		}
		else if(quizNum == 4){
			get.Quiz54.set(index, ans);
		}	
	}
	
	public static void setFive(int index, int quizNum, char ans){
		if(quizNum == 0){
			get.Quiz15.set(index, ans);
		}
		else if(quizNum == 1){
			get.Quiz25.set(index, ans);
		}
		else if(quizNum == 2){
			get.Quiz35.set(index, ans);
		}
		else if(quizNum == 3){
			get.Quiz45.set(index, ans);
		}
		else if(quizNum == 4){
			get.Quiz55.set(index, ans);
		}	
	}
	
	
	
	
}