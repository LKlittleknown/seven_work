package seven_work;
import java.util.Date;
public class Transaction {
	public Date date;
	public char type;
	public double amount;
	public double balance;
	public String description;
	public Transaction(char t,double am,double bl,String des){
	    date=new Date();
	    type=t;
	    amount=am;
	    balance=bl;
	    description=des;
	}
}
