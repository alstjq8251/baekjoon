package day6.boj;

import java.io.*;

public class P1712 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		int count = 1;
		while (true)
		{
			int sum = Integer.parseInt(s[0]);
			int sum1 = (Integer.parseInt(s[2]) - Integer.parseInt(s[1]));
			if(sum1 <=0)
			{
				count = -1;
				break;
			}
			else
			{
				count = (sum / sum1) +1;
				break;
			}
		}
		System.out.println(count);
	}
}
