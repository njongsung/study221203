package prac221113;

import java.util.Scanner;

//입력한 정숫값의 부호(양수/음수/0)를 판단
public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        if(n>0)
            System.out.println("이 수는 양의 정수입니다.");
        else if(n<0)
            System.out.println("이 수는 음의 정수입니다.");
        else if(n==0)
            System.out.println("이 수는 0입니다.");
        else
            System.out.println("정수를 입력해주세요.");
    }
}
