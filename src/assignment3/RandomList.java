import java.util.Random;

public class RandomList {
    
    private class Node {
        int value;
        Node next;
    }
    
    private Node head;
    
    public RandomList(int bound, int size) {
     
        //////////////////////
        // Insert code here //
        //////////////////////
    }
    
    public String toString() {
     
        //////////////////////
        // Insert code here //
        //////////////////////
    }
    
    public void removeAdjacentDuplicates() {
     
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

