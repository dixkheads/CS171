/*  This class represents a Playlist of podcast episodes, where each
/*  episode is implemented as an object of type Episode. A user navigating
/*  a Playlist should be able to move between songs using Next or Previous.
/*
/*  To enable flexible navigation, the Playlist is implemented as
/*  a Circular Doubly Linked List where each episode has a link to both
/*  the next and the prev episodes in the list.
/*
/*  Additionally, the last Episode is linked to the head of the list (via next),
/*  and the head of the list is linked to that last Episode (via prev). That said,
/*  there is NO special "last" reference keeping track of the last Episode.
/*  But there is a "head" reference that should always refer to the first Episode.
*/
public class Playlist
{
   private Episode head;
   private int size;

   public Playlist(){
      head = null;
      size = 0;
   }

   public boolean isEmpty()
   { return head == null; }

   // Ensure that "size" is updated properly in other methods, to
   // always reflect the correct number of episodes in the current playlist
   public int getSize()
   { return this.size; }

   // Displays the Episodes starting from the head and moving forward
   // Example code and its expected output:
   /*   Playlist pl = new Playlist();
   /*   pl.addLast("PlanetMoney",26.0);
   /*   pl.addLast("TodayExplained",10);
   /*   pl.addLast("RadioLab",25.5);
   /*   pl.displayPlaylistForward();
   /* [BEGIN] (PlanetMoney|26.0MIN) -> (TodayExplained|10.0MIN) -> (RadioLab|25.5MIN) [END]
   */
   public void displayPlaylistForward()
   {
     String output = "[BEGIN] ";
     Episode current = head;
     if( current != null ){
       while( current.next != head ){
         output += current + " -> ";
         current = current.next;
       }
       output += current + " [END]\n";
     }
     else{
       output += " [END]\n";
     }
     System.out.println(output);
   }

   // Displays the Episodes starting from the end and moving backwards
   // Example code and its expected output:
   /*   Playlist pl = new Playlist();
   /*   pl.addLast("PlanetMoney",26.0);
   /*   pl.addLast("HowIBuiltThis",10);
   /*   pl.addLast("RadioLab",25.5);
   /*   pl.displayPlaylistForward();
   /* [END] (RadioLab|25.5MIN) -> (HowIBuiltThis|10.0MIN) -> (PlanetMoney|26.0MIN) [BEGIN]
   */
   public void displayPlaylistBackward()
   {
     // .. TODO .. //
   }

   // Add a new Episode at the beginning of the Playlist
   public void addFirst( String title, double length )
   {
     // .. TODO .. //
   }

   // Add a new Episode at the end of the Playlist
   public void addLast( String title, double length )
   {
   // .. TODO .. //
   }

   // Add a new Episode at the given index, assuming that index
   // zero corresponds to the first node
   public void add( String title, double length, int index )
   {
   // .. TODO .. //
   }

   // Delete the first Episode in the Playlist
   public Episode deleteFirst()
   {
     // .. TODO .. //
   }

   // Delete the last Episode in the Playlist
   // (There is no special "last" variable in this Playlist;
   // think of alternative ways to find that last Episode)
   public Episode deleteLast()
   {
     // .. TODO .. //
   }
   // Remove (delete) the Episode that has the given "title"
   // You can assume there will be no duplicate titles in any Playlist
   public Episode deleteEpisode(String title)
   {
     // .. TODO .. //
   }

   // Remove (delete) every m-th Episode in the user's circular Playlist,
   // until only one Episode survives. Return the survived Episode.
   public Episode deleteEveryMthEpisode(int m)
   {
     // .. TODO .. //
     return null;
   }

} // End of Playlist class
