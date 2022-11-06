package prac221106;

public class mkException1 {

	public static void main(String[] args) {
	try {
		Exception e = new Exception("고의로 발생시킴");
		throw e;
	// throw new Exception("고의로 발생시킴"); //위의 두 줄 압출
	}catch (Exception e)	{
		System.out.println("에러 메세지:" + e.getMessage());
			e.printStackTrace();
	}
		System.out.println("프로그램 정상 종료");
	}

}
