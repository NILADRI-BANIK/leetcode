# Write your MySQL query statement below
SELECT Department, Employee, Salary FROM
(SELECT Department.name AS Department,Employee.name AS Employee,Employee.salary AS Salary, 
DENSE_RANK() OVER(PARTITION BY Department.name ORDER BY Employee.Salary DESC)AS RANKS
FROM Employee LEFT JOIN Department
ON Employee.departmentId=Department.id)TEMP
WHERE RANKS<=3;