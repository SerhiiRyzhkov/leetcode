package easy.Task_1399;

import java.util.ArrayList;
import java.util.List;


//Count Largest Group
//https://leetcode.com/problems/count-largest-group/
public class Solution {
    public int countLargestGroup(int n) {
        int maxSize=0;
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<=n;i++){
            int s = getSum(i);

            if(lists.size()<=s) lists.add(new ArrayList<>());
            lists.get(s).add(i);
            if(lists.get(s).size()>maxSize)maxSize=lists.get(s).size();
        }

        lists.remove(0);
        int finalMaxSize = maxSize;
        return (int) lists.stream().filter(el->el.size()==finalMaxSize).count();
    }

    private int getSum(int n){
        int sum=0;
        while (n>=10) {
            sum += n % 10;
            n/= 10;
        }
        sum+=n;
        return sum;
    }
}