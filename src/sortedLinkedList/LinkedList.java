package sortedLinkedList;
public class LinkedList
{
   node head; //head of list
  
   //method to insert a new node
   public LinkedList insert(LinkedList list, String data)
   {
       //create a new node with given data
       node new_node = new node(data);
       new_node.next = null;
      
       /* Special case for head node */
       if (list.head == null || list.head.name.compareTo(new_node.name)>=0) { 
           new_node.next = list.head; 
           list.head = new_node; 
       } 
       else { 
 
    	   //It is simple than you wrote before
           /* Locate the node before point of insertion. */
           node current = list.head;
           while (current.next != null && current.next.name.compareTo(new_node.name)<0) 
               current = current.next; 
           //after locating node add new_node after that located node
           new_node.next = current.next; 
           current.next = new_node; 
       } 
       //return the list by head
       return list;
   }
   //method to print the LinkedList
   public void printList(LinkedList list)
   {
       node currnode = list.head;
      
       System.out.println("LinkedList: ");
      
       //Traverse through the LinkedList
       while (currnode != null)
       {
           //print the data at current node
           System.out.println(currnode.name + " ");
          
           //go to next node
           currnode = currnode.next;
       }
   }
}