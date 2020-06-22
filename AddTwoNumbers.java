import java.util.Scanner;
class AddTwoNumbers{
	int firstNumber,secondNumber,result;
	public static void main(String[] args) {
		AddTwoNumbers sum = new AddTwoNumbers();
		sum.input();
		sum.add(sum.firstNumber,sum.secondNumber);
		sum.display();
	}

void display(){
		System.out.println("Sum of the two numbers is");
		System.out.println(result);
	}

void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		firstNumber= scan.nextInt();
		System.out.println("Enter second number");
		secondNumber=scan.nextInt();
}

int add(int firstNumber,int secondNumber){
		result = firstNumber + secondNumber;
		return result;
}

}
