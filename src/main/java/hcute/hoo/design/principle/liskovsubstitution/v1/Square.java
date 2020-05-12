package hcute.hoo.design.principle.liskovsubstitution.v1;

public class Square implements Quadrangle {

    private long sideLength;

    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
