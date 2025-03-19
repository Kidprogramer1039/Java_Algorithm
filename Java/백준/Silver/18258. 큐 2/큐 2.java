import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();  // 출력 버퍼

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    q.add(st.nextToken());
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? "-1" : q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? "-1" : q.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty() ? "-1" : q.peekLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);  // 한 번에 출력
    }
}
