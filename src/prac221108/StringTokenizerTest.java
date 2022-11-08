package api.test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String tel="010-1234-5678";
		//split()
		String[] phone = tel.split("-");
		System.out.println("split->"+ Arrays.toString(phone));	//[010,1234,5678]로 만들어줌
		
		StringTokenizer st = new StringTokenizer(tel, "-");
		System.out.println("토큰 수 ->"+st.countTokens());
		System.out.println();
		
		// hasMoreElements(), hasMoreTokens()	: 토큰이 있으면 true, 없으면 false
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
