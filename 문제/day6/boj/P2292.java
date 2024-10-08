package day6.boj;

import java.io.*;

public class P2292 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		System.out.println(sum(number));
	}
	public static int sum(int a)
	{
		int number = 1;
		int count = 1;
		while(true)
		{
			if(a == number)
				return count;
			if ( number < a)
			{
				number += (6*count);
			}
			else if ( number > a)
			{
				return count;
			}
			count ++;
		}
	}
}
