package wonjun;

import java.util.Scanner;

/*
 * [����2]
 */

public class Test_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ �ϳ� �Է��Ͽ� �ֽʽÿ� : ");
		
		int su = sc.nextInt();
		
		System.out.println(su + "�� ������ ==> " + su*su);
		System.out.println(su + "�� �������� ==> " + su*su*su);
		
		sc.close();
		}

}
