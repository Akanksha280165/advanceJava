import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput
{
 public static void main(String[] args) throws Exception
 {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader   br = new BufferedReader(isr);
   
   System.out.println("enter the number");
   int num=Integer.parseInt(br.readLine());
   
   System.out.println("the number entered is "+ num );
   
   
 }
}
