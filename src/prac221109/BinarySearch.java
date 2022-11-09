package prac221109;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	//이진검색 (Binary Search)
	//								데이터 수		데이터		
	public static int binarySearch	(int n,	int arr[],	int value ) {
		int pl=0;	//시작 위치 index
		int pr=n-1;	//끝 위치 index n이 10이면 index는 0~9까지 있다.
		
		do {
			int pc = (pl+pr)/2;//가운데 위치 index를 구한다.	(pl+pr)/2
			
			//중앙값과 찾는 값이 같을 때		->검색 성공
			if(value==arr[pc]) {
				return pc;
				
			}else if(value<arr[pc]) {//찾을 값이 pointcenter의 값보다 작으면 pointright -> pr = pc-1로 변경
				pr = pc - 1;
			}else {// 찾을 값이 pc의 값보다 크면 pointleft -> pl = pc + 1
				pl = pc + 1;
			}
			
			
		}while(pl<=pr);// 시작 위치와 끝 위치가 같거나 끝 위치가 작으면 종료된다.
		//데이터가 없을 때
		return -1;
	}
	
	
	public static void main(String[] args) {
		Random ran = new Random();//난수를 생성하기 위한 객체
		
		//데이터
		//데이터의 수를 입력받아 1~100 사이의 난수를 생성하여 오름차순으로 정렬한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수: ");
		int cnt = sc.nextInt();
		
		//난수를 이용하여 1~100 사이의 값을 cnt의 수만큼 생성하여 배열에 저장하라.
		int arr[] = new int[cnt];
		for(int i=0;i<cnt;i++) {
			arr[i]= ran.nextInt(100)+1;
		}
		//정렬	-	오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println("정렬 후: "+Arrays.toString(arr));
		
		
		//찾을 값 입력
		System.out.print("찾을 값 입력: ");
		int inData = sc.nextInt();	//NumberFormatException
		
		//이진검색 실행
		int result = binarySearch(cnt, arr, inData);	// -1이면 배열에 찾을 값이 없는 것
		if(result==-1) {
			System.out.println(inData+"는 존재하지 않습니다.");
		}else {
			System.out.println(result+"위치의 값은 " +arr[result]+"입니다.");
		}
		sc.close();

	}

}
