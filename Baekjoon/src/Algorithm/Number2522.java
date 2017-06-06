package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 3..
 */
public class Number2522 {
    public static void main(String args[]){
        char ch ='*';
        char ch_s=' ';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            for(int j=i;j<T-1;j++){
                System.out.print(ch_s);
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }


        for(int i=0;i<T-1;i++){

            for(int j=0;j<=i;j++){
                System.out.print(ch_s);
            }

            for(int j=i;j<T-1;j++){
                System.out.print(ch);
            }


            System.out.println();
        }
    }
}
