package day14.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 구간 합
// 모듈러 연산
// 조합

// (k-1)C1 -> kC1이되면 이전 개수만큼 조합할 수 있어 k-1씩 선형으로 늘어남 2c2 -> 1 3c2 -> 3 4c2 -> 6  => 0+`1` , 1+`2` , 3+`3`

public class P10986 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int range = Integer.parseInt(st.nextToken());
        int mod = Integer.parseInt(st.nextToken());
        long[] sumArray = new long[range+1];
        st = new StringTokenizer(br.readLine());
        long[] remainder = new long[mod];
        remainder[0] = 1;

        long result = 0L;
        for(int i=1; i<range+1; i++){
            sumArray[i] = sumArray[i-1] + Integer.parseInt(st.nextToken());
            int remainNo = (int) (sumArray[i]%mod);
            if(remainder[remainNo]>0){
                result+=remainder[remainNo];
            }
            remainder[remainNo]+=1;
        }
        System.out.println(result);
    }
}
