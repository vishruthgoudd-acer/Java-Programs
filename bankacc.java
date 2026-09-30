class BankAccount {

    private String holder;
    private double balance;

    // Setter for holder
    public void setHolder(String holder) {
        this.holder = holder;
    }

    // Getter for holder
    public String getHolder() {
        return holder;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid balance!");
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
