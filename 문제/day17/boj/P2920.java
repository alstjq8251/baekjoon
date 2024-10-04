package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2920 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int prevNo = Integer.parseInt(st.nextToken());
        boolean ascDscBool = false;
        for(int i=1; i<8; i++){
            int nowNo = Integer.parseInt(st.nextToken());
            int diff = prevNo-nowNo;
            if(diff==1){
                ascDscBool=true;
            }else if(diff==-1){
                ascDscBool=false;
            }else{
                System.out.println("mixed");
                return;
            }
            prevNo = nowNo;
        }
        if(ascDscBool){
            System.out.println("descending");
        }else{
            System.out.println("ascending");
        }
    }
}
