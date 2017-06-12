package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 11..
 */
public class Number9095 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int[] d = new int[11];
        d[0] = 1;
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
        }
        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
