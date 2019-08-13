import java.util.Scanner;
import java.lang.*;
public class subtract{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
int inp=sc.nextInt();
int sub=0;
int sum=0;
int inp=0;
while(inp1!=0)
{
  inp=inp*10+(inp1%10);
  inp1/=10;
}

int x=inp;

while(inp>99)
{
  sub=0;
  sum=0;
  x=inp;
  while(x>9)
  {  
      int a=x%10;
     x/=10;
     int b=x%10;
     sub=Math.abs(a-b);
    sum=(sum*10)+sub;
   
  }
  inp=sum;
}
int ans=0;
while(sum!=0)
{
  ans=ans*10+(sum%10);
  sum/=10;
}

System.out.println(ans);
}
}
