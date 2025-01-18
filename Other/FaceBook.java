class Facebook01 {

 void msg() {
  System.out.println("Implemented Msg");
 }

 void Details() {
  msg();
 }

}

class Facebook02 {

 void msg() {
  System.out.println("Implemented Msg in V1");
 }

 void call() {
  System.out.println("Implemented Call in This Version");
 }

 void Details() {
  msg();
  call();
 }

}

class Facebook03 {

 void msg() {
  System.out.println("Implemented Msg in v1");
 }

 void call() {
  System.out.println("Implemented Call in v2");
 }

 void story() {
  System.out.println("Implemented Story in This Version");
 }

 void Details() {
  msg();
  call();
  story();
 }

}

public class FaceBook {
 public static void main(String[] args) {

  Facebook01 f1 = new Facebook01();
  Facebook02 f2 = new Facebook02();
  Facebook03 f3 = new Facebook03();

  f1.Details();
  System.out.println("==================");
  f2.Details();
  System.out.println("==================");
  f3.Details();

 }
}
