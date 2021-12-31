package calendarProject;

import java.util.Scanner;

public class RepeatTest {
		private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
		
		public int getMaxDaysOfMonth(int mon) {
			return MAX_DAYS[mon-1];
		}		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			RepeatTest cal = new RepeatTest();
			
			System.out.println("반복횟수를 입력하세요.");
			int repeat = sc.nextInt();
			
			for(int i=0;i<repeat;i++) {
			
			System.out.println("달을 입력하세요.");
			int mon = sc.nextInt();			
			System.out.printf("%d월은 %d일까지 있습니다.\n", mon, cal.getMaxDaysOfMonth(mon));
			}
			System.out.println("끝");
			sc.close();
	}
}
