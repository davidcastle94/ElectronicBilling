package Model;

public class Product {
    public String description; 
    public short code;
    public double price;
    

    public Product(String description,short code, double price) {
        this.description = description;
        this.code = code;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getCode() {
        return code;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCode(short code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product \n" + "description=" + description + "  code = " + code + ", price = " + price;
    }
   
}
