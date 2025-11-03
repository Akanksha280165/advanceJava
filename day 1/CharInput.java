import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CharInput
{
 public  static void main(String[] args)throws Exception
 {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  
  System.out.println("enter the character");
  char ch=br.readLine().charAt(0);
  
  System.out.println(" the character entered is "+ch);
  
 }
}

