package day3.boj;

import java.io.*;

public class P8958 {

	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int loop = Integer.parseInt(br.readLine());
		for(int b=0; b<loop; b++)
		{
			String s = br.readLine();
			char a = ' ';
			int sum = 0;
			int number = 0;

			for(int i=0; i<s.length(); i++)
			{
				a = s.charAt(i);
				switch(a)
				{
				case 'O' :number++;
						sum += number;
				break;
				case 'X': number = 0;
					break;
				default : break;
				}
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}
}
