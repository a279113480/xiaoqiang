-- dept ºÍEmp·ÖÒ³²éÑ¯

select e.ename,e.job,e.dname,e.loc,e.sal from(
select row_number()over(order by sal desc) rn,c.* from
(select e.ename,e.job,d.dname,d.loc,e.sal from emp e ,dept d where e.deptno = d.deptno) c )e where 1=1 and rn>5 and rn <=10;