package Algorithm1;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 17..
 */
public class Number10953 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a, c;
        String[] b;
        for(int j=0;j<num;j++) {
            b = sc.next().split(",");
            a = Integer.parseInt(b[0]);
            c = Integer.parseInt(b[1]);
            System.out.println(a + c);
        }
    }
}
