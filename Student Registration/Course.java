// Enum for predefined courses
public enum Course {
 JAVA, PYTHON, JAVASCRIPT, SQL, C, HTML_CSS;

 // Method to check if a course is valid
 public static boolean isValidCourse(String course) {
  for (Course c : Course.values()) {
   if (c.name().equalsIgnoreCase(course)) {
    return true;
   }
  }
  return false;
 }
}