import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Give numbers: ");
		int sum = 0;
		int counter = 0;
		int even = 0;
		int odd = 0;

		while (true) {
			int input = Integer.valueOf(scanner.nextLine());

			if (input == -1) {
				break;
			}
			
			if(input % 2 == 0) {
				even++;
			}
			
			if(input % 2 == 1) {
				odd++;
			}
			counter++;
			sum += input;

		}

		System.out.println("Sum of : " + sum);
		System.out.println("Numbers: " + counter);
		System.out.println("Average: " + (double)sum/counter);
		System.out.println("Even: " + even);
		System.out.println("odd: " + odd);
		scanner.close();

	}

}
