package day3.boj;

import java.io.*;

public class P2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int [] number = new int[10];
		int d = a*b*c;
		String s="";
		s = String.valueOf(d);
		for (int i=0; i<s.length(); i++)
		{
			int check = s.charAt(i) - '0';
			switch(check)
			{
			case 0: number[0]++;
				break;
			case 1: number[1]++;
				break;
			case 2: number[2]++;
				break;
			case 3: number[3]++;
				break;
			case 4: number[4]++;
				break;
			case 5: number[5]++;
				break;
			case 6: number[6]++;
				break;
			case 7: number[7]++;
				break;
			case 8: number[8]++;
				break;
			case 9: number[9]++;
				break;
			default: 
					break;
			}
		}
		for (int i=0; i<=9; i++)
		{
			sb.append(number[i] + "\n");
		}
		System.out.println(sb);
	}
}
