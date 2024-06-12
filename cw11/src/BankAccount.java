import java.util.ArrayList;

public class BankAccount implements AccountOperations{
    private int stanKonta = 0;
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(int stanKonta) {
        this.stanKonta = 0;
    }

    public int getStanKonta() {
        return stanKonta;
    }


    @Override
    public void transfer(int amount, BankAccount bankAccount) {
        AccountOperationException exception =new AccountOperationException("Nie ma środków na koncie");

    }

    @Override
    public void payment(int amount, BankAccount bankAccount) {

    }

}
