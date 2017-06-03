package Algorithm_class1;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number2445 {
    public static void main(String args[]){
        char ch = '*';
        char ch_space = ' ';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            for(int j=1;j<T-i;j++){
                System.out.print(ch_space);
            }
            for(int j=1;j<T-i;j++){
                System.out.print(ch_space);
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i=0;i<T-1;i++){
            for(int j=T-1;j>i;j--){
                System.out.print(ch);
            }
            for(int j=T;j>=T-i;j--){
                System.out.print(ch_space);
            }
            for(int j=T;j>=T-i;j--){
                System.out.print(ch_space);
            }
            for(int j=T-1;j>i;j--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
