package linkedStack;

public class Tester 
{
   public static void main(String[] args) 
   {
      testStackOperations();
      System.out.println("\n\nDone.");
   }  // end main

   public static void testStackOperations()
   {
      System.out.println("Create a stack: ");
      LinkedStack myStack = new LinkedStack();

      System.out.println("\nAdd to stack to get\n" +
                         "4, 1, 2, 2, 7, 2, 8, 8, 8, 4");

      int inputArray[] = {4, 1, 2, 2, 7, 2, 8, 8, 8, 4};

      for(int i = 0; i<inputArray.length; i++){
         myStack.push(inputArray[i]);
      }

      System.out.println("\nTesting sum:");
      int sumValue1 = myStack.sum();
      System.out.println("\nThe result of summing is:" + sumValue1);

      System.out.println("\nTesting sumSkipDuplicates:");
      int sumValue2 = myStack.sumSkipDu();
      System.out.println("\nThe result of sumSkipDuplicates is:" + sumValue2);

      System.out.println("\nTesting peek and pop:");
      while (!myStack.isEmpty())
      {
         int top = myStack.peek();
         System.out.println("\n" + top + " is at the top of the stack.");

         top = myStack.pop();
         System.out.println(top + " is removed from the stack.");
      } // end while

      System.out.println("\nTesting clear:");
      myStack.clear();
      System.out.println("The stack should be empty: ");
      System.out.println("\nisEmpty() returns " + myStack.isEmpty());
   } 
}