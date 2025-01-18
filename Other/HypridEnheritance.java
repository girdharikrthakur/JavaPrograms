class Person {
 String name;
 int age;

 @Override
 public String toString() {
  return "Person [name=" + name + ", age=" + age + "]";
 }

}

class Boy extends Person {

 @Override
 public String toString() {
  return "Boy [name=" + name + "Age= " + age + "]";
 }

}

class Student extends Person {
 String gender;
 int grade;

 @Override
 public String toString() {
  return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", grade=" + grade + "]";
 }

}

public class HypridEnheritance {
 public static void main(String[] args) {

  Student student = new Student();

  student.name = "Hound";
  student.age = 24;
  student.gender = "Male";
  student.grade = 10;

  System.out.println(student);

 }
}
