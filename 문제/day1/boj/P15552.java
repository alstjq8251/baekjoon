import java.io.*;

public class P15552 {

	public static void main(String[] ars) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 출력 시간 감소위한 스트링빌더 사용
		
		int loop = Integer.parseInt(br.readLine());
		
		while(loop --> 0)
		{
			String []two = br.readLine().split(" ");
			int []two1 = new int [2];
			int sum =0;
			for(int i=0; i<2; i++)
			{
				two1[i] = Integer.parseInt(two[i]); 
				sum += two1[i];
			}
			sb.append(sum + "\n"); //개행 후 스트링빌더에 추가
		}
		System.out.println(sb); // 전부출력
	}
}
