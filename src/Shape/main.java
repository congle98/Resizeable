package Shape;

public class main {
    static void showArea(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Rectangle){
                System.out.println(((Rectangle) shapes[i]).getArea());
            }
            else if(shapes[i] instanceof Square){
                System.out.println(((Square) shapes[i]).getArea());
            }
            else {
                System.out.println(((Circle) shapes[i]).getArea());
            }
        }
    }
    static void arrayResizeable(Shape[] shapes){
        double size = (int)((Math.random()*10)+1);
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Rectangle){
                ((Rectangle) shapes[i]).resize(size);
            }
            else if(shapes[i] instanceof Square){
                ((Square) shapes[i]).resize(size);
            }
            else {
                ((Circle) shapes[i]).resize(size);
            }
        }
        System.out.println(size);
    }
    public static void main(String[] args) {
        Shape[] shapes= new Shape[3];
        shapes[0]= new Rectangle(5,7);
        shapes[1]= new Square(5);
        shapes[2]= new Circle(3);
        showArea(shapes);
        arrayResizeable(shapes);
        showArea(shapes);



    }
}
