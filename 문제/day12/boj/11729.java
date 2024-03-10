import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] condition = bf.readLine().split(" ");
        int dataLimit = Integer.parseInt(condition[0]);
        int inputLimit= Integer.parseInt(condition[1]);
        int[] dataArray=new int[dataLimit];
        String[] datas = bf.readLine().split(" ");
        dataArray[0] = Integer.parseInt(datas[0]);
        for(int i=1; i<dataLimit; i++){
            dataArray[i] = dataArray[i-1] + Integer.parseInt(datas[i]);
        }
        for(int i=0; i<inputLimit; i++){
            String[] inputDatas = bf.readLine().split(" ");
            int start = Integer.parseInt(inputDatas[0])-1;
            int end = Integer.parseInt(inputDatas[1])-1;
            if(start == 0){
                System.out.println(dataArray[end]);
            }else{
                System.out.println(dataArray[end]-dataArray[start-1]);
            }
        }
    }
    
}

