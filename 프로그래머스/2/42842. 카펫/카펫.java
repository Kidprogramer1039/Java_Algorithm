

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] res = new int[2];
       int sum = brown + yellow;
       for (int i = 1; i <= sum; i++) {
           int row = i;
           int col = sum / i;

           if (row > col) continue;

           if ((row-2) * (col-2) == yellow) {

               res[0] = col;
               res[1] = row;
               break;
           };
       }
       return res;
    }
}