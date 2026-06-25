DECLARE
BEGIN
    FOR Customer IN (
        SELECT CustomerID, Age
        FROM Customerss
    )
    LOOP
        IF Customer.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = Customer.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'DISCOUNT APPLIED FOR CustomerID: ' ||
                Customer.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'DONE! INTEREST RATES APPLIED AND UPDATED'
    );
END;
/
