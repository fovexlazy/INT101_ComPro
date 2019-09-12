package int101.object;
import java.util.Random;

public class Rectangle {
    private Random random;
    private double height;
    private double width;
    
    public Rectangle() {
        random = new Random();
        roll();
    }
    
    public Rectangle(double height,double width){
        if (height <= 0 && width <=0 ){
            random  = new Random();
            roll();
        }
    }
    public void roll() {
        this.height = random.nextInt();
        this.width = random.nextInt();
    }
    
    public void setHeight(double height){  
        if (height <= 0) {
            return;
        }
        this.height = height;
    }
    
    public void setWidth(double width){ 
        if (width <= 0) {
            return;
        }
        this.width = width;
    }
    
    public double getArea() {
        return width * height;
    }
    public double getParimeter() { 
        return (height + width) * 2; 
    } 
}
