import java.util.Scanner;

public class WhileConcept2
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the  range : ");
  int a=sc.nextInt();
  sc.nextLine();
  int i=1;
  
  System.out.println("even numbers are printed as ");
  
  while(i<=a)
  {
   
  System.out.println(i);
  i++;
   
  }
  
  
 }
}