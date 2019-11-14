
package shape;
public class Shape {
    //private member variable
    private String color;
    //contructor
    public Shape (String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "shape [color = " + color + "]";
        
    }
    // all shape must have a method called getArea
    public double getArea(){
        System.err.println("shape unknown canot computer area");
        return 0;
    }

       
    }

