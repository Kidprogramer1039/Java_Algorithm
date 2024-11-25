import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫 번째 배열 크기와 데이터 입력
        int N = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine()); // StringTokenizer 사용
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            hm.put(val, hm.getOrDefault(val, 0) + 1); // getOrDefault로 containsKey 제거
        }

        // 두 번째 배열 크기와 데이터 입력
        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            int item = Integer.parseInt(st.nextToken());
            sb.append(hm.getOrDefault(item, 0)).append("\n"); // 결과를 StringBuilder에 추가
        }

        // 결과 출력
        System.out.print(sb);
    }
}
