package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1654 {
    static long minNo = Integer.MAX_VALUE;
    static boolean operator = false;
    static int desireNo;
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nowNo = Integer.parseInt(st.nextToken());
        desireNo = Integer.parseInt(st.nextToken());
        long[] lineArr = new long[nowNo];
        for(int i=0; i<nowNo; i++){
            st = new StringTokenizer(br.readLine());
            lineArr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(lineArr);
        long start = 0;
        long end = lineArr[0];
        long result = 0;
        result = binarySearchForHalf(start,end,lineArr,false);
//        result = binarySearchForMax(result,end,lineArr);
        System.out.println(result);
    }
    public static long binarySearchForHalf(long start, long end, long[] arr, boolean operator){
        long half = start + (end-start)/2;
        long calNo =0;
        for (long l : arr) {
            calNo += l / half;
            minNo = Math.min(minNo,l%half);
        }
        if(start>end){
            return start + (operator?+2:-2);
        }
        if(calNo>=desireNo){
            start = half+1;
            operator=false;
        }else if(calNo<desireNo){
            end = half-1;
            operator = true;
        }
        return binarySearchForHalf(start,end,arr,operator);
    }
    public static long binarySearchForMax(long start,long end, long[] arr){
        long half = start + (end-start)/2;
        long calNo =0;
        for (long l : arr) {
            calNo += l / half;
        }
        if(start>end){
            return half;
        }
        if(calNo>=desireNo){
            start=half+1;
        }else if(calNo<desireNo){
            end = half-1;
        }
        return binarySearchForMax(start,end,arr);
    }
}
