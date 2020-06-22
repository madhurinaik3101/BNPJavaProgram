class Seasons{
	public static void main(String[] args) {
		String date= new java.util.Scanner(System.in).nextLine();
		switch(date){
			case "12 1 2":
				System.out.println("WINTER");
				break;
			case "3 4 5":
				System.out.println("Spring");
			case "6 7 8":
				System.out.println("Summer");
			case "9 10 11":
				System.out.println("Autumn");
			default:
				System.out.println("No such Season exists");
		}
	}
}