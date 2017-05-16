package Step2;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 16..
 */
public class Number1008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();
        if(0<a){
            double b=sc.nextDouble();
            if(b<10){
                System.out.println(a/b);
            }
        }
    }
}
