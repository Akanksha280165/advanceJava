import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RuntimeInput
{
  static public void main(String[] args) throws Exception
 {
  InputStreamReader  isr= new InputStreamReader(System.in);
  BufferedReader  br= new BufferedReader(isr);
  
  System.out.println("enter the number");
  int num =Integer.parseInt(br.readLine());
  
  if(num%2==0)
  {
  System.out.println(" the number is even");
  
  }
  
  else
  {
  System.out.println("the number is odd");
	  
  }
  
  
 }
}
