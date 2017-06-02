package Algorithm_class1;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number10818 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int min, max;
        int num[] = new int[T];
        for(int i=0;i<T;i++){
            num[i]=sc.nextInt();
        }
        min = num[0];
        max = num[0];
        for(int i=1;i<num.length;i++){
            if(min > num[i]){
                min = num[i];
            }
            if(max <num[i]){
                max = num[i];
            }
        }
        System.out.println(min+ " " + max);

    }
}
