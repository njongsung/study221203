package prac221119;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;


public class RemoveDuplicates {
    public static ArrayList remove(int[] arr) {


            int n = arr.length;
            int j = 0;

            ArrayList<Integer> temp = new ArrayList<Integer>();

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                        temp.add(arr[i]);
                }
            }

            if(arr[n-1] == arr[n - 2]){
                temp.add(arr[n-1]);
            }

            return temp;

    }



    public static void main(String[] args) {
        int[] a={1,1,3,3,0,1,1};
        int n = a.length;

        remove(a);




}
