import java.util.Scanner;
public class Robot {
    public static void main(String[] args) {
    
    int x=3;
    int y=4;
    String str1="2-2-E";
    String str2="R M L M L M R M";
    String ans=mvr(x,y,str1,str2);
    System.out.println("The result is:"+ans);
   }
   
   public static String mvr(int in1,int in2, String in3, String in4)
   {
     
     
     int x=0;
     int y=0;
     x=in1;
     y=in2;
    int cx=0,cy=0;
    String ans="";
    char dir;
    int flag=0;
    String pos[]=in3.split("-");
    cx=Integer.valueOf(pos[0]);
    cy=Integer.valueOf(pos[1]);
    dir=pos[2].charAt(0);
    
    char arr[]=in4.toCharArray();
    
    for(int i=0;i<in4.length();i++)
    {
      char ch=arr[i];
      switch(ch)
      {
        case 'R':
          if(dir=='N')
             dir='E';
          else if(dir=='E')
              dir='S';
          else if(dir=='S')
            dir='W';
          else
             dir='N';
          
          break;
        
        case 'L':
          if(dir=='N')
             dir='W';
          else if(dir=='W')
              dir='S';
          else if(dir=='S')
            dir='E';
          else
             dir='N';
          
          break;
        
        case 'M':  
         
          if(cx<=x && cy<=y && cx>=0 && cy>=0)
          {
            if(dir=='N')
              cy++;
            else if(dir=='E')
              cx++;
            else if(dir=='S')
              cy--;
            else
              cx--;
  
          }
           if(cx>x || cy>y || cx<0 || cy<0)
          {
            if(dir=='N')
              cy--;
            else if(dir=='E')
              cx--;
            else if(dir=='S')
              cy++;
            else
              cx++;
              
              flag=1;
          }
          break;
      }
      if(flag==1)
      {
        break;
      }
    }
    ans+=String.valueOf(cx)+"-"+String.valueOf(cy)+"-"+dir;
    
    if(flag==1)
    {
      ans+="-ER";
    }
    return ans;
   }
}
