package prac221113;

import java.util.Scanner;

public class SomOf {
    static int sumOf(int[]a){
        int sum=0;
        for(int i=0; i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int[]x= new int[num];

        for(int i=0;i<num;i++){
            System.out.print("a["+i+"]: ");
            x[i]=sc.nextInt();
        }
        System.out.println("모든 요소의 합계는 "+sumOf(x)+"입니다");
    }
}
