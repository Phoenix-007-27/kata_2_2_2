package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		System.out.println("WORK");
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(1, "mers", 123));
		cars.add(new Car(2, "bmw", 7));
		cars.add(new Car(3, "volvo", 90));
		cars.add(new Car(4, "lada", 15));

		model.addAttribute("messages", cars);
		return "index";
	}
	
}