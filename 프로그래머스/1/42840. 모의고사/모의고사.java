import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int a=0,b=0,c=0;
        int num;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i%num1.length]) a++;
            if (answers[i] == num2[i%num2.length]) b++;
            if (answers[i] == num3[i%num3.length]) c++;
        }
        int[] resArray = {a,b,c};
        int ace = Arrays.stream(resArray).max().getAsInt();
        ArrayList<Integer> res = new ArrayList<>();
        if (a == ace) res.add(1);
        if (b == ace) res.add(2);
        if (c == ace) res.add(3);
        return res;
    }
}