package easy.Task_2660;

// Determine the Winner of a Bowling Game
// https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/
public class Solution {
    public int isWinner(int[] player1, int[] player2) {
        if(countScore(player1)>countScore(player2))return 1;
        else if(countScore(player1)<countScore(player2))return 2;
        else return 0;
    }

    private int countScore(int [] arr){
        int result=0;
        int count=0;
        for (int j : arr) {
            result += j;
            if (count>0) {result += j;count--;}
            if (j == 10) count = 2;
        }
        return result;
    }
}