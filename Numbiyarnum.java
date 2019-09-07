public class Numbiyarnum {
    public static void main(String[] args) {

    String str1="987453291013";
     System.out.println(nnGenerator(str1));
    }
    static int nnGenerator(String str1)
    {
      String arr[]=str1.split("");
      String ans="";
      int y=0;
      int i=0;
      int x=0;
      while(i<arr.length)
      {
        x=Integer.valueOf(arr[i]);
        if(x%2==0)
        {
         y=x; 
          while(y%2==0 && i<arr.length-1)
          {
            i++;
            x=Integer.valueOf(arr[i]);
            y+=x;
          }
          ans+=String.valueOf(y);
          i++;
        }
        else
        {
          y=x;
          while(y%2!=0 && i<arr.length-1)
          {
            i++;
            x=Integer.valueOf(arr[i]);
            y+=x;
          }
          ans+=String.valueOf(y);
          i++;
        }
      }
      return Integer.valueOf(ans);
    }
}
