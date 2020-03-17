public class Tetrahedron extends ThreeDimensionalShape {

    private double one;
    private double two;
    private double three;

    public Tetrahedron(double one, double two, double three) {
        this.one = one;
        this.two= two;
        this.three= three;
    }

    public void setDimensions(double one, double two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public double[] getDimensions() {
        double[] dimensions = {one, two, three};
        return dimensions;
    }

    public double getFirstDimension() {
        return  this.one;
    }


    public double getSecondDimension() {
        return  this.two;
    }

    public double getThirdDimension() {
        return  this.three;
    }

    @Override
    public double getArea() {
        return 4 * (0.50 * one * two);	// 4 * (1/2 * baseWidth * baseHeight)
    }

    @Override
    public double getVolume() {
        // 1/3 * (1/2 * baseWidth * baseHeight) * height
        return 0.33 * (0.50 * one * two) * three;
    }

    @Override
    public String toString() {
        return String.format("%sDimensions: %s%n", super.toString(), getDimensions());
    }

}
