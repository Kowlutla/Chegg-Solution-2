package genericClasses;
// Defines class Car
public class Car
{
   // Instance variables to store student information
   private int plateNo;
   private String brand;
  
   // Default constructor
   public Car()
   {
       plateNo = 0;
       brand = "";
   }// End of default constructor
  
   // Parameterized constructor
   public Car(int plateNo, String brand)
   {
       this.plateNo = plateNo;
       this.brand = brand;
   }// End of parameterized constructor
  
  
   // Getter methods
   public int getPlateNo()
   {
       return plateNo;
   }
   public String getBrand()
   {
       return brand;
   }
  
   // Setter methods
   public void setplateNo(int plateNo)
   {
       this.plateNo = plateNo;
   }
   public void setBrand(String brand)
   {
       this.brand = brand;
   }
  
   // Overrides toString() method to return Car information
   public String toString()
   {
       return plateNo + ", " + brand;
   }// End of method
}// End of class Car