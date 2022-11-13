package prac221113;

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("n의 값을 입력해주세요.");
        n=sc.nextInt();

        for (int i=0; i<n/2; i++)
            System.out.print("+-");

        if(n%2!=0)
            System.out.print("+");
    }
}
