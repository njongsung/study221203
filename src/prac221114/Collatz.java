package prac221114;

public class Collatz {

    public int solution(long num) {

        int answer = 0;
        int cnt=0;

        if (num==1)
            return 0;
        do{
            if(num%2==0) {
                num /= 2;
                cnt++;
            }else {
                num*=3;
                num++;
                cnt++;
            }
            if(cnt==500)
                break;
        }while(num!=1);
        if(cnt==500)
            return -1;
        return cnt;
    }

}
