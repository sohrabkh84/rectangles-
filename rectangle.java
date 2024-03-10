import java.lang.*;
 class rectangle1 {
    private int length;
    private int breath;

    public rectangle1(){
        length=1;
        breath=1;


    }
    public rectangle1(int z){
        length=breath=1;
    }
    public int area() {
        return length * breath;
    }

    public int perimeter() {
        return 2 * (length * breath);
    }

    public boolean isSquare() {
        return length == breath;
    }
}

public class rectangle {
    public static void main(String[] args) {
        rectangle1 r = new rectangle1(5);
        
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
    }
}
