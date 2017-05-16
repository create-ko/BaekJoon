import java.util.Scanner;

/**
 * Created by seung_hee on 2017. 5. 16..
 */
public class Number11718 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.nextLine();
            if(!(s.isEmpty()) | (s.length()>100))
            System.out.println(s);
        }
    }
}
