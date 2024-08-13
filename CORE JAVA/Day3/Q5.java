package com.selva;

class BankAccount{
	double bal;
	void deposit(double amount) {
		bal +=amount;
		System.out.println("Deposit: "+amount);
		System.out.println("Balance: "+bal);
	}
	void withdraw(double amount) {
		if(bal>=amount) {
			bal-=amount;
			System.out.println("Withdraw: "+amount);
			System.out.println("Current balance: "+bal);
		}
	}
}
class SavingsAccount extends BankAccount{
	void withdraw(double amount) {
		if(bal-amount<100) {
			System.out.println("Cannot withdraw");
		}
		else {
			super.withdraw(amount);
		}
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount();
		b1.deposit(8000);
		b1.withdraw(4000);
		SavingsAccount s1 = new SavingsAccount();
		s1.deposit(8000);
		s1.withdraw(7950);
		s1.withdraw(900);

	}

}