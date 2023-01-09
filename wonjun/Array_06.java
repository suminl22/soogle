package wonjun;

import java.util.Scanner;

// 키보드 배열의 크기를 입력을 받아 보자.

public class Array_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요. : ");
		
		// int size = sc.nextInt();
		
		String[] str = new String[sc.nextInt()];
		
		for(int i=0; i<str.length; i++) {
			
			System.out.print((i+1) + "번째 문자열 입력 : ");
			
			str[i] = sc.next();
		}
		
		// 문자열 배열에 저장된 데이터를 출력해 보자.
		for(int i=0; i<str.length; i++) {
			
			System.out.println("srt["+i+"] >>> " + str[i]);
		}
			
		// 문자열 배열에 저장된 문자열을 검색해 보자.
		System.out.println("검색할 문자열을 입력하세요. : ");
		
		String search = sc.next();
		
		for(int i=0; i<str.length; i++) {
			if(search.equals(str[i]) ) {
				System.out.println("찾은 문자열 >>> " + str[i]);
				System.out.println("찾은 인덱스 >>> str["+i+"]");
			}
		}
		
		sc.close();
	}

}
