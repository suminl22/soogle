package wonjun;

/*
 * [����1]
 */

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��Ͽ� �ֽʽÿ� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͽ� �ֽʽÿ� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͽ� �ֽʽÿ� : ");
		int mat = sc.nextInt();
		
		System.out.print("�ڹ� ������ �Է��Ͽ� �ֽʽÿ� : ");
		int jav = sc.nextInt();
		
		int sum = kor + eng + mat + jav;
		System.out.println("������ " + sum + "�� �Դϴ�.");
		
		double avg = sum / 4.0;
		System.out.printf("����� " + "%.2f�� �Դϴ�.\n", avg);
		
		sc.close();
		}

		
}
