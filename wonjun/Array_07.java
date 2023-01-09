package wonjun;

import java.util.Scanner;

public class Array_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 배열 크기 입력 : ");
		
		String[] str = new String[sc.nextInt()];
		
		// 상당히 중요 앞으로 무지막지 하게 보게 될 것이다. 주소 값이 복사된다.
		// strCopy에 str 값을 대입하므로써 str과 strCopy가 같은 칸을 공유하게 된다. [이거 모르면 객체 못한다.]
		/*
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 *  ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * 매우 중요한 개념이다. 
		 * 배열의 이름은 heap 영역의 시작 주소값을 저장하고 있기 떄문에 아래의 문장은 시작 주소값을 다른 배열의 배열명에
		 * 복사해 주는 명령문이다. 즉, 배여릥 공유가 이루어지게 된다.
		 */
		String[] strCopy = str; 
		
		System.out.println("str 배열 주소값 >>> " + str);
		
		System.out.println("strCopy 배열 주소값 >>> " + strCopy);
		
		for(int i=0; i<strCopy.length;i++) {
			
			System.out.println((i+1) + "번째 문자열 입력 : ");
			
			strCopy[i] = sc.next();
		}
		
		// str배열에 있는 데이터를 화면에 출력해 보자.
		for(int i=0; i<str.length; i++) {
			
			System.err.println("str["+i+"] >>> " +str[i]);
		}
		
		sc.close();
		
	}

}
