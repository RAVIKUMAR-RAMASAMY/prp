import java.util.*;
public class Wordcount
{
   static Scanner sc=new Scanner(System.in);
    
  static int strcount(String s)
  {
    int count=0,x,ans=0,a;
    String Words[]=s.split(" ");
    for(String ch:Words)
    {
        x=ch.length();
        a=x;
        while(a>9)
        {
          x=a;
          count=0;
        while(x!=0)
        {
            count=count+(x%10);
            x=x/10;
        }
        a=count;
        }
        ans=ans*10+a;
    }
    
    return (ans);
  }

    public static void main(String[] args) {
   String str=sc.nextLine();
 
  int y=strcount(str);
    System.out.println(y);
    }
}
