class FibonacciSeries{
	public static void main(String[] args) {
			System.out.println("Enter number");
			int number= new java.util.Scanner(System.in).nextInt();
			int fibonacci=0;
			int currentnumber=1;
			int previousnumber=0;

			while(fibonacci!=number){
			fibonacci=currentnumber+previousnumber;
			System.out.print(fibonacci+"\t");
			previousnumber=currentnumber;
			currentnumber=fibonacci;
		}
		}
}