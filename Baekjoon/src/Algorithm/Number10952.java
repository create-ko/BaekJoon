package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 17..
 */
public class Number10952 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(sc.hasNext()){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0){
                if(b==0){
                    break;
                }
            }
            System.out.println(a+b);
        }
    }
}
