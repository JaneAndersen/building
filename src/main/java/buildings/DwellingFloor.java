/*Создайте публичный класс DwellingFloor этажа жилого здания, основанный
на массиве квартир.
Номер этажа не хранится.
Этаж хранит массив квартир.
Конструктор 1 принимает количество квартир на этаже и создаёт этаж с
квартирами используя конструктор квартир по умолчанию.
Конструктор 2 принимает массив квартир этажа.
Создайте метод getTotalFlats() для получения количества квартир на этаже.
Создайте метод getFlatsSquare() для получения общей площади квартир
этажа.
Создайте метод getFlatsQuantity() для получения общего количества комнат
этажа.
Создайте метод getFlats() для получения массива квартир этажа.
Создайте метод getFlat(int index) для получения объекта квартиры по ее
номеру на этаже.
Создайте метод setFlat(int index, Flat newFlat) для изменения квартиры по
ее номеру на этаже и ссылке на новую квартиру.
Создайте метод addFlat(int index, Flat newFlat) для добавления новой
квартиры на этаже по будущему номеру квартиры (в index указывается
номер, который должна иметь квартира после вставки в массив) и ссылке на
объект новой квартиры.
Создайте метод deleteFlat(int index) для удаления квартиры по ее номеру на
этаже. (удаление из массива)
Создайте метод getBestSquare() для получения самой большой по площади
квартиры этажа.*/
package buildings;
public class DwellingFloor {
    private Flat[] flats;
    public DwellingFloor(int count)
    {
        flats = new Flat[count];
        for (int i=0; i<count; i++)
        {
            flats[i]= new Flat();
        }
    }
    public DwellingFloor(Flat[] array)
    {
        flats= array;
    }
    public int getTotalFlats()
    {
        return flats.length;
    }
    public int getFlatsSquare()
    {
        int square=0;
        for (int i=0; i<flats.length; i++)
        {
            square+=flats[i].getSquare();
        }
        return square;
    }
    public int getFlatsQuantity()
    {
        int quantity=0;
        for (int i=0; i<flats.length; i++)
        {
            quantity+=flats[i].getQuantity();
        }
        return quantity;
    }
    public Flat[] getFlats()
    {
        return flats;
    }
    public Flat getFlat(int index)
    {
        return flats[index];
    }
    public void setFlat(int index, Flat newFlat)
    {
        if (index >= 0 && index < flats.length)
            flats[index] = newFlat;
    }
    public void addFlat(int index, Flat newFlat)
    {
        if (index >= 0 && index <= flats.length)
        {
            Flat[] newFlats = new Flat[flats.length + 1];
            for (int i = 0; i < index; i++)
            {
                newFlats[i] = flats[i];
            }
            newFlats[index] = newFlat;
            for (int i = index; i < flats.length; i++)
            {
                newFlats[i + 1] = flats[i];
            }
            flats = newFlats;
        }
    }
    public void deleteFlat(int index)
    {
        if (index >= 0 && index < flats.length)
        {
            Flat[] newFlats = new Flat[flats.length - 1];
            for (int i = 0, j = 0; i < flats.length; i++)
            {
                if (i != index)
                {
                    newFlats[j++] = flats[i];
                }
            }
            flats = newFlats;
        }
    }
    public int getBestSquare()
    {
        int square=0;
        for (int i=0; i<flats.length; i++)
        {
            if (square<flats[i].getSquare())
            {
                square=flats[i].getSquare();
            }
        }
        return square;
    }
}
