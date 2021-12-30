package gugudan;
import java.util.*;
public class Day1Test {
	public static void main(String[] args) {		
		
		// 입력한 값에 따라 크기가 다른 구구단 계산 출력
		// 2*1 ~ 19*19 까지 출력하기
		
		System.out.println("정수를 입력하세요: ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int i,j;
		
		for(i=2;i<=num;i++) {
			for(j=1;j<=num;j++) {
				System.out.printf("%d*%d=%d, ",i,j,i*j);
			} 
			System.out.println();
		}
		
		// 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
		// "8,7"을 입력한다면 2*1 ``` 2*7 ... 8*7 까지 출력한다.
		
		System.out.println("숫자 두개 입력 : (ex:1,2)");
		Scanner sc2 = new Scanner (System.in);
		String str = sc2.nextLine();
		
		// 쉼표를 기준으로 분리함
		String[] splitedValue = str.split(",");
		// 쉼표를 기준으로 분리한 문자열을 숫자로 변환
		int num1 = Integer.parseInt(splitedValue[0]);
		int num2 = Integer.parseInt(splitedValue[1]);
		
		for(int x=2;x<=num1;x++) {
			for(int y=1;y<=num2;y++) {
				System.out.printf("%d*%d=*%d, ",x,y,x*y);
			}
			System.out.println();
		}
		
				
			
		
		
		
		
		
		
	}
}
