public class TwoThreeGame implements Game
{
   public int[] nextPositions(int n)
   {
      if (n >= 4) return new int[] { n - 3, n - 2 };
      else return new int[] {};
   }
}