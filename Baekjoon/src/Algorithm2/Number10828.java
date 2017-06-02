package Algorithm2;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by seung_hee on 2017. 5. 19..
 */
public class Number10828 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<num;i++){
            switch(sc.next()){
                case "push":st.push(sc.nextInt());a++;
                    break;
                case "pop":if(st.empty()){
                    System.out.println("-1");
                }else {
                    System.out.println(st.peek());
                    st.pop();
                    a--;
                }
                    break;
                case "size":System.out.println(st.size());
                    break;
                case "empty":if(st.empty()){
                    System.out.println("1");
                }else System.out.println("0");
                break;
                case "top":if(st.empty()){
                    System.out.println("-1");
                }else {
                    System.out.println(st.peek());
                }
            }
        }
    }

}