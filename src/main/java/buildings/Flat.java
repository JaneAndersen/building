package buildings;
import buildings.Space;
public class Flat {

    private int square;
    private int quantity;
    public static final int SQUARE=50, QUANTITY=2;
    public Flat() {
        square=50;
        quantity=2;
    }
    public Flat(int sq) {
        square=sq;
        quantity=2;
    }
    public Flat(int sq, int q) {
        square=sq;
        quantity=q;
    }
    public int getSquare() {
        return square;
    }
    public void setSquare(int square) {
        this.square=square;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
}
