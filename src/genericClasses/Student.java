package genericClasses;
// Defines class Student
public class Student
{
   // Instance variables to store student information
   private int id;
   private String name;
   private double gpa;
  
   // Default constructor
   public Student()
   {
       id = 0;
       name = "";
       gpa = 0.0;
   }// End of default constructor
  
   // Parameterized constructor
   public Student(int id, String name, double gpa)
   {
       this.id = id;
       this.name = name;
       this.gpa = gpa;
   }// End of parameterized constructor
  
  
   // Getter methods
   public int getID()
   {
       return id;
   }
   public String getName()
   {
       return name;
   }
   public double getGPA()
   {
       return gpa;
   }
  
   // Setter methods
   public void setID(int id)
   {
       this.id = id;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setGPA(double gpa)
   {
       this.gpa = gpa;
   }
  
   // Overrides toString() method to return Student information
   public String toString()
   {
       return id + ", " + name + ", " + gpa;
   }// End of method
}// End of class Student