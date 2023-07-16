/*
Delete Duplicate Emails
https://leetcode.com/problems/delete-duplicate-emails/
   */

DELETE P2 from person P1 join person P2  ON P1.Email=P2.Email and
                                            P1.Id<P2.Id;