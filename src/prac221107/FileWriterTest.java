package io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
		// 파일로 쓰기
		//존재하는 파일명이면 원래 파일에 덮어쓰기가 되고 파일명이 존재하지 않으면 파일 쓰기를 할 때 파일이 자동 생성된다.
		File f = new File("D://etc/writeTest.txt");
		FileWriter fw = new FileWriter(f);
		
		
		//		index	01 234.... 
		String txt = "자바에서 파일 쓰기 연습중\n";
		//		값	시작	 개수
		fw.write(txt, 0, txt.length());
		//fw.write(txt, 4, txt.length()-5);	4부터 시작했을 때 문자열 값보다 txt.length 값이 더 커서 에러 -를 해줘야한다.
	
		String  txt2 = "java Filewrite test...\n";
		fw.write(txt2,0,txt2.length());
		
		fw.close();//	<-- 왜 close?
		}catch(IOException ie) {
			ie.printStackTrace();
		}

	}

}
