package prac221118;

public class lrdiv2 {
    public int solution(int l, int r) {
        int answer = 0;

        for(int i=l;i<=r;i++){
            if(i%Math.sqrt(i)==0)
                answer+=i;
            else
                answer-=i;
        }

        return answer;
    }
}
