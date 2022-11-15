package prac221115;

import java.util.Arrays;

public class arrdiv {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                for(int j=0;j<=i;j++){
                    answer[j] = arr[i];
                    count++;
                }
            }
        }

        if(count==0);
        answer = new int[]{-1};

        Arrays.sort(answer);
        return answer;
    }


}
