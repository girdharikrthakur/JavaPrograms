class Laptop {
 int id = 1;
 String model;
 int dimesion;
 String color;

 @Override
 public String toString() {
  return "Laptop [id=" + id + ", model=" + model + ", dimesion=" + dimesion + ", color=" + color + "]";
 }

 public static int DELL1000(int count) {
  Laptop laptop = new Laptop();
  for (int i = 0; i < count; i++) {
   int no = laptop.id;
   laptop.id = i;
   laptop.model = "DELL1000" + no + "LAP";
   laptop.dimesion = 15;
   laptop.color = "Black";
   no++;

   System.out.println(laptop);
   laptop.id = no;

  }

  return laptop.id;

 }

}

public class Dell {

 public static void main(String[] args) {
  Laptop.DELL1000(10);

 }

}
