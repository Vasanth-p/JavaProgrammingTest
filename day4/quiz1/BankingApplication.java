interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class SavingsAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class CheckingAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class LoanAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        // Deposit logic for loan account
    }

    @Override
    public void withdraw(double amount) {
        // Withdrawal logic for loan account
    }

    @Override
    public double checkBalance() {
        // Balance check logic for loan account
        return balance;
    }
}

