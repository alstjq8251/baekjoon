package day6.boj;

import java.io.*;

public class P2869 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		int lastday = Integer.parseInt(s[2]) - Integer.parseInt(s[0]);
		int daycalculate = lastday / (Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
		if (lastday % (Integer.parseInt(s[0]) - Integer.parseInt(s[1]))  == 0 )
			System.out.println((daycalculate +1));
		else 
			System.out.println((daycalculate +2));
	}
}
