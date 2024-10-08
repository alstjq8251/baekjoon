package day3.boj;

import java.io.*;
import java.text.DecimalFormat;

public class P4344 {

	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(br.readLine());
		double []rate = new double[loop];
		for(int i=0; i<loop; i++) {
			int sum=0;
			double count=0;
			String [] s = br.readLine().split(" ");
			int a= Integer.parseInt(s[0]);
			int [] student = new int[a];
			for(int b=1; b<s.length; b++)
			{
					student[b-1] = Integer.parseInt(s[b]);
					sum += Integer.parseInt(s[b]);
			}
			int average = sum/a;
			for(int c=0; c<student.length; c++)
			{
				if(student[c] > average)
					count++;
				else
					continue;
			}
			rate[i] = ((double)((count/a))*100);
		}
		DecimalFormat form = new DecimalFormat("0.000"); // DecimalFormat함수로 설정한 소수점 자리수를 설정및 0 출력
		for(int i=0; i<loop; i++)
		{
			System.out.println(form.format(rate[i]) + "%"); // format함수로 설정한 자리수로 소수 포멧후 출력
		}
	}
}
