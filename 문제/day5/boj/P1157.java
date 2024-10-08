package day5.boj;

import java.io.*;

public class P1157 {

	public static int MAX = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		boolean l = true;
		int sum = 65;
		int a = 0;
		int [] check = new int[26];
		int [] count = new int[26];
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			count[c - 'A']++;
			check[c- 'A'] = count[c-'A'];
		}
		for(int i=0; i<26; i++)
		{
			MAX = Math.max(MAX, check[i]);
		}
		for(int i=0; i<check.length; i++)
		{
			for(int j=i+1; j<check.length; j++)
			{
				if(check[i] == MAX && check [j] == MAX)
					l = false;
			}
			if(check[i] == MAX)
				a = i;
		}
		str = Character.toString(a+sum);
		if(l == true)
			System.out.println(str);
		else if(l == false)
			System.out.println('?');
	}
}
