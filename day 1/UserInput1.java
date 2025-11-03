import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UserInput1
{
 public static void main(String[] args) throws Exception
 {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
   
  System.out.println("enter the number");
  double num =Double.parseDouble(br.readLine());  
  System.out.println("the number entered is "+ num);
  
 }
}