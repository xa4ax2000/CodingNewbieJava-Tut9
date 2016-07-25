import java.util.Scanner;
public class mainFunction {
	public static void main(String args[]){
		
		//method 1: nested if statements
		int age = 60;
		System.out.printf("You are %d years old\n", age);
		
		if (age<50){
			System.out.println("You are young");
		}else{
			System.out.println("You are old");
			if (age >75){
				System.out.println("You are really old");
			}else{
				System.out.println("Don't worry you are not really that old");
			}
		}
		
		//method 2: else-if statements
		
		System.out.println("\n");
		
		int age2 = 20;
		System.out.printf("You are %d years old \n", age2);
		
		if (age2 >= 65)
			System.out.println("You are a senior citizen");
		else if (age2 >= 50)
			System.out.println("You are almost a senior citizen");
		else if (age2 >= 30)
			System.out.println("You are a (working) adult!");
		else if (age2 >= 20)
			System.out.println("You are a young adolescent!");
		else
			System.out.println("You are young");
		
		//method 3: conditional operators
		
		Scanner input = new Scanner(System.in);
		int age3;
		System.out.println("Type in your age: ");
		age3 = input.nextInt();
		input.nextLine();
		
		System.out.println(age3 >= 65 ? "You are a senior citizen" : "You are still young!");
		
		
	}
}
