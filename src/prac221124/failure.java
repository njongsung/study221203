package prac221124;

import java.util.Arrays;

public class failure {
    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int people=stages.length;

        int[]failure = new int[N];
        int NCcount=0;
        int allcount=0;


        for(int i=0;i<N;i++){
            for( int j=0; j<people; j++){
                if (stages[j]==i+1)
                    NCcount++;
                }
            failure[i]=NCcount/(people-allcount);
            allcount+=NCcount;
            NCcount=0;
        }

        for (int i=0;i< failure.length;i++)
            answer[i]=failure[i];


        return answer;
    }

    public static void main(String[] args) {
        int[] a={2,1,2,6,2,4,3,3};
        int N =5;
        solution(N, a);
    }
}
