package prac221106;

import java.io.*;

public class inputSR {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        try {
            BufferedReader br = new BufferedReader(isr);
            String line =  br.readLine();

            for (var word:line.split(" ")) {
                System.out.println(word);
            }

        } catch (IOException e) {
            System.out.println("wrong input");
        }
    }
}