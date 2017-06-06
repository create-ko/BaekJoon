package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 17..
 */
public class Number11022 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int j=1;j<=num;j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+j+": "+a+ " + "+b+" = " + (a+b));
        }
    }
}
