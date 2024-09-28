package day4.boj;

import java.io.*;

public class P2675 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int loop = Integer.parseInt(br.readLine());
		
		while ( loop --> 0)
		{
			String [] te = br.readLine().split(" ");
			int number = Integer.parseInt(te[0]);
			String s = te[1];
			for(int i=0; i<s.length(); i++)
			{
				char c = s.charAt(i);
				for(int b=0; b<number; b++)
				{
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}
