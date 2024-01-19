public class Ellipse extends Shape{
    private double a; //Major axis
    private double b; //Minor axis

    public Ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public String getShape(){
        return "Ellipse";
    }
    @Override
    double getPerimeter(){
        return Math.PI * (2 * Math.sqrt((a * a + b * b) / 2) - Math.pow((a - b), 2) / 2);
    }
    @Override
    double getArea(){
        return Math.PI * a * b;
    }
    @Override
    public void scale(double scaleFactor) {
        a *= scaleFactor;
        b *= scaleFactor;
    }
    public String toString(){
        return "Ellipse with area " + getArea() + " and perimeter " + getPerimeter();
    }
}
