package package1;         //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

class Student      //Declaring class for student details.
{
	
	private String nameOfStudent;         //String variable to store the name of the student.
	private long phoneNumber;        //long variable to store the phone number of student.
	private int rollNumber;          //int variable to store roll number of student.
	private int classNumber;         //int variable to store the class number of student.
	
	//Above variables are private so, can not be accessed out of the class.Not by the child also.
	
	public String getNameOfStudent()      //getter for name of student.
	{
		return nameOfStudent;
	}
	
	public void setNameOfStudent(String nameOfStudent)    //setter for name of student. 
	{
		this.nameOfStudent = nameOfStudent;
	}
	
	public long getPhoneNumber()      //getter for phone number.
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber)      //setter for phone number.
	{
		this.phoneNumber = phoneNumber;
	}
	
	public int getRollNumber()       //getter for roll number.
	{
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber)       //setter for roll number.
	{
		this.rollNumber = rollNumber;
	}
	
	public int getClassNumber()          //getter for class number 
	{
		return classNumber;
	}
	
	public void setClassNumber(int classNumber)      //setter for class number. 
	{
		this.classNumber = classNumber;
	}
	
	public String resultOfStudent(int phycicsMarks,int chemistryMarks,int mathsMarks,int rollNumber)
	{
		//We have choosen the criteria of passing is atleast 33 marks in each subjects. 
		//If student is fail in one subject then he/she will fail.
		
		if(phycicsMarks<33 || chemistryMarks<33 || mathsMarks<33)          //OR operator is used to put above condition.
			return "Fail";
		
		return "Pass";                //If if condition is not satisfied then it will return this statement.
	}
	
}     //End of student class.


class  StudentResultProcesing extends Student       //StudentResultProcesing is a child class of Student.
{
	
	
	public void printingResult(int physicsMarks,int chemistryMarks,int mathsMarks)    //Function printing result with details.
	{
		//This class is inherited from the Student class, so we can use the public and protected members and methods of Student.
		System.out.println();          //Leaving one line before information of one student.
		System.out.println("Name of the student is "+getNameOfStudent());      //Printing name of student.
		System.out.println("Roll number of student is "+getRollNumber());
		System.out.println("Class in which student is studying is "+getClassNumber());
		System.out.println("Result of the Student is "+resultOfStudent(physicsMarks,chemistryMarks,mathsMarks,getRollNumber()));
		//Getting the result of student from the method of parent class and printing.
		
		System.out.println();    //Leaving one line after information of one student.
	}
	
}   






public class Assignment3_4     //Class declaration.
{

	public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.
	{
		//Now we want to take input of the details of students from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		StudentResultProcesing[] detailsStudent=new StudentResultProcesing[3];   
		             //Above line is creating array of references of class StudentResultProcessing.
		
		for(int i=0;i<3;i++)                //Creating each object by new keyword.
			detailsStudent[i]=new StudentResultProcesing();
		
		
		for(int i=0;i<3;i++)     //for loop to take details of the students and printing their result.
		{
			System.out.println("Enter the Name, Phone number, Roll Number, class respectively space seperated");   //Asking for details.
			detailsStudent[i].setNameOfStudent(sc.next());          //Setting the name.
			detailsStudent[i].setPhoneNumber(sc.nextLong());        //Setting the phone number
			detailsStudent[i].setRollNumber(sc.nextInt());          //Setting roll number.
			detailsStudent[i].setClassNumber(sc.nextInt());         //setting class number
			System.out.println("Enter the marks of Physics,Chemistry and maths out of 100 space seperated.");     //Asking for marks.
			detailsStudent[i].printingResult(sc.nextInt(), sc.nextInt(), sc.nextInt());         //Calling the function printingResult to print the result of student.
		}
		
		sc.close();         //Closing the Scanner object sc.
	}    //End of main function.

}      //End of class.