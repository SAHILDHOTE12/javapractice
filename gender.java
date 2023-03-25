import java.util.*;
class Code16GENDER {
	public static void main(String[] args) {
		Scanner nay=new Scanner(System.in);
		System.out.println("Enter your paper marks: ");
		
		int P1 =nay.nextInt();
		int P2 =nay.nextInt();
		int P3 =nay.nextInt();
		
		System.out.println("Enter your Gender(Male/Female): ");
		String Gender=nay.next();
		int Total=P1+P2+P3;
		int per=Total/3;
		if (per>=65 && Gender.equals("Male")) {
			System.out.println("Admission is possible ");
		}
		else {
			System.out.println("Admission is not possible");
	     }
	}

}
