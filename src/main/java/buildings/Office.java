package buildings;
import buildings.Space;
public class Office extends AbstractSpace implements Space {
    public Office() {
        super();
    }
    public Office(int sq) {
        super(sq);
    }
    public Office(int sq, int q) {
        super(sq,q);
    }
}
