package wonjun;

/*
 * [문제1]
 */

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하여 주십시오 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하여 주십시오 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하여 주십시오 : ");
		int mat = sc.nextInt();
		
		System.out.print("자바 점수를 입력하여 주십시오 : ");
		int jav = sc.nextInt();
		
		int sum = kor + eng + mat + jav;
		System.out.println("총점은 " + sum + "점 입니다.");
		
		double avg = sum / 4.0;
		System.out.printf("평균은 " + "%.2f점 입니다.\n", avg);
		
		sc.close();
		}

		
}
