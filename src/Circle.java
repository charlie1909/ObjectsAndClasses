public class Circle {


    //question 3-6
    private double radius;
    private String color;

    public Circle(){
        radius = 1.8;
        color = "Red";
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

    public String getColor() {
        return color;
    }
}
