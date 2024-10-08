package day9.boj;

import java.io.*;
import java.util.ArrayList;

public class P9020 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int limit = Integer.parseInt(br.readLine());
		int number1 = 10000;
		ArrayList<Boolean> al = new ArrayList<Boolean>(number1+1);
		al.add(false);
		al.add(false);
		for(int i=2; i<=number1; i++)
			al.add(i,true);
		for(int i=2; (i*i)<=number1; i++)
		{
			if(al.get(i))
				for(int j= i*i; j<=number1; j += i) al.set(j, false);
		}
		while(limit -->0)
		{
			int MIN = Integer.MAX_VALUE;
			int number = Integer.parseInt(br.readLine());
			int number2 =0;
			int number3 =0;
			int sub = 0;
			for(int i=2; i<number; i++)
				if(al.get(i))
				{
					number2 = i;
					number3 = number - number2;
					if(al.get(number3))
					{
						sub = Math.abs(number3 - number2);
						MIN = Math.min(MIN,sub);
					}
				}
			if(MIN == 0)
				sb.append((number/2)).append(" ").append((number/2)).append("\n");
			else
				for(int i=2; i<number; i++)
					if(al.get(i))
					{
						number2 = i;
						number3 = number-number2;
						sub = Math.abs((number3-number2));
						if(sub == MIN)
						{
							sb.append(number2).append(" ").append(number3).append("\n");
							break;
						}
					}
		}
		System.out.println(sb);
	}
}
