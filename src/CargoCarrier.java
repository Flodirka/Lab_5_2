package cargoCarrier;
public class CargoCarrier {
    // приватные поля класса
    private String gosNomer; //гос номер транспортного средства
    private String name;
    private String marka;//марка
    private double capacity; //грузоподьемность грузоперевозчика в кг

    // конструктор класса
    public CargoCarrier(String gosNomer, String name, String marka, double capacity) {
        this.gosNomer = gosNomer;
        this.name = name;
        this.marka = marka;
        this.capacity = capacity;
    }

    // метод для возвращения описания средства для грузоперевозки
    public String getDescription() {
        return " " + this.gosNomer + " " + this.name + " " + this.marka + "грузоподъемность: " + this.capacity + " кг ";

    }
    // абстрактный метод для переопределения в подклассах
    public abstract  String getcheck() ;

}

