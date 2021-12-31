package calendarProject;

import java.util.Scanner;

public class MonthTest {
	public static void main(String[] args) {
		// 월을 입력하면 그 달의 일 수를 계산해줌
		
		
		System.out.println("달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30,31,30,31};
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", mon, maxDays[mon+1]);
		
		sc.close();
	}
}
