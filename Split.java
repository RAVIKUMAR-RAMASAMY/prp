import java.util.Scanner;
public class Split{
      
      static Scanner sc= new Scanner(System.in);
      static String str1=sc.next();
      static String str2=sc.next();
      static String str3=sc.next();
      static String x1,x2,x3;
    static String f1,f2,f3,m1,m2,m3,l1,l2,l3;
    static void splitstr(String str)
    {
      int len=str.length();
      
      int ch=len%3;
      int sp=len/3;
      switch(ch)
      {
        case 0:
          x1=str.substring(0,sp);
          x2=str.substring(sp,(2*sp));
          x3=str.substring(2*(sp),(len));
          break;
        case 1:
          x1=str.substring(0,sp);
          x2=str.substring(sp,(2*sp)+1);
          x3=str.substring(2*(sp)+1,(len));
          
          break;
        case 2:
           x1=str.substring(0,sp+1);
          x2=str.substring(sp+1,(2*sp)+1);
          x3=str.substring((2*sp)+1,(len));
          break;
      }
      if(str==str1)
      {
        f1=x1;
        m1=x2;
        l1=x3;
      }
      else if(str==str2)
      {
        f2=x1;
        m2=x2;
        l2=x3;
      }
      else
      {
        f3=x1;
        m3=x2;
        l3=x3;
      }
    }
    public static void main(String[] args) {
      
    
      splitstr(str1);
      splitstr(str2);
      splitstr(str3);
      String str4=l1+f2+m3;
      char strarr[]=str4.toCharArray();
      for(int i=0;i<str4.length();i++)
      {
          if(Character.isUpperCase(strarr[i]))
               strarr[i]=Character.toLowerCase(strarr[i]);
          else
          strarr[i]=Character.toUpperCase(strarr[i]);
          
      }
      str4=String.valueOf(strarr);
      System.out.println(f1+m2+l3);
      System.out.println(m1+l2+f3);
      System.out.println(str4);
    }
}
