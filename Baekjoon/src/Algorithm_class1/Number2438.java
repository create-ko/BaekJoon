package Algorithm_class1;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number2438 {
    public static void main(String args[]){
        char ch ='*';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
