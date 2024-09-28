package day9.boj;

import java.io.*;

public class P11653 {
	
	public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int first = Integer.parseInt(br.readLine());
		int a=2;
		while(first >= a)
		{
			if( first % a == 0)
			{
				sb.append(a).append("\n");
				first /= a;
			}
			else
				a++;
		}
		System.out.println(sb);
	}
}
