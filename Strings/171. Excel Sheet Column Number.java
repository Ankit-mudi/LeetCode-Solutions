
public class Solution()
{
    public int TitleToNumber(String col)
      {
          int sum = 0, p = 0;

          for(int i=col.length()-1; i>=0; i--)
            {
                int tmp = col.charAt(i) - 64;
                sum = sum + (int)Math.pow(26, p++) * tmp;
            }
            return sum;
      }
}
