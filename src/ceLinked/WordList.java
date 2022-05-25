package ceLinked;

/**
* WordList is a singly-linked list of Strings.
* It is designed as a practice opportunity to
* learn how to manipulate linked sturctures.
*
* @author ..........
*/
public class WordList {
   private Node head; // first node of the list or null
   private Node tail; // last node of the list or null
   private int n; // number of words in the list

   /**
   * Node of LinkedList that stores the item and a
   * single reference to the next node.
   */
   private class Node {
       private String item;
       private Node next;
   }
  
   /**
   * Adds a node containing the new item at the
   * end of the list.
   *
   * @param newItem
   */
   public void append(String newItem) {
       // create a new node based on the word provided by the user
       Node newNode = new Node();
       newNode.item = newItem;
      
       if (isEmpty()) {
           head = newNode;
           tail = newNode;
       }
       else {
           tail.next = newNode;
           tail = newNode;
       }
       n++;
   }
  
   /**
   * Adds a node containing the new item at the
   * front of the list.
   *
   * @param newItem
   */
   public void prepend(String newItem) {      
	   Node newNode = new Node();
       newNode.item = newItem;
      
       if (isEmpty()) {
           head = newNode;
           tail = newNode;
       }
       else
       {
    	   newNode.next=head;
    	   head=newNode;
       }
       n++;
   }
  
   /**
   * Returns the index of the first occurrence of the specified item.
   * If the specified item in not part of the list
   * the method indexOf returns -1
   *
   * @param item
   * @return index of the first occurrence of the item; -1 if the word was not found.
   */
   public int indexOf(String item) {      
	   Node current = head;
	   int index=0;
       while(current != null) {
           if(current.item.equalsIgnoreCase(item))
           {
        	   return index;
           }
           index++;
           current = current.next;
       }
       return -1;
   }
  
   /**
   * Checks whether the list contains the given item.
   *
   * @param item
   * @return true if the item is contained in the list; false otherwise.
   */
   public boolean contains(String item) {  
	   Node current = head;
       while(current != null) {
           if(current.item.equalsIgnoreCase(item))
           {
        	   return true;
           }
           current = current.next;
       }
       return false;
   }
  
   /**
   * Returns the number of elements in the list
   * @return the number of elements
   */
   public int size() {
       return n;
   }
  
   /**
   * Determines whether the list is empty or not.
   * @return true if there are no elements in the list.
   */
   public boolean isEmpty() {
       return n == 0;
   }
  
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       Node current = head;
      
       while(current != null) {
           sb.append(current.item).append(" ");
           current = current.next;
       }
      
       return sb.toString();
   }
  
   /* * * * * * * * Test Client * * * * * * */
   public static void main(String[] args) {
       WordList list = new WordList();
       System.out.println("size: " + list.size());
      
       // TODO 1
       // Dynamically determine whether the list is empty. If so, print
       // 'The list is empty.' otherwise print 'The list is not empty.'   
       System.out.print("TODO 1:");
       if(list.isEmpty())
       {
    	   System.out.println("list is empty");
       }
       else
       {
    	   System.out.println("list is not empty");
       }
       
       list.append("ant");
       list.append("bat");
       list.append("cow");
       list.append("dog");
       
       //TODO 2: prepend 'ape'
       System.out.println("TODO 2: prepend 'ape'");
       list.prepend("ape");
       System.out.println("list: " + list);
       
       //TODO 2: prepend 'auk'
       System.out.println("TODO 2: prepend 'auk'");
       list.prepend("auk");
       System.out.println("list: "+ list);
       System.out.println("size: " + list.size());
       //TODO 3: indexOf
       System.out.println("TODO 3: indexOf");
       System.out.println("index of dog "+list.indexOf("dog"));
       System.out.println("index of auk "+list.indexOf("auk"));
       System.out.println("index of yak "+list.indexOf("yak"));
       
       //TODO 4: contains
       System.out.println("TODO 4: contains");
       if(list.contains("cow"))
       {
    	   System.out.println("cow is included in the list");
       }
       else
       {
    	   System.out.println("cow is not included in the list");
       }

       if(list.contains("yak"))
       {
    	   System.out.println("yak is included in the list");
       }
       else
       {
    	   System.out.println("yak is not included in the list");
       }
       
       System.out.println("list: "+ list);
       System.out.println("size: " + list.size());
   }

}