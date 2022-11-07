package sw.test;

import java.util.Arrays;

public class Ex06_attay2 {

	public static void main(String[] args) {
		

		int a[][] = new int [5][5];
		int num=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=num++;
			}
			System.out.println(Arrays.deepToString(a));
		}
		
		
		System.out.println("\n\n\n\n*****************\n\n\n\n");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.printf("%3d ", a[i][j]);
			}System.out.println();
		}
			
		
		

			System.out.println("\n\n\n\n*****************\n\n\n\n");
		
		
		int arr[][] = new int[5][5];
		int cnt=1;
		for(int r=0; r<arr.length; r++) {	// r=0,1,2,3,4
			for(int c=0;c<arr[r].length;c++) {	// c=0,1,2,3,4
				arr[r][c] = cnt++;
			}
		}
		
		//출력
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
		
		//배열 세로로 나오도록
		
		
		
	}

	
}


/*

int arr [][] = new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=i*5+j+1;
			}
		}


*/