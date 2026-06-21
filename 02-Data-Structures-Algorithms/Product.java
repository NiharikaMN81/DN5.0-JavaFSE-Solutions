public class Product {
    int productId;
    String productName;
    String productCategory;
    public Product(int productId, String productName, String productCategory){
        this.productId=productId;
        this.productName=productName;
        this.productCategory=productCategory;
    }
    public String toString(){
        return "Product {ID: " + productId +
           ", Name: " + productName +
           ", Category: " + productCategory + "}";
    }
}
