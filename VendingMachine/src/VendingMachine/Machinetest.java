package VendingMachine;

public class Machinetest {
    
    public static void main(String[] args) {
        VendingMachine b1;
        VendingMachine b2;
        VendingMachine b3;
        b1 = new VendingMachine();
        
        b1.setprice(3);
        b1.setMoney(0);
        b1.setProdect(5);
        
        int result = b1.giveProdect();
        System.out.print(result+"result");
       
      
    }
}
