import java.util.Scanner;

public class Games
{
   public static boolean isWinningPosition(int n, Game g)
   {
      int[] positions = g.nextPositions(n);

      if (positions.length == 0) /* Your code goes here */   
      for (int i : positions)
      {
         /* Your code goes here */
      }
      /* Your code goes here */
   }

   public static boolean isLosingPosition(int n, Game g)
   {
      int[] positions = g.nextPositions(n);
      if (positions.length == 0) /* Your code goes here */  
      for (int i : g.nextPositions(n))
      {
         /* Your code goes here */
      }
      /* Your code goes here */

   }
   
   public static void main (String [] args)
   {
      Scanner in = new Scanner(System.in);
      String gameType = in.nextLine();
      String positionType = in.nextLine();
      int n = in.nextInt();
      if (gameType.equals("NimGame"))
      {
         if(positionType.equals("isWinningPosition"))
         {
            System.out.println(isWinningPosition(n, new NimGame()));
         }
         else // isLosingPosition
         {
            System.out.println(isLosingPosition(n, new NimGame()));
         }
      }
      else //TwoThreeGame
      {
         if(positionType.equals("isWinningPosition")) // isWinningPosition
         {
            System.out.println(isWinningPosition(n, new TwoThreeGame()));
         }
         else // isLosingPosition
         {
            System.out.println(isLosingPosition(n, new TwoThreeGame()));
         }
      }
   }
}