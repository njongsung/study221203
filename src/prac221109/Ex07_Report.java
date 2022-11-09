package sw.test;

import java.util.Scanner;

public class Ex07_Report {

	public static void main(String[] args) {

/* 과제물
 [문제]	년도를 입력 받아 윤년과 평년을 구별하여 출력하라.
 		1행은 입력받은 데이터의 수
 		
 		윤년
	 	1. 4의 배수의 해이면서 100의 배수는 아닌 경우
	 	2. 400의 배수인 경우
	 	 
 [입력]
 6
 4 100 400 2000 2001 2004
 
 [출력]
 #1 윤년
 #2 평년
 #3 윤년
 #4 윤년
 #5 평년
 #6 윤년
 */
		
		//데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 데이터의 수: ");
		int num=sc.nextInt();	// int n = Integer.parseInt(sc.nextLine());
		sc.nextLine();//엔터처리
		//년도를 문자열로
		System.out.print("입력할 년도: ");
		String yearStr = sc.nextLine();
		
		String[] yearArr = yearStr.split(" ");
		String[] yearResult = new String[num];//결과를 저장할 배열
		
		//처리
		
		for(int i=0;i<num; i++) {//i=0,1,2,3,4,5
			int year = Integer.parseInt(yearArr[i]);
			
//			1. 4의 배수의 해이면서 100의 배수는 아닌 경우
			if(year%4==0 && year%100!=0 || year%400==0) {//윤년
				yearResult[i] = "윤년";
			}else {//평년
				yearResult[i] = "평년";
			}
		}
		//출력
		for(int i=0;i<num;i++) {
		//	System.out.println("#(i+1)"+ " " + yearResult[i]);
			System.out.printf("#%d %s\n", i+1, yearResult[i]);
		}
		
		
		
		
		
	}
	
	
		
}
