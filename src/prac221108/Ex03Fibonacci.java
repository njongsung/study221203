package sw.array;

import java.util.Scanner;

public class Ex03Fibonacci {
/*피보나치 수열 만들기
 초기값을 0 1로 하고 다음 수는 바로 앞의 두 수의 합이 되는 것이 피보나치 수열이다
 [입력]
 10
 
 [출력]
 1 1 2 3 5 8 13 21 34 55 
 
 */
	
	

	public static void fibo1(int n) {
		
		//초기값
		//  전전값	 	전값			현재 값
		int num1 =0,	num2 = 1, 	sum = 1;
		
		for(int i=0;i<n;i++) {
			System.out.print(sum+" ");	// 1, 1, 3, 5, 8, 
			sum = num1 + num2;			// 1, 1, 3,
			num1 = num2;//전값			// 0, 1, 2,
			num2 = sum;	//전전값 			// 1, 2, 3,
			
		}
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int n= sc.nextInt();
		
		fibo1(n);
		
		
	}

}
