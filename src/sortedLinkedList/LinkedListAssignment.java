package sortedLinkedList;
/*Programmer: Mariam Asad
* Date Written: 08/07/2020
*
* This program is designed to test the LinkedList class to see
* that inserting and printing out works
*
*/
public class LinkedListAssignment
{
   public static void main(String[] args)
   {
       LinkedList IS4010 = new LinkedList();
      
       //load names into the LinkedList
       IS4010 = IS4010.insert(IS4010, "Lally");
       IS4010 = IS4010.insert(IS4010, "Aviles");
       IS4010 = IS4010.insert(IS4010, "Saito");
       IS4010 = IS4010.insert(IS4010, "Day");
       IS4010 = IS4010.insert(IS4010, "Able");
       IS4010 = IS4010.insert(IS4010, "Bble");
      
       //print out the LinkedList
       IS4010.printList(IS4010);
   }
}