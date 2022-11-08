package api.test;

public class SampleTest {


		//멤버변수(field)
		int a=1234;
		static int z=9999;
		
		static {
			//실행사용 가능하며 제일 먼저 실행됨
			try {
				System.out.println("static 영역실행됨");
			}catch(Exception e) {e.printStackTrace();}
			int asd=123;
		}
		
		
		//생성자메소드	new SampleTest() /  << 없으면 쓸 수 없음 -->new SampleTest(30);
		SampleTest(){
			System.out.println("SampleTest() 생성자 메소드 실행됨");
		}
		SampleTest(int a){}
		
		
		
		//메소드
		void getData(){
			//메소드에 정의한 내부클래스
			System.out.println("getData()실행확인");
			InnerClass i1 = new InnerClass();
			System.out.println("i1.b: "+ i1.b);
			class InnerMethod{	//클래스이름
				int c=5687;
						InnerMethod(){}	//메소드이름
						void output() {
							System.out.println("c: "+c);
						}
			}
			
			InnerMethod im = new InnerMethod();
			im.output();
		}
		
		
		
		//멤버 내부클래스
		class InnerClass{
			int b = 4567;
			InnerClass(){}
			void print() {
				System.out.println("b: "+b);
				System.out.println("a: "+a);
			}
		}


}

/*
 
 생성자는 클래스 이름과 같아야한다.
 
 
*/