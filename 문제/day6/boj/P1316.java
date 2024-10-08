package day6.boj;

import java.io.*;

public class P1316 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int sum = number;
		while(number --> 0)
		{
			String s = br.readLine();
			boolean checker = true;
			for(int i=0; i<s.length(); i++)
			{
				if(i > 1)
				{
					if(s.charAt(i) != s.charAt(i-1))
						for(int j=i-1; j>=0; j--)
							if(s.charAt(i) == s.charAt(j))
								checker = false;
				}
			}
			if(checker == false)
				sum -= 1;
		}
		System.out.println(sum);
	}
}
