# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It will be easier to solve if I choose a suitable container to keep asteroids.
# Approach
<!-- Describe your approach to solving the problem. -->
We got two special cases: negative asteroids and positive asteroids. If an asteroid is positive we just push it to arrayDeque. If the asteroid is negative we start crush asteroids among them. We use while loop for it. We destroy all the asteroids that less than current one. After iterating over the array we have asteroids that have survived, but we have them in the revers order. So we need to write down them to the final array from the end to begin.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            if (deque.isEmpty() || asteroid > 0) {
                deque.push(asteroid);
            } else {
                while (!deque.isEmpty() && deque.peek() > 0 && deque.peek() < Math.abs(asteroid)) {
                    deque.pop();
                }
                if (!deque.isEmpty() && (deque.peek() == Math.abs(asteroid))) {
                    deque.pop();
                } else {
                    if (deque.isEmpty() || deque.peek() < 0) {
                        deque.push(asteroid);
                    }
                }
            }
        }

        int [] result = new int[deque.size()];
        int index=result.length;
        while (!deque.isEmpty())
            result[--index]=deque.pop();

        return result;
    }
}
```