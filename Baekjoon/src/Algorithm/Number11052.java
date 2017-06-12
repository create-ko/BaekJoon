package Algorithm;

import java.util.Scanner;


/**
 * Created by seung_hee on 2017. 6. 12..
 */
public class Number11052 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = new int[T+1];
        for (int i=1; i<=T; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[T+1];
        for (int i=1; i<=T; i++) {
            for (int j=1; j<=i; j++) {
                if (d[i] < d[i-j] + a[j]) {
                    d[i] = d[i-j] + a[j];
                }
            }
        }
        System.out.println(d[T]);
    }
}