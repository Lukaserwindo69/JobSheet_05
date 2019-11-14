
package shape;
public class triangle extends Shape {
    
    private int base;
    private int heigth;
    
    public triangle(String color, int base, int heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }
    @Override
    public String toString(){
        return "triangle[base=" + base + ",heigth=" + heigth + ","
        + super.toString() + "]";
    }
    @Override
    public double getArea() {
        return 0.5*base*heigth;
    }
    
}
