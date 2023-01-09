package wonjun;

/*
 * 다차원 배열의 가변 배열 (잘 안쓰지만 알고는 있어라)
 * - java의 다차원 배열은 행마다 서로 다른 열을 가질 수 있음.
 * 	 행의 크기를 먼저 결정을 하고, 열의 크기는 가변적으로 할당을 하는 배열.
 * - 가변 배열을 사용하는 이유 : 메모리 손실을 최소화시켜 주기 위함.
 */

public class Array_10 {

	public static void main(String[] args) {
		
		// 다차원 배열의 가변 배열 선언 및 메모리 생성.
		// 행 : 4행, 열 : 미지정.
		int[][] arr = new int[4][];
		
		//가변배열의 열 메모리 생성.
		arr[0] = new int[3];	// 1행 3열
		arr[1] = new int[2];	// 1행 3열
		arr[2] = new int[1];	// 1행 3열
		arr[3] = new int[4];	// 1행 3열
		
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
