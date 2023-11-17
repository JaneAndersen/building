package buildings;
public class Flat extends AbstractSpace implements Space {
    private int sq, q;
    public Flat() {
        super();
    }
    public Flat(int sq) {
        super(sq);
    }
    public Flat(int sq, int q) {
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
