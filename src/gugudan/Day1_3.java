package gugudan;
public class Day1_3 {
	public static int[] caculate(int times) {
		// 메소드 활용하여 구구단 구현
		
		int[] result = new int[9];
		for (int i=0;i<result.length;i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for (int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
			
		int[] result2 = caculate(2);
		print(result2);
		
		int[] result3 = caculate(3);
		print(result3);
		
		int[] result4 = caculate(4);
		print(result4);
		
	}
}
