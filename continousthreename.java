import java.util.*;
public class continousthreename {
    public static void main(String[] args) {
       int n=3;
       String strarr[]={"aa","bb","cc"};
       int intarr[]={7,8,9};
       String ans="";
        int st=-1;
       Dictionary dic=new Hashtable();
       for(int i=0;i<n;i++)
       {
         dic.put(intarr[i],strarr[i]);
       }
       
       Arrays.sort(intarr);
      
       for(int i=0;i<intarr.length-2;i++)
       {
         if(intarr[i]+1==intarr[i+1]&&intarr[i]+2==intarr[i+2])
         {
              st=i;
              break;
         }
       }
       
       if(st==-1)
       {
         ans="NONE";
       }
       else
       {
         st=st+2;
         
           ans+=(String)dic.get(intarr[st--])+":"+(String)dic.get(intarr[st--])+":"+(String)dic.get(intarr[st--]);
         }
         
       }
       
    }
