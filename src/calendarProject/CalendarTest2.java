package calendarProject;

import java.util.*;

public class CalendarTest2 {
	private final static String PROMPT = "cal>";
	
	
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		CalendarTest2_class cal = new CalendarTest2_class();
		
		int mon = 1;		
		
		while(true) {
			System.out.println("월을 입력하세요.");
			mon = sc.nextInt();		
			if(mon == -1) {
				System.out.println("종료합니다.");
				break;
			}
			if(mon > 12) {
				continue; // 처음으로 돌아감
			}
			cal.printSampleCalendar(2022, mon);
		}		
		sc.close();
	}
	
	public static void main(String[] args) {
		// 셀 실행
		
		CalendarTest2 p = new CalendarTest2();
		p.runPrompt();
	}
		
}
	
	
	
	

