package wonjun;

/*
 *  ���� for��(������ for��, ���� for��)
 *  - jdk 1.5 �������� �߰��� ���.
 *  - �ַ� �迭�� ���(��)�� ó��(���)�� �� �����.
 *  
 *	����)	
 *		for (�ڷ��� ������ : �迭��) {
 *			�ݺ� ���๮;
 *		}
 * ���� ���
 *  - �迭�� ù���� �ε���[0]�� �ִ� �����͸� �º��� ������ �����Ͽ� ����� �� ��.
 *  - �������� �� ��ŭ �ڵ����� �ݺ��Ͽ� ����� ��.
 *  
 *  ����)
 *  - �캯�� �ִ� �迭���� �ڷ����� �º��� �ִ� �������� �ڷ����� �ݵ�� ��ġ�ؾ� ��.
 *  - ���� ��ġ���� ������ error �߻�.
 */


/*
 * [����] ���� ���డ�� ���� 5�� ���� Ű����� �Է¹޾Ƽ� �迭�� ���� ��
 * ȭ�鿡 ����� ������.
 */

public class Array_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nations = new String[5];
		
		// �ݺ����� �̿��Ͽ� 5�� ���� �迭�� ������ ����.
		for(int i=0; i<5, i++) {
			System.out.print((i+1) + "��° ���� ���� ���� : ");
		
			nations[i] = sc.next();
			}
		
		System.out.println();
		
		// �ݺ����� �̿��Ͽ� �迭�� ����� 5���� ���� ����� ����.
		for(int i=0; i<5; i++) {
			System.out.println("nations["+i+"] >>>" + nations);
		}
		
		System.out.println();
		// ���� for���� �̿��Ͽ� ����� �� ����.
		for(String na : nations);
			System.out.println();
		}
		
		sc.close;
		
}
