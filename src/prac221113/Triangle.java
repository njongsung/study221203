package prac221113;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("몇 단 삼각형입니까? ");
            n = sc.nextInt();
        } while (n <= 0);


        triangleLB(n);

        triangleLU(n);

        triangleRB(n);
    }

    static void triangleLB(int n) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력");

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void triangleLU(int n) {
        System.out.println("왼쪽 위가 직각인 이등변 삼각형 출력");

        for (int i = n; i > 0; i--) {
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형 출력");

        for (int i=n; i>0; i--) {
            for (int j=0; j<=n; j++){
                if(j<i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        System.out.println("오른쪽 위가 직각인 이등변 삼각형 출력");

        for (int i=n; i>0; i--) {
            for (int j=0; j<=n; j++){
                if(j<i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
