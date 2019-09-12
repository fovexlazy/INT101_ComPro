import int101.object.Dice;
import int101.object.Circle;
import int101.object.Rectangle;


public class objectTest {
    
          
    private static void diceTest() {
        Dice d1,d2;
        d1 = new Dice();
        d2 = new Dice();
        d1.setFace(8);
        System.out.println("D1: " + d1.getFace());
        System.out.println("D2: " + d2.getFace());
        d2.setFace(3);
        System.out.println("D2: " + d2.getFace());
        d1.roll();
        System.out.println("D1: " + d1.getFace());
        d1.roll();
        System.out.println("D1: " + d1.getFace());
        
    }
       
    private static void circleTest() {
        Circle c1,c2;
        c1 = new Circle(0);
        c2 = new Circle(0);
        System.out.println("Radius : " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("parimeter: " + c1.getParimeter());
    }
    
    private static void rectangleTest() {
        Rectangle r1;
        r1 = new Rectangle();
        r1.setHeight(1.5);
        r1.setWidth(2);
        System.out.println("Area : " + r1.getArea());
        System.out.println("Parimeter : " + r1.getParimeter());
    }
    
}
