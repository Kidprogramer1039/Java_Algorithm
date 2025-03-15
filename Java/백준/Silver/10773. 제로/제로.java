import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        int size = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {

            int k = Integer.parseInt(br.readLine());
            if (k == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(k);
                size = size+1;
            }
        }
        int res = 0;
        if (list.size() == 0) {
            System.out.println(0);
            return;
        }
        else {
            for (int num : list) {
                res += num;
            }
            System.out.println(res);
        }
        }

}