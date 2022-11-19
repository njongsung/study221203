package prac221119;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;


public class RemoveDuplicates {
    public static ArrayList solution(int[] arr) {


        int n = arr.length;
        int j = 0;

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp.add(arr[i]);
            }
        }


        if(temp.indexOf(temp.size() - 1) != arr[n-1]){
            temp.add(arr[n-1]);
        }


        return temp;

    }

    }

}
