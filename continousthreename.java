import java.util.*;
public class continousthreename {
    public static void main(String[] args) {
       int n=2;
       String strarr[]={"aa","bb"};
       int intarr[]={9,89};
       Dictionary dic=new Hashtable();
       for(int i=0;i<n;i++)
       {
         dic.put(intarr[i],strarr[i]);
       }
       String ans="";
       Arrays.sort(intarr);
       int st=-1;
      int  count=1;
       for(int i=0;i<intarr.length-1;i++)
       {
         if(intarr[i]+1==intarr[i+1])
         {
           if(st==-1)
              st=i;
              
           count++;
           if(count==3)
           {
             break;
           }
         }
           else
           {
             st=-1;
             count=1;
           }
         
       }
       
       if(st==-1)
       {
         ans="NONE";
       }
       else
       {
         for(int i=st+2;i>=st;i--)
         {
           String str1=(String)dic.get(intarr[i]);
           ans+=str1+":";
         }
         ans=ans.substring(0,ans.length()-1);
       }
       
    }
}
