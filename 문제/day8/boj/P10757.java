package day8.boj;

import java.io.*;
import java.math.BigInteger;

public class P10757 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		BigInteger b1 = new BigInteger(s[0]);
		BigInteger b2 = new BigInteger(s[1]);
		BigInteger b3 = b1.add(b2);
		System.out.println(b3);
	}
}
