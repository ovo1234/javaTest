package calendarProject;

import java.util.*;

public class RepeatTest2 {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
	
	public int getMaxDaysOfMonth(int mon) {
		return MAX_DAYS[mon-1];
	}		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RepeatTest2 cal = new RepeatTest2();
		
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
