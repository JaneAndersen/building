package buildings.impl;
import buildings.*;
public class Office extends AbstractSpace implements Space {
    private int sq,q;
    public Office() {
        super();
    }
    public Office(int sq) {
        super(sq);
    }
    public Office(int sq, int q) {
        super(sq,q);
    }
    public int getSquare() {
        return sq;
    }
    public
    void setSquare(int square) {
        this.sq=square;
    }

    public int getQuantity() {
        return q;
    }

    public void setQuantity(int quantity) {

        this.q=quantity;
    }
}
