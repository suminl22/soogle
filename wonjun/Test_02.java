package wonjun;

import java.util.Scanner;

/*
 * [문제2]
 */

public class Test_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 정수를 하나 입력하여 주십시오 : ");
		
		int su = sc.nextInt();
		
		System.out.println(su + "의 제곱근 ==> " + su*su);
		System.out.println(su + "의 세제곱근 ==> " + su*su*su);
		
		sc.close();
		}

}
