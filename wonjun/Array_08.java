package wonjun;

import java.util.Scanner;

/*
 * Ű����� �迭�� ���� �����͸� ����.
 * - ������������ ������ ����.
 *  ��) 19, 43, 6, 97, 65
 *  ==> 97, 65, 43, 19, 6 (����� ����), (��ǻ�ʹ� �Ұ���)
 *  ����ó�����,������ �Ǳ⿡�� �ܰ�� ������ ����! 
 */

public class Array_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �迭 ũ�� �Է� : ");
		
		int[] sort = new int[sc.nextInt()];
		
		for(int i=0; i<sort.length; i++) {
			
			System.out.print((i+1) + "��° ���� �Է� : ");
			
			sort[i] = sc.nextInt();
			
		}
		
		// ������������ ������ ������ ����.
		int temp = 0;
				
		for(int i=0; i<sort.length; i++) {
			
			for(int j=i+1; j<sort.length; j++) {
				
				if(sort[j] > sort[i]) { // ���������� sort[i] > sort[j]
					
					temp = sort[i];
					
					sort[i] = sort[j];
					
					sort[j] = temp;
				}
			}
		}
		
		// ������������ ���ĵ� sort �迭�� ȭ�鿡 ����� ����.
		for(int i=0; i<sort.length; i++) {
			System.out.print(sort[i]+ "\t");
		}
		
		sc.close();
		
	}

}
