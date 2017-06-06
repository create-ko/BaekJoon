package Algorithm;

import java.util.*;

/**
 * Created by seung_hee on 2017. 6. 6..
 */
public class Number1158 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<Integer> que = new LinkedList<Integer>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=1;i<=N;i++){
            que.offer(i);
        }

        for(int i=0;i<N-1;i++){
            for(int j=0;j<M-1;j++){
                que.offer(que.poll());
            }
            sb.append(que.poll()+ ", ");

        }
        sb.append(que.poll() + ">");
        System.out.println(sb);

    }
}
