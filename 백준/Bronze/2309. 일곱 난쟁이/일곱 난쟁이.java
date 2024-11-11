import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(array);
        int sum = Arrays.stream(array).sum();


        for (int j = 0; j < 9; j++) {
            for (int k = j+1; k < 9; k++) {
                if (sum - array[j] - array[k] == 100) {
                    for (int q = 0; q < 9; q++) {
                        if (q != j && q != k) {
                            System.out.println(array[q]);
                        }
                    }
                    return;

                }
            }
        }


    }
}