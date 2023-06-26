  /*
  List the Products Ordered in a Period
  https://leetcode.com/problems/list-the-products-ordered-in-a-period/
     */

  select product_name,sum(unit) as 'unit' from products
                                                   join orders on (orders.product_id=products.product_id)
  where (order_date between '2020-02-01' AND '2020-02-29')
  group by product_name having sum(unit)>=100;