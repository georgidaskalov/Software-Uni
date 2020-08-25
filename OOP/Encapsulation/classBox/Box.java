package OOP.Encapsulation.classBox;


public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);

    }

    // a*b*c
    public double calculateVolume() {
        return this.length * this.height * this.width;
    }

    //a * c * 2 + b * c * 2
    public double calculateLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    // 2 * a * b + 2 * a * c + 2 * b * c
    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + this.calculateLateralSurfaceArea();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                        "Lateral Surface Area - %.2f%n" +
                        "Volume – %.2f%n", calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }
}
