package wonjun;

/*
 * ������ �迭�� ���� �迭 (�� �Ⱦ����� �˰�� �־��)
 * - java�� ������ �迭�� �ึ�� ���� �ٸ� ���� ���� �� ����.
 * 	 ���� ũ�⸦ ���� ������ �ϰ�, ���� ũ��� ���������� �Ҵ��� �ϴ� �迭.
 * - ���� �迭�� ����ϴ� ���� : �޸� �ս��� �ּ�ȭ���� �ֱ� ����.
 */

public class Array_10 {

	public static void main(String[] args) {
		
		// ������ �迭�� ���� �迭 ���� �� �޸� ����.
		// �� : 4��, �� : ������.
		int[][] arr = new int[4][];
		
		//�����迭�� �� �޸� ����.
		arr[0] = new int[3];	// 1�� 3��
		arr[1] = new int[2];	// 1�� 3��
		arr[2] = new int[1];	// 1�� 3��
		arr[3] = new int[4];	// 1�� 3��
		
		int count = 10;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = count;
				
				System.out.print(arr[i][j]+"\t");

				count += 10;
			}
			
			
			System.out.println();
		}
	}

}
