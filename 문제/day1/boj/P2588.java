import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2588 {
	
	public static void main(String[] ars) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String op = br.readLine();
		String s = br.readLine();
		int op1 []  = new int[6];
		int op2 = Integer.parseInt(op);
		int op3 = Integer.parseInt(s);
		
		for(int i=0; i<6; i++)
		{
			if(i<3)
			{
				op1[i] = (op.charAt(i) - '0'); // 문자열의 각 자리수 문자열 제거하여 저장
			}
			else
			{
				op1[i] = (s.charAt(i-3) - '0');
			}
		}
		System.out.println((op2 * op1[5]));
		System.out.println((op2 * op1[4]));
		System.out.println((op2 * op1[3]));
		System.out.println((op2 * op3));
	}
}
