package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account acc) {
        System.out.println("\nTransaction Report");
        System.out.println("Account Number: "
                + acc.getAccountNumber());
        System.out.println("Current Balance: "
                + acc.getBalance());
    }
}
