package q2;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numStudents;
			int marks;
			System.out.println("Enter No. of students");
			numStudents= scanner.nextInt();
			double average=0.0;
			double total=0.0;
			
			int grades[]=new int[numStudents];
			
			int counter=0;
			while(counter<numStudents) {
				System.out.println("Enter the grades "+ (counter+1));
				marks=scanner.nextInt();
				if(marks>100 || marks<0 ) {
					System.out.println("Put the grades in valid form");
					continue;
				}
				grades[counter++]= marks;
			}
			
			for(int grade: grades) {
				total+=grade;
			}
			System.out.println("Total marks of students: "+ total);
			
			average=total/grades.length;
			
			System.out.println("Average of all students: "+ average);
		}
		


	}

}