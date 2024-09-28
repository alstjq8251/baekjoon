import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2480 {
	
	public static int MAX = Integer.MIN_VALUE;

	public static void main(String []ars) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] op = br.readLine().split(" ");
		int [] H = new int[op.length];
		
		for(int i=0; i<3; i++)
		{
			H[i] = Integer.parseInt(op[i]);
		}
		if((H[0] > 0 && H[0] < 7) && (H[1] >0 && H[1] < 7) && (H[2] > 0 && H[2] < 7 ))
		{
			if((H[0] == H[1]) && (H[1] == H[2]))
			{
				System.out.println(10000 + (H[0] * 1000));
			}
			else if ((H[0] == H[1]) || (H[0] == H[2]) || (H[1] == H[2]))
			{
				if(H[0] == H[1])
					System.out.println(1000 + (H[0] * 100));
				else if (H[0] == H[2])
					System.out.println(1000 + (H[0] * 100));
				else 
					System.out.println(1000 + (H[1] * 100));
			}
			else 
			{
				for(int i=0; i<3; i++)
				{
					MAX = Math.max(MAX, H[i]); // 두 수중 큰수 리턴
				}
				System.out.println((MAX*100));
			}
		}
	}
}
