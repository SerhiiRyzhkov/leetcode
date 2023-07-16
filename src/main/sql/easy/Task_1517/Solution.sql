  /*
  Find Users With Valid E-Mails
  https://leetcode.com/problems/find-users-with-valid-e-mails/description/
     */

  select * from Users where mail regexp '^[A-Z][A-Z0-9_.-]*[@]leetcode[.]com$';