package hcute.hoo.design.principle.liskovsubstitution.v1;

public class Rectangle implements Quadrangle {

    private long length;
    private long width;



    public long getWidth() {
        return width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
