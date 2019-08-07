import java.util.Scanner;
public class stable {
  
    static boolean isstable(int x)
    {
      int occr[]=new int[10];
      int a=x;
      int m;
      if(x==0)
      return true;
      while(x!=0)
      {
        occr[x%10]+=1;
        x/=10;
      }
      m=occr[a%10];
      a=a/10;
      while(a!=0)
      {
        if(occr[a%10]!=m)
         return false;
        
        a/=10;
      }
      return true;
      
    }
    public static void main(String[] args) {
      int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the five numbers:");
      for(int j=0;j<5;j++)
{
        arr[j]=sc.nextInt();
}
      int ssum=0,usum=0;
      for(int i=0;i<5;i++)
      {
        if(isstable(arr[i]))
        {
          ssum+=arr[i];
        }
        else
        usum+=arr[i];
      }
    int ans=ssum-usum;
    System.out.println("The result is: "+ans);
    }
}
