package seven_work;

public class test11_8 {

	public static void main(String[] args) {
		Account11_8 ass = new Account11_8("George", 1122, 1000);
		ass.deposit(30, "1 dep");
		ass.deposit(40, "2 dep");
		ass.deposit(50, "3 dep");
		ass.withDraw(5, "1 wdw");
		ass.withDraw(4, "2 wdw");
		ass.withDraw(2, "3 wdw");
		System.out.print("name :"+ass.get_name()+" rate: "+ass.get_annualInterestRate()+" balance: "+ass.get_balance()+"\n");
		System.out.println();
		for(Transaction dick:ass.transactions) {
			System.out.println("date: "+dick.date);
            System.out.println("type: " + dick.type);
            System.out.println("amount: "+dick.amount);
            System.out.println("new balance: "+dick.balance);
            System.out.println("description: "+dick.description);
            System.out.println();
		}
	}

}
