import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1) 리스트 대신 primitive 배열 선언
        // — 기존
        // ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<Integer[]> board = new ArrayList<>();
        int[][] board = new int[n][m];
        boolean[][] vis   = new boolean[n][m];

        // 2) 입력 루프: ArrayList → 2차원 배열로 바로 저장
        // — 기존
        // for (int i = 0; i < m; i++) {
        //     st = new StringTokenizer(br.readLine());
        //     for (int j = 0; j < n; j++) {
        //         arr.add(Integer.parseInt(st.nextToken()));
        //     }
        //     board.add(arr.toArray(new Integer[0]));
        // }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = { 0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        int maxArea = 0;
        int picNum = 0;
        // 3) 그림 영역 탐색: 조건 검사 및 큐 삽입
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // — 기존
                // if (tmp.get(i)[j] == 1) continue;
                if (board[i][j] != 1 || vis[i][j]) continue;
                vis[i][j] = true;
                q.offer(new int[]{i, j});
                int area = 0;

                // 4) BFS 내부: 경계·값·방문 검사
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    area++;

                    for (int k = 0; k < 4; k++) {
                        int x = cur[0] + dx[k];
                        int y = cur[1] + dy[k];

                        // — 기존
                        // if ((x >= 0 && x < n && y >= 0 && y < m) | (board.get(x)[y] == 1)) continue;
                        if (x < 0 || x >= n || y < 0 || y >= m) continue;
                        if (board[x][y] != 1 || vis[x][y])      continue;

                        vis[x][y] = true;
                        q.offer(new int[]{x, y});
                    }
                }
                picNum += 1;
                maxArea = Math.max(maxArea, area);
            }
        }

        // 5) 결과 출력
        System.out.println(picNum);
        System.out.println(maxArea);

    }
}
