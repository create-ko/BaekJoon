package Step2;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 16..
 */
public class Number10869 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(1<=a){
            int b = sc.nextInt();
            if(b<=10000){
                System.out.println(a+b);
                System.out.println(a-b);
                System.out.println(a*b);
                System.out.println(a/b);
                System.out.println(a%b);
            }
        }
    }
}
