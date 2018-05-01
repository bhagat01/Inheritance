package practice1;
import java.util.Scanner;
public class inheritanceDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a= sc.nextInt();
		if (a<20) {
			System.out.println("This number is too small");
		}else if (a>20) {
		System.out.println("This is big enough");
		
		}
	} 

}

