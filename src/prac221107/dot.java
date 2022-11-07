package prac221107;

public class dot {
    public static void main(String[] args)
    {
        for(int i=1;i<7;i++){
            for(int j=0;j<i;j++){
                if(j<i){
                    System.out.print("*");}

            }System.out.println();
        }
        System.out.println("\n\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n\n");


        for(int i=1;i<7;i++){
            for(int j=6;j>0;j--) {
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }System.out.println();
        }

        System.out.println("\n\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n\n");


        for(int i=0;i<6;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }System.out.println();
        }

        System.out.println("\n\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n\n");


        for(int i=0;i<6;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }System.out.println();
        }

        for (int i=5;i>0;i--) {
            for (int j=6;j>i;j--) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }System.out.println();

        }

        System.out.println("\n\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n\n");



        for (int i=6;i>0;i--) {
            for (int j=6;j>i;j--) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }System.out.println();

        }

        for(int i=0;i<6;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }System.out.println();
        }


    }
}
