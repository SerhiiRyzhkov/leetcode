/*
Duplicate Emails
https://leetcode.com/problems/duplicate-emails/
   */

Select email as 'Email' from Person group by email having count(email)>1;