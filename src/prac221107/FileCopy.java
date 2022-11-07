package io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		//파일의 내용을 byte 단위로 읽어 다른 파일로 쓰기 (C V 하기?)

		
		try {
			//읽을(byte 단위로) 파일 객체 만들기
			File inFile = new File("D://etc/images.jfif");
			FileInputStream fis = new FileInputStream(inFile);
			
			//파일(byte 단위로) 쓰기 객체 만들기
			File outFile = new File("D://etcetc",inFile.getName());		// getName() : 파일명	 getParent() : 경로	 getPath() : 경로 + 파일명
			FileOutputStream fos = new FileOutputStream(outFile);
			
			//****************************//
			while(true) {
				int inData = fis.read();
				if(inData==-1) break;
				fos.write(inData);
			}
				//닫는 것은 역순으로 
			fos.close();
			fis.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

}
