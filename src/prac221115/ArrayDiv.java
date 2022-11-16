package prac221115;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiv {
    public int[] solution(int[] arr, int divisor) {
        int[] default_answer = {-1};

        List<Integer> answer = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            // 조건( divisor 로 나누어지는 수인지)
            if(arr[i]%divisor==0){
                // 만약 그렇다면 값을 결과에 추가
                answer.add(arr[i]);
            }

        }
        if (answer.isEmpty()){
            return default_answer;
        }else {
            answer.sort((i,j) -> i - j);

            default_answer = answer.stream().mapToInt(i->i).toArray();
            return default_answer;
        }
    }

    public boolean check(int[] my_answer, int[] expected){
        if(my_answer.length != expected.length)
            return false;
        for(int i=0;i<my_answer.length;i++) {
            if(my_answer[i] != expected[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test_case_1 = {5, 9, 7, 10};
        int divisor_1 = 5;
        int[] expected_1 = {5,10};

        int[] test_case_2 = {2,36,1,3};
        int divisor_2 = 1;
        int[] expected_2 = {1,2,3,36};

        int[] test_case_3 = {3,2,6};
        int divisor_3 = 10;
        int[] expected_3 = {-1};


        ArrayDiv this_class = new ArrayDiv();
        int[] answer_1 = this_class.solution(test_case_1,divisor_1);
        System.out.println(this_class.check(answer_1,expected_1));
        int[] answer_2 = this_class.solution(test_case_2,divisor_2);
        System.out.println(this_class.check(answer_2,expected_2));
        int[] answer_3 = this_class.solution(test_case_3,divisor_3);
        System.out.println(this_class.check(answer_3,expected_3));
    }
}


/*
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int k=0;
        int[] a = new int[arr.length];
        int[] answer = {-1};
        int count=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                for(int j=k;j<=i;j++){
                    a[j] = arr[i];
                    count++;
                    ++k;
                }
            }

        }

        if(count==0) return answer;

        Arrays.sort(a);
        return a;
    }
 */


/*
    public int[] solution(int[] arr, int divisor) {
        int k=0;
        int[] a = new int[arr.length];
        int[] answer = {-1};
        int count=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                for(int j=k;j<=i;j++){
                    a[j] = arr[i];
                    count++;
                    ++k;
                }
            }
        }

        List<Integer> b = new ArrayList<>();


        if(count==0) return answer;

        Arrays.sort(a);
        return a;
    }
 */