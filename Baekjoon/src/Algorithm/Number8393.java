package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number8393 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum=0;
        for(int j=1;j<=i;j++){
            sum+= j;
        }
        System.out.println(sum);
    }
}
