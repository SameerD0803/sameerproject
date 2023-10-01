package conditionalprogram;
import java.util.Scanner;rfr
public class Grade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math, chem, phy, total;
		float per;
		System.out.println("Enter marks of math, chem & phy : ");
		Scanner sc= new Scanner(System.in);
		math= sc.nextInt();
		chem= sc.nextInt();
		phy= sc.nextInt();
		total = math+chem+phy;
		per= total/3;
		if(math<40 || phy<40 || chem<40) {
			System.out.println("Student is Failed");
		}
		else if(per>=90) {
			System.out.println("Grade : A & Percentage : "+per);
		}
		else if(per>=70) {
			System.out.println("Grade : B & Percentage : "+per);
		}
		else if(per>40) {
			System.out.println("Grade : C & Percentage : "+per);
		}
		else {
			System.out.println("Student is Failed");
		}
		

	}

}