package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", required = false) String count,
                          Model model) {
        List<Car> carList;
        if (count != null) {
            switch (Integer.parseInt(count)) {
                case 1:
                    carList = Arrays.asList(Car.createAndGetFiveCars()).subList(0, 1);
                    break;
                case 2:
                    carList = Arrays.asList(Car.createAndGetFiveCars()).subList(0, 2);
                    break;
                case 3:
                    carList = Arrays.asList(Car.createAndGetFiveCars()).subList(0, 3);
                    break;
                case 4:
                    carList = Arrays.asList(Car.createAndGetFiveCars()).subList(0, 4);
                    break;
                default:
                    carList = Arrays.asList(Car.createAndGetFiveCars());
                    break;
            }
        } else {
            carList = Arrays.asList(Car.createAndGetFiveCars());
        }
        model.addAttribute("result", carList);
        return "cars";
    }

}
