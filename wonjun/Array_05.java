package wonjun;

import java.util.Scanner;

/*
 * length ��ɾ�
 * - �迭�� ũ��(����)�� �˷��ִ� ��ɾ�.
 * - �迭�� ũ��(����)�� ���������� �˷���.
 * 	����) �迭��.length
 *	��) int size = arr.length;
 */

public class Array_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		System.out.println("arr �迭�� ũ�� >>> " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print((i+1) + "��° ���� �Է� : ");
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] >>> " + arr[i]);
		}
		
		sc.close();
	}

}
