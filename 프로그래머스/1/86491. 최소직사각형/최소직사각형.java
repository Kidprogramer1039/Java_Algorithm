public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;  // 최소 직사각형의 가로
        int maxHeight = 0; // 최소 직사각형의 세로

        // 각 카드에 대해
        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            // 최대 가로와 세로 값 업데이트
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        // 최소 직사각형의 넓이
        return maxWidth * maxHeight;
    }
}
