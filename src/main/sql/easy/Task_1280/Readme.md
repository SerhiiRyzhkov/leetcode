# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should use join to combine 3 tables.

# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we use join to combine three tables. As we need show students and subjects which they did not attend, we need to use left join between subjects and examination tables. Then we need to count subjects names and group output table by student_id and subject_name. According to task we also need sort table with order by student_id.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
SELECT  students.student_id, students.student_name, subjects.subject_name, count(examinations.subject_name) as 'attended_exams'
FROM students 
JOIN subjects 
left JOIN examinations  
on students.student_id=examinations.student_id and subjects.subject_name=examinations.subject_name
group by students.student_id, subjects.subject_name order by students.student_id asc; 
```