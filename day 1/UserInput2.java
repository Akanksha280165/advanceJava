import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UserInput2
{
 public static void main(String[] args) throws Exception
 {
   long result=0;
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   
   System.out.println("enter the  first number");
   long num1=Long.parseLong(br.readLine());
   
   System.out.println("enter the  second number");
   long num2=Long.parseLong(br.readLine());
   
   System.out.println("enter the  operation");
   String string=br.readLine();
   
   if(string.equals("add"))
   {
    result=num1+num2;
	System.out.println("the result is "+result);
   }
   
  else if(string.equals("subtract"))
   {
    result=num1-num2;
	System.out.println("the result is "+result);
	
   }
   
    else if(string.equals("multiply"))
   {
    result=num1*num2;
	System.out.println("the result is "+result);
	
   }
   
    else 
   {
    result=num1/num2;
	System.out.println("the result is "+result);
	
   }
   
   
 }
}
