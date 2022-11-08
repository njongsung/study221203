package prac221108;

public class sum1 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 123;
        String a = Integer.toString(n);
        char[] b = a.toCharArray();

        for (int i = 0; i < b.length; i++) {

            answer = +b[i];

        }

        System.out.print("********************************\n");

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        System.out.print("********************************\n");

        System.out.println(b.length);

        System.out.print("********************************\n");

        System.out.print(answer);
    }
}
