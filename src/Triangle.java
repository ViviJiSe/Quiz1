public class Triangle {

    private double side;
    private double height;
    private double area;
    private double perimeter;


    private void computePerimeter(){
        this.perimeter= side *3;
    }

    private void computeArea(){

        this.area=(side * height)/2;
    }

    public double getArea() {

        return this.area;
    }

    public double getPerimeter() {

        return this.perimeter;
    }

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
        this.computeArea();
        this.computePerimeter();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + side +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
