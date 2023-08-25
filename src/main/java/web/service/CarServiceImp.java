package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDAO carDao;

    @Autowired
    public CarServiceImp(CarDAO carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCar(List<Car> carlist, int id) {
        return carDao.getcarList(carlist, id);
    }
}
