class Palindrome{
	public static void main(String[] args) {
		int flag=0;
		int i=0,j=0;

		String string = new java.util.Scanner(System.in).nextLine();
		int lengthOfString = string.length();
		String reverseString=" ";

		for(int k=lengthOfString-1;k>=0;k--){
			reverseString= reverseString+ string.charAt(k);
		}

		while(i!=lengthOfString && j!=0){
			if (string.charAt(i)!= reverseString.charAt(j)){
				flag=1;
				break;
			}
		}
		if (flag==1)
		{
			System.out.print("Not a Palindrome");	
		}
		else
		{
			System.out.print("Palindrome");
		}
	
	}
}