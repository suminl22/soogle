package wonjun;

/*
 *  ������ �迭
 *  - 1���� �迭�� ���� �� ���� �ִ� ������ �迭�� ����.
 *  - ��� ���� ������ ������ ��.
 */

public class Array_09 {

	public static void main(String[] args) {

		// ������ �迭 ���� �� �޸� ����.
		int[][] arr = new int[3][4]; // 3�� 4�� ������ �迭
		// ���� ������ �� ������ �迭�� ���� ����. [] �Ѱ��� 1����
		
		int count = 10;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j = 0; j<arr[i].length; j++) { // ���� �������� ���� ���ϹǷ� i�� �ƴ� j
				
				arr[i][j] = count;
				
				count += 10;
			}
		}
	
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
			
				System.out.println("arr["+i+"["+j+"] >>> " + arr[i][j]);
			
				System.out.println();
				
				}
			}
		}

	}
