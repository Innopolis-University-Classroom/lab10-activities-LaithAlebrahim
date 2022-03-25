//Create a Shape Factory which can produce different shapes such
//        as Circle, Square, Rectangle.
//        And the client uses ShapeFactory to get a particular shape.
public class Main {
    public static void main(String[] args) {

  
        ShapeFactory shape2 = new Square();
        shape2.factor();
        ShapeFactory shape3 = new Circle();
        shape3.factor();


    }

    }

 interface ShapeFactory {

     void factor();
     
}



 class Square implements ShapeFactory {


    @Override
    public void factor() {
        Rectangular rectangular=new Rectangular();
    }

   
 }
class Rectangular extends Square {


    Rectangular() {
        System.out.println("The factorization of Rectangular is done");
    }



}
class Circle implements ShapeFactory {


   
    @Override
    public void factor() {
        Ball ball=new Ball();
    }
}
class Ball extends Circle {

    Ball() {
        System.out.println("The factorization of Ball is done");
    }
}

