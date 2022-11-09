package sw.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequentialSearch {

	//검색처리 메소드
	//반환형의 값이 존재하면 찾는 값의 index를 return, 찾는 값이 존재하지 않으면 -1 return
	public static int linearSearch(int num, int[] data, int value) {
		//for문으로 선형검색
		for(int i=0; i<num; i++) {
			if(data[i]==value) {//데이터를 찾았을 때
				return i;
			}
		}
		return -1;//찾을 데이터가 없을 때 -1을 리턴
	}
	
	public static int linearSearch2(int cnt, int[]arr, int key) {
		
		int idx=0;
		while(true) {
			if(idx==cnt) {//배열을 마지막까지 검색하였으나 데이터가 존재하지 않는다.
				return -1;
			}
			if(arr[idx]==key){//index 위치에 찾는 문자가 있는지 확인 -- 찾았을 때
				return idx;
			}
			++idx;//다음 값을 찾기위해서 idx를 증가 // idx++, idx=idx+1, idx+=1; 다 가능
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
		//데이터 준비
		//데이터의 수		
		int num = Integer.parseInt(br.readLine());
		
		//콘솔에서 입력받은 데이터를 저장할 배열
		int data[] = new int[num];

		for(int i=0; i<num; i++) {
			System.out.print("["+i+"]");
			data[i]=Integer.parseInt(br.readLine());
		}
		do {//~while(true) 무한반복
			//찾을 숫자값 입력(무작위 정수)
			System.out.print("찾을 값 입력: ");
			int value = Integer.parseInt(br.readLine());
			
			//검색(메소드로)			요소수	배열		찾을값
//			int key = linearSearch(	num,	data,	value); //for 문을 이용한 검색 메소드
			int key = linearSearch2(num,	data,	value); //while 문을 이용한 검색 메소드
			
			//결과
			if(key==-1) {// 못찾음
				System.out.println("찾는 값이 존재하지 않습니다.");
			}else {//찾음
				System.out.println("찾는 값의 index: "+key+"입니다");
			}
		}while(true);
			
		}catch (IOException ie) {
				ie.printStackTrace();
		}catch ( NumberFormatException nfe) {
			System.out.println("숫자를 입력해야 합니다.");
		}
				
	}

}
