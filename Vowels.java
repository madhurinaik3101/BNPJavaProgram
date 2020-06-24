class Vowels{
	public static void main(String[] args) {
		int noOfVowels=0;
		char Vowels[]={'a','e','o','u','i'};
		System.out.println("Enter string");
		String string= new java.util.Scanner(System.in).nextLine();
		string=string.toLowerCase();
		
		for(int i=0;i<string.length();i++){
			for ( int j=0; j<Vowels.length;j++){
				if (string.charAt(i)== Vowels[j]) {
				noOfVowels+=1;
				}
			}
		}
		System.out.println(noOfVowels);
	}
}