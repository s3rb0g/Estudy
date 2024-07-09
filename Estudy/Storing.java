import java.util.*;
public class Storing extends Estudy{
	static LinkedList<String> Name = new LinkedList<>();
	static LinkedList<String> Surname = new LinkedList<>();
	static LinkedList<String> Email = new LinkedList<>();
	static LinkedList<String> Contact = new LinkedList<>();
	static LinkedList<String> Username = new LinkedList<>();
	static LinkedList<String> Password = new LinkedList<>();
	static ArrayList<Integer> Progress1 = new ArrayList<>();
	static ArrayList<Integer> Progress2 = new ArrayList<>();
	static ArrayList<Integer> Progress3 = new ArrayList<>();
	static ArrayList<Integer> Progress4 = new ArrayList<>();
	static ArrayList<Integer> Progress5 = new ArrayList<>();
	static ArrayList<Character> Quiz11 = new ArrayList<>();
	static ArrayList<Character> Quiz12 = new ArrayList<>();
	static ArrayList<Character> Quiz13 = new ArrayList<>();
	static ArrayList<Character> Quiz14 = new ArrayList<>();
	static ArrayList<Character> Quiz15 = new ArrayList<>();	
	static ArrayList<Character> Quiz21 = new ArrayList<>();
	static ArrayList<Character> Quiz22 = new ArrayList<>();
	static ArrayList<Character> Quiz23 = new ArrayList<>();
	static ArrayList<Character> Quiz24 = new ArrayList<>();
	static ArrayList<Character> Quiz25 = new ArrayList<>();	
	static ArrayList<Character> Quiz31 = new ArrayList<>();
	static ArrayList<Character> Quiz32 = new ArrayList<>();
	static ArrayList<Character> Quiz33 = new ArrayList<>();
	static ArrayList<Character> Quiz34 = new ArrayList<>();
	static ArrayList<Character> Quiz35 = new ArrayList<>();	
	static ArrayList<Character> Quiz41 = new ArrayList<>();
	static ArrayList<Character> Quiz42 = new ArrayList<>();
	static ArrayList<Character> Quiz43 = new ArrayList<>();
	static ArrayList<Character> Quiz44 = new ArrayList<>();
	static ArrayList<Character> Quiz45 = new ArrayList<>();	
	static ArrayList<Character> Quiz51 = new ArrayList<>();
	static ArrayList<Character> Quiz52 = new ArrayList<>();
	static ArrayList<Character> Quiz53 = new ArrayList<>();
	static ArrayList<Character> Quiz54 = new ArrayList<>();
	static ArrayList<Character> Quiz55 = new ArrayList<>();	
	static ArrayList<Integer> Score1 = new ArrayList<>();
	static ArrayList<Integer> Score2 = new ArrayList<>();
	static ArrayList<Integer> Score3 = new ArrayList<>();
	static ArrayList<Integer> Score4 = new ArrayList<>();
	static ArrayList<Integer> Score5 = new ArrayList<>();
	static ArrayList<Integer> QTake1 = new ArrayList<>();
	static ArrayList<Integer> QTake2 = new ArrayList<>();
	static ArrayList<Integer> QTake3 = new ArrayList<>();
	static ArrayList<Integer> QTake4 = new ArrayList<>();
	static ArrayList<Integer> QTake5 = new ArrayList<>();
	
	Storing(){
	}
	
	Storing(String name, String surname, String email, String contact, String username, String password){
		Name.add(name);
		Surname.add(surname);
		Email.add(email);
		Contact.add(contact);
		Username.add(username);
		Password.add(password);
		Progress1.add(0);
		Progress2.add(0);
		Progress3.add(0);
		Progress4.add(0);
		Progress5.add(0);		
		Quiz11.add(' ');
		Quiz12.add(' ');
		Quiz13.add(' ');
		Quiz14.add(' ');
		Quiz15.add(' ');		
		Quiz21.add(' ');
		Quiz22.add(' ');
		Quiz23.add(' ');
		Quiz24.add(' ');
		Quiz25.add(' ');		
		Quiz31.add(' ');
		Quiz32.add(' ');
		Quiz33.add(' ');
		Quiz34.add(' ');
		Quiz35.add(' ');		
		Quiz41.add(' ');
		Quiz42.add(' ');
		Quiz43.add(' ');
		Quiz44.add(' ');
		Quiz45.add(' ');		
		Quiz51.add(' ');
		Quiz52.add(' ');
		Quiz53.add(' ');
		Quiz54.add(' ');
		Quiz55.add(' ');		
		Score1.add(0);
		Score2.add(0);
		Score3.add(0);
		Score4.add(0);
		Score5.add(0);
		QTake1.add(0);
		QTake2.add(0);
		QTake3.add(0);
		QTake4.add(0);
		QTake5.add(0);
		
	}
	
	
}