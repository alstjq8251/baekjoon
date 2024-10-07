package day18.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28702 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = 0;
        int idx = 0;
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(!str.equals("Fizz") && !str.equals("Buzz") && !str.equals("FizzBuzz")){
                target = Integer.parseInt(str);
                idx = i+1;
            }
        }
        target += 3-idx+1;
        if(target%3==0&&target%5==0){
          System.out.println("FizzBuzz");
        } else if(target%3==0){
            System.out.println("Fizz");
        }else if(target%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(target);
        }
    }
}
