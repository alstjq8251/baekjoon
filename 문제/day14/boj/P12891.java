package day14.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P12891 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int stLength = Integer.parseInt(st.nextToken());
        int partLength = Integer.parseInt(st.nextToken());
        Map<Character,Integer> countMap = new HashMap<>();
        Map<Character,Integer> quizMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Character[] stArray = new Character[stLength];
        String quizArray = br.readLine();
        for(int i=0; i<stLength; i++){
            stArray[i] = quizArray.charAt(i);
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            if(i==0){
                quizMap.put('A',Integer.parseInt(st.nextToken()));
            }else if(i==1){
                quizMap.put('C',Integer.parseInt(st.nextToken()));
            }else if(i==2){
                quizMap.put('G',Integer.parseInt(st.nextToken()));
            }else{
                quizMap.put('T',Integer.parseInt(st.nextToken()));
            }
        }

        int start=0;
        int end=0;
        int resultCount = 0;
        while(start <= end && end<=stLength){
            if(sb.length()==partLength){
                List<Character> characterList = new ArrayList<>(quizMap.keySet());
                resultCount++;
                for (Character character : characterList) {
                    if (countMap.getOrDefault(character,0)<quizMap.get(character)) {
                        resultCount--;
                        break;
                    }
                }
                if(end==stLength){
                    break;
                }
                countMap.put(stArray[start],countMap.getOrDefault(stArray[start++],0)-1);
                countMap.put(stArray[end],countMap.getOrDefault(stArray[end++],0)+1);
            }else if(sb.length()<partLength){
                countMap.put(stArray[end],countMap.getOrDefault(stArray[end],0)+1);
                sb.append(stArray[end++]);
            }
        }
        System.out.println(resultCount);

    }
}
