package day7.boj;

import java.io.*;

public class P2775 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int limit = Integer.parseInt(br.readLine());
		for(int i=0; i<limit; i++)
		{
			int first = Integer.parseInt(br.readLine());
			int second = Integer.parseInt(br.readLine());
			int [][]people = new int[first+1][second+1];
			for(int a = 0; a <=first; a++)
			{
				people[a][0] = 1;
				for(int b=1; b<=second; b++)
					if(a == 0)
						people[a][b] = b+1;
					else
						people[a][b] = people[a][b-1] + people[a-1][b];
			}
			sb.append(people[first][second-1] + "\n");
		}
		System.out.println(sb);
	}
}
