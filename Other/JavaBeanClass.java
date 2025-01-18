class Product {

 private int productId;
 private String productName;
 private int productPrice;

 public int getProductId() {
  return productId;
 }

 public void setProductId(int productId) {
  this.productId = productId;
 }

 public String getProductName() {
  return productName;
 }

 public void setProductName(String productName) {
  this.productName = productName;
 }

 public int getProductPrice() {
  return productPrice;
 }

 public void setProductPrice(int productPrice) {
  this.productPrice = productPrice;
 }

}

public class JavaBeanClass {

 public static void main(String[] args) {
  Product product = new Product();
  product.setProductId(1);
  product.setProductName("Product1");
  product.setProductPrice(100);

  System.out.println("Product Name: " + product.getProductName());
  System.out.println("Product ID: " + product.getProductId());
  System.out.println("Product Price: " + product.getProductPrice());
 }
}
