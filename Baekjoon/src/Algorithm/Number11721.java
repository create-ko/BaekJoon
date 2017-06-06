package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 17..
 */
public class Number11721 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if((s.length()<100) && (s.length()>0)){
            for(int i=0;i<s.length();i++){
                if(i!=0 && i%10==0){
                    System.out.println();
                }
                System.out.print(s.charAt(i));
            }
        }
    }
}
