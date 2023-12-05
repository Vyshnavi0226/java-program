
import java.util.Scanner;
public class InputOutput
{
   public static void main(Sting args[])
   {
      System.out.print("Enter a number = ");
      Scanner reader = new Scanner (System.in); //Object creation, reader is an object
      int num = reader.nextInt();
      System.out.print("\nEntered values lis = " + num);
   }
}