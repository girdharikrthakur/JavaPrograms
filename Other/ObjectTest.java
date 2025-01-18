import java.util.Scanner;

class Logic {

 public static void evenTest() {
  Scanner scn = new Scanner(System.in);
  System.out.println("Enter a Even Number \nOr Enter --\"0\"-- to exit");
  String inputString = scn.nextLine().trim();
  int i = Integer.parseInt(inputString);

  while (i % 2 != 0) {
   System.out.println("Enter a Even Number \nOr Enter  --\"0\"-- to exit");
   String input = scn.nextLine().trim();
   i = Integer.parseInt(input);
   if (i == 0)
    break;
   System.out.println("Now its a even Number: " + i);
  }
  scn.close();

 }
}

public class ObjectTest {

 public static void main(String[] args) {

  // Static Method Call
  Logic.evenTest();
 }

}
