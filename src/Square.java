public class Square extends TwoDimensionalShape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.pow(getWidth(), 2);
    }

    @Override
    public String toString() {
        return String.format("%sLength: %.2f%n", super.toString(), getWidth());
    }

}
