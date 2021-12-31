package calendarProject;

import java.util.*;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다.
		// 형변환 : Integer.parseInt() / Integer.toString()
		
		// 두 수를 입력하여 두수의 합을 구한다.
		int a,b;
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		System.out.println(s1 + ", " + s2);
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.println(a + ", "+ b);
		
		System.out.println("두 수의 합은 "+ (a+b) + "이다.");
		sc.close();
		

	}
}
