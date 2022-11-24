package reac221125;

public class dart {
    private static int Solution(String dartResult) {

        int answer = 0;
        int count = 0;
        int starcount = 0;
        int hashcount = 0;
        int[] score = new int[3];

        char[] process = dartResult.toCharArray();

        for (int i = 0; i < process.length; i++) {
            switch (process[i]) {     // 계산 전 점수
                case '1':
                    score[count] += 1;
                    break;
                case '2':
                    score[count] += 2;
                    break;
                case '3':
                    score[count] += 3;
                    break;
                case '4':
                    score[count] += 4;
                    break;
                case '5':
                    score[count] += 5;
                    break;
                case '6':
                    score[count] += 6;
                    break;
                case '7':
                    score[count] += 7;
                    break;
                case '8':
                    score[count] += 8;
                    break;
                case '9':
                    score[count] += 9;
                    break;
                default:
                    score[count] += 10;
                    break;
            }

            switch (process[i]) {
                case 'S':
                    score[count] *= 1;
                    count++;
                    break;
                case 'D':
                    Math.pow(score[count], 2);
                    count++;
                    break;
                case 'T':
                    Math.pow(score[count], 3);
                    count++;
                    break;
            }

            if (hashcount == 0) {
                switch (process[i]) {
                    case '*':
                        if (starcount == 0) {
                            score[count] *= 2;
                            starcount++;
                            break;
                        } else if (starcount > 0) {
                            score[count] *= 4;
                            break;
                        }

                    case '#':
                        score[count] *= -1;
                        hashcount++;
                        break;
                }
            } else {
                switch (process[i]) {
                    case '*':
                        score[count]-=score[count];
                        break;


                    case '#':
                        score[count] *= -1;
                        hashcount++;
                        break;

                }

            }


            }
        for (int j = 0; j < 3; j++) {
            answer += score[j];
        }


        return answer;


    }

    public static void main(String[] args) {
        String S = "1D#2S*3S";
        Solution(S);
        System.out.println(Solution(S));
    }
}

