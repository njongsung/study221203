package api.test;

public class StringBufferTest {
	public StringBufferTest() {}
	public void start() {
		
	String str = "test";
	//str.replaceAll("t","TTT"); << 이거로는 변경 안됨
	str = str.replaceAll("t","TTT");
	System.out.println(str);
	
	//StingBuffer(동기화 O), StringBuilder(동기화 X)
	
	
	
	StringBuffer sb=new StringBuffer();
	StringBuffer sb2=new StringBuffer(50);
	StringBuffer sb3=new StringBuffer("자바의 문자열 처리방식 테스트 중");
	//sb=16, sb2=50, sb3=34
	
	//마지막에 문자열 추가하기
	sb.append("goguma");
	sb3.append("12345678900000000000000000000000000000000000000000000");
	//sb=16, sb2=50, sb3=71
	
	
	
	

	//중간에 문자추가
	sb3.insert(18, "☆☆☆**HELLO**☆☆☆");
	//sb2=
	//sb3=자바의 문자열 처리방식 테스트 중☆☆☆**HELLO**☆☆☆12345678900000000000000000000000000000000000000000000
	sb3.delete(4, 6);
	
	//문자열 뒤집기
	sb3.reverse();
	//sb3=자바의 열 처리방식 테스트 중☆☆☆**HELLO**☆☆☆12345678900000000000000000000000000000000000000000000	
	
	
	//확보된 메모리 공간 확인
	System.out.printf("sb=%d, sb2=%d, sb3=%d\n",sb.capacity(), sb2.capacity(), sb3.capacity());
	System.out.printf("sb=%s\nsb2=%s\nsb3=%s\n",sb.toString(), sb2.toString(), sb3.toString());
	}
	public static void main(String[] args) {
		new StringBufferTest().start();

	}

}
