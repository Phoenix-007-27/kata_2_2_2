package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/car")
    public String printWelcome(@RequestParam(value = "param", defaultValue = "5") int param, Model model) {
        if(param < 0){
            return "redirect:/car";
        }
        model.addAttribute("cars", carService.getCar(param));
        return "index";
    }

}