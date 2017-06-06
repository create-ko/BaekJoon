package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number2440 {
    public static void main(String args[]){
        char ch = '*';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            for(int j=T;j>i;j--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
