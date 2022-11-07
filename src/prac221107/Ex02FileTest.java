package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Ex02FileTest {

	public static void main(String[] args) {
/*
data2.txt의 파일을 입력하여 성적처리를 하는 프로그램을 작성하시오
[입력] 중간 기말 과제물 출석
90	89	99	100
100	66	55	85
60	60	58	73
90	50	99	70
70	60	80	92
90	80	72	70

[처리조건1]
평균 (중간+기말)/2	--> 60% 반영
과제물 			--> 20% 반영
출석				--> 20% 반영


[처리조건2]
학점
90~100		A
80~89.99	B
70~79.99	C
60~69.99	D
0~59.99		F

[처리조건3]
평가
A, B	-	excellent
C, D	-	good
F		-	poor

[출력] 평균, 학점, 평가
93.20	A	excellent
:		:	:
		 
*/
		
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(new File("D://etc/data2.txt")));
			
			
			for(int i=1;;i++) {
				
				String inData = br.readLine();
				if(inData==null) break;
				
				String[] str = inData.split(" ");
				String[] str1 =Arrays.copyOfRange(str, 0, 2);
				String[] str2 =Arrays.copyOfRange(str, 2, 3);
				String[] str3 =Arrays.copyOfRange(str, 3, 4);
				int sum =0;
				float avg=0;
				float ass=0;
				float att=0;
				
				for (String s:str1) {
					sum+=Integer.parseInt(s);
					avg=(float)sum/2;
				}
				
				for (String s:str2) {
					ass=Integer.parseInt(s);
				}
				
				for (String s:str3) {
					att=Integer.parseInt(s);
				}
				//System.out.println(sum +" "+ avg);
				
				
				
				float totavg=(float)((avg*0.6)+(ass*0.2)+(att*0.2));
				char grade ='0';
				if(totavg>=90)
				{
					grade = 'A';
				}else if(totavg>=80) {
					grade = 'B';
				}else if(totavg>=70) {
					grade = 'C';
				}else if(totavg>=60) {
					grade = 'D';
				}else
					grade = 'F';
				
				
				String ev = "null";
				
				if(grade == 'A')
					ev="excellent";
				else if(grade == 'B')
					ev="excellent";
				else if(grade == 'C')
					ev="good";
				else if(grade == 'D')
					ev="good";
				else
					ev="poor";
			
				
				System.out.println(totavg + " " + grade + " " + ev);
			
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

	private static String[] copyOfRange(String[] str, int i, int j) {
		return null;
	}

}
