//#1 : 타일의 총합 개수.
//#2 : 옐로우 타일이 세로로 긴 경우까지 고려하여 sum까지 반복문 실행
//#3 : 가로 길이가 세로 길이보다 크다고 했으니 반대의 경우에는 continue.
//#4 : 가로 및 세로 타일에서 -2씩을 하면, yellow 타일이 되어야 하므로, 
//     이 경우에 맞는 경우 구하기.

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow; //#1
        
        //#2
        for(int i = 1; i <= sum; i++) {
            int row = i;
            int col = sum / row;
            
            //#3
            if(row > col) {
                continue;
            }
            
            //#4
            if(((row-2) * (col-2)) == yellow) {
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        return answer;
    }
}