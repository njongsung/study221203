package io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public static void main(String[] args) {
		// File 클래스 
		
		File f1 = new File("D://etc");	// D:\etc 괄호 안에는 \를 쓰면 제어문자로 인식을 해서 쓰면 안됨
		File f2 = new File("D://etc/StringBufferTest.java");
		File f3 = new File(f1, "StringBufferTest.java");
		File f4 = new File("D://etc", "StringBufferTest.java");
		File f5 = new File(f1, "sample.txt");	//	없는 파일도 에러는 안남
		
		
		try {
			if(!f5.exists()) {// 있으면 true, 없으면 false
				boolean result = f5.createNewFile();	//파일 생성 여부 리턴
				if(result) {
					System.out.println(f5.getName()+"파일이 생성되었습니다.");	
					//getParent() : 경로, getName() : 파일명, getPath() : 경로 + 파일명
				}else {
					System.out.println("파일 생성 실패");
				}
			}
			f5.delete();	//파일 삭제
			
			long byteCnt = f2.length();	// 파일의 크기 (byte)
			System.out.println("바이트 수 -> "+byteCnt);
			
			// 마지막 수정일							Calendar
			long lastDate = f2.lastModified();	// 마지막 수정일을 밀리초로 구해준다
			
			Calendar date = Calendar.getInstance();	//오늘 현재 날짜와 시간
			date.setTimeInMillis(lastDate);
			//System.out.println(date);
			//2022-11-01 오후 5:21
			
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String dateStr = fmt.format(date.getTime());
			
			
			
			
			//System.out.println("최종 수정일 -> "+lastDate);
			
			System.out.println("최종 수정일 -> "+dateStr);
		}catch(IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
