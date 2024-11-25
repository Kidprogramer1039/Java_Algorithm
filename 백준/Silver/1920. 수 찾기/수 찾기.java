import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 배열 크기 및 입력
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        String[] firstLine = bf.readLine().split(" "); // 한 줄 입력을 공백 기준으로 나눔
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(firstLine[i]);
        }

        // 정렬
        Arrays.sort(arr);

        // 두 번째 배열 크기 및 입력
        int M = Integer.parseInt(bf.readLine());
        int[] arr2 = new int[M];
        String[] secondLine = bf.readLine().split(" "); // 한 줄 입력을 공백 기준으로 나눔
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(secondLine[i]);
        }

        // 값 비교
        for (int I : arr2) {
            boolean found = false;
            if (I > arr[N / 2]) {
                for (int i = N / 2; i < N; i++) {
                    if (arr[i] == I) {
                        found = true;
                        break;
                    }
                }
            } else if (I < arr[N / 2]) {
                for (int i = 0; i < N / 2; i++) {
                    if (arr[i] == I) {
                        found = true;
                        break;
                    }
                }
            } else if (I == arr[N / 2]) {
                found = true;
            }

            // 출력
            System.out.println(found ? 1 : 0);
        }
    }
}
