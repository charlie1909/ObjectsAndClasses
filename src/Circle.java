import java.util.Scanner;

public class Circle {

    //question 3-6
    private double radius;
    private String color;

    public Circle(){
        radius = 1.8;
        color = "Red";
    }

    //Question 1.15-2
    public void setColor(double value){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        double color = scanner.nextDouble();

        if(color<10){
            this.color = "RED";
        }else if(color>= 10 && color <50){
            this.color="Amber";
        }else{
            this.color = "Green";
        }
    }

    public String getColor() {
        return color;
    }


    public Circle (double radius){
        this.radius = radius;
        color="Red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = Math.PI * (radius*radius);
        return area;
    }

}
