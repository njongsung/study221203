package prac221113;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("변의 길이가 n인 정사각형 출력");
        System.out.print("n값 입력: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for (int j=0; j<n; j++){
                System.out.printf("%-3s","*");
            }
            System.out.println();
        }
    }
}
