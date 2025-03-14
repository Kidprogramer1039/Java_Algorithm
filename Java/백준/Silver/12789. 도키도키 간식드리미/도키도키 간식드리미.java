import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 학생 수
        
        Queue<Integer> queue = new LinkedList<>(); // 대기열
        Stack<Integer> stack = new Stack<>(); // 추가 대기열
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        
        int currentNumber = 1; // 현재 간식 순서
        
        while (!queue.isEmpty()) {
            if (queue.peek() == currentNumber) {
                queue.poll();
                currentNumber++;
            } else if (!stack.isEmpty() && stack.peek() == currentNumber) {
                stack.pop();
                currentNumber++;
            } else {
                stack.push(queue.poll());
            }
        }
        
        // 스택에 남은 학생이 있다면 순서대로 간식을 받을 수 없음
        while (!stack.isEmpty()) {
            if (stack.peek() == currentNumber) {
                stack.pop();
                currentNumber++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        
        System.out.println("Nice");
    }
}
