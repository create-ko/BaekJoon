package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */

public class Number10824 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sa = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String[] sq = s.split(" ");
        for(int i=0;i<sq.length;i++){
            if(i<2){
                sa.append(sq[i]);
            }else{
                sb.append(sq[i]);
            }
        }



        long q = Long.parseLong(sa.toString());
        long qq = Long.parseLong(sb.toString());

        System.out.println(q+qq);
    }
}

