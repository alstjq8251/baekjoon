package day2.boj;

import java.io.*;

public class P2562 {

	public static int MAX = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int [] check = new int[9];
		int count = 0;
		for(int i=0; i<9; i++)
		{
			check[i] = Integer.parseInt(br.readLine());
			MAX = Math.max(MAX, check[i]);
			if(MAX == check[i])
				count = i+1;
		}
		sb.append(MAX + "\n" + count);
		System.out.println(sb);
	}
}
