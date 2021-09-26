/*THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Harry He*/
package assignment3;

import java.util.Random;

public class RandomList {
    
    private class Node {
        int value;
        Node next;
    }
    
    private Node head = new Node();
    
    private Node start = new Node();
    
    public void addFirst(int item) {
    	   Node n = new Node();
    	   n.value = item;
    	   n.next = head;
    	   head = n; 
    	}
    
    public RandomList(int bound, int size) {
    	head.next = null;
    	head.value = (int)Math.floor(Math.random() * bound);
    	for(int i = 1; i < size; i++)
    	{
    		addFirst((int)Math.floor(Math.random() * bound));
    	}
    	start = head;
        //////////////////////
        // Insert code here //
        //////////////////////
    }
    
    public String toString() {
    	String res = new String();
    	while(head.next != null)
    	{
    		res += head.value;
    		res += "->";
    		head = head.next;
    	}
    	res += head.value;
    	head = start;
    	return res;
        //////////////////////
        // Insert code here //
        //////////////////////
    }
    
    public void removeAdjacentDuplicates() {
    	Node begin = start;
    	while(head.next != null)
    	{
    		while(head.next != null && head.next.value == begin.value)
    		{
    			head = head.next;
    		}
    		begin.next = head.next;
    		head = head.next;
    		begin = head;
    	}
    	head = start;
        //////////////////////
        // Insert code here //
        //////////////////////
    }
    
    public static void main(String[] args) {
        RandomList list = new RandomList(4,15);
        System.out.println("Random list:\n" + list + "\n");
        list.removeAdjacentDuplicates();
        System.out.println("List with adjacent duplicates removed:\n" + list);
    }

}

