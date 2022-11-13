package prac221113;

import java.util.Scanner;

public class NumP {
    static void starP(int n){
        for (int i=1; i<=n; i++){   //n=3       i=1         i=2         i=3
            for (int j=1; j<=n-i; j++)//        j=1, 2      j=1          X
                System.out.print(" ");
            for (int j=1; j<=(i-1)*2+1; j++)//  j=1         j=1,2,3     j=1,2,3,4,5
                System.out.print(i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("피라미드를 출력합니다.");
        do {
            System.out.print("단수는  : ");
            n = stdIn.nextInt();
        } while (n <= 0);
        starP(n);					// 피라미드를 출력
    }
}