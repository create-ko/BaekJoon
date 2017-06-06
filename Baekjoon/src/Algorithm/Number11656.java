package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number11656 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> st = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            st.add(s.substring(i, s.length()));
        }

        Collections.sort(st);
        for(String stq : st){
            System.out.println(stq);
        }


    }
}
