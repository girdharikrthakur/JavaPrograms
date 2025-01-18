// Class to handle student registration data

import java.util.Scanner;

public class StudentReg {
  String name;
  String phoneno;
  String email;
  String course;
  String branch;
  String passingYear;

  // toString method to format the Student details

  public String toString() {
    return "StudentReg: \n name= " + name + "\n phoneno= " + phoneno + "\n email= " + email + "\n course= " + course
        + "\n branch= " + branch + "\n passingYear= " + passingYear + "";
  }

  // Getter and setter for 'name'
  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name != null && !name.trim().isEmpty()) {
      this.name = name;
    } else {
      System.out.println("Name cannot be null or empty.");
    }
  }

  // Getter and setter for 'phoneno' with input validation
  public String getPhoneno() {
    return phoneno;
  }

  public void setPhoneno(String phoneno, Scanner scn) {
    // Loop until a valid 10-digit phone number is entered
    while (phoneno == null || !phoneno.matches("\\d{10}")) {
      System.out.println("Invalid Phone Number! It must be a 10-digit number.");
      System.out.println("Enter Phone no again:");
      phoneno = scn.nextLine();
    }
    this.phoneno = phoneno;
  }

  // Getter and setter for 'email' with input validation
  public String getEmail() {
    return email;
  }

  public void setEmail(String email, Scanner scn) {
    // Loop until a valid email address is entered
    while (email == null || !email.contains("@")) {
      System.out.println("Invalid email address. Please enter a valid email:");
      System.out.println("Enter Email Again:");
      email = scn.nextLine();
    }
    this.email = email;
  }

  // Getter and setter for 'course' with validation using the Course enum
  public String getCourse() {
    return course;
  }

  public void setCourse(String inputCourse) {
    if (Course.isValidCourse(inputCourse)) {
      this.course = inputCourse;
    } else {
      System.out.println(inputCourse + " is not a valid course.");
    }
  }

  // Getter and setter for 'branch' with validation using the Branch enum
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    if (Branch.isValidBranch(branch)) {
      this.branch = branch;
    } else {
      System.out.println(branch + " is not a valid branch.");
    }
  }

  // Getter and setter for 'passingYear' with input validation
  public String getPassingYear() {
    return passingYear;
  }

  public void setPassingYear(String passingYear, Scanner scn) {
    // Loop until a valid 4-digit year is entered
    while (passingYear == null || passingYear.length() != 4 || !passingYear.matches("\\d{4}")) {
      System.out.println("Invalid Passing Year! It must be a 4-digit year.");
      System.out.println("Enter Passing Year Again:");
      passingYear = scn.nextLine();
    }
    this.passingYear = passingYear;
  }
}
