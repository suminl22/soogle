package wonjun;

import java.util.Scanner;

/*
 * [문제3] 
 */

public class Test_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금액 입력 : ");
		int num1 = sc.nextInt(); 
		
		System.out.print("상품 단가 입력 : ");
		int num2 = sc.nextInt(); 
			
		System.out.print("상품 수량 입력 : ");
		int num3 = sc.nextInt(); 
		
		System.out.println();
		
		System.out.println("지불한 금액 : " + num1 + "원");
		System.out.println("제품단가 : " + num2+ "원");
		System.out.println("수량 : " + num3);
			
		int tax = ((num2 * num3) / 10); 
		System.out.println("부가세 : " + tax + "원");
		
		int total = ((num2 * num3) + tax);
		System.out.println("상품총액 : " + total + "원");
	
		int rest = num1 - total;
		System.out.println("거스름 돈 : " + rest + "원");
		
		sc.close();
	}

}
