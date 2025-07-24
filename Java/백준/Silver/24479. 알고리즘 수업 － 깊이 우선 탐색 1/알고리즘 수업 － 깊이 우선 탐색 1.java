import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] visitOrder;  // 각 정점의 방문 순서를 저장
    static boolean[] visited;
    static int order = 1;     // 방문 순서 카운터
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        visited = new boolean[n + 1];
        visitOrder = new int[n + 1];  // 방문 순서 배열 초기화
        
        // 간선 입력 (양방향)
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);  // 양방향 그래프
        }
        
        // 인접 정점들을 오름차순으로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        
        // DFS 실행
        dfs(r);
        
        // 결과 출력 (1번부터 N번까지 각 정점의 방문 순서)
        for (int i = 1; i <= n; i++) {
            System.out.println(visitOrder[i]);
        }
    }
    
    private static void dfs(int u) {
        visited[u] = true;
        visitOrder[u] = order++;  // 현재 정점에 방문 순서 할당하고 카운터 증가
        
        for (int v : graph.get(u)) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
}