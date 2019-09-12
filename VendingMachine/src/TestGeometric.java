import int101.object.Dice;
import int101.object.Circle;
import int101.object.Rectangle;

public class TestGeometric {
    public static void main(String[] args) {
        diceTest();
        circleTest();
        rectangleTest();
    }
   
    public static void diceTest(){
        Dice d1,d2;
        d1 = new Dice();
        d2 = new Dice();
        d1.setFace(3);
            System.out.println("D1: " + d1.getFace());
        d2.setFace(2);
            System.out.println("D2: " + d2.getFace());
        d1.roll();
            System.out.println("D1: " + d1.getFace());
        d2.roll();
            System.out.println("D2: " + d2.getFace());

    }
    public static void circleTest(){
        Circle c1,c2,c3,c4,c5;
        c1 = new Circle(0);
        c1.setRadius(1.5);
            System.out.println("c1_Radius: " + c1.getRadius());
            System.out.println("c1_Area: " + c1.getArea());
            System.out.println("c1_parimeter: " + c1.getParimeter());
        c2 = new Circle(0);
        c2.setRadius(2.8);
            System.out.println("c2_Radius: " + c2.getRadius());
            System.out.println("c2_Area: " + c2.getArea());
            System.out.println("c2_parimeter: " + c2.getParimeter());
        c3 = new Circle(0);
        c3.setRadius(1.5);
            System.out.println("c3_Radius: " + c3.getRadius());
            System.out.println("c3_Area: " + c3.getArea());
            System.out.println("c3_parimeter: " + c3.getParimeter());
        c4 = new Circle(0);
        c4.setRadius(3.0);
            System.out.println("c4_Radius: " + c4.getRadius());
            System.out.println("c4_Area: " + c4.getArea());
            System.out.println("c4_parimeter: " + c4.getParimeter());
        c5 = new Circle(0);
        c5.setRadius(9.7);
            System.out.println("c5_Radius: " + c5.getRadius());
            System.out.println("c5_Area: " + c5.getArea());
            System.out.println("c5_parimeter: " + c5.getParimeter());
    }
    public static void rectangleTest(){
        Rectangle r1,r2,r3,r4,r5;
        r1 = new Rectangle();
        r1.setHeight(1.1);
        r1.setWidth(2);
            System.out.println("r1_Area: " + r1.getArea());
            System.out.println("r1_Parimeter: " + r1.getParimeter());
        r2 = new Rectangle();
        r2.setHeight(2.8);
        r2.setWidth(4);
            System.out.println("r2_Area: " + r2.getArea());
            System.out.println("r2_Parimeter: " + r2.getParimeter());
        r3 = new Rectangle();
        r3.setHeight(3.0);
        r3.setWidth(1.8);
            System.out.println("r3_Area: " + r3.getArea());
            System.out.println("r3_Parimeter: " + r3.getParimeter());
        r4 = new Rectangle();
        r4.setHeight(9.7);
        r4.setWidth(5);
            System.out.println("r4_Area: " + r4.getArea());
            System.out.println("r4_Parimeter: " + r4.getParimeter());
        r5 = new Rectangle();
        r5.setHeight(1.1);
        r5.setWidth(1.1);
            System.out.println("r5_Area: " + r5.getArea());
            System.out.println("r5_Parimeter: " + r5.getParimeter());
    }
}
