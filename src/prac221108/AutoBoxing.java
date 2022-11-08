package api.test;

public class AutoBoxing {

	public static void main(String[] args) {
		// Autoboxing : 기본데이터형을 객체로 자동 대입해준다
		int a = 10;
		Integer b = a;
		
		//Autoboxing 안될 때
		//Integer c = new Integer(a);
		
		Integer c = Integer.valueOf(a);//<< 현재 권장
		
		System.out.println(b);
		System.out.println(c);

		
		
		//AutoUnboxing
		int d = c;	// 객체형을 기본데이터형으로 자동 대입해주는 것
		
		int e = c.intValue();// 안된다면 이런 식으로 해야함.
		System.out.println(d);
		System.out.println(e);
		
	}

}
