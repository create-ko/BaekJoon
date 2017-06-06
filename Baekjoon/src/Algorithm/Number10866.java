package Algorithm;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number10866 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        ArrayDeque<Integer> de = new ArrayDeque<>();
        while (T-- > 0) {
            String s_p = sc.nextLine();
            String[] s = s_p.split(" ");
            switch (s[0]){
                case "push_front" :
                    de.offerFirst(Integer.parseInt(s[1]));
                    break;
                case "push_back" :
                    de.offerLast(Integer.parseInt(s[1]));
                    break;
                case "front" :
                    if(de.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(de.peekFirst());
                    }
                    break;
                case "back" :
                    if(de.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(de.peekLast());
                    }
                    break;
                case "pop_front" :
                    if(de.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(de.pollFirst());
                    }
                    break;
                case "pop_back" :
                    if(de.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(de.pollLast());
                    }
                    break;
                case "size" :
                    System.out.println(de.size());
                    break;
                case "empty" :
                    if(de.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
            }


        }
    }
}
