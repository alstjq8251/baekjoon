package day14.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int forCount = Integer.parseInt(st.nextToken());
        int[] arr = new int[forCount+1];
        st = new StringTokenizer(br.readLine());
        int No = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 하단의 정렬은 삽입정렬과 같은 복잡도로 n2 의 복잡도를 가질 수 있음 -> 시간복잡도에 안좋음
        for(int i=1; i<=forCount; i++){
            int suNo = Integer.parseInt(st.nextToken());
            if(suNo>=arr[i-1]){
                arr[i]=suNo;
            }else{
                arr[i] = arr[i-1];
                int index = i-1;
                if(index == 0){
                    arr[i-1] = suNo;
                }
                while(index>0 && suNo<arr[index]){
                    int max = arr[index];
                    arr[index] = suNo;
                    arr[index+1] = max;
                    index--;
                }
            }
        }
        // 하단의 정렬을 사용하는게 효율적 Arrays.sort() -> nlogn의 복잡도를 가짐
       // 하단으로 풀다가 처음에 시간초과나서 정렬에서 문제있는 줄 알고 했으나 오히려 정렬이 악화되고 로직은 개선되서 통과
//        for(int i=0; i<forCount; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        // 배열 정렬 (0-based 인덱싱 사용)
//        Arrays.sort(arr);


        // 0은 내가 정렬할려고 넣은 인덱스라 이것때문에 계산 실패;;
        int start = 1;
        int end = forCount;
        int result = 0;
        while(start<end){
            int sum = arr[end]+arr[start];
            if(sum == No){
                result++;
                start++;
                end--;
            }else if(sum > No){
                end--;
            }else{
                start++;
            }
        }
        System.out.println(result);
    }
}
/*
*         while(end <= forCount){
            if(sum == No){
                result++;
                if(end == forCount){
                    sum -= arr[start++];
                }else{
                    sum += arr[end++];
                }
            }else if(sum > No){
                sum -= arr[start++];
            }else{
                sum += arr[end++];
            }
        }
        System.out.println(result);
*
* */

// 기존의 시간초과 났던 풀이 문제를 제대로 못읽어 모든 합을 구하려햇음

//public class Main {
//    public static void main(String[] arg) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int forCount = Integer.parseInt(st.nextToken());
//        int[] arr = new int[forCount+1];
//        st = new StringTokenizer(br.readLine());
//        int No = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine());
//        for(int i=0; i<forCount; i++){
//            arr[i+1] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//
//
//        int start = 0;
//        int end = 0;
//        int result = 0;
//        int sum = 0;
//        while(end <= forCount){
//            if(sum == No){
//                result++;
//                if(end == forCount){
//                    start++;
//                }else{
//                    end++;
//                }
//            }else if(sum > No){
//                sum -= arr[start++];
//            }else{
//                sum+= arr[end++];
//            }
//        }
//        System.out.println(result);
//    }
//}