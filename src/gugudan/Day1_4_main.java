package gugudan;
public class Day1_4_main {
	// 클래스 사용하여 구구단 활용하기
	
	public static void main(String[] args) {
		for (int i=2;i<10;i++) {
			int[]result = Day1_4.caculate(i);
			Day1_4.print(result);
		}
		
		
	}
}
