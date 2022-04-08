package week1;

import java.util.Scanner;

class Student{
	//data field
	int idStudent;
	private String name;
	private String department;
	private String classification;
	
	Student(int idStudent, String name, String department, String classification){
		this.classification=classification;
		this.department=department;
		this.idStudent=idStudent;
		this.name=name;
	}
	Student(){
		//no arg constructor
		idStudent = 0;
		name = "";
		department = "";
		classification = "";
	}
	//setters and getters
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String toString() {
		//getting the display message
		return idStudent+" \t \t "+name+" \t "+department+" \t "+classification;
	}
	
}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int j = 1; // used for numbering in loop
		int matrix;
		String name;
		String dept;
		String status;
		System.out.println("enter number of students");
		int num = scan.nextInt();
		Student[] StudentArray = new Student[num];
		
		for(int i =0; i<num; i++) {
			
			System.out.println("enter details for student number "+j);
			StudentArray[i] = new Student();
			System.out.println("Matrix number : ");
			//matrix = scan.nextInt();
			StudentArray[i].setIdStudent(scan.nextInt());
			System.out.println("name : ");
			//name = scan.next();
			scan.nextLine();
			StudentArray[i].setName(scan.nextLine());
			
			System.out.println("department : ");
			//dept = scan.next();
			StudentArray[i].setDepartment(scan.nextLine());
			
			System.out.println("classification : ");
			//status = scan.next();
			StudentArray[i].setClassification(scan.nextLine());
			
			
			//StudentArray[i] = new Student(matrix,name,dept,status);
			j++;
		}
		j=1;
		//print out the display
		System.out.println("matrix number \t name \t\t department \t classification");
		for (int x=0; x<num; x++) {
			System.out.println(StudentArray[x].toString());
		}
		
	}
	

}
