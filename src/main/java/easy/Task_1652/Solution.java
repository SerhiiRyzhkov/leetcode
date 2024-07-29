package easy.Task_1652;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  Defuse the Bomb
//  https://leetcode.com/problems/defuse-the-bomb/
public class Solution {
    public int[] decrypt(int[] code, int k) {
        int [] result = new int[code.length];
            for(int i=0;i<code.length;i++){
                int count=k;
                int sum=0;
                if(k>0) {
                    for (int j = i + 1; count > 0; j++) {
                        count--;
                        if (j < code.length) sum += code[j];
                        else {
                            sum += code[0];
                            j = 0;
                        }
                    }
                }
                else if(k<0){
                    for(int j=i-1;count<0;j--){
                        count++;
                        if(j>=0)sum+=code[j];
                        else {
                            sum+=code[code.length-1];
                            j=code.length-1;
                        }
                    }
                }
                result[i]=sum;
            }

        return result;
    }
}