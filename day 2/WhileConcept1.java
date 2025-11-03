import java.util.Scanner;

public class WhileConcept1
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number for Max range  ");
  int a=sc.nextInt();
  int i=1;
  
  System.out.println("the number from 1 to "+ a +"  is");
  
  while(i<=a)
  {
   
  System.out.println(i);
  i++;
   
  }
  
  
 }
}