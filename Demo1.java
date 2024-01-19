public class Demo1 {
    public static void main(String[] args) {
        // Create shape objects
        Shape triangle = new Triangle(3, 4, 5);
        Shape equilateralTriangle = new EquilateralTriangle(3);
        Shape ellipse = new Ellipse(8, 5);
        Shape circle = new Circle(5);

        //Print before scaling
        System.out.println("Before scaling:");
        System.out.println(triangle);
        System.out.println();
        System.out.println(equilateralTriangle);
        System.out.println();
        System.out.println(ellipse);
        System.out.println();
        System.out.println(circle);
        System.out.println();
      

        //Scaling the objects
        Scalable[] scalableArray = {triangle, equilateralTriangle, ellipse, circle};

        scaleArray(scalableArray, 2.5);

        System.out.println("\nAfter scaling by a factor of 2.5:");
        System.out.println();
        printObjects(scalableArray);
    }

    // Static method to scale an array of Scalable objects
    static void scaleArray(Scalable[] array, double scaleFactor) {
        for (Scalable scalable : array) {
            scalable.scale(scaleFactor);
        }
    }

    // Static method to print an array of Scalable objects
    static void printObjects(Scalable[] array) {
        for (Scalable scalable : array) {
            System.out.println(scalable);
            System.out.println();
        }
    }
}
      

    
    

