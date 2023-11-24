package buildings;
/*Создайте экземпляр многоэтажный жилого дома с различными произвольными значениями количества квартир по этажам,
а также площадей и количества комнат в квартирах.
Вызовите все методы класса Dwelling и убедитесь в корректности выводимых результатов.*/
import buildings.impl.*;

public class Main
{
    public static void main(String[] args)
    {
        Flat flat1 = new Flat(30,1);
        Flat flat2 = new Flat(75,3);
        Flat flat3 = new Flat(50,2);
        Flat flat4 = new Flat(60,3);
        Flat flat5 = new Flat(45,1);
        Flat flat6 = new Flat(60,2);
        Flat flat7 = new Flat(50,3);
        Flat flat8 = new Flat(25,1);
        Flat flat9 = new Flat(70,3);
        Flat flat10 = new Flat(65,3);
        Flat flat11 = new Flat(55,2);
        Flat flat12 = new Flat(50,2);
        DwellingFloor floor1 = new DwellingFloor(new Flat[]{flat1, flat2, flat3, flat4, flat5});
        DwellingFloor floor2 = new DwellingFloor(new Flat[]{flat6, flat7, flat8});
        DwellingFloor floor3 = new DwellingFloor(new Flat[]{flat9, flat10, flat11, flat12});
        Dwelling dwell = new Dwelling(new DwellingFloor[]{floor1, floor2, floor3});
        int countFloors=dwell.getFloorsQuantity();
        System.out.println(countFloors);
        System.out.println(dwell.getFlatsQuantity());
        System.out.println(dwell.getFlatsSquare());
        System.out.println(dwell.getFloorsQuantity());
        Floor[] arrayFloors = dwell.getFloors();
        Floor DFloor = dwell.getFloor(2);
        dwell.setFloor(1, DFloor);
        dwell.getFlat(5);
        Flat newFlat = new Flat(30,2);
        dwell.setFlat(8, newFlat);
        dwell.addFlat(1, newFlat);
        dwell.deleteFlat(10);
        System.out.println(dwell.getBestSpaceBySquare());
        dwell.getSortSpacesBySquare(1);
        dwell.getSortSpacesBySquare(-1);
        System.out.println();
    }
}
