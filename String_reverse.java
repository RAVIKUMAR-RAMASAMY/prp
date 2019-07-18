import java.io.*;
import java.util.*;
public class String_reverse {
  
    static String rever(String str,int n)
    {
      
      String rev="";
      char strarr[]=str.toCharArray();
      
     
      String words[]=str.split(" ");
      for(String w:words)
      {
        StringBuilder sb = new StringBuilder(w);
        sb.reverse();
        rev+=sb.toString()+" ";
      }
      rev=rev.trim();
     char revarr[]=rev.toCharArray();
      switch(n)
      {
        case 0:
          return rev;
        case 1:
         
            char revarr1[]=rev.toCharArray();
            for(int i=0;i<rev.length();i++)
            {
              if(Character.isLowerCase(strarr[i]))
              {
                revarr1[i]=Character.toLowerCase(revarr1[i]);
              }
               else if(Character.isUpperCase(strarr[i]))
              {
                revarr1[i]=Character.toUpperCase(revarr1[i]);
              }
            }
           return String.valueOf(revarr1);
          
        case 2:
          
          for(int i=0;i<rev.length();i++)
          {
            if(Character.isLowerCase(revarr[i]))
            {
              revarr[i]=Character.toUpperCase(revarr[i]);
            }
            else
             {
               revarr[i]=Character.toLowerCase(revarr[i]);
             }
                
          }
          return String.valueOf(revarr);
         
              
      }
      
      return str;
      
    }
  
    public static void main(String[] args) {
      String str1;
      
    Scanner sc = new Scanner(System.in);
str1=sc.nextLine();
int n= sc.nextInt();

       System.out.println(rever(str1,n));

sc.close();
  }
}
       
  
