package day15.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int quizNo = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int[] quizArray = new int[quizNo+1];
        for(int i=0; i<quizNo; i++){
            st.nextToken();
            quizArray[i] = (int) st.nval;
        }
        int idx=0;
        for(int i=0; i<quizNo; i++){
            stack.push(i+1);
            sb.append("+").append("\n");
            while(!stack.isEmpty() && stack.peek()==quizArray[idx]){
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek()==quizArray[idx]){
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
