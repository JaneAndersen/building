package buildings.dwellingFloor;

import buildings.DwellingFloor;
import buildings.Flat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DwellingFloorTest
{
    private final Flat flat1 = new Flat();
    private final Flat flat2 = new Flat(100);
    private final Flat[] DwellingFloors = new Flat[] { flat1, flat2 };
    private final DwellingFloor Floor = new DwellingFloor(DwellingFloors);

    @Test
    public void testGetTotalFlats() {
        System.out.println("GetTotalFlats: " + Floor.getTotalFlats());

        Assertions.assertEquals(DwellingFloors.length, Floor.getTotalFlats());
    }

    @Test
    public void testGetFlatsSquare() {
        System.out.println("GetFlatsSquare: " + Floor.getFlatsSquare());

        Assertions.assertEquals(flat1.getSquare() + flat2.getSquare(), Floor.getFlatsSquare());
    }

    @Test
    public void testGetFlatsQuantity() {
        System.out.println("GetFlatsQuantity: " + Floor.getFlatsQuantity());

        Assertions.assertEquals(flat1.getQuantity() + flat2.getQuantity(), Floor.getFlatsQuantity());
    }

    @Test
    public void testGetFlats() {
        System.out.println("GetFlats: done");

        Assertions.assertEquals(DwellingFloors, Floor.getFlats());
    }

    @Test
    public void testGetFlat() {
        System.out.println("GetFlat: " + Floor.getFlat(1).getSquare() + ", " + Floor.getFlat(1).getQuantity());

        Assertions.assertEquals(flat2, Floor.getFlat(1));
    }

    @Test
    public void testSetFlat() {
        int index = 1;
        Floor.setFlat(index, flat1);
        System.out.println("SetFlat: " + Floor.getFlat(index).getSquare() + ", " + Floor.getFlat(index).getQuantity());

        Assertions.assertEquals(flat1, Floor.getFlat(index));
    }

    @Test
    public void testAddFlat() {
        int index = 2;
        Floor.addFlat(index, flat1);
        System.out.println("AddFlat: " + Floor.getFlat(index).getSquare() + ", " + Floor.getFlat(index).getQuantity());

        Assertions.assertEquals(flat1, Floor.getFlat(index));
    }

    @Test
    public void testDeleteFlat() {
        int index = 0;
        Floor.deleteFlat(index);
        System.out.println("DeleteFlat: " + Floor.getFlat(index).getSquare() + ", " + Floor.getFlat(index).getQuantity());

        Assertions.assertEquals(flat2, Floor.getFlat(index));
    }

    @Test
    public void testGetBestSquare() {
        System.out.println("GetBestSquare: " + Floor.getBestSquare());

        Assertions.assertEquals(100, Floor.getBestSquare());
    }
}
