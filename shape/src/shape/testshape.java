
package shape;
public class testshape {
    public static void main(String[] args){
        Shape s1 = new rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("area is " + s1.getArea());
        
        Shape s2 = new triangle("blue is ", 4, 5);
        System.out.println(s2);
        System.out.println("area is " + s2.getArea());
    }
    
}
