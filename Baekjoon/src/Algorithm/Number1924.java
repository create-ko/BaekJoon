package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 2..
 */
public class Number1924 {
    public static void main(String args[]){
        String[] day_mon={"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] day_day={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int day=0;
        for(int i=0;i<x-1;i++){
            day +=day_day[i];
        }
        day+=y;
        System.out.println(day_mon[day%7]);

    }
}
