package medium.Task_735;

import java.util.*;


// Asteroid Collision
// https://leetcode.com/problems/asteroid-collision/
public class Solution {
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