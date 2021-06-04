import java.util.*;
abstract class Shape{
  int value;
  void setValue(int value)
  {
    this.value=value;
  }
  int getValue() {
    return this.value;
  }
  abstract void  Calculatearea(int value);
}

class Circle extends Shape{
  @Override
  void Calculatearea(int value) {
    double area=Math.PI*(value*value);
    System.out.println("Area of Circle:"+area);
  }
}
class Square extends Shape{
  @Override
   void Calculatearea(int value) {
    double area=(value*value);
    System.out.println("Area of Aquare:"+area);
  }
}


public class ShapeMain {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String shape;
    int radius,side;
    System.out.println("Enter Shape(in lower alphabets):");
    shape=sc.next();
    switch(shape) {
    case "circle":  System.out.println("Enter Radius:");
            radius=sc.nextInt();
            Shape c=new Circle();
            c.Calculatearea(radius);
            break;
    case "square":  System.out.println("Enter side:");
            side=sc.nextInt();
            Shape s=new Square();
            s.Calculatearea(side);
            break;
    default:        System.out.println("Wrong Input");

    }
    sc.close();
    
  }

}