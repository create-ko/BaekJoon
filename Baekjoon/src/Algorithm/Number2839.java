package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 16..
 */
public class Number2839 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int three=0, five = n/5; n %= 5;
        while(five>=0) {
            if (n % 3 == 0) {
                three = n / 3;
                n %= 3;
                break;
            }
            five--;
            n += 5;
        }
        System.out.printf("%d", n == 0 ? five + three : -1);
    }
}

