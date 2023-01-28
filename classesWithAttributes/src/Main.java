public class Main {
    public static void main(String[] args) {
      Product product=new Product(1,"Leptop","Asus",3000,2,"Siyah");


/*     product.set_name("Leptop");
      product.set_id(3);
      product.set_description("Asus Leptop");
      product.set_price(5000);
      product.set_stockAmount(3);
      product.set_color("Purple");
      product.set_code(3154);
      ProductManager productManager=new ProductManager();
      productManager.Add(product);*/

      productManager.Add2(1,"","",2,200,"White");

      System.out.println(product.get_code());
        System.out.println(product.get_id());
    }
}