package Algorithm_class1;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 3..
 */
public class Number10992 {
    public static void main(String args[]){
        char ch ='*';
        char ch_s=' ';
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            for(int j=i;j<T-1;j++){
                System.out.print(ch_s);
            }
            if(i==T-1){
                for(int j=0;j<(i*2)+1;j++){
                    System.out.print(ch);
                }
            }else{
                for(int j=0;j<(i*2)+1;j++){
                    if(j==0 || j==(i*2)){
                        System.out.print(ch);
                    }else{
                        System.out.print(ch_s);
                    }

                }
            }
            System.out.println();
        }
    }
}
