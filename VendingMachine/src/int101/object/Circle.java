package int101.object;

import java.util.Random;


public class Circle {
    
    private double radius;
    
    public Circle(double radius){
        if (radius <= 0){
        Random r = new Random();
        setRadius(r.nextDouble());
        }
    setRadius(radius);
    }

        public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0 ) return;
        this.radius = radius;
    }
    
    public double getArea() { 
        return Math.PI*radius*radius;
    }
    
    public double getParimeter() {
        return 2* Math.PI*radius;
    }
    
    //area = Math.Pi * r ^ 2
    //paramiter = 2 * Math.pi * r
    
}
