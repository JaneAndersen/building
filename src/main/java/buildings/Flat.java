/*Создайте публичный класс Flat квартиры жилого дома.
Квартира не хранит свой номер.
Квартира хранит свою площадь в переменной square.
Квартира хранит количество комнат в переменной quantity.
Конструктор 1 по умолчанию создает квартиру из 2 комнат площадью 50 кв.м. (эти числа должны быть константами в классе)
Конструктор 2 может принимать площадь квартиры и создает квартиру с указанной площадь и 2 комнатами.
Конструктор 3 может принимать площадь квартиры и количество комнат.
Создайте метод getSquare() для получения площади квартиры.
Создайте метод setSquare() для изменения площади квартиры.
Создайте метод getQuantity() для получения количества комнат в квартире.
Создайте метод setQuantity() для изменения количества комнат в квартире.*/
package buildings;
public class Flat {

    private int square;
    private int quantity;
    public static final int SQUARE=50, QUANTITY=2;
    public Flat()
    {
        square=50;
        quantity=2;
    }
    public Flat(int sq)
    {
        square=sq;
        quantity=2;
    }
    public Flat(int sq, int q)
    {
        square=sq;
        quantity=q;
    }
    public int getSquare()
    {
        return square;
    }
    public void setSquare(int square)
    {
        this.square=square;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
}
