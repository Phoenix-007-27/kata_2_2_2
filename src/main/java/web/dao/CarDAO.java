package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
   List<Car>  getcarList(List<Car> carList, int param);
}
