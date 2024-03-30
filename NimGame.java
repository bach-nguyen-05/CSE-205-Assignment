public class NimGame implements Game
{
   public int[] nextPositions(int n)
   {
      int[] result = new int[n / 2];
      for (int i = 0; i < result.length; i++)
         result[i] = n - i - 1;
      return result;
   }
}