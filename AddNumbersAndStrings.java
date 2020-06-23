//Shows Error that reference to add is ambiguous when there are zero parameters.
class AddNumbersAndStrings{
	int total;
	void add(int...numbers){
	for(int number:numbers){
		total+=number;
	}
	System.out.println(total);
    }

   void add(String...strings){
	StringBuffer str= new StringBuffer();
	for(String string:strings){
		str.append(string);
	}
	System.out.println(str);
    }
	public static void main(String[] args) {
		AddNumbersAndStrings n = new AddNumbersAndStrings();
		n.add(1,2,3,4,5);
		n.add("Madhuri"," ","Naik");

	}
}

