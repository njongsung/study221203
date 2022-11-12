package prac221113;

public class MaxMinTest1 {
    static int max4(int a, int b, int c, int d){
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        return max;
    }


    static int min3(int a, int b, int c){
        int min3=a;
        if (b<min3) min3=b;
        if (c<min3) min3=c;

        return min3;
    }

    static int min4(int a, int b, int c, int d){
        int min4=a;
        if (b<min4) min4=b;
        if (c<min4) min4=c;
        if (d<min4) min4=d;

        return min4;

    }

    public static void main(String[] args) {

    }
}
