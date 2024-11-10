import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0,cnt2 = 0,cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i%num1.length]){
                cnt1++;
            }
            if (answers[i] == num2[i%num2.length]){
                cnt2++;
            }
            if (answers[i] == num3[i%num3.length]){
                cnt3++;
            }
        }

        int[] resArray = {cnt1, cnt2, cnt3};
        ArrayList<Integer> result = new ArrayList<>();

        int max = Arrays.stream(resArray).max().getAsInt();
        for(int j = 0; j < resArray.length; j++) {
            if (max == resArray[j]) {
                result.add(j+1);
            }
        }

        return result;



    }
}