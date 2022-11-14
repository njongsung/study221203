package prac221114;

public class phonenum {
    public String solution(String phone_number) {

        String answer = "";

        char[] star = phone_number.toCharArray();

        for(int i=0; i<star.length-4; i++){
            star[i] ='*';
        }
        answer = new String(star);

        return answer;
    }

}
