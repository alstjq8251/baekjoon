package day17.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P31403 {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int firNo = (int)st.nval;
        st.nextToken();
        int secondNo =(int)st.nval;
        st.nextToken();
        int thirdNo = (int)st.nval;
        String sb = (firNo + secondNo - thirdNo) + "\n";
        int mixedNo = Integer.parseInt(firNo + "" + secondNo);
        sb += mixedNo-thirdNo;
        System.out.println(sb);
    }
}
