package wonjun;

import java.util.Scanner;

public class Array_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �迭 ũ�� �Է� : ");
		
		String[] str = new String[sc.nextInt()];
		
		// ����� �߿� ������ �������� �ϰ� ���� �� ���̴�. �ּ� ���� ����ȴ�.
		// strCopy�� str ���� �����ϹǷν� str�� strCopy�� ���� ĭ�� �����ϰ� �ȴ�. [�̰� �𸣸� ��ü ���Ѵ�.]
		/*
		 * �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 *  �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 * �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 * �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 * �ſ� �߿��� �����̴�. 
		 * �迭�� �̸��� heap ������ ���� �ּҰ��� �����ϰ� �ֱ� ������ �Ʒ��� ������ ���� �ּҰ��� �ٸ� �迭�� �迭��
		 * ������ �ִ� ��ɹ��̴�. ��, �迩�� ������ �̷������ �ȴ�.
		 */
		String[] strCopy = str; 
		
		System.out.println("str �迭 �ּҰ� >>> " + str);
		
		System.out.println("strCopy �迭 �ּҰ� >>> " + strCopy);
		
		for(int i=0; i<strCopy.length;i++) {
			
			System.out.println((i+1) + "��° ���ڿ� �Է� : ");
			
			strCopy[i] = sc.next();
		}
		
		// str�迭�� �ִ� �����͸� ȭ�鿡 ����� ����.
		for(int i=0; i<str.length; i++) {
			
			System.err.println("str["+i+"] >>> " +str[i]);
		}
		
		sc.close();
		
	}

}
