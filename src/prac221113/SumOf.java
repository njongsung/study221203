package prac221113;

import java.util.Scanner;

public class SumOf {
    static int sumof(int a, int b){
        int sum=0;

        if(a<b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        }else if(a>b){
            for (int i = a; i>= b; i--){
                sum += i;
            }
            return sum;
        }else
            sum=a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값을 입력하세요: ");
        int a = sc.nextInt();
        System.out.println("b의 값을 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("a와 b 사이 값의 합은 "+sumof(a,b)+"입니다.");
    }
}
