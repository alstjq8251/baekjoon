import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P1008 {
	
	public static void main(String[] ars) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] s = br.readLine().split(" ");
		int s1 [] = new int[2];
		
		for(int i=0; i<s.length; i++)
		{
			s1[i] = Integer.parseInt(s[i]);
		}
    
		double s2 = (double)s1[0]/s1[1];
		
		DecimalFormat form = new DecimalFormat("#.#########"); // DecimalFormat함수로 설정한 소수점 자리수를 설정
		System.out.println(form.format(s2)); // format함수로 설정한 자리수로 소수 포멧후 출력
	}
}
