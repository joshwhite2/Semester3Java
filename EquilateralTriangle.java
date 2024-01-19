public class EquilateralTriangle extends Shape{
    private double sides;
     
    public EquilateralTriangle(double sides){
        this.sides = sides;
    }
    @Override
    public String getShape(){
        return "Equilateral Triangle";
    }
    @Override
    public double getArea(){
        return (Math.sqrt(3) / 4) * Math.pow(sides, 2);
    }

    @Override
    public double getPerimeter(){
        return 3 * sides;
    }
    @Override
    public void scale(double scaleFactor) {
        sides *= scaleFactor;
     
    }

    public String toString(){
        return "Equilateral Triangle with area " + getArea() + " and perimeter " + getPerimeter();
    }
    } 

