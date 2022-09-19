import java.util.Scanner;

public class Fahrenheit {

 public static void main(String[]args) {
  
  Scanner input =new Scanner (System.in);
  
  
   System.out.println("********************************************");
  System.out.print("Enter temperature in Centigrade: ");
 int tempcel =input.nextInt();
   System.out.println("********************************************");
 int tempfar = ((tempcel*9)/5)+32;

    System.out.println("Temperature in Fahrenheit is: "+tempfar);
   }
  }