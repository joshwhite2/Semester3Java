public class Circle extends Shape {  

   private double radius; 
  
   
   public Circle( double radius ) {
      this.radius = radius;
   } 

  
   @Override
   public String getShape(){
       return "Circle";
   }
   @Override
   public double getArea() {
      return Math.PI * radius * radius;}

      @Override
      public double getPerimeter() {
         return 2 * Math.PI * radius;
   }
   @Override
   public void scale(double scaleFactor) {
      radius *= scaleFactor;}

   public String toString(){
      return "Circle with area " + getArea() + " and perimeter " + getPerimeter();
         }
    
   } 

