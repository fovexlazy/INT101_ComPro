
public class Product {
 
    private String productId,productName;
    private double productPrice,productDiscount;
    private boolean promotion;
   
    
    public Product(){
     
    }
    
    public Product(String productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        
    }
    
    public double getPrice(){
        return productPrice;
    }
    
    public double getNetPrice(){
        if( this.promotion == true){
        this.productPrice = productPrice - productDiscount;
        
        }
        return productPrice;
    }
    
    public double getProductPrice(){
        return this.productPrice=productPrice* 0.07;
    }
    
    public double setProductDiscount(double productDiscount){
        return this.productDiscount = productDiscount;
        
    }
    
    public void setPromotion(boolean hasPromotion){
        this.promotion = hasPromotion;
    
}
//    @Override
    public String toString(){
        return productId + productName + productPrice + " NetPrice : " + getNetPrice() ;
    }
}

