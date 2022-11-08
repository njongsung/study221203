package api.test;

public class SampleTestMain {

	public static void main(String[] args) {
		SampleTest st = new SampleTest();
		
			System.out.println(st.a);
		
			st.getData();
			
			
			//내부클래스 사용하기
			SampleTest.InnerClass inner= new SampleTest().new InnerClass();
			inner.print();
	}

}
