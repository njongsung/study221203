package prac221113;

import java.util.Scanner;

public class ReverseCopy {

    //배열 b의 모든 요소를 배열 a에 역순으로 copy
    static void rcopy(int[]a,int[]b){
        int num = a.length <= b.length ? a.length : b.length;
        for (int i=0; i<num; i++)
            a[i] =b[b.length - i - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a의 요솟수: ");
        int numA = sc.nextInt();
        int[]a = new int[numA];
        for (int i=0;i<numA;i++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("b의 요솟수: ");
        int numB = sc.nextInt();
        int[]b = new int[numB];
        for (int i=0;i<numB;i++){
            System.out.print("b["+i+"]: ");
            b[i] = sc.nextInt();
        }

        rcopy(a,b); //배열 b의 모든 요소를 배열 a에 역순으로 copy

        System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 paste 했습니다.");
        for (int i=0; i<numA;i++)
            System.out.println("a["+i+"]: "+a[i]);
    }
}
