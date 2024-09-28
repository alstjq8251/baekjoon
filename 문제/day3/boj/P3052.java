package day3.boj;

import java.io.*;
import java.util.HashSet;

public class P3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> Hash = new HashSet();
		
		for(int i=0; i<10; i++)
		{
			int a = Integer.parseInt(br.readLine());
			Hash.add(a%42);
		}
		System.out.println(Hash.size());
	}
}
