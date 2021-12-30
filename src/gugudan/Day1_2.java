package gugudan;
public class Day1_2 {	
	
	public static void main(String[] args) {
		// 배열로 구구단 구현
			
		int[] result = new int[9];
		for (int i=0;i<result.length;i++) {
			// 계산 결과를 배열에 저장
			result[i] = 2 * (i+1);
		}
		
		for (int i=0;i<result.length;i++) {
			// 계산결과를 화면에 출력
			System.out.println(result[i]);
		}
		
				
	}
}
