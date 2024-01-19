public class Triangle extends Shape {
    private double side1; 
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side");
        }
}
   
@Override
public String getShape(){
    return "Triangle";
}

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    @Override
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    @Override
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }
    
    public String toString() {
        return "Triangle with area " + getArea()+ " and perimeter " + getPerimeter();
    }
}