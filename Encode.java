import java.util.*;
public class Encode
{
  
    
  static int [] encode(int arr[])
  {
    int l= arr.length;
    for(int i=l-2;i>=0;i--)
    {
      arr[i]=arr[i]-arr[i+1];
    }
    return arr;
  }

    public static void main(String[] args) {
   
int str[]={7,6,8,16,12,3};
 
  int ans[]=encode(str);
  System.out.println("First number in original array = "+ans[0]);
   int sum=0;
   for(int i : ans)
   {
     sum+=i;
   }
   System.out.println("Sum of all elements in original array = "+sum);
    
    }
}
