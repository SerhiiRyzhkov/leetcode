# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need iterate over the input array in direct and reverse order and the same time. Consequently, we will need two vars that will mean index of the array for direct order and reverse order. 
# Approach
<!-- Describe your approach to solving the problem. -->
We create two vars to use them for array indexes of direct and reverse iterating. Also, we create var steps. Then we have "while" loop where we increment direct order index and reverse order index. On the every iteration we check if we found the target and count every step. If number of steps is greater than words length, it means that we have already check all the array and there isn`t target here, so we should return -1. 

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {

        int backIndex=startIndex;
        int forwardIndex=startIndex;

        int steps=0;

        while (steps<words.length){
            if((words[backIndex--].equals(target))||(words[forwardIndex++].equals(target))) return steps;
            else {
                steps++;
                if(backIndex==-1)backIndex=words.length-1;
                if(forwardIndex==words.length) forwardIndex=0;
            }
        }


        return -1;
    }
}
```