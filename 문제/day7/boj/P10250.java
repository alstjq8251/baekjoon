package day7.boj;

import java.io.*;

public class P10250 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int limit = Integer.parseInt(br.readLine());
		while(limit --> 0)
		{
			String[] s = br.readLine().split(" ");
			int [] collect = new int[s.length];
			for(int i=0; i<s.length; i++)
			{
				collect[i] = Integer.parseInt(s[i]);
			}
			if(collect[2] <= collect[0] * collect[1])
			{
				if(collect[2] % collect[0] != 0)
					sb.append(collect[2] % collect[0]);
				else
					sb.append(collect[0]);
				if(collect[2] / collect[0] < 9)
				{
					if(collect[2] % collect[0] != 0)
						sb.append("0" + (collect[2] / collect[0]+1));
					else
						sb.append("0" + collect[2] / collect[0]);
				}
				else if(collect[2] / collect[0] == 9)
					if(collect[2] % collect[0] == 0)
						sb.append("0" + collect[2] / collect[0]);
					else
						sb.append(collect[2] / collect[0] +1);
				else
				{
					if(collect[2] % collect[0] != 0)
						sb.append((collect[2] / collect[0]+1));
					else
						sb.append(collect[2] / collect[0]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
