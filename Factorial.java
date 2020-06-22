class Factorial{
	public static void main(String[] args) {
		int number= new java.util.Scanner(System.in).nextInt();
		int factorial=1;
		while(number>0){
			factorial=factorial*number;
			number=number-1;
		}
		System.out.println(factorial);
	}
}