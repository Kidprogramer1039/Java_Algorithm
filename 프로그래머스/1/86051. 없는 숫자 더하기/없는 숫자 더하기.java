import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        HashSet<Integer> hashMap = new HashSet<>();
        for (int item : numbers) {
            hashMap.add(item);
        }

        for (int i = 0; i < 10; i++) {
            if (!hashMap.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }
}