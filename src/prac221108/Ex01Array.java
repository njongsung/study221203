package sw.array;

import java.util.Arrays;

public class Ex01Array {
	//					0  1  2  3  4
	static int []arr = {50,60,80,30,40};
	int[]arr1 = {50,60,80,30,40};
	
	//배열의 값을 반복문을 이용하여 출력하기
	public static void printArray1() {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//재귀 호출을 이용한 배열의 값 출력하기
	public static void printArray2(int i) {// i=0
		
		System.out.println(arr[i]+" ");
		// 배열의 모든 index를 접근했을 때 메소드 중단시키기
		if(arr.length-1==i) {
			System.out.println();//줄바꿈
			return;
		}
		printArray2(++i);
		System.out.print("*");	//경로 추적
	}
	
	
	
	
	public static void main(String[] args) {
		Ex01Array ea1 = new Ex01Array();
		System.out.println(Arrays.toString(ea1.arr1));

		System.out.println("*******************************************");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("*******************************************");
		
		printArray1();
		
		System.out.println("*******************************************");
		
		printArray2(0);
		
	}

}
