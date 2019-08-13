import java.util.Scanner;
public class Wordrev{
  
  
  static String rev(String s)
  {
    int l=s.length();
    String ans="";
    int split1=l/2;
    if(l%2==0)
    {
      String r=s.substring(0,split1);
      for(int i=split1-1;i>=0;i--)
      {
        ans=ans+r.charAt(i);
      }
      ans=ans+(s.substring(split1,l));
    }
    else if(l>1)
    {
      String r=s.substring(0,split1+1);
      for(int i=split1;i>=0;i--)
      {
        ans=ans+r.charAt(i);
      }
      ans=ans+(s.substring(split1,l));
    }
    else
    {
      ans=s;
    }
    return ans;
  }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
String instr=sc.nextLine();
//String instr="Today is a nice day";
//int inp=43;
int inp=sc.nextInt();
int b=inp%10;
int a=inp/10;

String words[]=instr.split(" "); 
System.out.println(rev(words[a-1])+" "+rev(words[b-1]));

}
}
