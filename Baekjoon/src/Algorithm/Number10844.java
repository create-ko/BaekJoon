package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 13..
 */
public class Number10844 {
    public static void main(String args[]){
        long d = 1000000000;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int dp[][] = new int[T+1][10];

        for(int i=1;i<10;i++){
            dp[1][i] = 1;
        }
        for(int i=2;i<=T;i++){
            for(int j=0;j<=9;j++){
                dp[i][j] = 0;
                if(j-1>=0){
                    dp[i][j] += dp[i-1][j-1];
                }
                if(j+1<=9){
                    dp[i][j] += dp[i-1][j+1];
                }
                dp[i][j] %= d;
            }
        }

        long sum = 0;
        for(int i=0;i<=9;i++){
            sum += dp[T][i];
        }

        System.out.println(sum%d);
    }
}
