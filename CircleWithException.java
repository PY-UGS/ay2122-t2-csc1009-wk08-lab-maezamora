public class CircleWithException {
    private Float radius;

    public CircleWithException(Float radius) {
        this.radius = radius;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getDiameter(){
        double diameter = 2*radius;
        return diameter;
    }
}
