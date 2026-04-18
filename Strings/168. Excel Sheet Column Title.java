class Solution{
  Public String convertToTile(int colNo)
  {
    StringBuilder sb = new StringBuilder();

    while(colNo > 0)
      {
          int rem = (colNo-1) % 26;
          sb.append((char)(rem+'A'));
          colNo = (colNo-1)/26;
      }
      return sb.reverse().toString();
  }
}
