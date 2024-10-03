package day15.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] quizNo = new int[Integer.parseInt(st.nextToken())];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<quizNo.length; i++){
            int no = Integer.parseInt(st.nextToken());
            quizNo[i] = no;
        }
        Arrays.sort(quizNo);
        int start = 0;
        int result = 0;
        if(quizNo.length<3){
            System.out.println(0);
            return ;
        }
        int nowIdx = quizNo.length-1;
        int end = quizNo.length-1;
        while(nowIdx>=0){
            if (nowIdx == end) {
                end--;
                continue;
            }

            // 현재 인덱스가 start와 같으면 start를 증가시키고 다음 반복으로 넘어감
            if (start == nowIdx) {
                start++;
                continue;
            }

            // start가 end보다 크거나 같으면 start와 end를 초기화하고 nowIdx를 감소시킴
            if (start >= end) {
                start = 0;
                end = quizNo.length - 1;
                nowIdx--;
                continue;
            }
            long sumNo = quizNo[start] + quizNo[end];
            if(sumNo==quizNo[nowIdx]){
                result++;
                nowIdx--;
                end = quizNo.length-1;
                start=0;
            }else if(sumNo > quizNo[nowIdx]){
                end--;
            }else if(sumNo<quizNo[nowIdx]){
                start++;
            }

        }
        System.out.println(result);
    }
}
