public interface AccountOperations {
    double stanKonta();
    void transfer(int amount, BankAccount bankAccount);
    void payment(int amount, BankAccount bankAccount);

}
