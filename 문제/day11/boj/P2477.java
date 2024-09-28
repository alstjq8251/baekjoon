import java.io.*;

public class P2477 {
	
	static char arr[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int limit = Integer.parseInt(br.readLine());
		arr = new char[limit][limit];
		boolean check = false;
		int number = 1;
		for(int i=1; i<8; i++)
		{
			number*=3;
			if(limit %3 == 0 && number == limit)
			{
				check = true;
			}
		}
		if(check == true)
		{
			star(0,0,limit,false);
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<limit; i++) {
			for(int j=0; j<limit; j++) {
				sb.append(arr[i][j]);
			}sb.append('\n');
		}
		System.out.println(sb);
	}
	
	public static void star(int x, int y, int push, boolean check) {
		
		if(check) {
			for(int i=x; i<x+push; i++) {
				for(int j=y; j<y+push; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(push == 1) {
			arr[x][y] = '*';
			return;
		}
			
		int segregate = push/3;
		int count =0;
		
		for(int i=x; i<x+push; i += segregate) {
			for(int j=y; j<y+push; j += segregate) {
				count++;
				if(count == 5) {
					star(i,j,segregate,true);
				} else {
					star(i,j,segregate,false);
				}
			}
		}
	}
}
