package buildings;

public abstract class AbstractSpace{

    private int square;
    private int quantity;
    public static final int SQUARE=50, QUANTITY=2;
    public AbstractSpace() {
        square=50;
        quantity=2;
    }
    public AbsractSpace(int sq) {
        square=sq;
        quantity=2;
    }
    public AbsractSpace(int sq, int q) {
        square=sq;
        quantity=q;
    }
}
