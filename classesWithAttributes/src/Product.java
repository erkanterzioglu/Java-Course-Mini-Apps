public class Product {
    public Product(int id,String name,String description,double price,int stockAmount,String color) {
        System.out.println("Yapıcı blok çalıştı");

    }

  private int _id;
   private  String _name;
  private   String _description;
  private   double _price;
   private  int _stockAmount;

   private int _code;


 private    String _color;



    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public int get_code() {
        return _code;
    }

    public void set_code(int _code) {
        this._code = _code;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }
}
// notice-> private method is only defined own library!
// notice -> static method can be called from anywhere
//this method meaning is represent own class