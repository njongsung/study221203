package prac221111;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		System.out.println("요소수: ");
    int num = sc.nextInt();
    int[] x = new int[num];
    System.out.println("오름차순으로 입력하세요");
//    System.out.println("x[0] :");
//    x[0] = sc.nextInt();

		for (int i=0; i<num; i++) {
        System.out.print("x["+i+"]: ");
        x[i]=sc.nextInt();
    }

    System.out.println("검색할 값");
    int key = sc.nextInt();

    int idx = binarySearch(x, num, key);
		if(idx == -1) System.out.println("없습니다.");
		else System.out.println("그 값은 x["+idx+"]에 있습니다.");

}

    private static int binarySearch(int[] a, int n, int key) {
        //이진 검색
        int pl=0;
        int pr=n-1;
        int cnt=0; // 몇 번 비교했는지 구하는 변수
        do{
            cnt++;
           int pc = (pl+pr)/2;
           if(a[pc] == key)return pc;
           else if(a[pc] < key) pl = pc + 1;
           else pr = pc - 1;
            System.out.println(cnt + "번 비교했습니다.");
        }while(pl<=pr);
        // 못찾았음

        return -1;
    }
}
