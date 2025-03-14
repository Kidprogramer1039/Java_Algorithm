import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine()); // 명령어 수
        
        Stack<Integer> stack = new Stack<>(); // 정수를 저장할 스택
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String command = st.nextToken();
            
            if (command.equals("1")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num); // 정수 추가
            } else if (command.equals("2")) {
                if (!stack.isEmpty()) {
                    pw.println(stack.pop()); // 맨 위 정수 제거 및 출력
                } else {
                    pw.println(-1); // 스택이 비어있을 때
                }
            } else if (command.equals("3")) {
                pw.println(stack.size()); // 스택의 크기 출력
            } else if (command.equals("4")) {
                if (stack.isEmpty()) {
                    pw.println(1); // 스택이 비어있을 때
                } else {
                    pw.println(0); // 스택이 비어있지 않을 때
                }
            } else if (command.equals("5")) {
                if (!stack.isEmpty()) {
                    pw.println(stack.peek()); // 맨 위 정수 출력
                } else {
                    pw.println(-1); // 스택이 비어있을 때
                }
            }
        }
        
        pw.flush();
        pw.close();
    }
}
