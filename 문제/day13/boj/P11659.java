package day13.boj;

import java.io.*;
import java.util.Arrays;

public class P11659{
    public static void main(String[] ars) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int numberLength= (int)st.nval;
        st.nextToken();
        int forCount = (int)st.nval;
        int[] sumArray = new int[numberLength];
        st.nextToken();
        sumArray[0] = (int)st.nval;
        for(int i=1; i< numberLength; i++){
            st.nextToken();
            sumArray[i] = sumArray[i-1] + (int)st.nval;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< forCount; i++){
            st.nextToken();
            int start = (int)st.nval-1;
            st.nextToken();
            int end = (int)st.nval-1;

            if(start == 0){
                sb.append(sumArray[end]).append("\n");
            }else{
                sb.append(sumArray[end]-sumArray[start-1]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
