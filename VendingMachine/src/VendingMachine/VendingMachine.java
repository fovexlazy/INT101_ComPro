
package VendingMachine;

public class VendingMachine
 {
    private int Product; 
    private int price; 
    private int money;  
    private int receiveMoney;  
    
                
    public void receiveMoney() {
        receiveMoney++;
    }
    
    public boolean receiveMoney(int amount) { 
        if(amount < 0) return false;
        receiveMoney += amount;
        return true;
    }
    public int  giveProdect() {
        if (Product==0) return -1;
        if (receiveMoney <  price) return -2;
        Product = Product - 1;
        money = money + price;
        receiveMoney = receiveMoney - price;
        return returnMoney();
    }
    
    public int returnMoney() {
        int returned = receiveMoney;
        receiveMoney = 0;
        return returned;
        
    } 
    
    
    public boolean setMoney (int amount){
        if(amount<0) return false;
        money = amount;
        return true;
    }
    
     
    public boolean setprice(int amount){
        if(price<=0) return false;
        price = amount;
        return true;
    }
    public boolean setProdect(int amount){
        if(Product<=0) return false;
        Product = amount;
        return true;
        
    }
       
    
     
     
}

    



