package day9.boj;

import java.io.*;
import java.util.ArrayList;

public class P1929 {
	
	public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] s = br.readLine().split(" ");
		int first = Integer.parseInt(s[0]);
		int second = Integer.parseInt(s[1]);
		ArrayList<Boolean> al = new ArrayList<Boolean>(second+1);
		al.add(false);
		al.add(false);
		for(int i=2; i<=second; i++)
			al.add(i,true);
		for(int i=2; (i*i)<=second; i++)
		{
			if(al.get(i))
				for(int j= i*i; j<=second; j += i) al.set(j, false);
		}
		for(int i=first; i<=second; i++)
		{
			if(al.get(i))
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
