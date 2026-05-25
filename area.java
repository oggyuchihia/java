class Shape {
    public double getarea(){
        return 0;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double getarea(){
        return 0.5*base*height;
    }
}
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public double getarea(){
        return side*side;
    }
}
class area{
    public static void main (String[] args){
        Shape[] s=new Shape[2];
        s[0]=new Square(7);
        s[1]=new Triangle(9,5);
        System.out.println("Area of square "+s[0].getarea());
        System.out.println("Area of triangle " + s[1].getarea());
        }
}