package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2475 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum =0;
        for(int i=0; i<5; i++){
            int quizNo = Integer.parseInt(st.nextToken());
            if(quizNo!=0){
                sum += Math.pow(quizNo,2);
            }
        }
        System.out.println(sum%10);
    }
}
