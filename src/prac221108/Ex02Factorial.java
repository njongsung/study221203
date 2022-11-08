package sw.array;

import java.util.Scanner;

/*
 
 [문제]
 정수를 입력받아 팩토리얼 값을 구하라

 
 [입력]
 5
 
 [출력]
 120(5!)
  
 */

public class Ex02Factorial {
	
	
	
	public static void facfor() {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("숫자 입력:");
		int num = sc.nextInt();
		int pac = 1;
		for (int i=1;i<=num;i++) {
			 pac*=i;
		}
		
		System.out.println(pac);
	}
	
	//배열을 이용하여 팩토리얼 구하기
	public static int factorial1(int max) {
		int result = 1;
		for(int i=1;i<=max;i++) {//5가 전달 됐을 때 : 1, 2, 3, 4, 5 
			result *=i;//계산
		}
		return result;
	}
	
	//재귀호출을 이용하여 팩토리얼 구하기 : 반환형이 없을 때
	
	static int result2 = 1;
	public static void rec(int n) {//5가 전달 됐을 때 : 5, 4, 3, 2, 1
		
		//계산
		result2*=n;		
		//종료
		if(n==1) return;
		rec(--n);
	}
	
	
	//재귀호출을 이용하여 팩토리얼 구하기 : 반환형이 있을 때
	public static int rec3(int n) {// 5, 4, 3, 2, 1
			if(n==1) return 1;
		return n*rec3(n-1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int max = sc.nextInt();
		System.out.print(factorial1(max));//팩토리얼 for
		
		System.out.println("\n******************************\n");
		
		facfor();
		
		System.out.println("\n******************************\n");
		
		//반환형이 없는 재귀호출
		rec(max);
		System.out.println(result2);
		
		System.out.println("\n******************************\n");
		
		//반환형이 있는 재귀호출
		int result3= rec3(max);
		System.out.println(result3);

	}
	
	
//	public static void pac(int c) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자 입력:");
//		int num = sc.nextInt();
//		if(num<c) {
//			System.out.println();
//			return;
//		}
//		
//		pac(++c);
//		
//	}
//	

}
