package reac221125;

public class dart {
    public int solution(String dartResult) {
        int answer = 0;
//        int[] Pscore = {1,2,3,4,5,6,7,8,9,10};
//        String[] bouns = {"S","T","D"};
//        String[] option = {"*", "#"};

        char[] process = dartResult.toCharArray();


        return answer;

    }

    private static int Solution(String dartResult) {

        int answer=0;
        int count=0;
        int starcount=0;
        int hashcount=0;
        int allcount=0;
        int pin=0;
        int[] score= new int[3];

        char[] process = dartResult.toCharArray();

        for (int i=0; i<process.length; i++){
            switch(process[i]){     // 계산 전 점수
                case 1:
                    score[count]+=1;
                    count++;
                    break;
                case 2:
                    score[count]+=2;
                    count++;
                    break;
                case 3:
                    score[count]+=3;
                    count++;
                    break;
                case 4:
                    score[count]+=4;
                    count++;
                    break;
                case 5:
                    score[count]+=5;
                    count++;
                    break;
                case 6:
                    score[count]+=6;
                    count++;
                    break;
                case 7:
                    score[count]+=7;
                    count++;
                    break;
                case 8:
                    score[count]+=8;
                    count++;
                    break;
                case 9:
                    score[count]+=9;
                    count++;
                    break;
                case 10:
                    score[count]+=10;
                    count++;
                    break;
            }

            switch (process[i]){
                case 'S':
                    score[count-1]*=1;
                    break;
                case 'D':
                    Math.pow(score[count-1],2);
                    break;
                case 'T':
                    Math.pow(score[count-1],3);
                    break;
            }

            if(hashcount==0) {
                switch (process[i]) {
                    case '*':
                        if (starcount == 0 && allcount == 0) {
                            score[count - 1] *= 2;
                            starcount++;
                            allcount++;
                            break;
                        } else if (starcount > 0) {
                            score[count - 1] *= 4;
                            break;
                        }

                    case '#':
                        score[count - 1] *= -1;
                        hashcount++;
                        allcount++;
                        break;
                }
            }else{
                switch (process[i]) {
                    case '*':
                        if (starcount == 0 && allcount == 0) {
                            score[count - 1] *= 2;
                            starcount++;
                            allcount++;
                            break;
                        } else if (starcount > 0 && allcount == 0) {
                            score[count - 1] *= 4;
                            break;
                        }

                    case '#':
                        score[count - 1] *= -1;
                        hashcount++;
                        allcount++;
                        break;

            }

        }

        for (int j=0; j<3; j++){
            answer+=score[j];
        }
        return answer;
    }




    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        Solution(dartResult);
    }
}

