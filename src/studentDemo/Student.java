package studentDemo;

//Student class
public class Student {
	
	//Part
	//Attributes
	String studentName;
	String studentNumber;
	int markForJava;
	int markForEnglish;
	int markForMaths;
	
	//Part-2
	//method to get student number
	public String getNumber()
	{
		return this.studentNumber;
	}

	//method to set student number
	public void setNumber(String studentNumber)
	{
		this.studentNumber=studentNumber;
	}
	
	//method to get student name
	public String getName()
	{
		return this.studentName;
	}
	
	//method to set student name
	public void setName(String studentName)
	{
		this.studentName=studentName;
	}
	
	//method to set three subject marks
	public void enterMarks(int markForJava,int markForEnglish,int markForMaths)
	{
		this.markForJava=markForJava;
		this.markForEnglish=markForEnglish;
		this.markForMaths=markForMaths;
	}
	
	//method to get student java marks
	public int getJavaMark()
	{
		return this.markForJava;
	}
	
	//method to get student english marks
	public int getEnglishMark()
	{
		return this.markForEnglish;
	}
	
	//method to get student maths marks
	public int getMathsMark()
	{
		return this.markForMaths;
	}
	
	//method to get student average of marks
	public double calculateAverageMark()
	{
		return (markForJava+markForEnglish+markForMaths)/3.0;
	}
}
