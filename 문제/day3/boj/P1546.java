package day3.boj;//import java.io.*;
//
//public class Main {
//
//	public static double MAX = Integer.MIN_VALUE;
//
//	public static void main(String [] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int a = Integer.parseInt(br.readLine());
//		double [] point = new double[a];
//		String [] s = br.readLine().split(" ");
//		for(int i=0; i<a; i++)
//		{
//			point[i] = Integer.parseInt(s[i]);
//			MAX = Math.max(MAX, point[i]);
//		}
//		double sum = 0 ;
//		for(int i=0; i<a; i++)
//		{
//			point[i] = (point[i]/MAX)*100;
//			sum += point[i];
//		}
//		System.out.println(sum/a);
//	}
//}

// 2024.09.27

import java.io.*;

public class P1546 {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int index = (int)st.nval;

		double max = 0;
		double number = 0f;
		double numbers[] = new double[index];
		for(int i=0; i<index; i++){
			st.nextToken();
			double point = st.nval;
			numbers[i] = point;
			max = Math.max(max,point);
		}
		for(int i=0; i<index; i++){
			number += (numbers[i]/max*100);
		}
		System.out.println(number/index);
	}

}