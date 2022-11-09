package prac221109;

public class squareRoot {
    public long solution(long n) {
        long answer = 0;
        long x=(long)Math.sqrt(n);

            if (n == (long) Math.pow(x, 2)) {
               return answer = (long) Math.pow((x + 1), 2);
            } else
               return answer = -1;


    }
}
