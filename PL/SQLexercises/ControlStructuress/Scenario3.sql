BEGIN
    FOR loan IN(
        SELECT l.LoanID, l.DueDate, c.CustomerName
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate <= SYSDATE+30
        AND l.DueDate >= SYSDATE
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder - Dear '|| loan.CustomerName||',your loan (ID:'|| loan.LoanID ||') is due on '||loan.DueDate ||'. Please make your payment!!');     
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('All reminders sent!!);
END;
/