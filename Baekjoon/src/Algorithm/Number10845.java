package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number10845 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] que = new int[10000];
        int start=0, end=0;
        sc.nextLine();
        while(T-- > 0){
            String s_p = sc.nextLine();
            String[] s=s_p.split(" ");

            switch (s[0]){
                case "push" :
                    que[end] = Integer.parseInt(s[1]);
                    end+=1;
                    break;
                case "pop" :
                    if(end==start){
                        System.out.println(-1);
                    }else {
                        System.out.println(que[start]);
                        que[start] = 0;
                        start+=1;
                    }
                    break;
                case "size" :
                    System.out.println(end-start);
                    break;
                case "empty" :
                    if(start==end){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front" :
                    if(start != end){
                        System.out.println(que[start]);
                    }else {
                        System.out.println(-1);
                    }
                    break;
                case "back" :
                    if(start != end){
                        System.out.println(que[end-1]);
                    }else {
                        System.out.println(-1);
                    }
                    break;
            }

        }

    }
}
