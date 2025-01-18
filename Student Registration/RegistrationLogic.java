
// Class to handle registration logic

import java.util.Scanner;

public class RegistrationLogic {

  static Scanner scn = new Scanner(System.in);

  // Method to register a student
  public StudentReg StudentRegistration() {

    // Display registration options
    System.out.println("Student Registration");
    System.out.println("Enter 1 for registration using Phone and \nEnter 2 for registration using Email");
    int option = Integer.parseInt(scn.nextLine().trim());

    StudentReg studentReg = new StudentReg();

    // Handle registration based on user choice
    switch (option) {
      case 1: // Registration using phone
        System.out.println("Enter Phone no:");
        studentReg.setPhoneno(scn.nextLine(), scn);

        System.out.println("Enter Name:");
        studentReg.setName(scn.nextLine());

        System.out.println("Enter Email:");
        studentReg.setEmail(scn.nextLine(), scn);

        System.out.println("Enter Course from the list:");
        System.out.println("JAVA, PYTHON, JAVASCRIPT, SQL, C, HTML_CSS");
        studentReg.setCourse(scn.nextLine().toUpperCase());

        System.out.println("Enter Branch from the List:");
        System.out.println("BE, BTech, BCA, MCA, CS");
        studentReg.setBranch(scn.nextLine().toUpperCase());

        System.out.println("Enter Passing Year:");
        studentReg.setPassingYear(scn.nextLine(), scn);

        break;

      case 2: // Registration using email
        System.out.println("Enter Email:");
        studentReg.setEmail(scn.nextLine(), scn);

        System.out.println("Enter Name:");
        studentReg.setName(scn.nextLine());

        System.out.println("Enter Phone no:");
        studentReg.setPhoneno(scn.nextLine(), scn);

        System.out.println("Enter Course from the list:");
        System.out.println("JAVA, PYTHON, JAVASCRIPT, SQL, C, HTML_CSS");
        studentReg.setCourse(scn.nextLine().toUpperCase());

        System.out.println("Enter Branch from the List:");
        System.out.println("BE, BTech, BCA, MCA, CS");
        studentReg.setBranch(scn.nextLine().toUpperCase());

        System.out.println("Enter Passing Year:");
        studentReg.setPassingYear(scn.nextLine(), scn);

        break;

      default: // Handle invalid input
        System.out.println("Entered Wrong Option");
        break;
    }

    scn.close(); // Close the scanner
    return studentReg;
  }

}