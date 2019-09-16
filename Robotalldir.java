import java.util.Scanner;
public class Robotalldir {
    public static void main(String[] args) {
    
    int x=6;
    int y=5;
    String str1="3-2-SE";
    String str2="M R l L R M M r M";
    String ans=mvr(x,y,str1,str2);
    System.out.println("The result is:"+ans);
   }
   
   public static String mvr(int in1,int 
   in2, String in3, String in4)
   {
     
     
     int x=0;
     int y=0;
     x=in1;
     y=in2;
    int cx=0,cy=0;
    String ans="";
    String dir;
    int flag=0;
    String pos[]=in3.split("-");
    cx=Integer.valueOf(pos[0]);
    cy=Integer.valueOf(pos[1]);
    dir=pos[2];
    
    char arr[]=in4.toCharArray();
    
    for(int i=0;i<in4.length();i++)
    {
      char ch=arr[i];
      if(ch=='R')
        {
          if(dir.equals("N"))
             dir="E";
          else if(dir.equals("E"))
              dir="S";
          else if(dir.equals("S"))
            dir="W";
          else if(dir.equals("W"))
             dir="N";
          else if(dir.equals("SE"))
              dir="SW";
          else if(dir.equals("SW"))
            dir="NW";
          else if(dir.equals("NW"))
             dir="NE";
          else
             dir="SE";
      } 
     else if(ch=='L')
        {
        if(dir=="N")
             dir="W";
          else if(dir.equals("W"))
              dir="S";
          else if(dir.equals("S"))
            dir="E";
          else if(dir.equals("E"))
             dir="N";
          else if(dir.equals("SE"))
              dir="NE";
          else if(dir.equals("NE"))
            dir="NW";
          else if(dir.equals("NW"))
             dir="SW";
          else
             dir="SE";
          
      }
         else if(ch=='l')
        {
          if(dir.equals("N"))
             dir="NW";
          else if(dir.equals("NW"))
              dir="W";
          else if(dir.equals("W"))
            dir="SW";
          else if(dir.equals("SW"))
             dir="S";
          else if(dir.equals("S"))
              dir="SE";
          else if(dir.equals("SE"))
            dir="E";
          else if(dir.equals("E"))
             dir="NE";
          else
             dir="N";
        }
        else if(ch=='r')
        {
           if(dir.equals("N"))
             dir="NE";
          else if(dir.equals("NE"))
              dir="E";
          else if(dir.equals("E"))
            dir="SE";
          else if(dir.equals("SE"))
             dir="S";
          else if(dir.equals("S"))
              dir="SW";
          else if(dir.equals("SW"))
            dir="W";
          else if(dir.equals("W"))
             dir="NW";
          else
             dir="N";
          
      }
        else if(ch=='M' || ch=='m') 
         {
             int mm=1;
             
           /*  if(ch=='M')            // This set of code is for 2 movement..
                 mm=2;  */
             
          if(cx<=x && cy<=y && cx>=0 && cy>=0)
          {
            if(dir.equals("N"))
              cy+=mm;
            else if(dir.equals("E"))
              cx+=mm;
            else if(dir.equals("S"))
              cy-=mm;
            else if(dir.equals("W"))
              cx-=mm;
             else if(dir.equals("NW"))
              {
                cx-=mm;
                cy+=mm;
              }
               else if(dir.equals("SW"))
              {
                cx-=mm;
                cy-=mm;
              }
               else if(dir.equals("NE"))
             {
                cx+=mm;
                cy+=mm;
              }
              else
              {
                cx+=mm;
                cy-=mm;
              }
  
          }
           if(cx>x || cy>y || cx<0 || cy<0)
          {
            if(dir.equals("N"))
              cy-=mm;
            else if(dir.equals("E"))
              cx-=mm;
            else if(dir.equals("S"))
              cy+=mm;
            else if(dir.equals("W"))
              cx+=mm;
             else if(dir.equals("NW"))
              {
                cx+=mm;
                cy-=mm;
              }
               else if(dir.equals("SW"))
              {
                cx+=mm;
                cy+=mm;
              }
               else if(dir.equals("NE"))
              {
                cx-=mm;
                cy-=mm;
              }
              else
              {
                cx-=mm;
                cy+=mm;
              }
              
              flag=1;
          }
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
