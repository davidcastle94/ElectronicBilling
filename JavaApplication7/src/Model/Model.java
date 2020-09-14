
package Model;

import java.util.ArrayList;

public class Model {

   public ArrayList<Product> listProduct = new ArrayList<>();
   public ArrayList<Bill> bills = new ArrayList<>();
   public ArrayList<Customer> listCustomers = new ArrayList<>();

    public Model() {
    }

    //Add product to the stock of the super market 
    public void addListProduct(Product p){
            listProduct.add(p);
    }
    
    public void addNewBill(Bill b){
        bills.add(b);
        
    }
    
    //add a new customer ot the database
    public boolean addNewCustomer(Customer l){
        if (listCustomers.contains(l)){
            return false;
        }else{
          listCustomers.add(l); 
          return true;
        }
    }
    

    
   
   
   
}
