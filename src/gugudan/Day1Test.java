package gugudan;
import java.util.*;
public class Day1Test {
	public static void main(String[] args) {		
		
		// �Է��� ���� ���� ũ�Ⱑ �ٸ� ������ ��� ���
		// 2*1 ~ 19*19 ���� ����ϱ�
		
		System.out.println("������ �Է��ϼ���: ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int i,j;
		
		for(i=2;i<=num;i++) {
			for(j=1;j<=num;j++) {
				System.out.printf("%d*%d=%d, ",i,j,i*j);
			} 
			System.out.println();
		}
		
		// �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.
		// "8,7"�� �Է��Ѵٸ� 2*1 ``` 2*7 ... 8*7 ���� ����Ѵ�.
		
		System.out.println("���� �ΰ� �Է� : (ex:1,2)");
		Scanner sc2 = new Scanner (System.in);
		String str = sc2.nextLine();
		
		// ��ǥ�� �������� �и���
		String[] splitedValue = str.split(",");
		// ��ǥ�� �������� �и��� ���ڿ��� ���ڷ� ��ȯ
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
