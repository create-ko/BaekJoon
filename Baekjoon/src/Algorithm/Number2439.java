package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number2439 {
    public static void main(String args[]){
        char ch ='*';
        char ch_s=' ';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            for(int j=1;j<T-i;j++){
                System.out.print(ch_s);
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}