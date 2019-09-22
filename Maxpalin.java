import java.util.*; 

public class Maxpalin {
  static int arr[]=new int[500];
  static int ans=0;
    public static void main(String[] args) {
  Dictionary geek = new Hashtable(); 

String str1="asdfghjkla";
str1=str1.toLowerCase();
char string[]=str1.toCharArray();

for(int i=0;i<str1.length();i++)
{
  
  if(geek.get(string[i])==null)
{
  geek.put(string[i],1); 
} 
else
{
  geek.put(string[i],(int)geek.get(string[i])+1); 
}
}

 for (Enumeration i = geek.elements(); i.hasMoreElements();) 
        { 
          int x=(int)(i.nextElement());
            if( x>=2)
            {
               ans=ans+((x/2)*2);
            }
        } 
        if(ans<str1.length() && ans!=0)
        {
         ans+=1;
        }
        else if(ans==0)
        {
          ans=-1;
        }
      
System.out.println(ans);
    }
}
