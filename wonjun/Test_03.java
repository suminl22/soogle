package wonjun;

import java.util.Scanner;

/*
 * [����3] 
 */

public class Test_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Աݾ� �Է� : ");
		int num1 = sc.nextInt(); 
		
		System.out.print("��ǰ �ܰ� �Է� : ");
		int num2 = sc.nextInt(); 
			
		System.out.print("��ǰ ���� �Է� : ");
		int num3 = sc.nextInt(); 
		
		System.out.println();
		
		System.out.println("������ �ݾ� : " + num1 + "��");
		System.out.println("��ǰ�ܰ� : " + num2+ "��");
		System.out.println("���� : " + num3);
			
		int tax = ((num2 * num3) / 10); 
		System.out.println("�ΰ��� : " + tax + "��");
		
		int total = ((num2 * num3) + tax);
		System.out.println("��ǰ�Ѿ� : " + total + "��");
	
		int rest = num1 - total;
		System.out.println("�Ž��� �� : " + rest + "��");
		
		sc.close();
	}

}
