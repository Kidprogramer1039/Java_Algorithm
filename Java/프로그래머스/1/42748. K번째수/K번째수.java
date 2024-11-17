import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        // 반환할 결과값의 배열을 생성
        int[] result = new int[commands.length];

        // 커맨드 반복
        for (int l = 0; l < commands.length; l++) {

            // 원하는 범위까지 슬라이스
            int[] arr2 = Arrays.copyOfRange(array, commands[l][0]-1, commands[l][1]);

            //정렬
            Arrays.sort(arr2);

            result[l] = arr2[commands[l][2]-1];
        }
        return result;
    }
}