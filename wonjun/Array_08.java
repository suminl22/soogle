package wonjun;

import java.util.Scanner;

/*
 * 키보드로 배열에 정수 데이터를 저장.
 * - 내림차순으로 정렬할 예정.
 *  예) 19, 43, 6, 97, 65
 *  ==> 97, 65, 43, 19, 6 (사람은 가능), (컴퓨터는 불가능)
 *  정보처리기사,산업기사 실기에서 단골로 나오는 문제! 
 */

public class Array_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수형 배열 크기 입력 : ");
		
		int[] sort = new int[sc.nextInt()];
		
		for(int i=0; i<sort.length; i++) {
			
			System.out.print((i+1) + "번째 정수 입력 : ");
			
			sort[i] = sc.nextInt();
			
		}
		
		// 내림차순으로 정렬을 진행해 보자.
		int temp = 0;
				
		for(int i=0; i<sort.length; i++) {
			
			for(int j=i+1; j<sort.length; j++) {
				
				if(sort[j] > sort[i]) { // 오름차순은 sort[i] > sort[j]
					
					temp = sort[i];
					
					sort[i] = sort[j];
					
					sort[j] = temp;
				}
			}
		}
		
		// 내림차순으로 정렬된 sort 배열을 화면에 출력해 보자.
		for(int i=0; i<sort.length; i++) {
			System.out.print(sort[i]+ "\t");
		}
		
		sc.close();
		
	}

}
