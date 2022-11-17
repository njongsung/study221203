package prac221118;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class lrdiv {
    public int solution(int l, int r) {
        int answer = 0;
        ArrayList<Integer>sum = new ArrayList<>();

        for (int i=l;i<=r;i++) {
            int s = (int)Math.sqrt(i);
            if(s%i==0){
                sum.add(i);
                if(s/i!=i)
                    sum.add(s/i);
            }
            if (sum.size()/2==0){
                answer+=i;
            }else {
                answer-=i;
            }
            sum.clear();
        }
        return answer;
    }
    public void main(String[] args) {
        solution(13,17);
    }
}


