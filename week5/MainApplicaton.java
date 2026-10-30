import reports.TransactionReport;
import transaction.Account;

public class MainApplication {

    public static void main(String[] args) {

        Account acc = new Account(1000, 5000);

        acc.deposit(2000);
        acc.withdraw(3000);

        TransactionReport report =
                new TransactionReport();

        report.generateReport(acc);
    }
}
