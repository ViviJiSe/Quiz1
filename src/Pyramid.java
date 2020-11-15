import java.lang.Math;

public class Pyramid {

    private Triangle triangle;
    private double height;
    private double side;
    private double volume;

    private void computeVolume(){
       this.volume = ((Math.sqrt(3)/12)* (triangle.getArea()*this.height));
    }

    public double getVolume(){
          return this.volume;
    }

    public double getHeight(){
        return this.height;
    }

    public double getSide(){
          return this.side;
    }

    public Pyramid(Triangle triangle, double height, double side) {
        this.triangle = new Triangle(side, height);
        this.height = height;
        this.side = side;
        this.computeVolume();
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "height= " + height +
                ", side= " + side +
                ", volume= " + volume +
                '}';
    }
}
