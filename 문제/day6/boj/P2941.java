package day6.boj;

import java.io.*;

public class P2941 {
	
	public static int MAX = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sum = s.length();
		for(int i=0; i<s.length(); i++)
		{
			if(i>0)
			{
				if(s.charAt(i) == '=')
				{
					if( s.charAt(i-1) == 'c')
						sum -=1;
					else if (s.charAt(i-1) == 's')
						sum -=1;
					else if (s.charAt(i-1) == 'z')
					{
						if(i > 1)
						{
							if(s.charAt(i-2) == 'd')
								sum -=2;
							else 
								sum -=1;
						}
						else
							sum -=1;
					}
				}
				else if(s.charAt(i) == '-')
				{
					if(s.charAt(i-1) == 'c')
						sum -=1;
					else if(s.charAt(i-1) == 'd')
						sum -=1;
				}
				else if(s.charAt(i) == 'j')
				{
					if(s.charAt(i-1) == 'l')
						sum -=1;
					else if(s.charAt(i-1) == 'n')
						sum -=1;
				}	
			}
		}
		System.out.println(sum);
	}
}
