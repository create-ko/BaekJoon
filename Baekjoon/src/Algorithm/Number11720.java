package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 17..
 */
public class Number11720 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num=sc.nextInt();
        String as = sc.next();
        for(int i=0;i<num;i++) {
         sum+=(as.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}
