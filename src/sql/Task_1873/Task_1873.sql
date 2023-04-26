/*
Customers Who Never Order
https://leetcode.com/problems/customers-who-never-order/
*/

select employee_id,
       case
           when (mod(employee_id,2)=0 or name like'M%') then 0
           else salary
           end
    as 'bonus'
from Employees order by employee_id;