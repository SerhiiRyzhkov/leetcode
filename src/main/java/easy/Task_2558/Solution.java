package easy.Task_2558;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// Take Gifts From the Richest Pile
// https://leetcode.com/problems/take-gifts-from-the-richest-pile/
public class Solution {
    public long pickGifts(int[] gifts, int k) {
        long result=0;
        Queue<Integer>queue = new PriorityQueue<>((o1, o2) -> o2-o1);

        Arrays.stream(gifts).forEach(queue::add);

        for(int i=0;i<k;i++)
        {
            int a=queue.remove();
            queue.add((int) Math.sqrt(a));
        }

       for(Integer i:queue)
            result+=i;

        return result;


    }
}