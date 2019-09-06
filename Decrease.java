import java.util.Scanner;
public class Decrease {
    public static void main(String[] args) {
  
  //int arr[]={2,8,3,9,7,6,4,5,3,1,0,2};
     Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine();
     String[] val = str1.split(" ");
     int[] arr = new int[val.length];
     for (int j = 0; j < val.length; ++j){
          arr[j] = Integer.parseInt(val[j]);
     }
    int count1=0;
    int flag=0,flag1=0,s=0,e=0,s1=0,e1=0;
    int count2=0;
    int ans3=0;
    int i=0,sum=0;
   
      for(i=1;i<arr.length;i++)
      {
        if(arr[i-1]>arr[i])
        {
         flag=1;
         count2++;
        }
        else
        {
          e=i-1;
          s=e-count2;
          count2++;
          flag1=1;  
        }
        if(i==arr.length-1 && count2!=0 && flag1!=1)
        {
            e=i;
          s=e-count2;
          count2++;
          flag1=1; 
        }
      if(flag1==1)
      {
        flag1=0;

       if(count2>ans3)
        {
          s1=s;
          e1=e;
          ans3=count2;
        }
        count2=0;
        
      if(flag==1)
      {
       count1++;
       flag=0;
      }
    }
    }
    
    if(count1>0)
    {
    System.out.println("Total decreasing orders:"+count1);
        
    System.out.println("Max length:"+ans3);
        
    System.out.println("The elements:");
    for(i=s1;i<=e1;i++)
    {
      sum+=arr[i];
       System.out.print(arr[i]+"  ");
    }
    
 System.out.println("");
    
     
       System.out.println("Sum of the elements:"+sum);
    }
    else
    System.out.println("No decreasing elements");
    }
}
