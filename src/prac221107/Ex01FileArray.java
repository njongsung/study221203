package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01FileArray {

	public static void main(String[] args) {
/* data1.txt 파일의 내용을 읽어 다음 출력형식으로 표시하라.
[입력]
3 4 5 1 3 4 5 1 4 5
6 7 8 5 4 2 1 5 6 7
4 5 6 7 2 5 7 6 1 1
		 
		 
[출력]
#1 35(첫 줄 합계)
#2 51(두번째 줄 합계)
#3 44(세번째 줄 합계)
		 
		 
*/
			try {
				// 파일의 내용을 읽어 콘솔에 출력하기
				File f=new File("D://etc/data1.txt");
				FileReader fr=new FileReader(f); // FileIputStream
				BufferedReader br=new BufferedReader(fr); //한줄씩 데이터를 읽어온다.
				int count=0;
				while(true) {
					String str=br.readLine(); //읽어온 내용에는 엔터가 포함되지 않는다. 읽어올 데이터의 구분기호로 엔터를 사용한다.
					if(str==null) break;
					
					count++;
					int sum=0;
					String arr[]=str.split(" ");
					for(String a: arr) {
						sum+=Integer.parseInt(a);
					}
					
					System.out.println("#" + count +" " + sum);
					
					//System.out.println(str);
					
				}
				

			} catch (FileNotFoundException e) { //파일이 없을 수 있음
				//e.printStackTrace(); 
				System.out.println("파일이 존재하지 않습니다.");
			} catch (IOException e) {
				System.out.println("파일읽기 예외 발생");
			}
			
			System.out.println("\n**************************\n");
			
			try {
				/*
				File f = new File("D://etc/data1.txt");
				FileReader fr= new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				*/
				
				BufferedReader br = new BufferedReader(new FileReader(new File("D://etc/data1.txt")));	//한 줄로 요약
				
				
				for (int i=1;;i++) {//i=1,2,3,4,5,6,...... 무한 루프
					
					String inData = br.readLine();
					if (inData == null) break;	// 종료지점
					
					String strLine[] = inData.split(" ");	// 파일에서 1줄을 읽은 후 " " 기준으로 조각내어 배열에 저장한다.
					
					//합을 구할 변수 초기화
					int sum = 0;
					for(String s:strLine) {	// s에 넣고 덮어쓰고 반복
						sum+=Integer.parseInt(s);
					}
					//출력
					System.out.println("#"+i+" "+sum);
					
					
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
