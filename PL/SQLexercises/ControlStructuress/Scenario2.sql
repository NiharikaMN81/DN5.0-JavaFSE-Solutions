BEGIN
    FOR Customer IN(SELECT CustomerID,Balance FROM Customers)
    LOOP
        IF Customer.Balance>10000 THEN
            UPDATE Customers
            SET IsVIP='TRUE'
            WHERE CustomerID=Customer.CustomerID;
            DBMS_OUTPUT.PUT_LINE('CustomerID:'||Customer.CustomerID||'is promoted as VIP!');
        ELSE
            DBMS_OUTPUT.PUT_LINE('CustomerID:'||Customer.CustomerID||'is not promoted as VIP!');
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rate is applied for all customers');
END;
/