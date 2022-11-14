package prac221114;

import java.util.Arrays;

public class DescendingOrder {

    public StringBuffer solution(String s) {

        char[] chArr = new char[s.length()];

        chArr=s.toCharArray();

        Arrays.sort(chArr);

        String asd = new String(chArr);

        StringBuffer answer = new StringBuffer(asd);

        answer.reverse();

        return answer;
    }


}
