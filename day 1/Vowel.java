import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Vowel
{
 public static void main(String[] args) throws Exception {
 
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 
 System.out.println("enter the character");
 
 char ch = br.readLine().charAt(0);
 
 if(ch=='a')
 {
  System.out.println(" the character is vowel");
 }
 
 else if(ch=='e')
 {
  System.out.println("the character is vowel");
 }
 
 else if(ch=='i')
 {
  System.out.println("the character is vowel");
 }
 
 else if(ch=='o')
 {
 System.out.println("the character vowel");
 }
 
 else if(ch=='u')
 {
  System.out.println("the character vowel");
 }
 
 else
 {
 System.out.println("the character is not vowel");
  
 }
 
}
}
