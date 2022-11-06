package prac221106;

public class methodEx1 {

	public static void main(String[] args) throws Exception {
		method1();
	}
	
//	static void method1() throws Exception {
//		method2();
//	}
//	static void method2() throws Exception {
//		throw new Exception();
//	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch(Exception e){
			System.out.println("method1 메서드에서 예외처리 되었습니다.");
			e.printStackTrace();
		}
	}

}
