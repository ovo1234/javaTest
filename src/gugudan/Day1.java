// 20211231 ������ ����

package gugudan;

import java.util.*;

public class Day1 {
	public static void main(String[] args) {		
		// 2��
		// ���� ���� ����Ű: ctrl + alt + �Ʒ�/ �� ȭ��ǥ 
		// �����Ͽ� �̵� : alt + �Ʒ�/�� ȭ��ǥ
		System.out.println("2��");
		System.out.print(2*1+",");
		System.out.print(2*2+",");
		System.out.print(2*3+",");
		System.out.print(2*4+",");
		System.out.print(2*5+",");
		System.out.print(2*6+",");
		System.out.print(2*7+",");
		System.out.print(2*8+",");
		System.out.println(2*9);
		
		// 3��
		System.out.println("3��");
		System.out.print(3*1+",");
		System.out.print(3*2+",");
		System.out.print(3*3+",");
		System.out.print(3*4+",");
		System.out.print(3*5+",");
		System.out.print(3*6+",");
		System.out.print(3*7+",");
		System.out.print(3*8+",");
		System.out.println(3*9);
		System.out.println();
		
		// �� �Է� �� ����
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		System.out.println(num+"��");
		System.out.print(num * 1+",");
		System.out.print(num * 2+",");
		System.out.print(num * 3+",");
		System.out.print(num * 4+",");
		System.out.print(num * 5+",");
		System.out.print(num * 6+",");
		System.out.print(num * 7+",");
		System.out.print(num * 8+",");
		System.out.print(num * 9);
		
		// �ݺ��� 
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		int i = 1;
		System.out.println(num2 + "��");
		while(i < 10) {
			System.out.print(num2 * i+",");
			i += 1;
		}
		System.out.println();
		System.out.println("7��");
		for (int j=1; j<10; j++) {
			System.out.print(7*j+",");
		}
		
		// �� �Է� �� �ݺ���
		
		System.out.print("������ �Է��ϼ���.");
		Scanner sc3 = new Scanner(System.in);
		int num3 = sc3.nextInt();
		
		System.out.println("����ڰ� �Է��� ��:"+num3);
		
		if(num3<2) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else if (num3 > 9) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			for (int n = 1; n<10;n++) {
				System.out.print(num3 * n +",");
			}
		}
		
		System.out.println();
		
		System.out.print("������ �Է��ϼ���.");
		Scanner sc4 = new Scanner(System.in);
		int num4 = sc4.nextInt();
		
		System.out.println("����ڰ� �Է��� ��:"+num4);
		
		if(num4<2 || num4 > 9) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			for (int n2 = 1; n2<10;n2++) {
				System.out.print(num4 * n2 +",");
			}
		}
		
	}
}
