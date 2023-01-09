package wonjun;

import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("지방의 그램을 입력하세요 : ");
		int fat = sc.nextInt();
		
		System.out.print("탄수화물의 그램을 입력하세요 : ");
		int car = sc.nextInt();
	
		System.out.print("단백질의 그램을 입력하세요 : " );
		int pro = sc.nextInt();
	
		
		int total = ((fat*9) + (pro*4) + (car*4));
		System.out.printf("총 칼로리 : " + total + "cal");
		
		sc.close();
	}

}
