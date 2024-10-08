package day4.boj;

import java.io.*;

public class P1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int limit = Integer.parseInt(br.readLine());
		

		System.out.println(calculate(limit));
		
	}
	
	
	public static int calculate(int a) {
		StringBuilder sb = new StringBuilder();
		if(a < 100)
		{
			return a;
		}
		else 
		{
			int sum = 99;
			int count = 0;
			for(int i=100; i<=a; i++)
			{
				sb.append(i);
				int first = sb.charAt(0) - '0';
				int second = sb.charAt(1) - '0';
				int third  = sb.charAt(2) - '0';
				if((first - second) == (second - third))
				{
					count ++;
				}
				sb.setLength(0);
			}
			return sum + count;
		}
	}
}
