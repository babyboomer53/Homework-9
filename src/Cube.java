public class Cube extends ThreeDimensionalShape {
    private double width;

    public Cube(double width) {
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getWidth(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getWidth(), 3);
    }

    @Override
    public String toString() {
        return String.format("%sWidth: %.2f\n", super.toString(), getWidth());
    }

}
