package wonjun;

import java.util.Scanner;

// Ű���� �迭�� ũ�⸦ �Է��� �޾� ����.

public class Array_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���. : ");
		
		// int size = sc.nextInt();
		
		String[] str = new String[sc.nextInt()];
		
		for(int i=0; i<str.length; i++) {
			
			System.out.print((i+1) + "��° ���ڿ� �Է� : ");
			
			str[i] = sc.next();
		}
		
		// ���ڿ� �迭�� ����� �����͸� ����� ����.
		for(int i=0; i<str.length; i++) {
			
			System.out.println("srt["+i+"] >>> " + str[i]);
		}
			
		// ���ڿ� �迭�� ����� ���ڿ��� �˻��� ����.
		System.out.println("�˻��� ���ڿ��� �Է��ϼ���. : ");
		
		String search = sc.next();
		
		for(int i=0; i<str.length; i++) {
			if(search.equals(str[i]) ) {
				System.out.println("ã�� ���ڿ� >>> " + str[i]);
				System.out.println("ã�� �ε��� >>> str["+i+"]");
			}
		}
		
		sc.close();
	}

}
