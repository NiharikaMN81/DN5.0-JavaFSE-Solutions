CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
)
AS
    source_balance NUMBER;
BEGIN
    SELECT Balance INTO source_balance
    FROM Accounts
    WHERE AccountID=from_account;

    IF source_balance<amount THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: Insufficient balance! available: '||source_balance);
    ELSE
        UPDATE Accounts
        SET Balance = Balance-amount
        WHERE AccountID=from_account;

        UPDATE Accounts
        SET Balance=Balance+amount
        WHERE AccountID= to_account;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('SUCCESS: Rs. '||amount||' transferred from account '|| from_account ||'to account'||to_account);
    END IF;
END;
/

EXEC TransferFunds(1, 2, 1000);
EXEC TransferFunds(4, 2, 99999);