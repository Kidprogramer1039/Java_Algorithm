import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();  // 출력 버퍼
        int b;
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        while (q.size() > 1) {
            q.removeFirst();
            q.addLast(q.removeFirst());
        }
        System.out.println(q.peekFirst());
    }
}
