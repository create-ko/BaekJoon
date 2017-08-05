package Algorithm;

import java.util.Scanner;

/**
 * Created by seunghee on 2017. 6. 29..
 */
public class Number11053 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int d[] = new int[T];
        for (int i = 0; i < d.length; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                }
            }
        }


        int anw = d[0];

        for (int i = 1; i < d.length; i++) {
            if(anw<d[i])
                anw = d[i];
        }

        System.out.println(anw);
    }
}
