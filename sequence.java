import java.util.*;
public class sequence {
    public static void main(String[] args) {

      int ip1=4,ip2=1,ip3=5,ans=0,l=1,u=0;
      ip2=ip2-ip3;
      for(int i=0;i<ip1;i++)
      {
        ans+=(ip2*u)+((ip2+ip3)*l);
        ip2=ip2+ip3;
        l++;
        u++; 
      }
    }
}
