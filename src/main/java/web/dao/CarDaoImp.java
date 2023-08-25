package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public class CarDaoImp implements CarDAO {

    @Override
    public List<Car> getcarList(List<Car> carList, int param) {
        if(param<5){
            return carList.stream().limit(param).toList();
        }
        return carList;
    }
}
