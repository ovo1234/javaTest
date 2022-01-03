package calendarProject;

import java.util.Scanner;

public class CalendarTest {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
	
	public int getMaxDaysOfMonth(int mon) {
		return MAX_DAYS[mon-1];
	}		
	
	public void printSampleCalendar() {
		System.out.println(" 일 월  화  수  목 금  토");
		System.out.println("------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
	}
	public void printSampleCalendar2() {
		System.out.println(" 일 월  화  수  목 금  토");
		System.out.println("------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	public void printSampleCalendar3() {
		System.out.println(" 일 월  화  수  목 금  토");
		System.out.println("------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalendarTest cal = new CalendarTest();
		
		int mon = 1;		
		
		while(true) {
			System.out.println("월을 입력하세요.");
			mon = sc.nextInt();		
			if(mon == -1) {
				System.out.println("종료합니다.");
				break;
			}
			if(mon > 12) {
				continue; 
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", mon, cal.getMaxDaysOfMonth(mon));
			if(mon == 2) {				
				cal.printSampleCalendar2();
			} else if(mon == 4) {
				cal.printSampleCalendar3();
			} else if(mon == 6) {
				cal.printSampleCalendar3();
			} else if(mon == 9) {
				cal.printSampleCalendar3();
			} else if(mon == 11) {
				cal.printSampleCalendar3();
			} else {
				cal.printSampleCalendar();
			}
			
			
			
			
			
		}
		
		
		
		sc.close();
		
}
}
