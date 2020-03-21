public class Square extends TwoDimensionalShape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return String.format("%s %s Length: %.2f%n", getClass().getName(), super.toString(), getLength());
    }

}
