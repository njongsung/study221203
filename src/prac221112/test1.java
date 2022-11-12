package prac221112;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N, K 입력 받기
        System.out.print("N 입력: ");
        int N = sc.nextInt();
        System.out.print("K 입력: ");
        int K = sc.nextInt();

        // 배열 A의 모든 원소를 입력 받기
        Integer[]a = new Integer[N];
        for (int i=0; i<N; i++){
            System.out.print("["+i+"]: ");
            a[i] = sc.nextInt();
        }

        // 배열 B의 모든 원소를 입력 받기
        Integer[]b = new Integer[N];
        for (int i=0; i<N; i++){
            System.out.print("["+i+"]: ");
            b[i] = sc.nextInt();

            //배열 A는 오름차순 정렬 수행
            Arrays.sort(a);
            //배열 B는 내림차순 정렬 수행
            Arrays.sort(b, Collections.reverseOrder());
        }

        //첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
        for (int i=0; i<K; i++){
            //A의 원소가 B의 원소보다 작은 경우
            if(a[i]<b[i]){
                //두 원소를 교체
                int tmp=a[i];
                a[i]=b[i];
                b[i]=tmp;
            }
            //A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
            else break;
        }

        //배열 A의 모든 원소의 합을 출력
        long result=0;
        for(int i=0;i<N;i++){
            result+=a[i];
        }
        System.out.println(result);
    }

}
