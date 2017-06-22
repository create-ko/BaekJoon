package Algorithm;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 17..
 */
public class Number2156 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T+1];

        for(int i=1;i<T+1;i++){
            a[i] = sc.nextInt();
        }

        int[] d = new int[T+1];
        d[1] = a[1];
        if (T >= 2) {
            d[2] = a[1]+a[2];
        }
        for (int i=3; i<=T; i++) {
            d[i] = d[i-1];
            d[i] = Math.max(d[i], d[i-2]+a[i]);
            d[i] = Math.max(d[i], d[i-3]+a[i-1]+a[i]);
        }
        int ans = d[1];
        for (int i=2; i<=T; i++) {
            ans = Math.max(ans, d[i]);
        }
        System.out.println(ans);

    }
}
