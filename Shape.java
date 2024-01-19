abstract class Shape implements Scalable{
   
    abstract double getArea();
    abstract double getPerimeter();
    abstract String getShape();

    @Override
    public abstract void scale(double scaleFactor);

     @Override
     public abstract String toString();
     }

