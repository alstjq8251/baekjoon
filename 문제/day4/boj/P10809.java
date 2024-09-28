package day4.boj;

import java.io.*;

public class P10809 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int [] count = new int[26];
		sb.append(br.readLine());
		
		for(int i=0; i<26; i++)
		{
			count[i] = -1;
		}
		
		while(sb.length() != 0)
		{
			for(int i=0; i<sb.length(); i++)
			{
				char sentence = sb.charAt(i);
				
				if(count[sentence - 'a'] == -1)
					count[sentence - 'a'] = i;
			}
			sb.setLength(0);
		}
		for(int i=0; i<26; i++)
		{
			sb.append(count[i] + " ");
		}
		System.out.println(sb);
	}
}
