CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    SELECT DISTINCT emp.salary
   FROM (
        SELECT e.salary,
        DENSE_RANK() OVER(ORDER BY e.salary DESC) As rnk
        FROM Employee e
    )emp
    WHERE emp.rnk = N
  );
END;
$$ LANGUAGE plpgsql;