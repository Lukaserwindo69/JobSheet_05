
package shape;
public class rectangle extends Shape {
    private int Length;
    private int width;
    
    public rectangle(String color, int Length, int width){
        super(color);
        this.Length = Length;
        this.width = width;
    }
    @Override
    public String toString() {
        return "retcteangle [length=" + Length + "width=" + width + "," + super.toString() + "]";
        
    }
    @Override
    public double getArea() {
        return Length*width;
    }
    
}
