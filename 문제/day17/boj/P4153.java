package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int no =Integer.parseInt(st.nextToken());
            if(no==0){
                break;
            }
            int max=no;
            int sum= (int) Math.pow(no,2);
            for(int i=1; i<3; i++){
                no =Integer.parseInt(st.nextToken());
                sum += Math.pow(no,2);
                max = Math.max(max,no);
            }
            sum -= Math.pow(max,2)*2;
            if(sum==0){
                sb.append("right").append("\n");
            }else{
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
