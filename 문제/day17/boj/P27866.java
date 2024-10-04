package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27866 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] quizArr = br.readLine().toCharArray();
        int idx = Integer.parseInt(br.readLine());
        System.out.println(quizArr[idx-1]);
    }
}
