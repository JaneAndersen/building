package buildings;
import buildings.Building;
public class Dwelling implements Building{
    private Floor[] floors;
    public Dwelling(int countFloor, int[] countFlat) {
        floors = new Floor[countFloor];
        for (int i = 0; i < countFloor; i++) {
            floors[i] = new Floor(countFlat[i]);
        }
    }
    public Dwelling(Floor[] array) {
        floors = array;
    }
    public int getFloorsQuantity() {
        return floors.length;
    }
    public int getTotalFlats() {
        int total = 0;
        for (int i = 0; i < countFloor; i++) {
             total += floor.getTotalFlats();
        }
        return total;
    }
    public int getFlatsSquare() {
        int square = 0;
        for (int i = 0; i < floors.length; i++) {
            square = floors[i].getFlatsSquare();
        }
        return square;
    }
     public int getFlatsQuantity() {
        int quantity = 0;
        for (int i = 0; i < floors.length; i++) {
            quantity += floors[i].getFlatsQuantity();
        }
        return quantity;
    }
    public Floor[] getFloors() {
        return floors;
    }
    public Floor getFloor(int index) {
        return floors[index];
    }
    public void setFloor(int index, Floor newDwellingFloor) {
        floors[index] = newDwellingFloor;
    }
    public Flat getFlat(int index) {
        int number = 0;
        Space fl = new Space();
        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].getFlats().length; j++) {
                if (number == index) fl = floors[i].getFlats()[j];
                number++;
            }
        }
        return fl;
    }
    public void setFlat(int index, Space newFlat) {
        int number=0;
        for(int i=0; i<floors.length; i++) {
            for(int j=0; j<floors[i].getFlats().length;j++) {
                number++;
                if(number==index) floors[i].getFlats()[j] = newFlat;
            }
        }
    }
    public void addFlat(int index, Space newFlat) {
        int number = 0;
        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].getFlats().length; j++) {
                if (number == index) floors[i].getFlats()[j] = newFlat;
            }
        }
    }
    public void deleteFlat(int index) {
        int ind = index;
        for (Floor floor : floors) {
            int count = floor.getTotalFlats();
            if (ind < count) {
                floor.deleteFlat(ind);
                return;
            } else {
                ind -= count;
            }
        }
    }
    public int getBestFlatBySquare() {
        int number = 0;
        int maxIndex = 0;
        int maxSquare = 0;
        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].getFlats().length; j++) {
                number++;
                if (floors[i].getFlats()[j].getQuantity() * floors[i].getFlats()[j].getSquare() > maxSquare) {
                    maxIndex = number;
                    maxSquare = floors[i].getFlats()[j].getQuantity() * floors[i].getFlats()[j].getSquare();
                }
            }
        }
        return maxIndex;
    }

    public Floor[] getSortFlatsBySquare(int order) {
        Floor[] sorted = floors;
        Space array = new Space();
        if (order == 1) {
            for (int i = 0; i < floors.length - 1; i++) {
                for (int j = 0; j < floors.length - i - 1; j++) {
                    if (floors[j].getFlats()[j+1].getSquare() > floors[j+1].getFlats()[j+1].getSquare()) {
                        array = floors[j].getFlats()[j+1];
                        floors[j].getFlats()[j+1] = floors[j + 1].getFlats()[j+1];
                        floors[j + 1].getFlats()[j+1] = array;
                    }
                }
            }

        } else if (order == -1) {
            for (int i = 1; i < floors.length; i++) {
                for (int j = 0; j < floors[i].getFlats().length - i; j++) {
                    if (floors[i].getFlats()[j].getSquare() < floors[i].getFlats()[j + 1].getSquare()) {
                        array = floors[i].getFlats()[j];
                        floors[i].getFlats()[j] = floors[i].getFlats()[j + 1];
                        floors[i].getFlats()[j + 1] = array;
                    }
                }
            }
        }
        return floors;
    }
}
