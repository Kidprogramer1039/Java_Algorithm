import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] visitOrder;
    static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];   // 1~n 사용
        visitOrder = new int[n + 1];    // 1~n 사용

        // 그래프 초기화: 0~n 인덱스 (0번은 사용 안함)
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 핵심: 내림차순 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        dfs(k);

        // 출력: 1~n
        for (int i = 1; i <= n; i++) {
            System.out.println(visitOrder[i]);
        }
    }

    private static void dfs(int u) {
        visited[u] = true;
        visitOrder[u] = order++;

        for (int v : graph.get(u)) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
}