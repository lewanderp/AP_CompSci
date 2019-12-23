package chapter9;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Measurable
{  
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   public double getMeasure()
   {
      return balance;
   }
   public String toString() {
	   return ""+balance;
   }

   private double balance;

   @Override
   public double getMaximum() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public double getMinimum() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public double getAverage() {
      // TODO Auto-generated method stub
      return 0;
   }
}