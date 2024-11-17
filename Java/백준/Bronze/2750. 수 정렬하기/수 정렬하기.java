import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(bf.readLine());
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) arr[i] = Integer.parseInt(bf.readLine());
        Arrays.sort(arr);

        for (int i = 0; i < cnt; i++) System.out.println(arr[i]);
    }
}