package Algorithm_class1;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 3..
 */
public class Number10991 {
    public static void main(String args[]){
        char ch='*';
        char ch_s =' ';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            for(int j=i;j<T-1;j++){
                System.out.print(ch_s);
            }

            for(int j=0;j<(i*2)+1;j++){
                if(j%2==1){
                    System.out.print(ch_s);
                }else {
                    System.out.print(ch);
                }
            }
            System.out.println();

        }
    }
}
