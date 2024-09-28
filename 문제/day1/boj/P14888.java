import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14888 {
	public static int MAX = Integer.MIN_VALUE;    
   	public static int MIN = Integer.MAX_VALUE;
	static int N;
	static int num[];
	static int operation[];
	
	public static void main(String[] ars) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); 
		num = new int [N]; // num배열 크기 힙메모리 생성
		String[] op = br.readLine().split(" "); // 입력받은값 공백기준 op배열 저장
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(op[i]); // int로 변환하여 num에 저장
		}
		operation = new int [4];
		String[] op1 = br.readLine().split(" ");
		for (int i = 0; i < 4; i++) {
			operation[i] = Integer.parseInt(op1[i]);
		}
		
		abs(num[0],1); 
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	public static void abs(int sum, int x)
	{
		if (x == N)
		{
			MAX = Math.max(sum, MAX); // 큰값 저장
			MIN = Math.min(sum, MIN); // 작은값 저장 
			return; 
		}
		for(int i=0; i<4; i++)
		{
			if(operation[i] > 0) // 해당 연산자 존재할경우
			{
				operation[i]--; // 재귀함수 호출할 경우 연산자 값 감소
				switch(i)
				{
				case 0: abs(sum + num[x], x+1); // x값 올려가며 재귀함수 호출
				break;
				case 1: abs(sum - num[x], x+1);
				break;
				case 2: abs(sum * num[x], x+1);
				break;
				case 3: abs(sum / num[x], x+1);
				break;
				}
				operation[i]++; // 재귀함수 호출 이후 연산 자 값 되돌림
			}
		}
	}
}

