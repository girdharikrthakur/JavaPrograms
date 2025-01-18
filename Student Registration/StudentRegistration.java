// Main class
public class StudentRegistration {
  public static void main(String[] args) {
    
    // Create an instance of RegistrationLogic
    RegistrationLogic registrationLogic = new RegistrationLogic();

    // Register a student and display the details
    StudentReg registeredStudent = registrationLogic.StudentRegistration();
    System.out.println("Registered Student Details:\n" + registeredStudent);
  }
}
