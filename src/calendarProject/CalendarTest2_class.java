package calendarProject;

import java.util.Scanner;

public class CalendarTest2_class {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
	
	public int getMaxDaysOfMonth(int mon) {
		return MAX_DAYS[mon-1];
	}		
	public void printSampleCalendar(int year,int month) {
		System.out.printf("      <<%4d %3d>>\n" , year, month);
		System.out.println(" 일 월  화  수  목 금  토");
		System.out.println("------------------");
		
		int MaxDay = getMaxDaysOfMonth(month);
		
		for(int i = 1;i<=MaxDay;i++) {
			System.out.printf("%3d",i);
			if(i % 7 ==0) {
				System.out.println();
			}
			
		}System.out.println();
		
		
		
		
		
		
		
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
	
	
	
	public static void main(String[] args) {
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
			System.out.printf("%d월은 %d일까지 있습니다.\n", mon, cal.getMaxDaysOfMonth(mon));
		}
		
		
	
		sc.close();
		
}
}