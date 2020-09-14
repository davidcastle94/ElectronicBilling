package Model;


import java.util.ArrayList;

public class Bill {
    public double number_bill;
    public Customer client;
    public ArrayList<Product> product = new ArrayList<>();

    public Bill(double number_bill, Customer client) {
        this.number_bill = number_bill;
        this.client = client;
    }
    
    public void addProdutBill(Product p){
        if(product.isEmpty()){
             product.add(p);
        }
        else{
            
        }
    }
    
    public boolean remoteProductBill(Product p){
        if(product.contains(p)){
            product.remove(p);
        return true;
        }
        return false;
    }
    
    
    public double getNumber_bill() {
        return number_bill;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }
    
    
    
    
    
    
    
}

