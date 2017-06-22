package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 16..
 */
public class Number11057 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int dp[][] = new int[T+1][10];

        for(int i=0;i<10;i++){
            dp[1][i] = 1;
        }

        for(int i=2;i<=T;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<=j;k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }

            }
        }

        long sum =0;
        for(int i=0;i<10;i++)
            sum += dp[T][i];

        System.out.println(sum%10007);
    }
}
