package day4.boj;

import java.io.*;

public class P11720 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(br.readLine());
		int sum=0;
		while(sb.length() <number)
		{
			sb.append(br.readLine());
			for(int i=0; i<sb.length(); i++)
				sum += sb.charAt(i) - '0';
		}
		System.out.println(sum);
		
	}
}
