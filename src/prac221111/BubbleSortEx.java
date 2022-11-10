package prac221111;

import java.util.Scanner;

public class BubbleSortEx {

    static void swap(int[]a, int idx1, int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void bubbleSort(int[]a, int n){
        for (int i=n-1; i >0; i--){
            for (int j=0; j<i; j++){
                if(a[j]>a[j+1])
                    swap(a,j,j+1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x= new int[nx];

        for (int i=0; i<nx; i++){
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x,nx);

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i=0; i<nx;i++){
            System.out.println("x["+i+"]: "+x[i]);
        }
    }
}
