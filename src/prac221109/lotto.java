package prac221109;

import java.util.Random;
import java.util.Scanner;

public class lotto {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] lotto = new int[7];
        Random num = new Random();
        int tmp;



        System.out.print("게임 수를 입력하세요: ");
        int q = sc.nextInt();
        do {

                for (int i = 0; i < lotto.length; i++) {
                    lotto[i] = num.nextInt(45) + 1;
                    for (int k = 0; k < i; k++) {
                        if (lotto[i] == lotto[k])
                            i--;
                    }
                }

                for (int i = 0; i < lotto.length; i++) {
                    for (int k = 0; k < i; k++) {
                        if (lotto[i] < lotto[k]) {
                            tmp = lotto[i];
                            lotto[i] = lotto[k];
                            lotto[k] = tmp;
                        }
                    }
                }

                for (int i = 0; i < lotto.length - 1; i++) {
                    System.out.printf("%d ", lotto[i]);
                }
                String B = "Bouns: ";
                System.out.printf("%s%d\n", B, lotto[lotto.length - 1]);
            --q;

            if(q==0){
                System.out.print("계속 하시겠습니까 (1:예, 2:아니오)");
                int x = sc.nextInt();
                if(x==1) {
                    System.out.print("게임 수를 입력하세요: ");
                    q = sc.nextInt();
                }else if(x==2) break;
            }

        }while(q!=0);

    }
}
