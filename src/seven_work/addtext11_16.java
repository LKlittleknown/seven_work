package seven_work;
import java.util.*;

public class addtext11_16 {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int v[] = new int[1000000];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("what is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		while(number1 + number2 != answer) {
			if(v[answer] == 1) {
				System.out.println("You already entered" + answer);
			}else {
				System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
				v[answer] = 1;
			}
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
	}

}
