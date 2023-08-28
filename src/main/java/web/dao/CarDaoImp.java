package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDAO {

    private List<Car> cars;

    @Override
    public List<Car> getcarList(int param) {
        if (param < 5) {
            return carList().stream().limit(param).toList();
        }
        return cars;
    }

    @Override
    public List<Car> carList(){
        cars = new ArrayList<>();
        cars.add(new Car(1, "mers", 123));
        cars.add(new Car(2, "bmw", 7));
        cars.add(new Car(3, "volvo", 90));
        cars.add(new Car(4, "lada", 15));
        cars.add(new Car(5, "volga", 2110));

        return cars;
    }


}
