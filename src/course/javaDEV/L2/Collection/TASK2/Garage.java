package course.javaDEV.L2.Collection.TASK2;

import course.javaDEV.L2.Collection.TASK2.car.Brand;
import course.javaDEV.L2.Collection.TASK2.car.Car;
import course.javaDEV.L2.Collection.TASK2.car.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 *  * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.

 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 *  * Продемонстрировать работу гаража.
 */
public class Garage {

    private final Map<Car,Integer> cars = new HashMap<>();

    public void park(Car car){
        int oldCount = cars.getOrDefault(car,0);
        cars.put(car, oldCount + 1);

    }


    public void departure(Car car){
        int oldCount = cars.getOrDefault(car, 0);
        Integer newCount = oldCount == 0 ? 0 : oldCount - 1;
        cars.put(car, newCount);
    }

    public int getCarCountByBrand(Brand brand){
        int result = 0;
        for(Map.Entry<Car,Integer> car : cars.entrySet()){
            if(car.getKey().getBrand() == brand){
                result+= car.getValue();
            }
        }
        return result;
    }


    public int getCarCountByModel(Model model){
        int result = 0;
        for(Map.Entry<Car,Integer> car : cars.entrySet()){
            if(car.getKey().getModel() == model){
                result+= car.getValue();
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "Garage{" + "cars=" + cars +
                '}';
    }
}
