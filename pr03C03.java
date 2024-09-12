
import java.util.*;

abstract class Staff{
	String name, add;
	Staff(String name, String add){
		this.name = name;
		this.add = add;
	}
}
class FullTimeStaff extends Staff{
	String dept;
	int salary;
	FullTimeStaff(String dept, int salary, String name, String add){
		super(name, add);
		this.dept = dept;
		this.salary = salary;
	}
	public void display() {
		System.out.printf("Name:%s ",this.name);
		System.out.printf("\nadd:%s ",this.add);
		System.out.printf("\ndept:%s ",this.dept);
		System.out.printf("\nsalary:%d ",this.salary);

	}
	
}
class PartTimeStaff extends Staff{
	int noOfHours, ratePerHour;
	PartTimeStaff(int noOfHours, int ratePerHour, String name, String add){
		super(name, add);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}
	public void display() {
		System.out.printf("Name:%s ",this.name);
		System.out.printf("\nadd:%s ",this.add);
		System.out.printf("\nnoOfHours:%d ",this.noOfHours);
		System.out.printf("\nratePerHour:%d ",this.ratePerHour);

	}
}

public class pr03C03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		System.out.print("Enter FullTime(0) PartTime(1): ");
		int ch = sc.nextInt();
		System.out.println(ch);

		if(ch==0) {
			FullTimeStaff f1[] = new FullTimeStaff[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter a dept name: ");
				String dept = sc.next();
				System.out.print("Enter a salary: ");
				int salary = sc.nextInt();
				System.out.print("Enter a name: ");
				String name = sc.next();
				System.out.print("Enter a add: ");
				String add = sc.next();
				f1[i] = new FullTimeStaff(dept, salary, name, add);
			}
			for(int i=0;i<n;i++) {
				f1[i].display();
			}
		}
		else if(ch==1) {
			PartTimeStaff p1[] = new PartTimeStaff[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter number of hrs: ");
				int noOfHours = sc.nextInt();
				System.out.print("Enter rate per hrs: ");
				int ratePerHour = sc.nextInt();
				System.out.print("Enter a name: ");
				String name = sc.next();
				System.out.print("Enter a add: ");
				String add = sc.next();
				p1[i] = new PartTimeStaff(noOfHours, ratePerHour, name, add);
			}
			for(int i=0;i<n;i++) {
				p1[i].display();
			}
		}
		else {
			System.out.print("Wrong choice!");
		}
		
	}
}
