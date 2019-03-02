package BankExample;

import java.time.LocalDate;

import java.time.LocalTime;

import java.util.ArrayList;

import java.util.List;

/*

 �ó�����

������ ���¸� �����Ѵ�.

������ ���¸� ����Ѵ�.

������ ���¹�ȣ�� ���¸� ã�� �� �ִ�.

������ ������ �����ڸ����� ���¸� ã�� �� �ִ�.

������ ��� ������ ����� �� �� �ִ�.

���´� �����ڸ�, ���¹�ȣ, �ܰ�� �����ȴ�.

���´� �Ա�,��� ��ɰ� �ܰ�Ȯ�� ����� �ִ�.

���¿��� �ܾ��� ��ȭ�� ���� ������ ����� ���� ��ϵȴ�.

����� ���� �ŷ�����, �ŷ��ð�, �Ա�/���, �ݾ�, �ܾ����� �����ȴ�.

 */

 

class Bank{

	List<Account> accounts;     //����(0���̻�)

	private int totalAccount;   //�Ѱ��¼�

	 

	public Bank() {

		accounts = new ArrayList<Account>();

		this.totalAccount = 0;

	}

 

	//���»���

	public void addAccount(String accountNo,String name) {

		accounts.add(new Account(accountNo, name));

	}

	

	//���� ã��(���¹�ȣ)

	public Account getAccount(String accountNo) {

		Account find = null;

		for(int i=0; i<accounts.size() ;i++){

			if(accounts.get(i).getAccountNo().equals(accountNo)) {

				find = accounts.get(i);

			}

		}

		return find;

	}

	

	//���� ã��(�����ڸ�����)

	public ArrayList<Account> findAccounts(String name) {

		//Account[] find = null;

		ArrayList<Account> find = new ArrayList<Account>();

		for(int i=0 ; i<accounts.size() ; i++) {

			if(accounts.get(i).getName().equals(name)) {

				find.add(accounts.get(i));

			}

		}

		return find;

	}

	

	//���¸���� ����

	public ArrayList<Account> getAccounts() {

		return (ArrayList<Account>) accounts;

	}

	

	//�Ѱ��¼��� ��ȯ�Ѵ�

	public int getTotalAccount() {

		return accounts.size();

	}

 

	@Override

	public String toString() {

		return "Bank [accounts=" + accounts + ", totalAccount=" + totalAccount + "]";

	}

	

	

	

}

class Account{

	List<Transaction> transactions; //�ŷ�����(0���̻�)

	private String accountNo; //���¹�ȣ

	private String name;	  //�����ڸ�

	private long balance;	  //�ܰ�

	

	public Account(String accountNo, String name) {

		transactions = new ArrayList<Transaction>();

		this.accountNo = accountNo;

		this.name = name;

		balance = 0;

	}

	

	public String getAccountNo() {

		return this.accountNo;

	}

 

	public String getName() {

		return this.name;

	}

 

	//�Ա��Ѵ�

	public void deposit(long amount) {

		this.balance += amount;

		transactions.add(new Transaction("�Ա�", amount, balance));

	}

	

	//����Ѵ�.

	public void withdraw(long amount) {

		if(balance>amount) {

		this.balance -= amount;

		transactions.add(new Transaction("���", amount, balance));

		}else {

			System.out.println("�ܾ��� �����մϴ�.");

		}

	}

	

	//�ܰ� Ȯ���Ѵ�.

	public long getBalance() {

		return this.balance;

	}

	

	//�ŷ������� ����.

	public ArrayList<Transaction> getTransactions() {

		return (ArrayList<Transaction>) transactions;

		

	

	}

 

	@Override

	public String toString() {

		return "Account [transactions=" + transactions + ", accountNo=" + accountNo + ", name=" + name + ", balance="

				+ balance + "]";

	}

}

class Transaction{

	private String transactionDate; //�ŷ���

	private String transactionTime; //�ŷ��ð�

	private String kind;			//����(�Ա� �Ǵ� ���)

	private long amount;			//�ŷ��ݾ�

	private long balance;			//�ܰ�

	

	public Transaction(String kind, long amount, long balance) {

		this.transactionDate = LocalDate.now().toString();

        this.transactionTime = LocalTime.now().toString();

		this.kind = kind;

		this.amount = amount;

		this.balance = balance;

	}

 

	@Override

	public String toString() {

		return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="

				+ kind + ", amount=" + amount + ", balance=" + balance + "]";

	}





public class Hw01_Bank {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Bank bank = new Bank();

		bank.addAccount("307124", "������");

		bank.addAccount("111111", "ȫ�浿");

		bank.addAccount("222222", "������");

		System.out.println(bank.getAccount("111111").toString());

		System.out.println(bank.findAccounts("������").toString());

		

		Account ac = bank.getAccount("111111");

		

		System.out.println(ac.toString());

		

		bank.getAccount("111111").deposit(10000);

		

		System.out.println(bank.getAccount("111111").toString());

		

		bank.getAccount("111111").withdraw(5000);

		

		System.out.println(bank.getAccount("111111").toString());

 

		bank.getAccount("111111").withdraw(15000);

	}

 

}
