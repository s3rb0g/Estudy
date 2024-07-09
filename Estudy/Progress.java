public class Progress extends Modules{
	public static void progress(int index, int handNum, int pageNum){
		Storing get = new Storing();
		int prog;
		int total;
		handNum += 1;
		
		if(handNum == 1){
			prog = get.Progress1.get(index);
			total = percent(pageNum, prog);
			get.Progress1.set(index, total);
		}
		else if(handNum == 2){
			prog = get.Progress2.get(index);
			total = percent(pageNum, prog);
			get.Progress2.set(index, total);
		}
		else if(handNum == 3){
			prog = get.Progress3.get(index);
			total = percent(pageNum, prog);
			get.Progress3.set(index, total);
		}
		else if(handNum == 4){
			prog = get.Progress4.get(index);
			total = percent(pageNum, prog);
			get.Progress4.set(index, total);
		}
		else if(handNum == 5){
			prog = get.Progress5.get(index);
			total = percent(pageNum, prog);
			get.Progress5.set(index, total);
		}	
	}
	
	public static int percent(int pageNum, int prog){
		if (pageNum == 1 && prog < 20){
			prog += 20;
		}
		
		else if (pageNum == 2 && prog < 40){
			prog += 20;;
		}
		
		else if (pageNum == 3 && prog < 60){
			prog += 20;
		}
		
		else if (pageNum == 4 && prog < 80){
			prog += 20;
		}
		
		else if (pageNum == 5 && prog < 100){
			prog += 20;
		}
	
		return prog;
	}
}