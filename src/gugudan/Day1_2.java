package gugudan;
public class Day1_2 {	
	
	public static void main(String[] args) {
		// �迭�� ������ ����
			
		int[] result = new int[9];
		for (int i=0;i<result.length;i++) {
			// ��� ����� �迭�� ����
			result[i] = 2 * (i+1);
		}
		
		for (int i=0;i<result.length;i++) {
			// ������� ȭ�鿡 ���
			System.out.println(result[i]);
		}
		
				
	}
}
