public class BankAccount {
    private static int idCounter = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public BankAccount()
    {
        this.id = idCounter++;
    }
    public int getId()
    {
        return this.id;
    }
    public void deposit(double amount)
    {
        this.balance +=amount;
    }
    public double getInterest(int years)
    {
        return this.balance * interestRate * years;
    }
    public static void setInterestRate(double newRate)
    {
        interestRate = newRate;
    }
}
