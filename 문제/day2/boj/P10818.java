package day2.boj;

import java.io.*;

public class P10818 {
	
	public static int MAX = Integer.MIN_VALUE;    
    public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int check = Integer.parseInt(br.readLine());
		int []check2 = new int[check];
		String[] check1 = br.readLine().split(" ");
		for(int i=0; i< check1.length; i++)
		{
			check2[i] = Integer.parseInt(check1[i]);
			MAX = Math.max(MAX, check2[i]);
			MIN = Math.min(MIN, check2[i]);
		}
		System.out.println(MIN + " " + MAX);
	}
}
