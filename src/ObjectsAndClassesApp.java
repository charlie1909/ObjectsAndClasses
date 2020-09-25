import java.util.Scanner;

public class ObjectsAndClassesApp {


    public static void main(String[] args){


        //Question 1.15-1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius");
        double radius = scanner.nextDouble();
        Circle userCircle = new Circle(radius);

        //question 1-2
        ObjectsAndClasses objectsAndClasses= new ObjectsAndClasses();
        boolean multiple = objectsAndClasses.isMultiple(12,3);
        System.out.println(multiple);
        boolean isOdd = objectsAndClasses.isOdd(9);
        System.out.println(isOdd);


        //Question 3-6
        Circle plainCircle = new Circle();
        Circle newCircle = new Circle(3);
        String pcol = plainCircle.getColor();
        double prad = plainCircle.getRadius();
        System.out.println("Radius: " + prad + ", Color: " + pcol);
        String col = newCircle.getColor();
        double rad = newCircle.getRadius();
        System.out.println("Radius: " + rad + ", Color: " + col);
        double area = newCircle.getArea();
        System.out.print("Area: " + area);

    }

}
