import dao.AccountDAO;
import dao.AccountDAOImpl;
import exceptions.InsufficientBalanceException;
import exceptions.NegativeAmountException;
import exceptions.SsnNotValidException;
import model.Account;
import service.AccountService;

public class Main {

    public static void main(String[] args) {
        AccountDAO accountDAO = new AccountDAOImpl();
        AccountService accountService = new AccountService(accountDAO);

        // Creating accounts
        Account acc1 = new Account(1, "GR1601101250000000012300695", "John", "Doe", "123456789", 1000);
        Account acc2 = new Account(2, "GR1601101250000000012300696", "Jane", "Smith", "987654321", 2000);

        accountService.createAccount(acc1);
        accountService.createAccount(acc2);

        System.out.println("Accounts created:");
        System.out.println(accountDAO.findAll());

        // Deposit money
        try {
            accountService.deposit(1, 500);
            System.out.println("New balance after deposit: " + accountDAO.findById(1).getBalance());
        } catch (NegativeAmountException e) {
            System.err.println(e.getMessage());
        }

        // Withdraw money
        try {
            accountService.withdraw(1, 300, "123456789");
            System.out.println("New balance after withdrawal: " + accountDAO.findById(1).getBalance());
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.err.println(e.getMessage());
        }

    }
}
