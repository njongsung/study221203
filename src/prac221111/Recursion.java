package prac221111;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial (int n){
        if (n>0)
            return n*factorial(n-1);
        else
            return -1;
    }
}
