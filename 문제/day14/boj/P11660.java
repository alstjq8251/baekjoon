package day14.boj;

import java.io.*;
import java.util.StringTokenizer;

// 이건 기존에 푼 풀이법
//public class P11660 {
//    public static void main(String[] ars) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int index = Integer.parseInt(st.nextToken())+1;
//        int arrayCount = Integer.parseInt(st.nextToken());
//        long [][] suArray = new long[index][index];
//        for(int i=1; i<index; i++){
//            st = new StringTokenizer(br.readLine());
//            for(int y=1; y<index; y++){
//                suArray[i][y] = suArray[i][y-1] + Integer.parseInt(st.nextToken());
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<arrayCount; i++){
//            st = new StringTokenizer(br.readLine());
//            int firstRow = Integer.parseInt(st.nextToken())-1;
//            int firstColumn = Integer.parseInt(st.nextToken());
//            int secondRow = Integer.parseInt(st.nextToken());
//            int secondColumn = Integer.parseInt(st.nextToken());
//            long sum = 0;
//            while(firstRow!=secondRow){
//                firstRow++;
//                sum += suArray[firstRow][secondColumn] - suArray[firstRow][firstColumn-1];
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb.toString());
//    }
//}

// 올바른 풀이법
public class P11660 {
    public static void main(String[] ars) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = Integer.parseInt(st.nextToken());
        int forCount = Integer.parseInt(st.nextToken());
        long[][] quizArr = new long[index+1][index+1];
        for(int i=1; i<index+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int y=1; y<index+1; y++){
                quizArr[i][y] = quizArr[i-1][y] + quizArr[i][y-1] + Long.parseLong(st.nextToken()) - quizArr[i-1][y-1];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<forCount; i++){
            st = new StringTokenizer(br.readLine());
            int firstRow = Integer.parseInt(st.nextToken());
            int firstColumn = Integer.parseInt(st.nextToken());
            int secondRow = Integer.parseInt(st.nextToken());
            int secondColumn = Integer.parseInt(st.nextToken());
            long sum = quizArr[secondRow][secondColumn] - quizArr[secondRow][firstColumn-1] - quizArr[firstRow-1][secondColumn] + quizArr[firstRow-1][firstColumn-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}