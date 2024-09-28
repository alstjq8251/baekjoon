package day2.boj;

import java.io.*;

public class P1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int check = Integer.parseInt(br.readLine());
		int first, second , third = 0 ;
		int count = 0;
		int num = check;
		while (true)
		{
			if(check >=0 && check <= 99)
			{
				if(check < 10)
				{
	
					check = (check*10) + check ;
					count++;
					if(check == num)
						break;
				}
				else
				{
					first = check / 10;
					second = check % 10;
					third = (first + second) % 10;
					check = ((check % 10) * 10) + third;
					count++;
					if(check == num)
						break;
				}
			}
			else
				break;
		}
		System.out.println(count);
	}
}
