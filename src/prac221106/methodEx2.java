package prac221106;

public class methodEx2 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외처리가 되었습니다.");
			e.printStackTrace();
		}

	}
static void method1() throws Exception {
	throw new Exception();
}
}
