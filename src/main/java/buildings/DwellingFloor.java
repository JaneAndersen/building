package buildings;
import buildings.Office;
public class DwellingFloor implements Office{
    private Flat[] flats;
    
    public DwellingFloor(int count) {
        flats = new Flat[count];
        for (int i=0; i<count; i++) {
            flats[i]= new Flat();
        }
    }
    
    public DwellingFloor(Flat[] array) {
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
    
    public Flat[] getFlats() {
        return flats;
    }
    
    public Flat getFlat(int index) {
        return flats[index];
    }
    
    public void setFlat(int index, Flat newFlat) {
        if (index >= 0 && index < flats.length)
            flats[index] = newFlat;
    }
    
    public void addFlat(int index, Flat newFlat) {
        if (index >= 0 && index <= flats.length) {
            Flat[] newFlats = new Flat[flats.length + 1];
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
            Flat[] newFlats = new Flat[flats.length - 1];
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
