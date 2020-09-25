import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsAndClassesApp {


    public static void main(String[] args){


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
        System.out.println("Area: " + area);

        Circle circle = new Circle(10, 10);

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(circle);
        circles.add(newCircle);
        circles.add(plainCircle);
        for(int i =0; i< circles.size(); i++){
            double radius = circles.get(i).getRadius();
            String color = circles.get(i).getColor();
            System.out.println("Circle " + i + "- Radius: " + radius + " , color: "+ color);
        }
    }

}
