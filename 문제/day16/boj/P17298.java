package day16.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P17298 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int noLimit = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        int[] resultArray = new int[noLimit];
        int[] quizArray = new int[noLimit];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<noLimit; i++){
            quizArray[i] = Integer.parseInt(st.nextToken());
        }
        if(noLimit == 1){
            System.out.println(-1);
            return;
        }
        for(int i=0; i<noLimit; i++){
            while(!stack.isEmpty()&& quizArray[stack.peek()]<quizArray[i]){
                resultArray[stack.pop()] = quizArray[i];
            }
            stack.add(i);
        }
        for(int i=0; i<resultArray.length; i++){
            if(resultArray[i]==0){
                sb.append("-1");
            }else{
                sb.append(resultArray[i]);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
