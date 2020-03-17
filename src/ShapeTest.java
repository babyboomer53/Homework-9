/*
 * ShapeTest.java
 *
 * Implement  the  Shape hierarchy  shown in  Fig. 9.3. Each TwoDimensionalShape
 * should  contain  method getArea to  calculate the area of the two-dimensional
 * shape.  Each  ThreeDimensionalShape should have methods getArea and getVolume
 * to  calculate  the surface  area  and  volume,  respectively, of  the  three-
 * dimensional shape. Create a program that uses an array of Shape references to
 * objects  of each  concrete class in the hierarchy. The program should print a
 * text  description of  the object to which each array element refers. Also, in
 * the  loop that  processes all the shapes in the array, determine whether each
 * shape  is  a  TwoDimensionalShape  or  a  ThreeDimensionalShape.  If  it’s  a
 * TwoDimensionalShape,  display  its  area. If  it’s  a  ThreeDimensionalShape,
 * display its area and volume.
 *
 */

/**
 * @author Edgar Cole
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape shapes[] = new Shape[6];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(10);
        shapes[2] = new Triangle(3, 5);
        shapes[3] = new Sphere(2);
        shapes[4] = new Cube(8);
        /**
         * I'm not terribly hip on tetrahedra... if this ratio isn't legit,
         * don't come complaining (but you're welcome to tell me about it)
         */
        shapes[5] = new Tetrahedron(3, 5, 9);

        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensionalShape)
                System.out.printf("area is: %.2f\n",
                        ((TwoDimensionalShape) shape).getArea());
            else if (shape instanceof ThreeDimensionalShape)
                System.out.printf("area is: %.2f, and volume is: %.2f\n",
                        ((ThreeDimensionalShape) shape).getArea(),
                        ((ThreeDimensionalShape) shape).getVolume());
            System.out.println();
        }
    }

}
