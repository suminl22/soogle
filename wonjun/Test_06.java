package wonjun;

import java.util.Scanner;

public class Test_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���ڸ� �Է��Ͽ� �ֽʽÿ� : ");
		
		int num = sc.nextInt();
		
		int OddSum = 0, EvenSum = 0;
		
		for(int i=1; i<=num; i++) {
			if((i%2)==1) {
				OddSum += i;
			}else {
				EvenSum += i;
			}
			sc.close();
		}
			
			System.out.println("Ȧ���հ� : " + OddSum);
			System.out.println("¦���հ� : " + EvenSum);
			

	}

}
