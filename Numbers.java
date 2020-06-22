class Numbers{
	public static void main(String[] args) {
		int input= new java.util.Scanner(System.in).nextInt();
		for (int i=1;i<=input;i++){
			for(int num=1;num<=i;num++){
			System.out.print(num);
		}
			System.out.println(" ");
		}
	}
}