import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            
            switch (cmd) {
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.removeFirst() + "\n");
                    break;
                case 4:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.removeLast() + "\n");
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    bw.write(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case 7:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.peekFirst() + "\n");
                    break;
                case 8:
                    bw.write(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
