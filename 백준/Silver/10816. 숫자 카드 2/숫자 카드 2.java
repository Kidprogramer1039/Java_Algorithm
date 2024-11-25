import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> hm = new HashMap<>();
        String[] firstLine = bf.readLine().split(" "); // 한 줄 입력을 공백 기준으로 나눔
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(firstLine[i]);
            boolean value = hm.containsKey(val);
            if (value) {
                hm.put(val, hm.get(val)+1);
            }
            else {
                hm.put(val, 1);
            }
        }


        int stat = N / 2;

        // 두 번째 배열 크기 및 입력
        int M = Integer.parseInt(bf.readLine());
        int[] arr2 = new int[M];
        String[] secondLine = bf.readLine().split(" "); // 한 줄 입력을 공백 기준으로 나눔
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(secondLine[i]);
        }

        for (int item : arr2) {
            boolean res = hm.containsKey(item);
            if (res) {
                System.out.println(hm.get(item));
            }
            else {
                System.out.println("0");
            }
        }

    }
}