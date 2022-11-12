package prac221113;

import java.util.Scanner;//전체 프로그램 앞머리(클래스 선언보다 앞)에 작성

public class scanner {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); //main 메서드의 앞쪽에 작성
                                    // System.in == standard input stream
        stdIn.nextInt();//키보드로 입력한 값 중 정숫값을 읽어들인다.
    }
}

