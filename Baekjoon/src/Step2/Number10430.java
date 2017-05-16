package Step2;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 16..
 */
public class Number10430 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if ((2 <= a) && (a <= 10000)) {
            if ((2 <= b) && (b <= 10000)) {
                if ((2 <= c) && (c <= 10000)) {
                    System.out.println((a + b) % c);
                    System.out.println((a % c + b % c) % c);
                    System.out.println((a * b) % c);
                    System.out.println((a % c * b % c) % c);
                }
            }
        }
    }
}
