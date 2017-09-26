package laboration7;

import javax.swing.JOptionPane;

public class BankAccount {
	private String accountNbr;
	private double balance,
					interestRate;
	
	public BankAccount(String accountNbr){
		this.accountNbr = accountNbr;
		this.balance = 0.0;
		this.interestRate = 0.005;
	}
	
	public BankAccount(String accountNbr, double balance, double interestRate){
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getAccountNbr() {
		return accountNbr;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	
	public void withdrawal(double amount){
		this.balance -= amount;
	}
	
	public void info(){
		JOptionPane.showMessageDialog(null, "Account number: " + this.accountNbr + "\n" + "Balance: " + this.balance);
	}
}



























