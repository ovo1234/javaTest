package calendarProject;

import java.util.*;

public class MonthTest {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
	
	public int getMaxDaysOfMonth(int mon) {
//		switch(mon) {
//		case 4,6,9,11 :
//			return 30;
//		case 2 : 
//			return 28;
//		default : 
//			return 31;
//		}
		
		return MAX_DAYS[mon-1];
	}
	
	public void printSampleCalendar() {
		System.out.println(" 일 월  화  수  목 금  토");
		System.out.println("------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		// 월을 입력하면 그 달의 일 수를 계산해줌
		System.out.println("달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		MonthTest cal = new MonthTest();
		int mon = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", mon, cal.getMaxDaysOfMonth(mon));
		
		cal.printSampleCalendar();
		
		sc.close();
	}
}
