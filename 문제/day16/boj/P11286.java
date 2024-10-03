package day16.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P11286 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st =new StreamTokenizer(br);
        Queue<Integer> queue = new PriorityQueue<>(
                Comparator.comparing((Integer x) -> Math.abs(x))
                        .thenComparing(Integer::compare)
        );
        st.nextToken();
        int limit= (int)st.nval;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<limit; i++){
            st.nextToken();
            int no = (int)st.nval;
            if(no == 0){
                if(queue.size()>0){
                    sb.append(queue.poll()).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else{
                queue.add(no);
            }
        }
        System.out.println(sb.toString());
    }
}
