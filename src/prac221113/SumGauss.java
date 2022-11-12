package prac221113;

import java.util.Scanner;

public class SumGauss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = sc.nextInt();

        int Gauss;

        Gauss=(1+n)*n/2;

        if(n%2!=0) {
            Gauss = ((1+n)*(n/2) + (1+n)/2);

        }
        System.out.println(Gauss);
    }
}
