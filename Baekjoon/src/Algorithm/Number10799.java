package Algorithm;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by seung_hee on 2017. 5. 25..
 */
public class Number10799 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Character> stc = new Stack<>();
        int result = 0;
        String as = sc.next();
        for(int i=0;i<as.length();i++){
            if(as.charAt(i)=='('){
                stc.push(as.charAt(i));
            }else {
                stc.pop();
                if(as.charAt(i-1) == '('){
                    result += stc.size();
                }else result++;
            }
        }
        System.out.println(result);
    }
}
