package day9.boj;

import java.io.*;
import java.util.ArrayList;

public class P2581 {
	
	public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		ArrayList<Boolean> al = new ArrayList<Boolean>(second+1);
		int MAX = 0;
		al.add(false);
		al.add(false);
		for(int i=2; i <= second; i++)
		{
			al.add(i, true);
		}
		for ( int i = 2; (i*i) <=second; i++)
			if(al.get(i))
				for(int j = (i*i); j<=second; j +=i) al.set(j, false);
		for(int i= first; i<=second; i++)
		{
			if(al.get(i))
			{
				MAX += i;
				MIN = Math.min(MIN, i);
			}
		}
		if(MAX > 0 && MIN > 0)
			sb.append(MAX).append("\n").append(MIN);
		else
			sb.append(-1);
		System.out.println(sb);
	}
}
