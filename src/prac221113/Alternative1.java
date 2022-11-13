package prac221113;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("n의 값을 입력해주세요.");
        n=sc.nextInt();

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        for (int i=1; i<=n; i++){
            if(i%2==0)
                System.out.println("-");
            else
                System.out.println("+");
        }
    }

}
