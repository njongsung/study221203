package prac221111;

import java.util.Scanner;

public class InsertionSort {

    //단순 삽입 정렬

    static void insertionSort(int[]a, int n){
        for (int i = 1; i<n; i++){
            int j;
            int tmp=a[i];
            for(j=i;j>0 && a[j-1]>tmp;j--){
                a[j]=a[j-1];
            }
            a[j]=tmp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
    }
}
