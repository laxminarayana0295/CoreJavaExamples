package NumberPrograms;

import java.util.Scanner;

public class reverseOfNumbers {

   public static int findReverse(int num) {

     
      int reverse = 0;

      while(num != 0) {
        
         reverse = (reverse*10) + (num % 10);

       
         num = num / 10;
      }

      return reverse;
   }

   public static void main(String[] args) {

     
      int number = 0;
      int result = 0;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();
 
      result = findReverse(number);
      System.out.print("The reverse of "+number+
              " is = "+ result);
   }
}