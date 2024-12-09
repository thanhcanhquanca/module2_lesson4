package hop_1;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getArea(){
        return this.height * this.width;
    }

    public int getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle {" + "width :" + width + ", height :" + height + "}";
    }

}

