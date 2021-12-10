package seven_work;
import java.util.*;

public class complete_f {

	public static void main(String[] args) {
		System.out.print("Enter an integer m:");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int i = 1;
		int res=m, root;
		for(;i<=m;i++) {
			res = i*m;
			root = (int)Math.sqrt(res);
			if(root * root == res) {
				break;
			}
		}
		System.out.println("The smallest number n for m * n to be a perfect square is " + i);
		System.out.println("m * n is " + res);
	}

}
