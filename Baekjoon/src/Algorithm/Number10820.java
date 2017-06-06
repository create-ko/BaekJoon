package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number10820 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]= new int[4];
        while(sc.hasNext()){
            String s = sc.nextLine();
            for(int i=0;i<num.length;i++){
                num[i] = 0;
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ' ') {
                    num[3] += 1;
                }else if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                    num[0] += 1;
                }else if('A' <= s.charAt(i) && s.charAt(i) <='Z'){
                    num[1] += 1;
                }else if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                    num[2] += 1;
                }
            }

            System.out.println(num[0] + " " +num[1] + " " +num[2] + " " +num[3]);
        }
    }
}
