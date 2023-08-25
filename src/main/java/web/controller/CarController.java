package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.dao.CarDAO;
import web.dao.CarDaoImp;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/car")
    public String printWelcome(@RequestParam(value = "param", defaultValue = "5") int param, Model model) {


        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "mers", 123));
        cars.add(new Car(2, "bmw", 7));
        cars.add(new Car(3, "volvo", 90));
        cars.add(new Car(4, "lada", 15));

        cars = carService.getCar(cars, param);

        model.addAttribute("cars", cars);
        return "index";
    }

}