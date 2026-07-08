CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_percentage IN NUMBER
)
AS
BEGIN
    UPDATE Employees 
    SET Salary = Salary+(Salary * bonus_percentage/100)
    WHERE Department = dept_name;
    DBMS_OUTPUT.PUT_LINE('Bonus of '|| bonus_percentage ||'% is applied to'||dept_name||' Department.');
    DBMS_OUTPUT.PUT_LINE('Employees Updated: '||SQL%ROWCOUNT);

    COMMIT;
END;
/
EXEC UpdateEmployeeBonus('IT', 10);
EXEC UpdateEmployeeBonus('HR', 15);