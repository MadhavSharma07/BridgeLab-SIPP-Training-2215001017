

public class Circle {
     double radius;

 
    public Circle() {
    	
        radius =1.0; 
    }

    public Circle(double radius) {
        this.radius = radius;
    }

 
    public void print() {
        System.out.println("Radius of the circle : " + radius);
    }

 
    public static void main(String[] args) {
    	System.out.println("Defult Constructor-");
        Circle default_Circle = new Circle();
        default_Circle.print(); 
    	System.out.println();
    	System.out.println("Parameterize Constructor-");

        Circle para_Circle = new Circle(5.5);
        para_Circle.print();  
    }
}