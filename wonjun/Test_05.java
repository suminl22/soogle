package wonjun;

import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �׷��� �Է��ϼ��� : ");
		int fat = sc.nextInt();
		
		System.out.print("ź��ȭ���� �׷��� �Է��ϼ��� : ");
		int car = sc.nextInt();
	
		System.out.print("�ܹ����� �׷��� �Է��ϼ��� : " );
		int pro = sc.nextInt();
	
		
		int total = ((fat*9) + (pro*4) + (car*4));
		System.out.printf("�� Į�θ� : " + total + "cal");
		
		sc.close();
	}

}
