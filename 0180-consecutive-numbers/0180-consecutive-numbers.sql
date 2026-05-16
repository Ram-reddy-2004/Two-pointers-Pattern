/* Write your PL/SQL query statement below */
select distinct l1.num ConsecutiveNums from logs l1,logs l2, logs l3 where l1.id =l2.id+1 and l1.num = l2.num and l3.id = l1.id+1 and l3.num=l1.num;