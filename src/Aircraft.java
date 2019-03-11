package cargoCarrier;

public class Aircraft extends CargoCarrier { // класс Самолет наследующий  абстрактный класс Грузоперевозка

    //  приватные поля класса
    private double price; // цена за 1 км ;
    private double speed; // скорость самолета км/ч ;
    private double distance; //расстояние от пункта А до пункта Б
    private double summa; // сумма перевозки ;
    private double timeDelivery;

    // конструктор класса
    public Aircraft(String gosNomer, String name, String marka, double capacity, double price, double speed) {
        super(gosNomer, name, marka, capacity); // вызов конструктора суперкласса
        this.price = price; // инициализация переменных
        this.speed = speed;
    }

    // метод который возвращает цену перевозки за 1 км
    public double getPrice() {
        return this.price;
    }

    // метод который возвращает среднюю скорость выбранного самолета
    public double getSpeed() {
        return this.speed;
    }

    // переопределенный метод для получения описания грузоперевозящего средства - самолета
    @Override
    public String getDescription() {
        return super.getDescription() + " скорость: " + getSpeed() + "км/ч,  цена за километр: " + getPrice();
    }

    // метод для заказа грузоперевозки
    // считает сумму перевозки , исходя из переданного параметра расстояние на которое необходимо перевезти груз
    public void setDelivery(double s) {
        distance = s; // расстояние на которое необходимо перевезти груз
        summa = distance * price; // сумма перевозки
    }

    public String getTimeDelivery() // метод для получения время доставки груза
    {
        timeDelivery = distance / speed + 5;
        return Integer.toString((int) timeDelivery);
    }

    public void setVip() // заказ Vip грузоперевозки
    {
        summa += summa / 100 * 40; // сумма VIP перевозки увеличивается на 40 процентов
        timeDelivery /= 2;
    }


    // переопределенный метод для получения чека по перевозке груза
    @Override
    public String getcheck() {

        return "Чек: \nОписание грузоперевозчика самолетом: " + getDescription() + "" +
                "\nРасстояние в км :" + distance +
                "\nСумма грузоперевозки: " + summa +
                "\nВремя доставки :" + getTimeDelivery() + "часов\n";
    }

}
