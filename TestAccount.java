package week1;

import java.util.Scanner;

class Account{
	//data field
	int id;
	double balance;
	static int numberofAccounts;
	Account(){
		//no arg constructor
		id = 0;
		balance = 0.00;
	}
	Account(int id, double balance){
		this.id=id;
		this.balance=balance;
		numberofAccounts++;
	}
	public String displayAccount() {
		return " id : "+id+" balance : RM"+balance;
	}
	public double withdraw(double amount) {
		this.balance=this.balance-amount;
		return balance;
	}
	public double deposit(double amount) {
		this.balance=this.balance+amount;
		return balance;
	}
	public int getNumberofAccounts() {
		//keeping track of the number of accounts that have been entered
		return numberofAccounts;
	}
	
	
}

public class TestAccount {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Account[] accountArray;  				//declaring object account array
		accountArray = createaccountArray();    //calling method to create said array
		
		int number = accountArray[1].getNumberofAccounts();
		
		System.out.println("enter 1 to continue with transaction");
		int a = scanner.nextInt();
		
		double amount = 0;
		
		while(a!=0) {
			
			System.out.println("enter number of account entry");
			int i = scanner.nextInt();
			
			System.out.println("enter 1 for withdraw \n enter 2 for deposit \n enter 0 to exit");
			int num = scanner.nextInt();
			
			//loop for transactions
			switch(num) {
			case 1 :
				System.out.println("enter amount to withdraw");
				amount = scanner.nextDouble();
				accountArray[i].withdraw(amount);
				System.out.println("new balance = "+accountArray[i].balance);
				break;
			case 2 :
				System.out.println("enter amount to deposit");
				amount = scanner.nextDouble();
				accountArray[i].deposit(amount);
				System.out.println("new balance = "+accountArray[i].balance);
				break;
			case 0:
				break;
				//System.out.println("enter 0 again to confirm exit");
				//a= scanner.nextInt();
			}
		System.out.println("enter 0 to exit, enter 1 to continue");
		a=scanner.nextInt();
		}
		System.out.println("id \t  \t   balance");
		
		for (int i=1; i <= number;i++) {
			System.out.println(accountArray[i].id+"\t \t   "+accountArray[i].balance);
		}
		
	}


	
	
	
	
	
	private static Account[] createaccountArray() {
		//method to create array of accounts
		Scanner scanner = new Scanner(System.in);
		Account[] accountArray = new Account[100];
		
		System.out.println("press 1 to create accounts ");
		int a = scanner.nextInt();
		
		int i = 1;
		int j = 1;
		
		while(a!=0) {
			
			
			System.out.println("enter account detail");
			int id= scanner.nextInt();
			double balance = scanner.nextDouble();
			
			accountArray[i] = new Account(id,balance);
			
			System.out.println(+j+".account"+accountArray[i].displayAccount());
			
			j++;
			i++;
			
			System.out.println("press 1 to continue creating accounts or press 0 to exit ");
			a= scanner.nextInt();
			
		}
		return accountArray;
		
	}
}
