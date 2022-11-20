package prac221120;

import java.util.Arrays;

public class budjet {
    budjet(){};
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        return answer;
    }




    private static void budget(int[] d, int budget) {
        int leng=d.length;
        Arrays.sort(d);
        int bud=0;
        int count=0;

        for(int i=0; i<leng; i++){
            bud+=d[i];
            if(bud<=budget){
                count++;
            }else
                break;
        }

        System.out.println(count);


    }

    public static void main(String[] args) {
        int[]a = {2,2,3,3};
        int d=10;
        budget(a,d);

    }
}
