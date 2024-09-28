package day10.boj;

import java.io.*;

public class P17478 {

    static StringBuilder sb = new StringBuilder();
    public static int limit;
    public static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        limit = Integer.parseInt(br.readLine());
        if (limit > 0 && limit <= 50)
            System.out.println(print(limit));
    }

    public static StringBuilder print(int a) {
        String s = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
        String s1 = "\"재귀함수가 뭔가요?\"\n";
        String s2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        String s3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        String s4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        String s5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        String s6 = "라고 답변하였지.\n";
        String s7 = "____";
        if (a == limit) {
            sb.append(s).append(s1).append(s2).append(s3).append(s4);
            print(a - 1);
        } else if (a != 0 && a != limit) {
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s1);
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s2);
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s3);
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s4);
            print(a - 1);
        } else if (a == 0) {
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s1);
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s5);
        }
        if (a == limit) {
            sb.append(s6);
        } else if (a != 0) {
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s6);
        } else {
            for (int i = a; i < limit; i++)
                sb.append(s7);
            sb.append(s6);
        }
        return sb;
    }
}
