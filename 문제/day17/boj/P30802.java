package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30802 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        long memNo = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long [] tShirt = new long[6];
        for(int i=0; i<6; i++){
            tShirt[i] =Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        long quizTShirt = Long.parseLong(st.nextToken());
        long quizPen = Long.parseLong(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(int i=0; i<6; i++){
            if(tShirt[i]<=quizTShirt){
                sum+=1;
            }else{
                sum+=tShirt[i]/quizTShirt;
                if(tShirt[i]%quizTShirt>0){
                    sum+=1;
                }
            }
            if(tShirt[i]==0){
                sum-=1;
            }
        }
        long penDivide = memNo/quizPen;
        if(penDivide==0&& memNo>quizPen){
            memNo+=quizPen;
            penDivide = memNo/quizPen -1;
        }
        long penModuler = memNo%quizPen;
        sb.append(sum).append("\n").append(penDivide).append(" ").append(penModuler);
        System.out.println(sb.toString());
    }
}
