package uiTest;
import java.util.*;
public class Prompt {
	
	public void printMenu() {
		System.out.println("+-------------------+");
		System.out.println("| 1. 일정 등록     ");
		System.out.println("| 2. 일정 검색     ");
		System.out.println("| 3. 달력보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+-------------------+");
	}
	
	
	
	
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else return 0;
	}
	
	public void runPrompt() {
		printMenu();
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
			
		while(true) {
			System.out.println("명령(1,2,3,h,q)");
			String cmd = sc.next();
			if (cmd.equals("1")) cmdRegistar();
			else if (cmd.equals("2")) cmdSearch();
			else if(cmd.equals("3")) cmdCal(sc, cal);
			else if(cmd.equals("h")) printMenu();
			else if (cmd.equals("q")) break;
		}
				
		
		
		System.out.println("끝");
		sc.close();
	}
	
	private void cmdCal(Scanner s, Calendar c) {
		int month = 1;
		int year = 2017;
		
		System.out.println("년도를 입력하세요.(ex: -1)");
		System.out.print("year: ");
		year = s.nextInt();
			
		System.out.println("달을 입력하세요.");
		System.out.print("month: ");
		month = s.nextInt();
		
		if(month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		c.printCalendar(year,month);		
		
	}




	private void cmdSearch() {
		
	}




	private void cmdRegistar() {
		
	}




	public static void main(String[] args) {
	
		Prompt p = new Prompt();
		p.runPrompt();

	}
}
