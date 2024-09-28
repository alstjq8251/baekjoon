package day9.boj;

import java.io.*;
import java.util.ArrayList;

public class P1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int limit = Integer.parseInt(br.readLine());
		ArrayList<Boolean> al = new ArrayList<Boolean>(1001);
		int [] number = new int[limit];
		String [] s = br.readLine().split(" ");
		al.add(false);
		al.add(false);
		for(int i=2; i <= 1000; i++)
		{
			al.add(i, true);
		}
		int count = 0;
		for ( int i = 2; (i*i) <=1000; i++)
			if(al.get(i))
				for(int j = (i*i); j<=1000; j +=i) al.set(j, false);
		for(int i=0; i<limit; i++)
		{
			number[i] = Integer.parseInt(s[i]);
			if(al.get(number[i]))
				count++;
		}
		System.out.println(count);
	}
}
