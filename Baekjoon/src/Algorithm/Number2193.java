package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 17..
 */
public class Number2193 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int d[] = new int[T+1];


        d[1]=1;
        if(T>=2){
            d[2]=1;
        }
        for(int i=3;i<=T;i++){
            d[i] = d[i-1]+d[i-2];
        }

        System.out.println(d[T]);
    }
}
