class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + Math.PI*radius*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
   private int length;
   private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class practice_set {

    public static void main(String[] args) {
        //p-1
//        cylinder mycylinder = new cylinder();
//        mycylinder.setHeight(12);
//        int h = mycylinder.getHeight();
//        System.out.println(h);
//        mycylinder.setRadius(10);
//        int r = mycylinder.getRadius();
//        System.out.println(r);
//
//        //p-2
//        System.out.println(mycylinder.surfaceArea());
//        System.out.println(mycylinder.volume());


        //P-3
//        cylinder mycylinder = new cylinder(12,10);
//        System.out.println(mycylinder.getHeight());
//        System.out.println(mycylinder.getRadius());
//        System.out.println(mycylinder.volume());
//        System.out.println(mycylinder.surfaceArea());


        //P-4
//        Rectangle r = new Rectangle();
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());


//        Rectangle r = new Rectangle(12,56);
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());

    }
}
