package seven_work;
import java.util.*;

public class Contianers11_19 {

	public static void main(String[] args) {
		System.out.print("Enter the number of objects: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print("Enter the weights of the objects:");
		int maxn = 10;
		int a[] = new int[1111];
		int v[] = new int[1111];
		int got = 0;
		for(int i =0;i < n;i++) {
			a[i] = input.nextInt();
		}
		for(int i =1;i <= n; i++) {
			if(got == n)break;
			int vol = 0;
			System.out.printf("Container %d contains objects with weight", i);
			for(int j = 0;j < n;j++) {
				if(v[j] == 1)continue;
				if(vol + a[j] > 10) {
					break;
				}else {
					v[j] = 1;
					vol += a[j];
					got ++;
					System.out.print(" " + a[j]);
				}
			}
			System.out.println();
		}
		
	}

}
