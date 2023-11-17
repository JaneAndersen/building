package buildings;
import lombok.Data;
@Data
public abstract class AbstractSpace{

    private int square;
    private int quantity;
    public static final int SQUARE=50, QUANTITY=2;
    public AbstractSpace() {
        square=SQUARE;
        quantity=QUANTITY;
    }
    public AbstractSpace(int sq) {
        square=sq;
        quantity=QUANTITY;
    }
    public AbstractSpace(int sq, int q) {
        square=sq;
        quantity=q;
    }
}

