/* Write your PL/SQL query statement below */
select(select salary from(
    select  distinct salary, dense_rank() over(order by salary desc ) dk from employee
)where dk = 2) as SecondHighestSalary from dual;
