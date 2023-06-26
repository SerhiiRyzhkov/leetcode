/*
Swap Salary
https://leetcode.com/problems/swap-salary/
   */

update leetcode.salary set sex = case sex
                                 when 'f' then 'm'
                                 when 'm' then 'f'
                                 end;