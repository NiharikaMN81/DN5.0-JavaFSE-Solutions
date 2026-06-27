CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance+(Balance*0.01)
    WHERE AccountType='Savings';
    DBMS_OUTPUT.PUT_LINE('Interest rates of 1% updated for savings accs');
    DBMS_OUTPUT.PUT_LINE('Rows updated: '||SQL%ROWCOUNT);
    COMMIT;
END;
/
EXEC ProcessMonthlyInterest;