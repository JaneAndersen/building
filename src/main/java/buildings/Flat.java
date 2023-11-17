package buildings;
import buildings.Space;
public class Flat extends AbstractSpace implements Space{
    public Flat() {
        super();
    }
    public Flat(int sq) {
        super(sq);
    }
    public Flat(int sq, int q) {
        super(sq,q);
    }
}
