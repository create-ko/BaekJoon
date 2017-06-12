package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 10..
 */
public class Number11727 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dp[] = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=num;i++){

            dp[i] = dp[i-1] + (2*dp[i-2]);

            dp[i] = dp[i]%10007;
        }
        System.out.println(dp[num]);

    }
}
