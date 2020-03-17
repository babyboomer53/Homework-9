public abstract class Shape {
    @Override
    public String toString(){
        return String.format("%s%n", this.getClass().getName());
    }

}
