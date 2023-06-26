package easy.Task_1566;


//  Detect Pattern of Length M Repeated K or More Times
//  https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
public class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        if(m*k>arr.length)return false;
        int [] temp = new int[m*k];

        int l=0;
        while (l!=arr.length-m+1){
            int index=0;
            for(int j=0;j<k;j++) {
                for (int i = l; i < m + l; i++)
                    temp[index++] = arr[i];
            }

            int stop=0;
            index=0;
            for(int j=0;j<arr.length;j++) {
                if (arr[j] == temp[index]) {
                    index++;
                    stop=j;
                }
                else {
                    index = 0;
                    j=stop++;
                }
                if (index == temp.length) return true;
            }
            l++;
        }


        return false;
    }
}