package buildings;
import buildings.Office;

public class OfficeFloor implements Floor {
    private Space[] flats;
    public OfficeFloor(int count) {
        flats = new Space[count];
        for (int i=0; i<count; i++) {
            flats[i]= new Flat();
        }
    }
    public OfficeFloor(Space[] array) {
        flats= array;
    }
    public int getTotalFlats() {
        return flats.length;
    }
    public int getFlatsSquare() {
        int square=0;
        for (int i=0; i<flats.length; i++) {
            square+=flats[i].getSquare();
        }
        return square;
    }
    
    public int getFlatsQuantity() {
        int quantity=0;
        for (int i=0; i<flats.length; i++) {
            quantity+=flats[i].getQuantity();
        }
        return quantity;
    }
    public Space[] getFlats() {
        return flats;
    }
    public Space getFlat(int index) {
        return flats[index];
    }
    public void setFlat(int index, Space newFlat) {
        if (index >= 0 && index < flats.length)
            flats[index] = newFlat;
    }
    public void addFlat(int index, Space newFlat) {
        if (index >= 0 && index <= flats.length) {
            Space[] newFlats = new Space[flats.length + 1];
            for (int i = 0; i < index; i++) {
                newFlats[i] = flats[i];
            }
            newFlats[index] = newFlat;
            for (int i = index; i < flats.length; i++) {
                newFlats[i + 1] = flats[i];
            }
            flats = newFlats;
        }
    }
    public void deleteFlat(int index) {
        if (index >= 0 && index < flats.length) {
            Space[] newFlats = new Space[flats.length - 1];
            for (int i = 0, j = 0; i < flats.length; i++) {
                if (i != index) {
                    newFlats[j++] = flats[i];
                }
            }
            flats = newFlats;
        }
    }
    public int getBestSquare() {
        int square=0;
        for (int i=0; i<flats.length; i++) {
            if (square<flats[i].getSquare()) {
                square=flats[i].getSquare();
            }
        }
        return square;
    }
}
