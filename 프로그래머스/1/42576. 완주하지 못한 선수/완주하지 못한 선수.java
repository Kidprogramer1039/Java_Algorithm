import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String c : completion) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (String p : participant) {
            if (!map.containsKey(p) || map.get(p) == 0) {
                return p;
            }
            map.put(p, map.get(p) - 1);
        }

        return ""; // 모든 참가자가 완주한 경우 (문제 조건상 실행되지 않음)
    }
}
