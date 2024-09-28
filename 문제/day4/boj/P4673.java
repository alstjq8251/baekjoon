package day4.boj;

import java.io.*;

public class P4673 {

	public static void main(String[] args) throws IOException {
		
		boolean [] check = new boolean[10001];
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<10001; i++)
		{
			d(i);
			if (d(i) < 10001)
				check[d(i)] = true;
		}
		
		for(int i=1; i<10001; i++)
		{
			if(check[i] == false)
				sb.append(i + "\n");
		}
		System.out.println(sb);
	}
	
	
	public static int d(int a) {
		int sum = a;
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		while (sb.length() != 0 )
		{
			for(int i=0; i < sb.length(); i++)
			{
				sum += sb.charAt(i) - '0';
			}
			sb.setLength(0);
		}
		return sum;
	}
}
