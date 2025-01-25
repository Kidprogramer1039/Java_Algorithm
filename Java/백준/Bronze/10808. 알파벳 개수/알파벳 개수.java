import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10:51 ~
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();

        int[] num = new int[26];

        for (int i = 0; i < read.length(); i++) {
            int j = read.charAt(i) - 'a';
            num[j]+=1;
        }

        for (int i : num) {
            System.out.print(i + " ");
        }


    }


}