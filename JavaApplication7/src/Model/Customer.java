
package Model;


public class Customer {
    public String name;
    public double id; // value between 9 to 12 

    public Customer(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(double id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Customer " + name + "\n  ID " + id;
    }


   
}
