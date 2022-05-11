package string2;
import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		
		int age = sc.nextInt();
		double cgpa = sc.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("CGPA: "+cgpa);

	}

}


