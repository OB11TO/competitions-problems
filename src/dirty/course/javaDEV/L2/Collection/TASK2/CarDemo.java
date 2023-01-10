package dirty.course.javaDEV.L2.Collection.TASK2;


import dirty.course.javaDEV.L2.Collection.TASK2.car.Brand;
import dirty.course.javaDEV.L2.Collection.TASK2.car.Color;
import dirty.course.javaDEV.L2.Collection.TASK2.car.Model;
import dirty.course.javaDEV.L2.Collection.TASK2.car.Truck;

/**
 *  Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 *
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 *
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */


public class CarDemo {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Truck(2020, Brand.BWM, Model.STATION_WAGON, Color.RED, 10));
        garage.park(new Truck(2020, Brand.MERCEDES, Model.STATION_WAGON, Color.WHITE, 15));
        garage.park(new Truck(2020, Brand.BWM, Model.STATION_WAGON, Color.RED, 10));

        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByBrand(Brand.BWM));

        garage.departure(new Truck(2018, Brand.BWM, Model.SEDAN, Color.BLACK, 220));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByModel(Model.SEDAN));
    }


}
