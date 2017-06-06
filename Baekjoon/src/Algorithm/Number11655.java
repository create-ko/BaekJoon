package Algorithm;

import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number11655 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if('a'<=s.charAt(i) && s.charAt(i)<= 'z'){
                int a = 0;
                a = s.charAt(i) + 13;
                if(a>'z'){
                    a= a - ('z'-'a'+1);
                    sb.append((char)a);
                }else {
                    sb.append((char)a);
                }
            }else if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){

//                char c = s.charAt(i);
//                c+=13;
//                if(c>='Z'){
//                    int a = c - ('Z'+1);
//                    c = 'A';
//                    c+=a;
//                }
//                sb.append(c);

                int a = 0;
                a = s.charAt(i) + 13;
                if(a>'Z'){
                    a= a - ('Z'-'A'+1);
                    sb.append((char)a);
                }else {
                    sb.append((char)a);
                }
            }else{
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
