package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 24..
 */

public class Number9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            String s = sc.next();
            System.out.println(reaction(s));
        }
    }


    public static String reaction(String a){
        int count =0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('){
                count++;
            }else if(a.charAt(i)==')'){
                count--;
            }
            if(count<0){
                return "NO";
            }
        }
        if(count == 0 ) {
            return "YES";
        }else return "NO";
    }
}