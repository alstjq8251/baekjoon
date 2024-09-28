package day5.boj;

import java.io.*;

public class P2908 {
	
	public static int MAX = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		sb.append(s[0]);
		sb.reverse();
		int first = Integer.parseInt(sb.toString());
		sb.setLength(0);
		sb.append(s[1]);
		sb.reverse();
		int second = Integer.parseInt(sb.toString());
		
		MAX = first;
		MAX = Math.max(MAX, second);
		System.out.println(MAX);
		
	}
}
