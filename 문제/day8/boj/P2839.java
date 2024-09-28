package day8.boj;

import java.io.*;

public class P2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		int rest = 0;
		int limit = Integer.parseInt(br.readLine());
		if(limit > 2 && limit < 5001)
		{
			rest = limit % 5;
			if( limit != 4 && limit != 7)
			{
				if ( rest == 1)
				{
					number = 2;
					limit -= 6;
					number += limit/5;
					System.out.println(number);
				}
				else if(rest == 2)
				{
					number = 4;
					limit -= 12;
					number += limit/5;
					System.out.println(number);
				}
				else if(rest == 3)
				{
					number = 1;
					limit -= 3; 
					number += limit/5;
					System.out.println(number);
				}
				else if(rest == 4)
				{
					number = 3;
					limit -= 9;
					number += limit/5;
					System.out.println(number);
				}
				else
					System.out.println(limit/5);
			}
			else
				System.out.println(-1);
		}
		else
			System.out.println(-1);
	}
}
