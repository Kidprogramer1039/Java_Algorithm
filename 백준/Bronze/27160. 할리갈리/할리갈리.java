import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hs= new HashMap<>();
        int num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < num; i++) {
            String str = bf.readLine();
            String[] str2= str.split(" ");
            if (!hs.containsKey(str2[0])) {
                hs.put(str2[0], Integer.parseInt(str2[1]));
            }
            else {
                hs.replace(str2[0], hs.get(str2[0]) + Integer.parseInt(str2[1]));
            }
        }

        if (hs.containsValue(5)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }


}