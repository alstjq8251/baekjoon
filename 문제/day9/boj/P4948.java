import java.io.*;
import java.util.ArrayList;

public class P4948 {
	
	public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number1 = 123456*2 +1;
		ArrayList<Boolean> al = new ArrayList<Boolean>(number1);
		al.add(false);
		al.add(false);
		for(int i=2; i<=number1; i++)
			al.add(i,true);
		for(int i=2; (i*i)<=number1; i++)
		{
			if(al.get(i))
				for(int j= i*i; j<=number1; j += i) al.set(j, false);
		}
		while(true)
		{
			int number = Integer.parseInt(br.readLine());
			if(number == 0)
				break;
			else
			{
				int count =0;
				for(int j = number+1; j<=(number*2); j++)
					if(al.get(j))
						count ++;
				sb.append(count).append("\n");
			}
		}
		System.out.println(sb);
	}
}
