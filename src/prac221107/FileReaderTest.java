package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		//파일의 내용을 읽어 콘솔 출력에 출력하기
		
		try {
		
		File f = new File("D://etc/StringBufferTest.java");
		FileReader fr = new FileReader(f);	// FileInputStream	
		BufferedReader br = new BufferedReader(fr);
		
		
			while(true) {
				/*문자단위로 읽어오기
				int inData = fr.read();	//읽어온 값이 없을 때 -1 : EOF ( End of File)
				if(inData==-1) break;	//읽어온 값이 없을 때 반복문 종료
				System.out.print((char)inData);
				*/
				
				//줄단위로 읽어오기
				String str =br.readLine();//읽어온 내용에는 enter가 포함되지 않고 읽어올 데이터의 구분기호를 enter를 사용한다.
				//줄단위 데이터는 EOF일 때 null이 리턴된다.
				if(str==null) break;
				System.out.println(str);
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println("파일 읽기 에러");
		}
	}

}
