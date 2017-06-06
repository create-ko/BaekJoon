package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number10808 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] al = new int[26];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char c = 'a';
            for(int j=0;j<26;j++){
                if(ch==c++){
                    al[j] += 1;
                    break;
                }
            }
        }
        System.out.print(al[0]);
        for(int i=1;i<al.length;i++){
            System.out.print(" "+al[i]);
        }
    }
}
