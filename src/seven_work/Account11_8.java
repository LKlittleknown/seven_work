package seven_work;
import java.util.*;

public class Account11_8 {
	private String name;
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public Account11_8(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	public void set_id(int id) {
		this.id = id;
	}
	public void set_balance(double balance) {
		this.balance = balance;
	}
	public void set_annualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int get_id() {
		return this.id;
	}
	public double get_balance() {
		return this.balance;
	}
	public double get_annualInterestRate() {
		return this.annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 1200;
	}
	public double getMonthlyInterest() {
		return this.annualInterestRate *this.balance/1200;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public String get_name(){
		return this.name;
	}
	public void withDraw(double num, String ass) {
		if(num <= this.balance) {
			this.balance-=num;
			transactions.add(new Transaction('W', num, this.balance,ass));
		}else{
			System.out.println("you don't have enough money");
		}
	}
	
	public void deposit(double num, String ass) {
		this.balance += num;
		transactions.add(new Transaction('D',num, this.balance, ass));
	}
	
	
}
