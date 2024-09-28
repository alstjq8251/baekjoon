package day5.boj;

import java.io.*;

public class P1152 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sentence = br.readLine().split(" ");
		if(sentence.length > 0)
			if(sentence[0].isEmpty())
				System.out.println(sentence.length-1);
			else		
				System.out.println(sentence.length);
		else
			System.out.println(0);
	}
}
