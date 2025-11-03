 import java.util.Scanner;
 
 public class SwitchConcept1
{
 public static void main(String[] args)
 {
  
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the character");
  String ch=sc.nextLine();
  switch(ch)
  {
   case "a":
  {
   System.out.println("this is vowel");
  }
   
    case "e":
  {
   System.out.println("this is vowel");
  }
  
   case "i":
  {
   System.out.println("this is vowel");
  }
  
   case "o":
  {
   System.out.println("this is vowel");
  }
  
   case "u":
  {
   System.out.println("this is vowel");
  }
  
  default :
  {
	  System.out.println("character entered is not vowel");
  }
  }
 }
}