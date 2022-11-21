package prac221122;

public class stringNumWord {
    public static int solution(String s) {
        int answer = 0;
        String[] strnum={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] intnum={"0","1","2","3","4","5","6","7","8","9"};
        int count=0;


        while(count!=10) {
            s = s.replaceAll(strnum[count],intnum[count]);
            count++;
        }

        answer = Integer.parseInt(s);

        return answer;

    }

    public static void main(String[] args) {
        String number = "one4seveneight";
        solution(number);
    }

}
