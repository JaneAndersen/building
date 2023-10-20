/*Создайте публичный класс Dwelling жилого здания, основанный на массиве этажей здания.
Жилое здание хранит массив этажей.
Конструктор 1 принимает количество этажей и массив количества квартир по этажам. (для создания этажей и квартир будет срабатывать конструктор по умолчанию)
Конструктор 2 принимает массив этажей дома.
Создайте метод getDwellingFloorQuantity() для получения общего количества этажей дома.
Создайте метод getFlatsQuantity() для получения общего количества квартир дома.
Создайте метод getFlatsSquare() для получения общей площади квартир дома.
Создайте метод getRoomsQuantity() для получения общего количества комнат дома.
Создайте метод getDwellingFloors() для получения массива этажей жилого дома.
Создайте метод getDwellingFloor(int index) для получения объекта этажа, по его номеру в доме.
Создайте метод setDwellingFloor(int index, DwellingFloor newDwellingFloor) для изменения этажа по его номеру в доме и ссылке на обновленный этаж.
Создайте метод getFlat(int index) для получения объекта квартиры по ее номеру в доме.
Создайте метод setFlat(int index, Flat newFlat) для изменения объекта квартиры по ее номеру в доме и ссылке на объект квартиры.
Создайте метод addFlat(int index, Flat newFlat) для добавления квартиры в дом по будущему номеру квартиры в доме (т.е. в параметрах указывается номер, который должны иметь квартира после вставки) и ссылке на объект квартиры (количество этажей в доме при этом не увеличивается).
Создайте метод deleteFlat(int index) для удаления квартиры по ее номеру в доме.
Создайте метод getBestFlatBySquare() для получения самой большой по площади квартиры дома.
Создайте метод getSortFlatsBySquare(int order) для получения массива квартир по убыванию(order = 1)/увеличению(order=-1) площади.*/
package buildings;
public class Dwelling {
    private DwellingFloor[] floors;

    public Dwelling(int countFloor, int[] countFlat) {
        floors = new DwellingFloor[countFloor];
        for (int i = 0; i < countFloor; i++) {
            floors[i] = new DwellingFloor(countFlat[i]);
        }
    }

    public Dwelling(DwellingFloor[] array) {
        floors = array;
    }

    public int getDwellingFloorQuantity() {
        return floors.length;
    }

    public int getFlatsQuantity() {
        int quantity = 0;
        for (int i = 0; i < floors.length; i++) {
            quantity += floors[i].getTotalFlats();
        }
        return quantity;
    }

    public int getFlatsSquare() {
        int square = 0;
        for (int i = 0; i < floors.length; i++) {
            square = floors[i].getFlatsSquare();
        }
        return square;
    }

    public int getRoomsQuantity() {
        int quantity = 0;
        for (int i = 0; i < floors.length; i++) {
            quantity += floors[i].getFlatsQuantity();
        }
        return quantity;
    }

    public DwellingFloor[] getDwellingFloors() {
        return floors;
    }

    public DwellingFloor getDwellingFloor(int index) {
        return floors[index];
    }

    public void setDwellingFloor(int index, DwellingFloor newDwellingFloor) {
        floors[index] = newDwellingFloor;
    }

    public Flat getFlat(int index) {
        int number = 0;
        Flat fl = new Flat();
        for (int i = 0; i < floors.length; i++)
        {
            for (int j = 0; j < floors[i].getFlats().length; j++)
            {
                if (number == index) fl = floors[i].getFlats()[j];
                number++;
            }
        }
        return fl;
    }

    public void setFlat(int index, Flat newFlat)
    {
        int number=0;
        for(int i=0; i<floors.length; i++)
        {
            for(int j=0; j<floors[i].getFlats().length;j++)
            {
                number++;
                if(number==index) floors[i].getFlats()[j] = newFlat;
            }
        }
    }

    public void addFlat(int index, Flat newFlat) {
        int number = 0;
        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].getFlats().length; j++) {
                if (number == index) floors[i].getFlats()[j] = newFlat;
            }
        }
    }

    public void deleteFlat(int index) {
        int ind = index;

        for (DwellingFloor floor : floors)
        {
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

    public DwellingFloor[] getSortFlatsBySquare(int order) {
        DwellingFloor[] sorted = floors;
        Flat array = new Flat();
        if (order == 1) //по убыванию
        {
            for (int i = 0; i < floors.length - 1; i++) {
                for (int j = 0; j < floors.length - i - 1; j++) {
                    if (floors[j].getFlats()[j+1].getSquare() > floors[j+1].getFlats()[j+1].getSquare()){
                        array = floors[j].getFlats()[j+1];
                        floors[j].getFlats()[j+1] = floors[j + 1].getFlats()[j+1];
                        floors[j + 1].getFlats()[j+1] = array;
                    }
                }
            }

        } else if (order == -1)
        {
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
