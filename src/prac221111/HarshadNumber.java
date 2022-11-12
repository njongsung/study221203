package prac221111;

public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;


        while (x != 0) {
            sum += x % 10;

            try {
                if (x % sum == 0) return true;
                else return false;
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return answer;
    }

}
