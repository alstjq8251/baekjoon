package day10.boj;

import java.io.*;

public class P11729 {

    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        sb.append((int) Math.pow(2, limit) - 1).append("\n");
        hanoi(limit, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int number, int start, int mid, int destination) {
        if (number == 1) {
            sb.append(start + " " + destination + "\n");
            return;
        } else {
            hanoi(number - 1, start, destination, mid);
            sb.append(start + " " + destination + "\n");
            hanoi(number - 1, mid, start, destination);
            return;
        }
    }
}
