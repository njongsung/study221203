package api.test;

import java.util.Random;

public class Randomtest {

	public static void main(String[] args) {
		// 난수 	:	실행할 때 무작위 숫자(double)을 만들어준다.
		//			0.0<난수<1.0	
/*		for(int i=1; i<=100; i++) {
			double ran = Math.random();	//50~60 사이 값 만들기 :-> (정수)(난수*(큰수-작은 수+1))+작은값 ->
			int ranInt = (int)(ran*(60-50+1))+50;			//	(int)(ran*(60-50+1))+50	== 50+60
			System.out.println(ranInt);			
		}
*/
		Random r = new Random();//난수를 생성해주는 클래스
		
		for(int i=1; i<=100; i++) {
			//System.out.printf("%d, ", r.nextInt());// int 데이터형 범위 내의 값을 생성해준다.
//			System.out.printf("%s ", r.nextBoolean());// true, false를 무작위로 생성해준다.
			System.out.printf("%d, ", r.nextInt(11)+50);// ran*(60-50+1)+50
			if(i%10==0) System.out.println();
		}
	}

}
