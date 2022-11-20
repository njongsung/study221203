package prac221120;

public class Rectangle {

    private static int sol(int[][] sol) {
        int maxWid = 0;
        int maxHei = 0;


        for (int i = 0; i < sol.length; i++) {
            int longer = sol[i][0];
            int shorter = sol[i][1];

            if (longer < shorter){//swap
                    int swap=longer;
                    longer=shorter;
                    shorter=swap;
            }

            if(maxWid<longer)
                maxWid=longer;

            if(maxHei<shorter)
                maxHei=shorter;


        }
        System.out.println(maxWid*maxHei);
        return maxWid*maxHei;
    }

    public static void main(String[] args) {
        int[][] a={{10,7},{12,3},{8,15},{14,7},{5,15}};

        sol(a);
    }
}
