package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 16..
 */
public class Number1001 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(0<a){
            int b = sc.nextInt();
                if(b<10){
                    System.out.println(a-b);
                }
        }
    }
}
